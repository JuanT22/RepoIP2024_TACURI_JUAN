package numeromayor1;
import java.util.Scanner;
public class NumeroMayor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        short num1, num2, num3, mayor;

        System.out.println("Ingrese el primer número:");
        num1 = sc.nextShort();

        System.out.println("Ingrese el segundo número:");
        num2 = sc.nextShort();

        System.out.println("Ingrese el tercer número:");
        num3 = sc.nextShort();

        mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}