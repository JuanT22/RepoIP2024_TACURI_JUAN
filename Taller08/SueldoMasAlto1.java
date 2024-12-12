package sueldomasalto1;
import java.util.Scanner;

public class SueldoMasAlto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sueldo, sueldoMasAlto = 0;
        String nombre, nombresSueldoAlto = "";

        System.out.print("Ingrese la cantidad de empleados: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el nombre del empleado " + i + ": ");
            nombre = sc.nextLine();
            System.out.print("Ingrese el sueldo de " + nombre + ": ");
            sueldo = sc.nextInt();
            sc.nextLine();// Consumir el salto de línea pendiente

            if (sueldo > sueldoMasAlto) {
                sueldoMasAlto = sueldo;
                nombresSueldoAlto = nombre; 
            } else if (sueldo == sueldoMasAlto) {
                nombresSueldoAlto += ", " + nombre;
            }
        }
        System.out.println("\nEl sueldo más alto es: " + sueldoMasAlto);
        System.out.println("Empleado(s) que lo ganan: " + nombresSueldoAlto);
    }
}