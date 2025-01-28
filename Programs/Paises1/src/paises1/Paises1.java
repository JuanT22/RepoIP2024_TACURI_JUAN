package paises1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Paises1 {
    public static void main(String[] args) {
        String nombreArchivo = "Paises.csv";
        double maxDensidad = -1;
        String nombrePais = "";
        String codigoPais = "";

        try (BufferedReader br = new BufferedReader(new FileReader("data/Paises.csv"))) {
            br.readLine(); // Saltar encabezado
            
            String linea;
            int numLinea = 1;
            
            while ((linea = br.readLine()) != null) {
                numLinea++;
                linea = linea.trim();
                if (linea.isEmpty()) continue;
                
                String[] campos = linea.split(":");
                if (campos.length < 4) {
                    System.err.println("Error en línea " + numLinea + ": Formato incorrecto");
                    continue;
                }
                
                try {
                    String nombre = campos[0];
                    String codigo = campos[1];
                    int poblacion = Integer.parseInt(campos[2]);
                    double superficie = Double.parseDouble(campos[3]);
                    
                    if (superficie <= 1000) continue;
                    
                    double densidad = poblacion / superficie;
                    
                    if (densidad > maxDensidad) {
                        maxDensidad = densidad;
                        nombrePais = nombre;
                        codigoPais = codigo;
                    }
                    
                } catch (NumberFormatException e) {
                    System.err.println("Error en línea " + numLinea + ": Valores numéricos inválidos");
                }
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado - " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
        
        if (maxDensidad != -1) {
            System.out.println("Nombre: " + nombrePais);
            System.out.println("Código: " + codigoPais);
            System.out.printf("Densidad poblacional: %.2f hab/km²%n", maxDensidad);
        } else {
            System.out.println("No se encontraron países que cumplan los criterios.");
        }
    }
}