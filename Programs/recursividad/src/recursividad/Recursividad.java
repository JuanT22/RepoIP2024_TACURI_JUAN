package recursividad;
public class Recursividad {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc, num, res, b, e;
        do{
            opc = metodos.menu();
            switch(opc){
                case 1 ->{
                    System.out.println("Numero a calcular");
                    num = metodos.sc.nextInt();
                    System.out.println(metodos.factorial(num));
                }
                case 2 ->{
                    System.out.println("Ingrese la base: ");
                    b = metodos.sc.nextInt();
                    System.out.println("Ingrese el exponente: ");
                    e = metodos.sc.nextInt();
                    System.out.println(metodos.potencia(b, e));
                }    
            }
        }
    }   
}
