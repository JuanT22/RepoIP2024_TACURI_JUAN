package estadnumeros2;
import java.util.Scanner;

public class EstadNumeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0, cn = 0, totalNumeros = 0, cp = 0;
        double promedioTotal = 0, promedioPositivos = 0;

        System.out.print("Ingrese números positivos y negativos (para terminar digite 0): ");

        do {
            num = sc.nextInt();
            if (num != 0) {
                totalNumeros = totalNumeros + 1; 
                suma = suma + num;
                if (num < 0) {
                    cn = cn + 1;
                } else {
                    cp = cp + 1;
                    promedioPositivos = promedioPositivos + num;
                }
            }
        } while (num != 0);

        if (totalNumeros > 0) {
            promedioTotal = (double) suma / totalNumeros;
            if (cp > 0) {
                promedioPositivos = promedioPositivos / cp;
            }
        }
        System.out.println("En total usted ingresó " + cn + " números negativos");
        System.out.println("La suma de los números ingresados es " + suma);
        System.out.println("Total de números ingresados: " + totalNumeros);
        System.out.println("Cantidad de números positivos: " + cp);
        System.out.println("Promedio de todos los números: " + promedioTotal);
        System.out.println("Promedio de los números positivos: " + promedioPositivos);
        System.out.println("By Juan Tacuri");
    }
}
