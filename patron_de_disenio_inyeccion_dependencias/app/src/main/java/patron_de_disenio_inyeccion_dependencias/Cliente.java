package patron_de_disenio_inyeccion_dependencias;

/*
 * Clase que depende del servicio:
 * Representa el cliente que necesita un servicio para realizar su operación.
 * Utiliza la inyección de dependencias a través del constructor para recibir la instancia del servicio.
 */
public class Cliente {
    private Servicio servicio;

    /*
     * Constructor con inyección de dependencias:
     * Permite inyectar una instancia de Servicio al crear una instancia de Cliente.
     */
    public Cliente(Servicio servicio) {
        this.servicio = servicio;
    }

    /*
     * Método que realiza una operación utilizando el servicio inyectado.
     */
    public void realizarOperacion() {
        servicio.ejecutar();
    }
}
