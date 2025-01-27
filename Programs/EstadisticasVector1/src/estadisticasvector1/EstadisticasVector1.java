package estadisticasvector1;

import java.util.InputMismatchException;
import java.util.Scanner;
import Libreria1.Clase1;

public class EstadisticasVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean datovalido = false;

        do {
            try {
                System.out.print("Ingrese el tamaño del vector: ");
                n = sc.nextInt();
                if (n < 0) {
                    throw new Exception("Debe ingresar un entero positivo!");
                }
                datovalido = true;
            } catch (InputMismatchException error) {
                System.err.println("ERROR: Debe ingresar un número entero!");
                sc.nextLine();
            } catch (Exception error) {
                System.err.println("ERROR: " + error.getMessage());
            }
        } while (!datovalido);

        int[] vector = new int[n];

        System.out.println();
        for (int i = 0; i <= n - 1; i++) {
            datovalido = false;
            do {
                try {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    vector[i] = sc.nextInt();
                    datovalido = true;
                } catch (Exception error) {
                    System.err.println("ERROR: Debe ingresar un número entero!");
                    sc.nextLine();
                }
            } while (!datovalido);
        }

        Clase1.mostrarVector(vector);
        System.out.println("\nEl promedio del vector es: " + Clase1.promedioVector(vector));
        System.out.println("\nEl rango del vector es: " + Clase1.rangoVector(vector));
    }
}