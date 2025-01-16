package decimalabinario3;
import java.util.Scanner;

public class DecimalABinario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int decimal = sc.nextInt();
        String binario = decimalABinario(decimal);
        System.out.println("El número binario equivalente es: " + binario);
    }
    
    public static String decimalABinario(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            return decimalABinario(decimal / 2) + (decimal % 2);
        }
    }
}