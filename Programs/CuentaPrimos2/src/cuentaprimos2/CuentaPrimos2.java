package cuentaprimos2;
import java.util.Scanner;

public class CuentaPrimos2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, contadorPrimos = 0;

        System.out.print("Ingrese la cantidad de números del vector: ");
        N = sc.nextInt();

        int[] numeros = new int[N];

        System.out.println("Ingrese los números del vector:");
        for (int i = 0; i < N; i++) {
            numeros[i] = sc.nextInt();
        }

        // Contar los números primos en el vector
        for (int i = 0; i < N; i++) {
            if (primo(numeros[i])) {
                contadorPrimos++;
            }
        }

        System.out.println("De los elementos ingresados " + contadorPrimos 
                + " son primos");
    }
    
    // Función que determina si un número es primo (vista en clase)
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