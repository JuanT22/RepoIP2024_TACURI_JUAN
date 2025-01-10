package decimalabinario2;
import java.util.Scanner;

public class DecimalABinario2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);

        String binario = decimalABinario(n); // Llamada a la función

        System.out.println("El número " + n + " representado en binario es " + binario);
    }
    
    // Función para convertir decimal a binario
    public static String decimalABinario(int decimal) {
        String binario = "";
        int naux = decimal;

        while (naux > 0) {
            int residuo = naux % 2;
            binario = residuo + binario;
            naux /= 2;
        }
        return binario;
    }
}