import java.util.Scanner;

public class CompraElectrodomestico1{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		float precio, precioiva, total, enviopeso, enviodistancia, costoenvio;
		short peso, distancia;

		System.out.println("ACTURACIÓN DE UN ELECTRODOMÉSTICO");
		System.out.println("=================================");
		System.out.print("\nIngrese el precio del electrodomestico: ");
		precio = sc.nextFloat();
		System.out.print("Ingrese el peso en libras: ");
		peso = sc.nextShort();
		System.out.print("Ingrese la distancia al domicilio en Km: ");
		distancia = sc.nextShort();

		precioiva = (float)(precio * 0.12);
		costoenvio = (float)(0.01 * peso * distancia);
		total = precio + precioiva + costoenvio;

		System.out.print("Total a pagar con IVA y entrega a domicilio: " +total+ " USD");
		System.out.print("\nBy Juan Tacuri");
		
	}
}

