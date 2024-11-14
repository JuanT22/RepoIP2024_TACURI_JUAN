package validarorden1;
import java.util.Scanner;
public class ValidarOrden1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        short num1, num2, num3;
        System.out.print("Ingrese el primer número entero: ");
        num1 = sc.nextShort();

        System.out.print("Ingrese el segundo número entero: ");
        num2 = sc.nextShort();

        System.out.print("Ingrese el tercer número entero: ");
        num3 = sc.nextShort();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println("\nLos números están en orden numérico ascendente");
        } else {
            System.out.println("\nLos números no están en orden numérico ascendente");
        }
        System.out.println("By Juan Tacuri");
    }
}
