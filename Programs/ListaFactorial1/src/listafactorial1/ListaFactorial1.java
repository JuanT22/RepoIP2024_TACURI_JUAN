package listafactorial1;
import java.util.Scanner;

public class ListaFactorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, par;
        
        System.out.print("Ingrese la cantidad de pares a procesar: ");
        n = sc.nextInt();
        System.out.print("El factorial de los "+ n +" primeros pares son: ");
        for (int c = 1; c <= n; c++){
            par = c * 2;
            System.out.print(factorial(par) + ", ");
        }
        System.out.println();
    }
    public static int factorial(int num){
        int fact = 1;
        for (int c = 2; c <= num; c++){
            fact *= c;
        }
        return fact;
    }
}