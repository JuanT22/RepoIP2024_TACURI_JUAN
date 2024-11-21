package estadnumeros3;
import java.util.Scanner;
public class EstadNumeros3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte n;
        int v, suma = 0, c = 1, mayor = 0;
        float media;
        
        System.out.print("Ingrese la cantidad de los valores: ");
        n = sc.nextByte();
        while (c <= n) { 
            System.out.print("Ingrese valor "+c+": ");
            v = sc.nextInt();
            if (v > mayor){
                mayor = v;
            }        
            suma = suma + v;
            c++;
        }
        media = (float)suma / n;

        System.out.println("La media aritmetica de los "+n+" numeros es "+media);
        System.out.println("El mayor de los numeros ingresados es: "+mayor);
    }
}