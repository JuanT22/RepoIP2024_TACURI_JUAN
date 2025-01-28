package maximocomundivisor2;
import java.util.Scanner;

public class MaximoComunDivisor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        
        System.out.print("Ingrese el primer número (m): ");
        m = sc.nextInt();

        System.out.print("Ingrese el segundo número (n): ");
        n = sc.nextInt();

        int resultado = mcd(m, n);
        System.out.println("El MCD de " + m + " y " + n + " es: " + resultado);
    }
    
    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return mcd(n, m % n);
        }
    }
}