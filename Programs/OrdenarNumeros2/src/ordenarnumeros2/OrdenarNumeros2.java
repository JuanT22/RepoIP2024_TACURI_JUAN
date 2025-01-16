package ordenarnumeros2;
import java.util.Scanner;

public class OrdenarNumeros2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int[] numerosOrdenados = ordenar(numeros);

        System.out.println("Números ordenados:");
        for (int numero : numerosOrdenados) {
            System.out.print(numero + " ");
        }
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