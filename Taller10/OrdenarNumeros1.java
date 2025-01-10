package ordenarnumeros1;

import java.util.Scanner;

public class OrdenarNumeros1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp;
        
        System.out.print("Ingrese la cantidad de numeros a ingresar: ");
        n = sc.nextInt();
        
        int[] numeros = new int[n];
        
        for (int i=0; i<n; i++){
            System.out.print("Ingrese el "+(i+1)+" valor: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {

                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números ordenados de menor a mayor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}