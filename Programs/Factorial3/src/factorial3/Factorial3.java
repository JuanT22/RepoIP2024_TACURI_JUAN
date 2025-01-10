package factorial3;
import java.util.Scanner;
public class Factorial3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingrese un numero entero positivo: ");
        numero = sc.nextInt();
        
        System.out.println("El factorial de "+numero+ " es "+factorial(numero));
    }
    //Funcion para calcular el factorial usando recursividad
    public static long factorial (int x) {
        long fact;
        
        if (x == 0){
            fact = 1;
        }else{
        fact = x * factorial(x - 1);
        }
        
        return fact;
    }
}
