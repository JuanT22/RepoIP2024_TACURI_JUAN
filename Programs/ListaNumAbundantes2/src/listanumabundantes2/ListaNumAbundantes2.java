package listanumabundantes2;
import java.util.Scanner;

public class ListaNumAbundantes2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Ingrese el valor de N: ");
        N = sc.nextInt();

        System.out.print("Los números abundantes entre 0 y " + N + " son: ");

        for (int i = 1; i <= N; i++) {
            if (esAbundante(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    
    // Función para verificar si un número es abundante
    public static boolean esAbundante(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores > numero;
    }
}