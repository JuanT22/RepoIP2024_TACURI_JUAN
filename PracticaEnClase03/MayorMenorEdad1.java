import java.util.Scanner;

public class MayorMenorEdad1{
	public static void main(String[] args){
		// Declaracion de variables
		Scanner sc = new Scanner(System.in);
		short act, nacimiento, edad;
		String mensaje;

		// Entrada de datos
		System.out.print("Ingrese su año de nacimiento: ");
        nacimiento = sc.nextShort();
        act = 2024;

        // Proceso
        edad = (short)(act - nacimiento);

        if (edad < 18) {
            mensaje = "Usted es menor de edad";
        } else {
        	mensaje = "Usted es mayor de edad";
        }

        // Salida o muestra de datos
		System.out.print(mensaje);
        sc.close();
	} 
}