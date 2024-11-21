package duraciondescarga1;
import java.util.Scanner;

public class DuracionDescarga1 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in); 
        
        float tamanoGB, velocidadMbps, tamanoBits, velocidadBits, tiempoSegundos;
        short horas, minutos, segundos;
        
        System.out.print("Ingrese el tamaño del archivo a descargar (en GB): ");
        tamanoGB = sc.nextFloat();
        System.out.print("Ingrese la velocidad efectiva de descarga (en Mbps): ");
        velocidadMbps = sc.nextFloat();

        tamanoBits = (float)(tamanoGB * 8 * Math.pow(1024, 3)); 
        velocidadBits = (float)(velocidadMbps * Math.pow(1024, 2)); 
        tiempoSegundos = tamanoBits / velocidadBits;

        horas = (short)(tiempoSegundos / 3600);
        tiempoSegundos = tiempoSegundos % 3600;
        minutos = (short)(tiempoSegundos / 60);
        segundos = (short)(tiempoSegundos % 60);

        System.out.println("\nEl tiempo de descarga es: " + horas + " horas, " 
                + minutos + " minutos, " + segundos + " segundos");
        System.out.print("By Juan Tacuri");
    }
}