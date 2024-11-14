package cuotafija1;
import java.util.Scanner;
public class CuotaFija1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int plazo;
        float monto, interes_anual, interes_mensual;
        float cuota_parcial, seguro_des, cuota_final;
        System.out.print("Ingrese monto total del préstamo: ");
        monto = sc.nextFloat();
        System.out.print("Ingrese plazo para pago de préstamo (en meses): ");
        plazo = sc.nextInt();
        System.out.print("Ingrese el % de la tasa de interés anual: ");
        interes_anual = sc.nextFloat();
        
        if (plazo < 3){
            System.out.print("\nError, el plazo no puede ser inferior a 3 ");
        } else {
            if (plazo > 36 && monto < 20000){
                System.out.print("\nError, el plazo no puede ser mayor a 36 en "
                        + "prestamos inferiores a USD 20000");
        } else {
                interes_mensual = interes_anual / 12 / 100;
                cuota_parcial= monto * ((interes_mensual * (float)Math.pow(1 + interes_mensual, plazo)) / ((float)Math.pow(1 + interes_mensual, plazo) - 1));
                seguro_des = cuota_parcial * (float)0.05 / 100;
                cuota_final = cuota_parcial + seguro_des;
                System.out.println("\nLA CUOTA MENSUAL A PAGAR ASCIENDE A: "+cuota_final);
            }
        }
        System.out.print("By Juan Tacuri");
    }  
}
