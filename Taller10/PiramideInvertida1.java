package piramideinvertida1;
import java.util.Scanner;
public class PiramideInvertida1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        System.out.print("Ingrese la altua de la piramide: ");
        altura = sc.nextInt();
        
        for(int i = altura; i >= 1; i--){
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}