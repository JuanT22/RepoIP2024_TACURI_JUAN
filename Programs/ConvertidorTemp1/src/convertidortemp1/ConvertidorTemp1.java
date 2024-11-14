package convertidortemp1;
import java.util.Scanner;
public class ConvertidorTemp1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String medida;
        float temperatura, tempcel, tempfah;  
        System.out.print("Ingrese su temperatura: ");
        temperatura = sc.nextFloat();
        sc.nextLine();
        System.out.print("Ingrese la unidad de medida Celsius(C) o Fahrenheit(F): ");
        medida = sc.nextLine();
        tempcel = (float)5 / 9 * (temperatura - 32);
        tempfah = (float)9 / 5 * temperatura + 32;
        if (medida.equals("C") || medida.equals("c")){
            System.out.print("El valor de tu temperatura covertido a Fahrenheit es: "+tempfah);
        } else {
            System.out.print("El valor de tu temperatura covertido a Fahrenheit es: "+tempcel);
        }
    }  
}
