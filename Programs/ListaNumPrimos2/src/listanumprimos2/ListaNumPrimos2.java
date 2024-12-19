package listanumprimos2;
import java.util.Scanner;

public class ListaNumPrimos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo (N): ");
        int N = sc.nextInt();

        System.out.print("Los números primos entre 0 y " + N + " son: ");
        for (int i = 2; i <= N; i++) {
            if (primo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static boolean primo(int num) {
        boolean esPrimo = false;
        int c;
        if (num >= 2) {
            c = num - 1;
            while (num % c != 0) {
                c = c - 1;
            }
            if (c == 1) {
                esPrimo = true;
            }
        }
        return esPrimo;
    }
}
