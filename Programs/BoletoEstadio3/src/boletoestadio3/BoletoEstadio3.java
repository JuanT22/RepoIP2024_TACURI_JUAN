package boletoestadio3;
import java.util.Scanner;

public class BoletoEstadio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, localidad;
        char genero;
        float precio, descuento, precioFinal;
        
        precio = 0;
        descuento = 0;

        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
        System.out.print("Ingrese el género (M/F): ");
        genero = sc.next().toUpperCase().charAt(0);
        System.out.println("Seleccione la localidad:");
        System.out.println("1. Palco");
        System.out.println("2. Tribuna");
        System.out.println("3. Preferencia");
        System.out.println("4. General");
        System.out.print("Ingrese el número de la localidad: ");
        localidad = sc.nextInt();

        switch (localidad) {
            case 1:
                precio = 35;
                break;
            case 2:
                precio = 25;
                break;
            case 3:
                precio = 20;
                break;
            case 4:
                precio = 10;
                break;
            default:
                System.out.println("Localidad inválida");
                return; 
        }
        if (genero == 'F') {
            if (edad < 13) {
                descuento = (float)0.50;
            } else {
                descuento = (float)0.25; 
            }
        } else if (genero == 'M' && edad < 13) {
            descuento = (float)0.40; 
        }

        precioFinal = precio * (1 - descuento);

        System.out.println("\nEl valor a pagar del boleto es: $" + precioFinal);
        System.out.print("By Juan Tacuri");
    }
}