package personas4;

import java.io.FileReader;
import java.io.BufferedReader;

public class Personas4 {

    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("data/Personas.txt");
            BufferedReader br = new BufferedReader(archivo);

            System.out.printf("%-20s %-3s\n", "Nombre", "Edad");
            System.out.println("-------------------- ---");

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");
                String nombre = datos[0].trim();
                int edad = Integer.parseInt(datos[2].trim());

                if (edad > 50) {
                    System.out.printf("%-20s %3d\n", nombre, edad);
                }
            }

            br.close();

        } catch (Exception e) {
            System.err.println("ERROR " + e.getMessage());
        }
    }
}