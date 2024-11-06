import java.util.Scanner;

public class ParImpar1{
	public static void main(String[] args){
		// Declaracion de variables
		Scanner sc = new Scanner(System.in);
		String mensaje;
		int num, par, impar;

		// Entrada de datos
		System.out.print("Ingrese el numero para determinar: ");
        num = sc.nextInt();

        // Proceso
        if (num % 2 == 0) {
            mensaje = "Su numero " + num + " es: par";
        } else {
        	mensaje = "Su numero " + num + " es: impar";
        }

        // Salida o muestra de datos
		System.out.println(mensaje);
		System.out.println("By Juan Tacuri");
        sc.close();
	} 
}