package aptitudsufragar1;
import java.util.Scanner;
public class AptitudSufragar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short anioNacimiento, anioActual;
        byte edad;

        System.out.print("Ingrese el año de nacimiento: ");
        anioNacimiento = sc.nextShort();
        System.out.print("Ingrese el año actual: ");
        anioActual = sc.nextShort();

        if (anioActual < anioNacimiento) {
            System.out.println("Error: "
                    + "El año actual no puede ser anterior al año de nacimiento.");
        } else {
            edad = (byte) (anioActual - anioNacimiento);

            if (edad < 16) {
                System.out.println("Usted NO puede votar");
            } else if (edad < 18) {
                System.out.println("Usted puede votar OPCIONALMENTE");
            } else if (edad < 65) {
                System.out.println("Usted debe votar OBLIGATORIAMENTE");
            } else {
                System.out.println("Usted puede votar OPCIONALMENTE");
            }
        }
                System.out.print("By Juan Tacuri");
    }
}