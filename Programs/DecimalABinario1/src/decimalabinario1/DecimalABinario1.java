package decimalabinario1;
import java.util.Scanner;

public class DecimalABinario1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, naux;
        String binario;

        do {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);

        binario = "";
        naux = n;

        while (naux > 0) {
            int residuo = naux % 2;
            binario = residuo + binario; 
            naux /= 2;
        }
        System.out.println("El número representado en el sistema binario es " 
                + binario);
    }
}