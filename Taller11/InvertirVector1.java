package invertirvector1;
import java.util.Scanner;

public class InvertirVector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        
        int[] vector = new int[n];
        
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[n - i - 1];
            vector[n - i - 1] = temp;
        }

        System.out.print("El vector invertido es: [");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.print("]");
        sc.close();
    }
}