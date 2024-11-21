package validadivisor1;
import java.util.Scanner;

public class ValidaDivisor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num1, num2, menor, mayor;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextShort();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextShort();

        menor = (short)Math.min(num1, num2);
        mayor = (short)Math.max(num1, num2);

        if (mayor % menor == 0) {
            System.out.println(menor + " es divisor de " + mayor);
        } else {
            System.out.println(menor + " no es divisor de " + mayor);
        }
        System.out.print("By Juan Tacuri");
    }
}