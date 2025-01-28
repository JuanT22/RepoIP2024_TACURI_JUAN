package sumadigitos1;
import java.util.Scanner;

public class SumaDigitos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero,suma;
        
        System.out.print("Ingrese un número entero: ");
        numero = scanner.nextInt();
        suma = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }

    public static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return numero % 10 + sumaDigitos(numero / 10);
        }
    }
}