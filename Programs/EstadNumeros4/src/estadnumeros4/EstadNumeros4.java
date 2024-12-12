package estadnumeros4;
import java.util.Scanner;
public class EstadNumeros4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n;
        int v, suma = 0, mayor = 0, menor = 0, positivos = 0, negativos = 0;
        float media;
        boolean primerNumero = true; 

        System.out.print("Ingrese la cantidad de los valores: ");
        n = sc.nextByte();

        for (int c = 1; c <= n; c++) {
            System.out.print("Ingrese valor " + c + ": ");
            v = sc.nextInt();

            if (primerNumero) {
                mayor = v;
                menor = v;
                primerNumero = false;
            } else {
                if (v > mayor) {
                    mayor = v;
                }
                if (v < menor) {
                    menor = v;
                }
            }
            if (v > 0) {
                positivos++;
            } else if (v < 0) {
                negativos++;
            }
            suma = suma + v;
        }
        media = (float) suma / n;
        System.out.println("\nLa media aritmetica de los " + n + " numeros es " + media);
        System.out.println("El mayor de los numeros ingresados es: " + mayor);
        System.out.println("El menor de los numeros ingresados es: " + menor);
        System.out.println("La cantidad de numeros positivos es: " + positivos);
        System.out.println("La cantidad de numeros negativos es: " + negativos);
    }
}