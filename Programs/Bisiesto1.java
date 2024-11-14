package boletoautobus1;
import java.util.Scanner;
public class BoletoAutobus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
           
        float km, precioBase, precioFinal;
        char tipoDia;

        System.out.print("Ingrese el recorrido en Km: ");
        km = scanner.nextFloat();

        System.out.print("Seleccione el tipo de día (L o F): ");
        tipoDia = scanner.next().charAt(0);

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
