package fibonacci1;
import java.util.Scanner;
public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n, c;
        short fib_anterior, fib_nuevo, proximo;
        
        System.out.print("Ingrese los elementos fibonacci a mostrar: ");
        n = sc.nextByte();
        fib_anterior = 0;
        System.out.println(fib_anterior);
        fib_nuevo = 1;
        for (c=2; c <= n; c++){
            System.out.println(fib_nuevo);
            proximo = (short)(fib_anterior + fib_nuevo);
            fib_anterior = fib_nuevo;
            fib_nuevo = proximo;
        }
    }   
}