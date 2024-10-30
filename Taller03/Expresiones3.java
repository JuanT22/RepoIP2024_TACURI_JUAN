public class Expresiones3 {
    public static void main(String[] args) {

        System.out.println("UNIDADES DE ALMACENAMIENTO");
        System.out.println("===========================");

        System.out.println("\nProblema 1:");
        System.out.println("-------------");
        System.out.println("Suponga que su conexión de internet tiene una velocidad efectiva de descarga de 5Mbps (5 Mbits por segundo). ¿Cuántos minutos tardaría en descargarse una película que pesa 8GB?");
        
        double velocidadMbps = 5; 
        double tamanoGB = 8; 
        double velocidadMBps = velocidadMbps / 8; 
        double tamanoMB = tamanoGB * 1024; 
        double tiempoSegundos = (tamanoMB / velocidadMBps); 
        double tiempoMinutos = tiempoSegundos / 60;

        System.out.println("\nRESPUESTA: En total tardaría " + tiempoMinutos + " minutos");
        System.out.println();

        System.out.println("\nProblema 2:");
        System.out.println("-------------");
        System.out.println("\nSi en promedio en todo el mundo se envían 356 mil tweets por minuto y cada tweet en promedio pesa 2180 kB. ¿De cuánto espacio de almacenamiento debe disponer la compañía Twitter Inc. para almacenar los tweets que se escribirán en los próximos 10 años?");

        double tweetsPorMinuto = 356000; 
        double tamanoTweetKB = 2180; 
        int anos = 10; 

        double minutosEnUnAno = 60 * 24 * 365; 
        double totalMinutos = minutosEnUnAno * anos;
        double totalTweets = tweetsPorMinuto * totalMinutos;
        double espacioTotalKB = totalTweets * tamanoTweetKB;
        double espacioTotalTB = espacioTotalKB / Math.pow(1024, 4);

        System.out.println("\nRESPUESTA: Twitter requiere en total " +espacioTotalKB+ "KB o " +espacioTotalTB+"TB para almacenar los tweets de los próximos 10 años.");

        System.out.println("\nProblema 3:");
        System.out.println("-------------");
        System.out.println("\nUn fotógrafo utiliza una cámara de alta definición para capturar fotos panorámicas en excursiones a reservas naturales. Para almacenar las fotos lleva Memory Sticks de 32GB cada una. ¿Cuántos Memory Stick debe llevar para almacenar 500 fotos de alta definición de 64MB cada una, 2000 fotos de mediana definición de 8300kB cada una y 50 videos de 4GB cada uno?");

        int capacidadMemoryStickGB = 32; 
        int fotosAltaDefinicion = 500;
        int tamanoFotoAltaDefinicionMB = 64;
        int fotosMedianaDefinicion = 2000;
        int tamanoFotoMedianaDefinicionKB = 8300;
        int videos = 50;
        int tamanoVideoGB = 4;

        double espacioTotalGB = 
                (fotosAltaDefinicion * tamanoFotoAltaDefinicionMB / 1024.0) + 
                (fotosMedianaDefinicion * tamanoFotoMedianaDefinicionKB / Math.pow(1024, 2)) + 
                (videos * tamanoVideoGB);

        int numMemorySticks = (int) Math.ceil(espacioTotalGB / capacidadMemoryStickGB);

        System.out.println("\nRESPUESTA: El fotógrafo necesita " + numMemorySticks + " Memory Sticks.");
        System.out.print("\nBy Juan Israel Tacuri");  
    }
}