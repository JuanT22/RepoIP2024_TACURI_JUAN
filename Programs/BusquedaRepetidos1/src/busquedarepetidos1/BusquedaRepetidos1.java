package busquedarepetidos1;
import java.util.Scanner;

public class BusquedaRepetidos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        n = sc.nextInt();

        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        int ultimoElemento = vector[n - 1];

        System.out.print("El último elemento " + ultimoElemento + ", se repite ");

        for (int i = 0; i < n; i++) {
            if (vector[i] == ultimoElemento) {
                contador++;
            }
        }
        System.out.print(contador + " veces en las posiciones ");
        for (int i = 0; i < n; i++) {
            if (vector[i] == ultimoElemento) {
                System.out.print((i + 1) + ", "); 
            }
        }
    }
}