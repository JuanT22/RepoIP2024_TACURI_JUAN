package validafecha1;
import java.util.Scanner;
public class ValidaFecha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        short a;
        byte m, d, dmax; 

        System.out.print("Ingrese el año: ");
        a = sc.nextShort();
        System.out.print("Ingrese el mes: ");
        m = sc.nextByte();
        System.out.print("Ingrese el dia: ");
        d = sc.nextByte();        

        if (a < 1970 || a > 2024 || m <= 0 || m > 12 || d < 1) {
            System.out.println("\nFecha incorrecta");
        }else{
            dmax = 31;          
            if (m == 2) {
                if (a % 4 == 0 && !( a % 100 == 0 && a % 400 != 0)){
                    dmax = 29;
                }else{
                    dmax = 28;
                }
            }else{
                if( m == 4 || m == 6 || m == 9 || m == 11){
                    dmax = 30;
                } 
            }
            if (d > dmax){
                System.out.println("\nFecha incorrecta");
            }else{
                System.out.println("\nFecha correcta");               
            }
        }
        System.out.println("By Juan Tacuri");
    }
}