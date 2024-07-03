package patron_de_disenio_inyeccion_dependencias;

/*
 * Clase principal para ejecutar el ejemplo:
 * Demuestra cómo se puede utilizar la inyección de dependencias para crear instancias
 * y realizar operaciones sin necesidad de que la clase Cliente cree las instancias de Servicio por sí misma.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Crear una instancia del servicio:
         * Se crea una instancia de ServicioImpl que cumple con el contrato definido por la interfaz Servicio.
         */
        Servicio servicio = new ServicioImpl();
        
        /*
         * Inyectar la dependencia en el cliente:
         * Se crea una instancia de Cliente, inyectando la instancia de Servicio creada previamente.
         */
        Cliente cliente = new Cliente(servicio);
        
        /*
         * Realizar una operación que utiliza el servicio:
         * Se llama al método realizarOperacion de la clase Cliente, que a su vez utiliza el servicio inyectado.
         */
        cliente.realizarOperacion();
    }
}
