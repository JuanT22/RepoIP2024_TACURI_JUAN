import java.util.Scanner;

public class Circulo1 {
	public static void main(String[] args){

		Scanner	sc = new Scanner(System.in);
		float diametro, radio, circunferencia, area;

		System.out.print("Ingrese el diametro en cm: ");
		diametro = sc.nextFloat();

		radio = diametro / 2;
		circunferencia = (float)(2 * 3.14 * radio);
		area = (float)(3.14 * Math.pow(radio,2));

		System.out.println("La circunferencia del circulo es: " +circunferencia+ "cm");
		System.out.println("El area del circulo es: " +area+ " cm²");
		System.out.print("\nBy Juan Tacuri");
	}
}