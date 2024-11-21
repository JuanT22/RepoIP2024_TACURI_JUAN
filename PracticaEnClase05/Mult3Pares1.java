package mult3pares1;
import java.util.Scanner;
public class Mult3Pares1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de elementos a mostrar: ");
        int n = scanner.nextInt();

        int x = 0;
        int c = 0;

        while (c < n) {
            x += 2; 
            if (x % 3 != 0) { 
                System.out.print(x + " ");
                c++;
            }
        }
        System.out.println();
    }
}