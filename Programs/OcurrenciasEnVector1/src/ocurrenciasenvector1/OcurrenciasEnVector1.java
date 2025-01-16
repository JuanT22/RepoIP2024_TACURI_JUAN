package ocurrenciasenvector1;
import java.util.Scanner;

public class OcurrenciasEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int[] numerosOrdenados = ordenar(numeros);
        listarOcurrencias(numerosOrdenados);
    }

    public static int[] ordenar(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar numeros[j] y numeros[j+1]
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        return numeros;
    }

    public static void listarOcurrencias(int[] numeros) {
        int contador = 1;
        int valorActual = numeros[0];

        System.out.println("Valor\tOcurrencias");
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == valorActual) {
                contador++;
            } else {
                System.out.println(valorActual + "\t" + contador);
                valorActual = numeros[i];
                contador = 1;
            }
        }
        System.out.println(valorActual + "\t" + contador);
    }
}