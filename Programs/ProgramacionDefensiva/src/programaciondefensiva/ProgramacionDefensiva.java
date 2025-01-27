package programaciondefensiva;
import java.util.Scanner;
public class ProgramacionDefensiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        boolean datovalido = false;
        System.out.println("Raiz cuadrada de un numero");
        System.out.println("==========================\n");
        while(datovalido == false){
            try{
                System.out.print("Por favor ingrese un numero entero positivo: ");
                num = Integer.parseInt(sc.nextLine());
                if(num <= 0) {
                    throw new Exception("El numero ingreado no es positivo");
                }else{
                    datovalido = true;
                }
            }catch (NumberFormatException e){
                System.err.println("El valor ingresado no es un entero");
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        System.out.println("\nRaiz cuadrada: "+Math.sqrt(num));
    }
}