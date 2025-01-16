package muestraprimos1;
import java.util.Scanner;

public class MuestraPrimos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        numeros = ordenar(numeros); 

        System.out.print("Los números primos encontrados en el vector son: ");
        boolean primerPrimo = true; 
        for (int i = 0; i < n; i++) {
            if (primo(numeros[i])) {
                if (!primerPrimo) {
                    System.out.print(", ");
                }
                System.out.print(numeros[i]);
                primerPrimo = false;

                while (i < n - 1 && numeros[i] == numeros[i + 1]) {
                    i++;
                }
            }
        }
        System.out.println(); 
    }

    public static boolean primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] ordenar(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        return numeros;
    }
}