package recorridomatriz1;
import java.util.Scanner;
public class RecorridoMatriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matriz[][] = new int [3][4];
        short cneg;
        
        System.out.println("Ingrese los elementos de la Matriz: ");
        System.out.println("====================================");
        for (byte i = 0; i<=2; i++){
            for (byte j = 0; j<=3; j++){
                System.out.print("Elemento ["+(i+1)+","+(j+1)+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        cneg = 0;
        for (byte i = 0; i<=2; i++){
            for (byte j = 0; j<=3; j++){
               if (matriz[i][j] < 0){
                    cneg++;
                    matriz[i][j] = matriz[i][j] * -1;
               }
            }
        }
        System.out.println("\nSe encontraron "+cneg+" elementos negativos");
    }
}
