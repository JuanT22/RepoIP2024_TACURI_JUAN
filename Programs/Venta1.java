import java.util.Scanner;

public class Venta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float precio1, precio2, precio3, subtotal, precioTotal, porcentajeIVA, iva;

        System.out.println("COMPRA DE ARTICULOS");
        System.out.println("===================");
        System.out.println();

        System.out.print("Ingrese el precio del articulo 1: ");
        precio1 = scanner.nextFloat();
        System.out.print("Ingrese el precio del articulo 2: ");
        precio2 = scanner.nextFloat();
        System.out.print("Ingrese el precio del articulo 3: ");
        precio3 = scanner.nextFloat();

        subtotal = precio1 + precio2 + precio3;
        porcentajeIVA = 15; 
        iva = subtotal * (porcentajeIVA / 100);
        precioTotal = subtotal + iva;

        System.out.println("\nGracias por su compra!");
        System.out.println("El total a pagar incluido el IVA es: USD " + precioTotal);

        scanner.close();
    }
}