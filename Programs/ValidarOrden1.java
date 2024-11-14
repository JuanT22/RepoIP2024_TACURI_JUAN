package validarorden1;
import java.util.Scanner;
public class ValidarOrden1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        short num1, num2, num3;
        System.out.println("Ingrese el primer número entero:");
        num1 = sc.nextShort();

        System.out.println("Ingrese el segundo número entero:");
        num2 = sc.nextShort();

        System.out.println("Ingrese el tercer número entero:");
        num3 = sc.nextShort();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Los números están en orden numérico ascendente");
        } else {
            System.out.println("Los números NO están en orden numérico ascendente");
        }
    }
}
