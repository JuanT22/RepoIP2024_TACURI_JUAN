package recursividad;
import java.util.Scanner;

public class Metodos {
    Scanner sc;
    
    public Metodos(){
        this.sc = new Scanner(System.in);
    }
    
    public int menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("Factorial de un numero");
        System.out.println("Potencia de un numero");
        System.out.println("N Fobonacci");
        System.out.println("Salir");
        return sc.nextInt();
    }
    
    public int factorial(int n){
        if(n == 1)
            return n;
        else
            return n*factorial(n-1);
    }
    
    public int potencia(int b, int e){
        if(e == 1)
            return b;
        else
            return b*potencia(b, e-1);
    }
    
    public int fibo(int n){
        if((n == 1)||(n == 0)   )
            return n;
        else 
            return fibo(n - 1)+fibo(n-2);
        
    }
}