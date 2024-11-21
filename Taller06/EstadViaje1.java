package estadviaje1;
import java.util.Scanner;

public class EstadViaje1 {   
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        float kilometros, horas, galones, litros, rendimiento, velocidad;

        System.out.println("           ESTADISTICAS DE VIAJE           ");
        System.out.print("Ingrese el total de kilómetros recorridos: ");
        kilometros = sc.nextFloat();
        System.out.print("Ingrese la duración del viaje en horas: ");
        horas = sc.nextFloat();
        System.out.print("Ingrese la cantidad de galones consumidos: ");
        galones = sc.nextFloat();

        litros = (float)(galones * 3.785); 
        rendimiento = kilometros / litros;

        velocidad = (kilometros * 1000) / (horas * 3600); 

        System.out.println("\nEl rendimiento del auto en Km/lt fue de: "+ rendimiento);
        System.out.println("La velocidad media del viaje fue de: " + velocidad + " m/s");
        System.out.print("By Juan Tacuri");
    }
}