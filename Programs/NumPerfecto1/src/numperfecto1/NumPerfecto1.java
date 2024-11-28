package numperfecto1;
import java.util.Scanner;

public class NumPerfecto1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, sumaDivisores, c;
        
        c = 1;
        sumaDivisores = 0;
        
        System.out.print("Introduce un número natural: ");
        numero = sc.nextInt();
        
        if (numero <= 0) {
            System.out.println("El número debe ser un natural (mayor que 0).");
        } else {
            while (c < numero) {
                if (numero % c == 0) {
                    sumaDivisores = sumaDivisores + c;
                }
                c = c + 1;
            }
            if (sumaDivisores == numero) {
                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " no es un número perfecto.");
            }
        }
    }
}