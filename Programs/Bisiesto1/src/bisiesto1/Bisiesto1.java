package bisiesto1;
import java.util.Scanner;
public class Bisiesto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        short anio;

        System.out.print("Ingrese un año: ");
        anio = sc.nextShort();

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
        System.out.println("By Juan Tacuri");
    }
}