package paresenvector1;
import java.util.Scanner;

public class ParesEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer el tamaño del vector
        System.out.print("Ingrese el tamaño del vector (N): ");
        int n = sc.nextInt();

        // Leer los elementos del vector
        int[] vector = new int[n];
        System.out.print("Ingrese los elementos del vector separados por espacios "
                + "o uno por uno: ");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }

        // Contar pares y mostrar resultado
        int cantidadPares = contarPares(vector);
        System.out.println(cantidadPares + " elementos del vector son números pares.");
    }

    // Función que cuenta los números pares en el vector
    public static int contarPares(int[] vector) {
        int contador = 0;
        for (int numero : vector) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}