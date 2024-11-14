package calculoimc3;
import java.util.Scanner;
public class CalculoIMC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        float peso, estatura, imc;

    System.out.print("Ingrese su peso en kilogramos: ");
        peso = sc.nextFloat();

        System.out.print("Ingrese su estatura en metros: ");
        estatura = sc.nextFloat();

        imc = peso / (estatura * estatura);

        if (imc < 18.5) {
            System.out.println("\nSu IMC es " + imc + ", lo que indica Infra Peso.");
        } else if (imc < 25) {
            System.out.println("\nSu IMC es " + imc + ", lo que indica Peso Normal.");
        } else if (imc < 30) {
            System.out.println("\nSu IMC es " + imc + ", lo que indica Sobre Peso.");
        } else if (imc < 35) {
            System.out.println("\nSu IMC es " + imc + ", lo que indica Obesidad Leve.");
        } else if (imc < 40) {
            System.out.println("\nSu IMC es " + imc + ", lo que indica Obesidad Media.");
        } else {
            System.out.println("\nSu IMC es " + imc + ", lo que indica Obesidad Mórbida.");
        }
        System.out.println("By Juan Tacui");
    }
}