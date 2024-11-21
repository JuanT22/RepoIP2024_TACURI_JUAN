package calculadora1;
import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num1, num2;
        char operador;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextShort();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextShort();
        System.out.print("Ingrese el operador (+, -, *, /, %): ");
        operador = sc.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                } else {
                    System.out.println("Error: Módulo por cero");
                }
                break;
            default:
                System.out.println("Operador inválido");
        }
        System.out.print("By Juan Tacuri");
    }
}