package venta2;
import java.util.Scanner;

public class Venta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        short n, c;
        float total, iva, precio, totaliva;
        System.out.print("Ingrese la cantidad de artículos: ");
        n = sc.nextShort();
        
        total = 0;
        c = 1;
        while(c <= n){
            System.out.print("Ingrese el precio del artículo "+c+": ");
            precio = sc.nextFloat();
            total = total + precio;
            c++;
        }
        // Calcular el IVA (asumiendo un IVA del 15%)
        iva = (float)(total * 0.15);
        totaliva = total + iva;
        
        System.out.println("\nSubtotal: " + total);
        System.out.println("IVA (15%): " + iva);
        System.out.println("Total a pagar: " + totaliva);
        System.out.println("By Juan Tacuri");
    }
}
