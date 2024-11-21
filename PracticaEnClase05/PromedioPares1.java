package promediopares1;
import java.util.Scanner;
public class PromedioPares1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n, suma = 0, contador = 0, par = 2;
        float promedio;
        System.out.print("Ingrese la cantidad de numeros pares: ");
        n = sc.nextShort();
        
        while (contador < n) {
            suma += (short)par;
            contador++;
            par += 2;
        }
        promedio = (float)suma / n;
        
        System.out.println("Suma: "+suma);
        System.out.println("Promedio: "+promedio);
        System.out.print("By Juan Tacuri");
    }
}