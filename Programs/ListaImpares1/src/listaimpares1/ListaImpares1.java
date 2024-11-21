package listaimpares1;
import java.util.Scanner;

public class ListaImpares1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    short n, i, c;
    System.out.print("Cuantos impares quiere que se muestre: ");
    n = sc.nextShort();
    
    i = 1;
    c = 1;
    while (c <= n) {
        System.out.print(i+", ");
        i = (short)(i + 2);
        c = (short)(c + 1);   
        }
    }
}