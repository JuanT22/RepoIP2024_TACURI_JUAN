package ciudades2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ciudades2 {

    public static void main(String[] args) {
        try{
            FileWriter archivo = new FileWriter("data/ciudades2.txt",true);
            PrintWriter pw = new PrintWriter(archivo);
            Scanner sc = new Scanner(System.in);
            short n; 
            String ciudad, pais;
            int poblacion;
            System.out.print("Cuantas ciuades quiere ingresar: ");
            n = sc.nextShort();
            sc.nextLine();
            for(short c = 1; c <= n; c++){
                System.out.println("Ingrese los datos de la ciudad "+c);
                System.out.print("Nombre: ");
                ciudad = sc.nextLine();
                System.out.print("Poblacion: ");
                poblacion = sc.nextInt();
                sc.nextLine();
                System.out.print("Pais: ");
                pais = sc.nextLine();
                pw.println(ciudad+","+poblacion+","+pais);
            }
            
            pw.close();
            
        }catch (Exception e){
            System.err.println("ERROR "+e.getMessage());
        }
    } 
}
