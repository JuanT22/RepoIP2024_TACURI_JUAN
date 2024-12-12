package listanumabundantes1;
import java.util.Scanner;

public class ListaNumAbundantes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, sumaDivisores;

        System.out.print("Ingrese el valor de N: ");
        N = sc.nextInt();

        System.out.print("Los números abundantes entre 0 y " + N + " son: ");

        for (int i = 1; i <= N; i++) {
            sumaDivisores = 0; 
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sumaDivisores += j;
                }
            }
            if (sumaDivisores > i) {
                System.out.print(i + ", ");
            }
        }
    }
}