public class PrecioTV1 {

    public static void main(String[] args) {
        
        float precioTelevisor = 837;
        float porcentajeIVA = 15; 
        float iva = precioTelevisor * (porcentajeIVA / 100);
        float precioTotal = precioTelevisor + iva;

        System.out.println("El precio del televisor con iva es: " + precioTotal + "USD");
    }
}