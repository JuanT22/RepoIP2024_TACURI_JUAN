package multiplicamatriz1;
import java.util.Scanner;

public class MultiplicaMatriz1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, multiplicador;

        System.out.print("Introduce el número de filas (m): ");
        m = sc.nextInt();
        System.out.print("Introduce el número de columnas (n): ");
        n = sc.nextInt();

        int[][] matrizOriginal = new int[m][n];

        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Posición [" + (i + 1) + "," + (j + 1) + "]: ");
                matrizOriginal[i][j] = sc.nextInt();
            }
        }

        System.out.print("Introduce el número por el que multiplicar la matriz: ");
        multiplicador = sc.nextInt();

        // Multiplicar la matriz por el número
        int[][] matrizResultante = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizResultante[i][j] = matrizOriginal[i][j] * multiplicador;
            }
        }

        // Mostrar las matrices
        System.out.println("\nMatriz original:");
        mostrarMatriz(matrizOriginal);

        System.out.println("\nMatriz resultante:");
        mostrarMatriz(matrizResultante);
    }    
    
    // Procedimiento para mostrar una matriz en forma de cuadrícula
    public static void mostrarMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                System.out.printf(" %2d |", matriz[i][j]);
            }
            System.out.println();
            if (i < n - 1) {
                System.out.print("-");
                for (int j = 0; j < n; j++) {
                    System.out.print("----");
                }
                System.out.println();
            }
        }
    }
}