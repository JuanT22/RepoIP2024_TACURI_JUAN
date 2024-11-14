package boletoestadio1;
import java.util.Scanner;
public class BoletoEstadio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String genero;
        float precio = 30;
        System.out.print("Ingrese el genero de la pagina (M/F): ");
        genero = sc.nextLine();
        if (genero.equals("F")) {
            precio = (float) (precio * 0.5);
        }
        System.out.println("El precio a pagar por la entrada es: "+precio);
    }
}
