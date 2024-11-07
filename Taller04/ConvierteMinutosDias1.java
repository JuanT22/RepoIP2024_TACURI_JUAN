import java.util.Scanner;

public class ConvierteMinutosDias1{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int minutosa, dias, horas, minutosb;

		System.out.print("Ingrese la cantidad de minutos: ");
		minutosa = sc.nextInt();

		dias = minutosa / (24 * 60);
		horas = (minutosa % (24 * 60)) / 60;
        minutosb = minutosa % 60;

		System.out.println("\n" + minutosa + " minutos equivalen a:");
        System.out.println(dias + " días con " + horas + " horas y " + minutosb + " minutos");
        System.out.print("\nBy Juan Tacuri");
	}
} 