package clasepractica;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    
    public int menu(){
        System.out.println("\n==MENU PRINCIPAL==");
        System.out.println("[1] Impresion caracter por caracter");
        System.out.println("[2] Repeticion de caracter");
        System.out.println("[3] Determinar Palindromo");
        System.out.println("[4] Contar vocales");
        System.out.println("[5] Tornado");
        System.out.println("[0] SALIR");
        return sc.nextInt();
    }
    public String leerCadena(){
        String cadena;
        sc.nextLine();
        System.out.print("Escriba la cadena: ");
        cadena = sc.nextLine();
        return cadena;
    }
    public void carXcar(){
        String cadena = leerCadena();
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i)+" ");
            
        }
    }
    public void repetirCaracter() {
        String cadena = leerCadena();
        System.out.print("Ingrese el caracter a buscar: ");
        char c = sc.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == c) {
                contador++;
            }
        }
        System.out.println("El caracter '" + c + "' se repite " + contador + " veces");
    }
    public String deleteEspacioMayusMinus(String cadena){
        return cadena.toLowerCase().replace(" ", "");
    }
    public void palindromo(){
        String cadena = leerCadena();
        boolean sies = true;
        cadena = deleteEspacioMayusMinus(cadena);
        for(int i = 0; i < cadena.length()/2 ; i++){
            if(cadena.charAt(i) != cadena.charAt(cadena.length()-1-i)){
                sies = false;
                break;
        }
            if(sies)
                System.out.println("Si es palindromo");
            else
                System.out.println("No es palindromo");
        }
    }
    public void contarVocales() {
    String cadena = leerCadena();
    cadena = cadena.toLowerCase();

    int contador = 0;
    for (int i = 0; i < cadena.length(); i++) {
        char c = cadena.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            contador++;
        }
    }
    System.out.println("La cantidad de vocales es: " + contador);
    }
    public void tornado() {
    String cadena = leerCadena();

    while (cadena.length() > 0) {
        System.out.println(cadena);
        if (cadena.length() <= 2) {
            break; 
        }
        cadena = cadena.substring(1, cadena.length() - 1);
        }
    }
}   