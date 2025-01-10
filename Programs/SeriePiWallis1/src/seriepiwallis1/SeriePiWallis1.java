package seriepiwallis1;
public class SeriePiWallis1 {

    public static void main(String[] args) {

        double pi = 2.0; 
        double numerador = 2.0;
        double denominador = 1.0;
        
        //Se puede ajustar el número de iteraciones
        for (int i = 1; i <= 10000; i++) { 
            pi *= numerador / denominador;
            
            if (i % 2 == 0) {
                numerador += 2;
            } else {
                denominador += 2;
            }
        }

        System.out.println("El valor aproximado de Pi es: " + pi);
    }
}