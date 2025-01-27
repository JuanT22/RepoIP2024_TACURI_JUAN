package provinciasecuador1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProvinciasEcuador1 {

    public static void main(String[] args) {
        try{
            File archivo = new File("data/ProvinciasEcuador.txt");
            Scanner sc = new Scanner(archivo);
            String[] provincia;
            
            if(!sc.hasNextLine()){
                throw new Exception ("ERROR: Esta vacio"); 
            }
            
            System.out.println("PROVINCIA                      POBLACION                      AREA");
            System.out.println("============================== ============================== ==============================");
            while (sc.hasNextLine()){
                provincia = sc.nextLine().split(":");
                
                if (provincia[0].length() > 27) {
                    provincia[0] = provincia[0].substring(0,27);
                } 
                
                System.out.printf("%-30s %,30d %,30d%n", 
                        provincia[0],Integer.parseInt(provincia[1]), Integer.parseInt(provincia[2]));
            }
            sc.close();
        
        } catch(FileNotFoundException e){
            System.err.println("ERROR: Archivo no encontrado en la ruta especificada");
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("ERROR: Los datos estan incompletos");
        } catch(NumberFormatException e){   
            System.err.println("ERROR: El formato de los datos numericos es incorrecto");
        } catch (Exception e){
            System.err.println("ERROR: "+e.getMessage());
        } finally{
            System.out.println("GRACIAS POR USAR EL PROGRAMA!!!");
        }
    }
}