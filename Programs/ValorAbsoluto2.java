import java.util.Scanner;

public class ValorAbsoluto2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float numero, valorAbs;
		
		System.out.print("Ingrese un numero: ");
        numero = sc.nextFloat();

        if (numero < 0) {
            valorAbs = numero * -1;
        } else {
        	valorAbs = numero;
        }

		System.out.println("\nEl valor absoluto del numero " + numero + " es: " + valorAbs);
        sc.close();
	} 
}