package provincias2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Provincias2 {

    public static void main(String[] args) {
        try {
            File archivo = new File("data/provincias.txt");
            Scanner sc = new Scanner(archivo);
            String[] provincia;
            int suma;
            float promedio;
            
            ArrayList<String> nombresProv = new ArrayList();
            ArrayList<Byte> nombresCant = new ArrayList();
            
            while (sc.hasNextLine()){
                //provincia = sc.nextLine();
                provincia = sc.nextLine().split(",");
                
                nombresProv.add(provincia[0]);
                nombresCant.add(Byte.parseByte(provincia[1]));
            }
            sc.close();
            
            suma=0;
            for(int i=0; i<=nombresProv.size()-1; i++){
                System.out.println("Viva "+nombresProv.get(i)+" y sus "
                        +nombresCant.get(i)+" cantones!");
                suma += nombresCant.get(i);
            }
            promedio = (float) suma / nombresProv.size();   
            
            System.out.printf("\nEn promedio son %.2f cantonces por provincia%n"
                    ,promedio);
            
        }catch (Exception e){
            System.err.println("ERROR "+e.getMessage());
        }
    }    
}