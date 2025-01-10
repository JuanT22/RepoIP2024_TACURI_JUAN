package circulo2;
import java.util.Scanner;

public class Circulo2 {
    
    public static double pi = 3.14159265359;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diametro, radio;
        System.out.println("CIRCUNFERENCIA Y AREA DE UN CIRCULO");
        System.out.println("===================================");
        System.out.println("\nIngrese el diametro del circulo en cm: ");
        diametro = sc.nextDouble();
        radio = diametro / 2;
        System.out.printf("\nLa circunferencia del circulo es: %,.2f cm%n", 
                Circunferencia(radio));
        System.out.printf("El area del circulo es: %,.2f cm2%n",
                AreaCirculo(radio));
    }
    public static double AreaCirculo(double radio){
        double area = pi * Math.pow(radio,2);
        return area;
    }
    public static double Circunferencia(double radio){
        return (2 * pi * radio);
    }
}
