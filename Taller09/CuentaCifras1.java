package cuentacifras1;
import java.util.Scanner;

public class CuentaCifras1 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        
        int n, c, naux;
        
        do {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);
        c = 0;
        naux = n; 
        while (naux != 0) {
            naux /= 10; 
            c++;
        }
        System.out.println("\nEl número " + n + " tiene " + c + " cifras.");
    }
}