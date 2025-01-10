package promediocolmatriz1;
import java.util.Scanner;

public class PromedioColMatriz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Ingrese el número de filas (→): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (↓): ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese los elementos de la matriz [" 
                        + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        // Procesar cada columna
        for (int j = 0; j < m; j++) {
            int suma = 0;
            int menor = matriz[0][j];

            for (int i = 0; i < n; i++) {
                suma += matriz[i][j];
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }

            double promedio = (double) suma / n;
            System.out.printf("Columna %d: promedio = %.2f, valor más bajo "
                    + "= %d%n", j + 1, promedio, menor);
        }
    }
}