package observer_rxjava.ejemplo2;

public class Main {
    public static void main(String[] args) {
        ServicioNoticias servicioNoticias = new ServicioNoticias();
        VistaConsola vistaConsola = new VistaConsola(servicioNoticias);

        vistaConsola.iniciar();

        // Simular que la aplicación está corriendo por un tiempo
        try {
            Thread.sleep(5000); // 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        vistaConsola.detener();
    }
}

