package hillcipher;
public class HillCipher {

    public static String encrypt(String plaintext, int[][] key) {
        validarClave(key);
        int n = key.length;
        String textoProcesado = procesarTexto(plaintext, n);
        return cifrarTexto(textoProcesado, key);
    }

    private static void validarClave(int[][] key) {
        int n = key.length;
        for (int[] fila : key) {
            if (fila.length != n) {
                throw new IllegalArgumentException("La clave debe ser una matriz cuadrada");
            }
        }
    }

    private static String procesarTexto(String texto, int bloque) {
        StringBuilder sb = new StringBuilder();
        for (char c : texto.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        int padding = (bloque - (sb.length() % bloque)) % bloque;
        for (int i = 0; i < padding; i++) {
            sb.append('X');
        }
        return sb.toString();
    }

    private static String cifrarTexto(String texto, int[][] clave) {
        int n = clave.length;
        StringBuilder cifrado = new StringBuilder();
        
        for (int i = 0; i < texto.length(); i += n) {
            String bloque = texto.substring(i, i + n);
            int[] vector = convertirANumeros(bloque);
            int[] resultado = multiplicarMatriz(clave, vector);
            cifrado.append(convertirATexto(resultado));
        }
        
        return cifrado.toString();
    }

    private static int[] convertirANumeros(String bloque) {
        int[] numeros = new int[bloque.length()];
        for (int i = 0; i < bloque.length(); i++) {
            numeros[i] = bloque.charAt(i) - 'A';
        }
        return numeros;
    }

    private static int[] multiplicarMatriz(int[][] clave, int[] vector) {
        int[] resultado = new int[clave.length];
        for (int i = 0; i < clave.length; i++) {
            for (int j = 0; j < clave.length; j++) {
                resultado[i] += clave[i][j] * vector[j];
            }
            resultado[i] = Math.floorMod(resultado[i], 26);
        }
        return resultado;
    }

    private static String convertirATexto(int[] numeros) {
        StringBuilder sb = new StringBuilder();
        for (int num : numeros) {
            sb.append((char) (num + 'A'));
        }
        return sb.toString();
    }

// Ejemplo de uso
    public static void main(String[] args) {
        int[][] claveEjemplo = {
            {6, 24},
            {13, 16}
        };
        String textoOriginal = "HELLO";
        String textoCifrado = encrypt(textoOriginal, claveEjemplo);
        System.out.println("Texto cifrado: " + textoCifrado);
    }
}
//By Juan Tacuri