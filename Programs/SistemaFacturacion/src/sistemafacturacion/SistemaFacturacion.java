package sistemafacturacion;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SistemaFacturacion {
    private static final String ARCHIVO_INVENTARIO = "inventario.txt";
    private static final String ARCHIVO_FACTURAS = "facturas.txt";
    private static final String ARCHIVO_CONTADOR = "contador.txt";
    private static final double IVA = 0.12;
    
    static class Articulo {
        String nombre;
        int stock;
        double precio;
        
        public Articulo(String nombre, int stock, double precio) {
            this.nombre = nombre;
            this.stock = stock;
            this.precio = precio;
        }
    }
    
    static class Factura {
        String numero;
        String cliente;
        String ruc;
        String fecha;
        List<ArticuloVendido> articulos = new ArrayList<>();
        double descuento;
    }
    
    static class ArticuloVendido {
        String nombre;
        int cantidad;
        double precioUnitario;
    }

    public static void main(String[] args) {
        cargarInventario();
        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n=== SISTEMA DE FACTURACIÓN ===");
            System.out.println("1. Facturar nueva venta");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione opción: ");
            
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            
            switch(opcion) {
                case 1:
                    facturarVenta(sc);
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 3:
                    guardarInventario();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private static List<Articulo> inventario = new ArrayList<>();

    private static void cargarInventario() {
        try (BufferedReader br = new BufferedReader(new FileReader("data/inventario.txt"))) {
            String linea;
            while((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                inventario.add(new Articulo(
                    datos[0], 
                    Integer.parseInt(datos[1]), 
                    Double.parseDouble(datos[2])
                ));
            }
        } catch (IOException e) {
            System.out.println("Error al cargar inventario: " + e.getMessage());
        }
    }

    private static void guardarInventario() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("data/inventario.txt"))) {
            for(Articulo a : inventario) {
                pw.println(a.nombre + ";" + a.stock + ";" + a.precio);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar inventario: " + e.getMessage());
        }
    }

    private static void mostrarInventario() {
        System.out.println("\n=== INVENTARIO ===");
        System.out.printf("%-20s %-10s %-10s\n", "ARTÍCULO", "STOCK", "PRECIO");
        for(Articulo a : inventario) {
            System.out.printf("%-20s %-10d $%-10.2f\n", 
                a.nombre, a.stock, a.precio);
        }
    }

    private static void facturarVenta(Scanner sc) {
        Factura factura = new Factura();
        factura.numero = generarNumeroFactura();
        factura.fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        
        System.out.println("\n=== NUEVA FACTURA ===");
        System.out.print("Nombre del cliente: ");
        factura.cliente = sc.nextLine();
        System.out.print("RUC/CI del cliente: ");
        factura.ruc = sc.nextLine();
        
        boolean continuar = true;
        while(continuar) {
            mostrarInventario();
            System.out.print("Seleccione artículo (nombre): ");
            String nombre = sc.nextLine();
            
            Articulo articulo = buscarArticulo(nombre);
            if(articulo == null) {
                System.out.println("Artículo no encontrado");
                continue;
            }
            
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            
            if(cantidad > articulo.stock) {
                System.out.println("Stock insuficiente");
                continue;
            }
            
            ArticuloVendido av = new ArticuloVendido();
            av.nombre = articulo.nombre;
            av.cantidad = cantidad;
            av.precioUnitario = articulo.precio;
            factura.articulos.add(av);
            
            articulo.stock -= cantidad;
            
            System.out.print("¿Agregar otro artículo? (s/n): ");
            continuar = sc.nextLine().equalsIgnoreCase("s");
        }
        
        System.out.print("Descuento (%): ");
        factura.descuento = sc.nextDouble() / 100;
        sc.nextLine();
        
        mostrarFactura(factura);
        guardarFactura(factura);
    }

    private static String generarNumeroFactura() {
        try {
            int contador = Integer.parseInt(new Scanner(new File(ARCHIVO_CONTADOR)).nextLine());
            contador++;
            new PrintWriter(new FileWriter(ARCHIVO_CONTADOR)).printf("%d", contador).close();
            return String.format("FACT-%05d", contador);
        } catch (Exception e) {
            return "FACT-00001";
        }
    }

    private static void mostrarFactura(Factura f) {
        System.out.println("\n=== FACTURA ===");
        System.out.printf("%-30s %s\n", "RUC: 1790112233001", "Número: " + f.numero);
        System.out.printf("%-30s %s\n", "Farmacia 'Salud Total'", "Fecha: " + f.fecha);
        System.out.printf("%-30s %s\n", "Dirección: Av. Principal 123", "Teléfono: 022345678");
        System.out.println("Cliente: " + f.cliente);
        System.out.println("RUC/CI: " + f.ruc);
        
        System.out.println("\nDetalle de compra:");
        System.out.printf("%-5s %-20s %-10s %-10s\n", "CANT.", "DESCRIPCIÓN", "P.UNIT", "TOTAL");
        
        double subtotal = 0;
        for(ArticuloVendido av : f.articulos) {
            double total = av.cantidad * av.precioUnitario;
            System.out.printf("%-5d %-20s $%-9.2f $%-9.2f\n", 
                av.cantidad, av.nombre, av.precioUnitario, total);
            subtotal += total;
        }
        
        double descuento = subtotal * f.descuento;
        double baseImponible = subtotal - descuento;
        double iva = baseImponible * IVA;
        double total = baseImponible + iva;
        
        System.out.printf("\n%-20s: $%.2f\n", "Subtotal", subtotal);
        System.out.printf("%-20s: $%.2f\n", "Descuento", descuento);
        System.out.printf("%-20s: $%.2f\n", "Base Imponible", baseImponible);
        System.out.printf("%-20s: $%.2f\n", "IVA 12%", iva);
        System.out.printf("%-20s: $%.2f\n", "TOTAL", total);
    }

    private static Articulo buscarArticulo(String nombre) {
        for(Articulo a : inventario) {
            if(a.nombre.equalsIgnoreCase(nombre)) return a;
        }
        return null;
    }

    private static void guardarFactura(Factura f) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO_FACTURAS, true))) {
            pw.println("=== FACTURA " + f.numero + " ===");
            pw.println("Fecha: " + f.fecha);
            pw.println("Cliente: " + f.cliente);
            pw.println("RUC/CI: " + f.ruc);
            for(ArticuloVendido av : f.articulos) {
                pw.println(av.cantidad + " x " + av.nombre + " @ " + av.precioUnitario);
            }
            pw.println("=========================");
        } catch (IOException e) {
            System.out.println("Error al guardar factura: " + e.getMessage());
        }
    }
}