package sumarvectores1;
import java.util.Scanner;

public class SumarVectores1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Ingrese el tamaño de los vectores: ");
        n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Ingrese los elementos del vector A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor ("+(i+1)+" de "+n+"): ");
            A[i] = sc.nextInt();
        }

        System.out.println("Ingrese los elementos del vector B:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor ("+(i+1)+" de "+n+"): ");
            B[i] = sc.nextInt();
        }

        int[] suma = sumarVectores(A, B); 

        System.out.print("\nLa suma de los vectores es: [");
        for (int i = 0; i < n; i++) {
            System.out.print(suma[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    // Función para sumar dos vectores
    public static int[] sumarVectores(int[] A, int[] B) {
        int[] resultado = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            resultado[i] = A[i] + B[i];
        }
        return resultado;
    }
}