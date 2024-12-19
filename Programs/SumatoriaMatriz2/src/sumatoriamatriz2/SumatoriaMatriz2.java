package sumatoriamatriz2;
import java.util.Scanner;

public class SumatoriaMatriz2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce el tamaño de la matriz (n): ");
            n = sc.nextInt();
        } while (n <= 0);

        int[][] matriz = new int[n][n];

        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Posición [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Calcular la sumatoria
        int sumatoria = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sumatoria += matriz[i][j];
            }
        }

        // Mostrar la matriz en una cuadrícula
        System.out.println("\nLa matriz que usted ingresó es la siguiente:");
        for (int i = 0; i < n; i++) {
            System.out.print("|"); 
            for (int j = 0; j < n; j++) {
                System.out.printf(" %2d |", matriz[i][j]);
            }
            System.out.println(); 
            // Imprimir la línea horizontal entre filas 
            if (i < n - 1) {
                System.out.print("-");
                for (int j = 0; j < n; j++) {
                    System.out.print("----"); 
                }
                System.out.println();
            }
        }
        System.out.println("\nLa sumatoria sobre diagonal principal es: " + sumatoria);
    }
}