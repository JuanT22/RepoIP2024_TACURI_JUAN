package factorial1;
import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long factorial = 1;
        int numero,i = 1; 

        System.out.print("Introduce un número entero no negativo: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            while (i <= numero) {
                factorial *= i;
                i++;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}