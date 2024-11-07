import java.util.Scanner;
public class CalculoIMC1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String nombre;
		int pesoKg;
		float estaturaM;
		float iMC; 

		System.out.println("CalculoIMC");
		System.out.println("==========");
 		
 		System.out.print("\nIngrese su nombre: ");
 		nombre = scanner.nextLine();
 		System.out.print("Ingrese su peso en Kg: ");
 		pesoKg = scanner.nextInt();
 		System.out.print("Ingrese su estatura en metros: ");
 		estaturaM = scanner.nextFloat();
 		iMC = (float)(pesoKg / Math.pow(estaturaM,2));

 		System.out.println("El IMC de " +nombre+ " es igual a: " +iMC);
 		scanner.close();
	} 
}