public class Expresiones2 {
    public static void main(String[] args) {

        System.out.println("EVALUACIONES DE EXPRESIONES");
        System.out.println("===========================");

        // Expresión 1: 2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) / 5 ^ 2
        double expresion1 = 2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) / (5 ^ 2);
        System.out.println("\nExpresión 1:");
        System.out.println("    2 * 8 / 2.0 / 2 - 22 * 4 / 8.0 - (100 + 25) / 5 ^ 2");
        System.out.println("Resultado:");
        System.out.println(expresion1);
        
        // Expresión 2: (2 * 16 / 2 ^ 3 - 4) + 32 - (125 / 5 / 5 + 3)
        double expresion2 = (2 * 16 / (2 ^ 3) - 4) + 32 - (125 / 5 / 5 + 3);
        System.out.println("\nExpresión 2:");
        System.out.println("    (2 * 16 / 2 ^ 3 - 4) + 32 - (125 / 5 / 5 + 3)");
        System.out.println("Resultado:");
        System.out.println(expresion2);
        
        // Expresión 3: 12 >= 12 OR 8 > 4 AND 22 < 21
        boolean expresion3 = 12 >= 12 || 8 > 4 && 22 < 21;
        System.out.println("\nExpresión 3:");
        System.out.println("    12 >= 12 OR 8 > 4 AND 22 < 21");
        System.out.println("Resultado:");
        System.out.println(expresion3);
        
        // Expresión 4: (12 >= 12 or 8 > 4) and 22 < 21
        boolean expresion4 = (12 >= 12 || 8 > 4) && 22 < 21;
        System.out.println("\nExpresión 4:");
        System.out.println("    (12 >= 12 or 8 > 4) and 22 < 21");
        System.out.println("Resultado:");
        System.out.println(expresion4);
        
        // Expresión 5: 1 + 8 * (12 - 3 - 9 / (9 - 4 * 5) + 7) - 2.8 * 2 and 3 ^ 4 + 100 - 19
        double resultado = 1 + 8 * (12 - 3 + 9 / (9 - 4 * 5) + 7); 
        boolean expresion5 = resultado > 2.8 * 2 && Math.pow(3, 4) == 100 - 19; 
        System.out.println("\nExpresión 5:");
        System.out.println("    1 + 8 * (12 - 3 - 9 / (9 - 4 * 5) + 7) - 2.8 * 2 and 3 ^ 4 + 100 - 19");
        System.out.println("Resultado:");
        System.out.println(expresion5);
        
        int a = 100;
        int b = -12;
        int c = 4000;
        int d = 5;
        int e = 1;
        boolean expresion6 = (a + b * c + e) <= (e * d * b) && (c / a + e - d) < (e + d - c + b * a);
        System.out.println("\nExpresión 6:");
        System.out.println("    (a + b * c + d * e ^ f * b AND c) / a * e - d + c + c ^ b * a");
        System.out.println("    donde: a = 100, b = -12, c = 4000, d = 5, e = 0");
        System.out.println("Resultado:");
        System.out.println(expresion6);
        
        
        boolean V = true;
        boolean F = false;
        boolean expresion7 = V || F && (V || !(F || V && V));        System.out.println("\nExpresión 7:");
        System.out.println("    V or F and (V or not (F or V and V))");
        System.out.println("Resultado:");
        System.out.println(expresion7);

        boolean expresion8 = false || 1 == Math.pow((Math.pow(2, 3) / 4), 0) && !(Math.pow(2, -1) < 0);        System.out.println("\nExpresión 8:");
        System.out.println("    Falso OR 1 = (2 * 3 / 4) ^ 0 AND NOT(2 ^ -1 < 0)");
        System.out.println("Resultado:");
        System.out.println(expresion8);

        System.out.println("\nBy Juan Israel Tacuri");
    }
}