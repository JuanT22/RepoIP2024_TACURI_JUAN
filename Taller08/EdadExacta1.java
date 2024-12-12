package edadexacta1;
import java.util.Scanner;
public class EdadExacta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short diaNacimiento, mesNacimiento, anioNacimiento;
        short diaActual, mesActual, anioActual;
        short edadAnios, edadMeses, edadDias; 

        System.out.println("Fecha nacimiento:");
        System.out.print("Dia: ");
        diaNacimiento = scanner.nextShort();
        System.out.print("Mes: ");
        mesNacimiento = scanner.nextShort();
        System.out.print("Año: ");
        anioNacimiento = scanner.nextShort();

        System.out.println("Fecha actual:");
        System.out.print("Dia: ");
        diaActual = scanner.nextShort();
        System.out.print("Mes: ");
        mesActual = scanner.nextShort();
        System.out.print("Año: ");
        anioActual = scanner.nextShort();

        if (anioActual < anioNacimiento || 
            (anioActual == anioNacimiento && mesActual < mesNacimiento) ||
            (anioActual == anioNacimiento && mesActual == 
                mesNacimiento && diaActual < diaNacimiento)) {
            System.out.println("Datos de entrada incorrectos");
        } else {
            edadAnios = (short) (anioActual - anioNacimiento);
            edadMeses = (short) (mesActual - mesNacimiento);
            edadDias = (short) (diaActual - diaNacimiento);
            if (edadDias < 0) {
                edadDias += 30;
                edadMeses--;
            }
            if (edadMeses < 0) {
                edadMeses += 12;
                edadAnios--;
            }
            System.out.println("\nSu edad exacta es " + edadAnios + " años con " 
                    + edadMeses + " meses y " + edadDias + " dias");
        }
    }
}