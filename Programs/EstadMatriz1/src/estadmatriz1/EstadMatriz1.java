package estadmatriz1;
import java.util.Scanner;
public class EstadMatriz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte filas, columnas;
        int sumaPares, sumaImpares, sumaTotal, sumaUltimaColumna;
        int contadorPares, contadorImpares, totalElementos;
        float promedioPares, promedioImpares, promedioTotal;

        System.out.print("Ingrese el número de filas: ");
        filas = scanner.nextByte();
        System.out.print("Ingrese el número de columnas: ");
        columnas = scanner.nextByte();
        
        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        System.out.println("===================================");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento ["+(i+1)+","+(j+1)+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        sumaPares = 0;
        sumaImpares = 0;
        sumaTotal = 0;
        sumaUltimaColumna = 0;
        contadorPares = 0;
        contadorImpares = 0;
        totalElementos = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numero = matriz[i][j];
                sumaTotal += numero;
                totalElementos++;

                if (numero % 2 == 0) {
                    sumaPares += numero;
                    contadorPares++;
                } else {
                    sumaImpares += numero;
                    contadorImpares++;
                }
                if (j == columnas - 1) {
                    sumaUltimaColumna += numero;
                }
            }
        }
        promedioPares = (float) sumaPares / contadorPares;
        promedioImpares = (float) sumaImpares / contadorImpares;
        promedioTotal = (float) sumaTotal / totalElementos;

        System.out.println("\nPromedio de pares: " + promedioPares);
        System.out.println("Promedio de impares: " + promedioImpares);
        System.out.println("Promedio general: " + promedioTotal);
        System.out.println("Sumatoria de la última columna: " + sumaUltimaColumna);
    }
}