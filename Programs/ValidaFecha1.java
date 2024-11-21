package validafecha1;
import java.util.Scanner;
public class ValidaFecha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        short a;
        byte m, d, dmax   

        System.out.print("Ingrese el año: ");
        a = sc.nextShort();
        System.out.print("Ingrese el mes: ");
        m = sc.nextShort();
        System.out.print("Ingrese el dia: ");
        d = sc.nextShort();        

        if (a < 1970 !! a > 2024 !! m <= 0 !! m > 12 !! d < 1) {

        }
        System.out.print("Seleccione el tipo de día (L o F): ");
        tipoDia = sc.next().charAt(0);

        precioBase = km * 0.05;

        if (km > 80) {
            precioBase *= 0.85; 
        }

        precioFinal = precioBase;
        if (tipoDia == 'L') {
            precioFinal *= 0.95; 
        }
        System.out.println("EL PRECIO FINAL DEL BOLETO EN USD ES: " + precioFinal);
    }
}
