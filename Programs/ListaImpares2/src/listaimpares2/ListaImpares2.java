package listaimpares2;
import java.util.Scanner;

public class ListaImpares2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    short n, i;
    System.out.print("Indique el rango limite para mostrar impares: ");
    n = sc.nextShort();
    
    i = 1;
    while (i <= n) {
        System.out.print(i+", ");
        i = (short)(i + 2);  
        }
    }
}