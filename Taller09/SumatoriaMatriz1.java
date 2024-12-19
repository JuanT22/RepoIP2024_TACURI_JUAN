package sumatoriamatriz1;
import java.util.Scanner;

public class SumatoriaMatriz1 {
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

        int sumatoria = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                sumatoria += matriz[i][j];
            }
        }
        System.out.println("Sumatoria sobre diagonal principal: " + sumatoria);
    }
}