package primo2;
import java.util.Scanner;

public class Primo2 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        short n, c;
        boolean esPrimo;
        
        System.out.print("Ingrese un numero entero: ");
        n = sc.nextShort();
        
        esPrimo = true;
        c = (short)(n - 1);
        
        while (c >= 2){
            if (n % c == 0){
                 esPrimo = false;
                 c = 1;
            }else{
                c = (short)(c - 1);
            }
        }
        if (esPrimo){
            System.out.print("El numero "+n+" es primo.");
        }else{
            System.out.print("El numero "+n+" no es primo.");
        }
    }
}