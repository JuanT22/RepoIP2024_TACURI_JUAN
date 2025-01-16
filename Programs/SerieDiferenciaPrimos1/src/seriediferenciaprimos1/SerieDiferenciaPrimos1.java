package seriediferenciaprimos1;
import java.util.Scanner;
public class SerieDiferenciaPrimos1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese la cantidad de números de la serie que desea mostrar: ");
        N = sc.nextInt();

        int num1 = 2; 
        int num2 = 3; 
        int diferencia;

        for (int i = 0; i < N; i++) {
            diferencia = num2 - num1;
            System.out.print(diferencia + " ");

            num1 = num2;
            do {
                num2++;
            } while (!primo(num2));
        }
    }
    
    public static boolean primo(int num) {
        boolean esPrimo = false;
        int c;
        if (num >= 2) {
            c = num - 1;
            while (num % c != 0) {
                c = c - 1;
            }
            if (c == 1) {
                esPrimo = true;
            }
        }
        return esPrimo;
    }
}