package potencia1;
import java.util.Scanner;
public class Potencia1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        double resultado;
        System.out.print("Ingrese un numero entero: ");
        x = sc.nextInt();
        System.out.print("Ingrese el numero del exponente: ");
        y = sc.nextInt();
        resultado = calcularpotencia(x,y);
        System.out.println("El resultado de "+x+" elevado a "+y+" es igual a: "
                +resultado);
}
    //Funcion para exponente
    public static long calcularpotencia(int x, int y){
        long resultado;
        if (y == 0){
            resultado = 1;
        }else{
            resultado = x * calcularpotencia(x, y - 1);
        }
        return resultado;
    }
}