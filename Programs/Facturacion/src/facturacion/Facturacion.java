package facturacion;
import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class Facturacion {// Datos de la empresa
    static final String NOMBRE_EMPRESA = "J C I P H O N E S";
    static final String RUC = "1790999923001";
    static final String DIR_MATRIZ = "Av. Tecnologia N45-102";
    static final String DIR_SUCURSAL = "C.C. Megamaxi 2do Nivel";
    static final String AUT_SRI = "0987654321";
    
// Variables para inventario
    static String[] nombres = new String[10];
    static int[] stocks = new int[10];
    static double[] precios = new double[10];
    static int numArticulos = 0;

    public static void main(String[] args) {
        leerInventario();
        mostrarMenu();
    }

    static void leerInventario() {
        try (BufferedReader br = new BufferedReader(new FileReader("data/inventario.txt"))) {
            String linea;
            br.readLine(); // Saltar encabezado
            while ((linea = br.readLine()) != null && numArticulos < 10) {
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    nombres[numArticulos] = partes[0];
                    stocks[numArticulos] = Integer.parseInt(partes[1]);
                    precios[numArticulos] = Double.parseDouble(partes[2]);
                    numArticulos++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el inventario");
        }
    }
    
    static void guardarInventario() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/inventario.txt"))) {
            bw.write("Nombre;Stock;Precio");
            for (int i = 0; i < numArticulos; i++) {
                bw.newLine();
                bw.write(nombres[i] + ";" + stocks[i] + ";" + precios[i]);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el inventario");
        }
    }

    static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Facturar nueva venta");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1 -> facturarVenta(sc);
                case 2 -> mostrarInventario();
                case 3 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida!");
            }
        } while (opcion != 3);
    }

    static void mostrarInventario() {
        System.out.println("\n=========== INVENTARIO ACTUAL ===========");
        System.out.printf("%-20s %-10s %-10s%n", "ARTÍCULO", "STOCK", "PRECIO");
        for (int i = 0; i < numArticulos; i++) {
            System.out.printf("%-21s %-9d $%-10.2f%n", nombres[i], stocks[i], precios[i]);
        }
    }

    static void facturarVenta(Scanner sc) {
        int numeroFactura = leerNumeroFactura();
        String[] articulosComprados = new String[10];
        int[] cantidades = new int[10];
        double[] preciosUnitarios = new double[10];
        int contador = 0;

// Datos del cliente
        System.out.print("\nNombre del cliente: ");
        String cliente = sc.nextLine();
        System.out.print("RUC/CI            : ");
        String ruc = sc.nextLine();

// Selección de artículos
        boolean masArticulos = true;
        while (masArticulos && contador < 10) {
            mostrarInventario();
            System.out.print("\nSeleccione artículo (1-" + numArticulos + "): ");
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Entrada inválida!");
                continue;
            }
            int seleccion = sc.nextInt() - 1;
            
            if (seleccion < 0 || seleccion >= numArticulos) {
                System.out.println("Artículo no válido!");
                continue;
            }
            
            System.out.print("Cantidad a comprar: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            
            if (cantidad > stocks[seleccion]) {
                System.out.println("Stock insuficiente!");
                continue;
            }
            
            // Registrar compra
            stocks[seleccion] -= cantidad;
            articulosComprados[contador] = nombres[seleccion];
            cantidades[contador] = cantidad;
            preciosUnitarios[contador] = precios[seleccion];
            contador++;
            
            System.out.print("¿Agregar otro artículo? (s/n): ");
            masArticulos = sc.nextLine().equalsIgnoreCase("s");
        }
        
        // Actualizar archivo de inventario
        guardarInventario();
        
        // Cálculos
        double subtotal = 0;
        for (int i = 0; i < contador; i++) {
            subtotal += cantidades[i] * preciosUnitarios[i];
        }
        
        System.out.print("Descuento (%): ");
        double porcentajeDescuento = sc.nextDouble();
        double descuento = subtotal * (porcentajeDescuento / 100);
        double subtotalConDescuento = subtotal - descuento;
        double iva = subtotalConDescuento * 0.12;
        double total = subtotalConDescuento + iva;
        
// Mostrar factura
        imprimirFactura(numeroFactura, cliente, ruc, articulosComprados, 
                       cantidades, preciosUnitarios, contador, 
                       subtotal, descuento, subtotalConDescuento, iva, total);
        
// Actualizar número de factura
        guardarNumeroFactura(numeroFactura + 1);
    }

    static void imprimirFactura(int numeroFactura, String cliente, String ruc,
                               String[] articulos, int[] cantidades,
                               double[] precios, int contador,
                               double subtotal, double descuento,
                               double subtotalConDescuento, double iva, double total) {
        
        System.out.println("\n\n==================================================");
        System.out.println("                " + NOMBRE_EMPRESA + "                ");
        System.out.println("          Distribuidor Autorizado Apple            ");
        System.out.println("==================================================");
        System.out.printf("%-25s: %s%n", "Direccion Matriz", DIR_MATRIZ);
        System.out.printf("%-25s: %s%n", "Direccion Sucursal", DIR_SUCURSAL);
        System.out.printf("%-25s: %s%n", "RUC", RUC);
        System.out.printf("%-25s: %s%n", "Factura No.", String.format("%03d", numeroFactura));
        System.out.printf("%-25s: %s%n", "Autorizacion SRI", AUT_SRI);
        System.out.println("--------------------------------------------------");
        System.out.printf("%-25s: %s%n", "Sr/Sra.", cliente);
        System.out.printf("%-25s: %s%n", "RUC/CI", ruc);
        System.out.printf("%-25s: %s%n", "Fecha de Emision", new Date());
// Encabezado de columnas
        System.out.println("==================================================");
        System.out.printf("%-5s %-18s %13s %13s%n", "CANT", "DESCRIPCION", "P.UNITARIO", "TOTAL");
        System.out.println("--------------------------------------------------");

// Filas de artículos
        for (int i = 0; i < contador; i++) {
            System.out.printf("%-5d %-18s $%,10.2f $%,10.2f%n",
            cantidades[i],
            articulos[i],
            precios[i],
            cantidades[i] * precios[i]
            );
        }

// Totales
        System.out.println("--------------------------------------------------");
        System.out.printf("%-28s $%,13.2f%n", "SUBTOTAL:", subtotal);
        System.out.printf("%-28s $%,13.2f%n", "DESCUENTO:", descuento);
        System.out.printf("%-28s $%,13.2f%n", "SUBTOTAL CON DESCUENTO:", subtotalConDescuento);
        System.out.printf("%-28s $%,13.2f%n", "IVA 12%:", iva);
        System.out.println("--------------------------------------------------");
        System.out.printf("%-28s $%,13.2f%n", "TOTAL A PAGAR:", total);
        System.out.println("==================================================");
        System.out.println("VÁLIDO PARA SU EMISIÓN HASTA 30 DÍAS\n");
        System.out.println("FORMA DE PAGO: TRANSFERENCIA BANCARIA");
        System.out.println("==================================================");
        System.out.println("         Gracias por preferir productos Apple      ");
        System.out.println("      Soporte técnico: soporte@jciphones.com.ec     ");
        System.out.println("==================================================\n");
    }

// Métodos para numeración de facturas
    static int leerNumeroFactura() {
        try (BufferedReader br = new BufferedReader(new FileReader("data/config.txt"))) {
            return Integer.parseInt(br.readLine());
        } catch (Exception e) {
            return 1;
        }
    }

    static void guardarNumeroFactura(int numero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/config.txt"))) {
            bw.write(String.valueOf(numero));
        } catch (IOException e) {
            System.out.println("Error al guardar número de factura");
        }
    }
}