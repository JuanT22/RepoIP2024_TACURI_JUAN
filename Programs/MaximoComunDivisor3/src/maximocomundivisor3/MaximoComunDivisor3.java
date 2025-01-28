package maximocomundivisor3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaximoComunDivisor3 {
    
    public static void main(String[] args) {
        int m, n,resultado;
        m = leerEnteroPositivo("Ingrese el primer número (m): ");
        n = leerEnteroPositivo("Ingrese el segundo número (n): ");

        resultado = mcd(m, n);
        System.out.println("El MCD de " + m + " y " + n + " es: " + resultado);
    }
    
    public static int leerEnteroPositivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                if (numero > 0) {
                    entradaValida = true;
                } else {
                    System.err.println("Error: El número debe ser positivo.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: Ingrese un número entero válido.");
                sc.next(); 
            }
        }
        return numero;
    }
    
    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return mcd(n, m % n);
        }
    }
}