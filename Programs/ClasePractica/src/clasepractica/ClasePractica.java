package clasepractica;

public class ClasePractica {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do{
            opc = obj.menu();
            switch (opc){
                case 1 -> 
                    obj.carXcar();
                case 2 ->
                    obj.repetirCaracter();
                case 3 -> 
                    obj.palindromo();
                case 4 -> 
                    obj.contarVocales();
                case 5 -> 
                    obj.tornado();
            }
        }while(opc != 0);
    }
}
