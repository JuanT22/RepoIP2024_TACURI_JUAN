package listacuadradosperfectos1;
import java.util.Scanner;

public class ListaCuadradosPerfectos1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Introduce dos enteros positivos (a <= b): ");
            a = sc.nextInt();
            b = sc.nextInt();
        } while (a <= 0 || b <= 0 || a > b);

        System.out.print("Salida: ");
        for (int i = a; i <= b; i++) {
            int raiz = (int) Math.sqrt(i);
            if (raiz * raiz == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}