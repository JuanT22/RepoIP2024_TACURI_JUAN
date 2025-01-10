package numerocapicua1;
import java.util.Scanner;
public class NumeroCapicua1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numeroOriginal, numeroInvertido, digito;
        
        System.out.println("Determinar si tu número entero es capicua");
        System.out.print("Ingrese el numero entero: ");
        num = sc.nextInt();
        numeroOriginal = num;
        numeroInvertido = 0;
        
        while(num >0){
            digito = num % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            num = num / 10;
        }
        if (numeroOriginal == numeroInvertido){
            System.out.println("EL numero "+numeroOriginal+" si es capicua");
        }else{
            System.out.println("El numero "+numeroOriginal+" no es capicua");
        }
    }    
}