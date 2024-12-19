package venta5;
import java.util.Scanner;

public class Venta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de artículos: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Definir los vectores
        String[] nombres = new String[n];
        int[] cantidades = new int[n];
        double[] preciosUnitarios = new double[n];
        double[] preciosTotales = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Artículo " + (i + 1) + ":");
            System.out.print("Nombre del artículo: ");
            nombres[i] = sc.nextLine();
            System.out.print("Cantidad: ");
            cantidades[i] = sc.nextInt();
            System.out.print("Precio unitario: ");
            preciosUnitarios[i] = sc.nextDouble();
            sc.nextLine(); // Limpiar buffer
            preciosTotales[i] = cantidades[i] * preciosUnitarios[i];
        }
        //subtotal
        double subtotal = 0;
        for (double precioTotal : preciosTotales) {
            subtotal += precioTotal;
        }
        //IVA (12%)
        double iva = subtotal * 0.12;
        // Calcular total a pagar
        double totalAPagar = subtotal + iva;
        
        // Mostrar tabla
        System.out.printf("%-10s %-20s %-15s %-15s%n", "Cantidad", "Ítem", "Precio Unitario", "Precio Total");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-20s %-15.2f %-15.2f%n", cantidades[i], nombres[i], preciosUnitarios[i], preciosTotales[i]);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-47s %-15.2f%n", "Subtotal", subtotal);
        System.out.printf("%-47s %-15.2f%n", "IVA (12%)", iva);
        System.out.printf("%-47s %-15.2f%n", "Total a pagar", totalAPagar);
    }
}
