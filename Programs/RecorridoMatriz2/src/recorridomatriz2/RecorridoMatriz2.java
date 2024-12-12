package recorridomatriz2;
import java.util.Scanner;
public class RecorridoMatriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        short cneg;
        byte f,c;
        
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        f = sc.nextByte();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        c = sc.nextByte();
        int matriz[][] = new int[f][c];
        
        System.out.println("Ingrese los elementos de la Matriz: ");
        System.out.println("====================================");
        for (byte i = 0; i<f; i++){
            for (byte j = 0; j<c; j++){
                System.out.print("Elemento ["+(i+1)+","+(j+1)+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        cneg = 0;
        for (byte i = 0; i<f; i++){
            for (byte j = 0; j<c; j++){
               if (matriz[i][j] < 0){
                    cneg++;
                    matriz[i][j] = matriz[i][j] * (-1);
               }
            }
        }
        System.out.println("\nSe encontraron "+cneg+" elementos negativos");
        System.out.println("La Matriz convertida es: ");
        for (byte i = 0; i<f; i++){
            for (byte j = 0; j<c; j++){
                System.out.println("Elemento ["+(i+1)+","+(j+1)+"]: "
                        +matriz[i][j]);
            }
        }
    }
}