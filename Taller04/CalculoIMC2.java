import java.util.Scanner;
public class CalculoIMC2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String nombre;
		int pesoKg;
		double estaturaM;
		double iMC; 

		System.out.println("CalculoIMC");
		System.out.println("==========");
 		
 		System.out.print("\nIngrese su nombre: ");
 		nombre = scanner.nextLine();
 		System.out.print("Ingrese su peso en Kg: ");
 		pesoKg = scanner.nextInt();
 		System.out.print("Ingrese su estatura en metros: ");
 		estaturaM = scanner.nextDouble();
 		iMC = pesoKg / Math.pow(estaturaM,2);

 		System.out.println("El IMC de " +nombre+ " es igual a: " +iMC);
 		scanner.close();

 		System.out.println("\nTabla IMC");
        System.out.println("----------------------------------");
        System.out.println("Valor del IMC\t\tEstado");
        System.out.println("----------------------------------");
        System.out.println("Menos de 18.49\t\tInfra Peso");
        System.out.println("18.50 a 24.99\t\tPeso Normal");
        System.out.println("25 a 29.99\t\tSobre Peso");
        System.out.println("30 a 34.99\t\tObesidad Leve");
        System.out.println("35 a 39.99\t\tObesidad Media");
        System.out.println("40 o más\t\tObesidad Mórbida");
        System.out.println("----------------------------------");
        System.out.println("*Clasificación de la OMS de acuerdo con el IMC");
	} 
}