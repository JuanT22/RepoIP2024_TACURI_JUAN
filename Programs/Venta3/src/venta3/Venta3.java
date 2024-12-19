package venta3;
public class Venta3 {
    public static void main(String[] args) {
        String[] productos = {"Televisor LG", "Computador Asus", "Juego de Sala"};
        int[] cantidades = {4, 10, 7};
        double[] preciosUnitarios = {765.87, 2324.56, 655.99};

        double subtotal = 0;
        for (int i = 0; i < productos.length; i++) {
            double precioTotal = cantidades[i] * preciosUnitarios[i];
            subtotal += precioTotal;
        }
        double iva = subtotal * 0.12;
        double total = subtotal + iva;

        System.out.printf("%-15s %-30s %15s %15s\n", "Cantidad", "Item", "Precio Unitario", "Precio Total");
        System.out.println("==============================================================================");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%-15d %-30s %,15.2f %,15.2f\n",
                    cantidades[i], productos[i], preciosUnitarios[i], cantidades[i] * preciosUnitarios[i]);
        }
        System.out.println("==============================================================================");
        System.out.printf("%62s %,15.2f\n", "Subtotal", subtotal);
        System.out.printf("%62s %,15.2f\n", "IVA", iva);
        System.out.printf("%62s %,15.2f\n", "Total a pagar", total);
        System.out.println("==============================================================================");
    }
}