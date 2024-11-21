package estadnumeros1;
import java.util.Scanner;

public class EstadNumeros1 {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in); 
        
        short num, suma, cn;
        System.out.print("Ingrese números positivos y negativos (para terminar digite 0): ");
        num = 1;
        suma = 0;
        cn = 0;
        while (num != 0){
            num = sc.nextShort();
            if (num < 0){
                cn = (short)(cn + 1);   
            }
            suma = (short)(suma + num);
        }
        System.out.println("\nEn total usted ingresó " +cn+ " números negativos");
        System.out.println("La suma de los números ingresados es: " +suma);
        System.out.println("By Juan Tacuri");
    }    
}