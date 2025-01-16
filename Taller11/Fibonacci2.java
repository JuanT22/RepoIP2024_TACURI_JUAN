package fibonacci2;
import java.util.Scanner;

public class Fibonacci2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        int resultado = fibonacci(n);
        System.out.println("El " + n + "-ésimo número de Fibonacci es: " + resultado);
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}