package operarnumero1;
import java.util.Scanner;
public class OperarNumero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, suma;
        System.out.print("Ingrese el primero numero: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        suma = sumar(n1,n2);
        System.out.println("La suma es: "+suma);
    }
    public static int sumar(int x, int y){
        int s;
        s = x + y;
        return s;
    }
}
