package diasmes1;
import java.util.Scanner;
public class DiasMes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        byte mes;

        System.out.print("Ingrese el número de un mes (1 a 12): ");
        mes = sc.nextByte();

        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                System.out.println("El mes tiene 31 días.");
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                System.out.println("El mes tiene 30 días.");
                break;
            case 2: // Febrero
                System.out.println("El mes tiene 28 días (o 29 en años bisiestos).");
                break;
            default:
                System.out.println("Número de mes incorrecto.");
        }
    }
}