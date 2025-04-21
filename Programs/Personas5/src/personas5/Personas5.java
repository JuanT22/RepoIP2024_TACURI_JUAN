package personas5;

import java.io.*;
import java.util.*;

public class Personas5 {

    public static class EdadNegativaException extends Exception {
        public EdadNegativaException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            File archivo = new File("data/Personas.txt");
            Scanner f = new Scanner(archivo);
            String[] persona;
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> generos = new ArrayList();
            ArrayList<Integer> edades = new ArrayList();

            while (f.hasNextLine()) {
                persona = f.nextLine().split(",");
                nombres.add(persona[0]);
                generos.add(persona[1]);

                try {
                    int edad = Integer.parseInt(persona[2]); 
                    if (edad < 0) {
                        throw new EdadNegativaException("Edad negativa encontrada: " + edad); 
                    }
                    edades.add(edad); 
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir la edad: " + e.getMessage());
                }
            }
            f.close();

            int suma = 0, cf = 0;
            for (int i = 0; i <= edades.size() - 1; i++) {
                if (generos.get(i).equals("F")) {
                    suma += edades.get(i);
                    cf++;
                }
            }
            double media = (double) suma / cf;
            System.out.println("Promedio de edad de mujeres: " + media);

        } catch (FileNotFoundException e) {
            System.err.println("ERROR: Archivo no encontrado:\n" + e.getMessage());
        } catch (EdadNegativaException e) {
            System.err.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("ERROR general:\n" + e.getMessage());
        }
    }
}