package listanumprimos1;
import java.util.Scanner;

public class ListaNumPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte ele_mostrar;
        int num;
        String esPrimo;
        int c;

        System.out.print("Ingrese la cantidad de primos a mostrar: ");
        ele_mostrar = scanner.nextByte();

        int encontrados = 0;
        num = 2;

        while (encontrados < ele_mostrar) {
            esPrimo = "S";
            c = num - 1;
            while (c >= 2) {
                if (num % c == 0) {
                    esPrimo = "N";
                }
                c--;
            }
            if (esPrimo.equals("S")) {
                System.out.println(num);
                encontrados++;
            }
            num++;
        }
    }
}