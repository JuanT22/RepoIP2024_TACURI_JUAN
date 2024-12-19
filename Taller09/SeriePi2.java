package seriepi2;
import java.util.Scanner;

public class SeriePi2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        double pi;
        
        do {
            System.out.print("Introduce un número entero positivo para n: ");
            n = sc.nextInt();
        } while (n <= 0);

        pi = 0;

        for (int i = 0; i <= n; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }

        pi *= 4; 

        System.out.println("El valor aproximado de Pi con " + n + " términos es: " + pi);
    }
}