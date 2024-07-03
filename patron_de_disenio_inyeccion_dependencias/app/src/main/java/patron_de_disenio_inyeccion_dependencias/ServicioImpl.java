package patron_de_disenio_inyeccion_dependencias;

/*
 * Implementación concreta del servicio:
 * Proporciona una implementación específica del contrato definido por la interfaz Servicio.
 */
public class ServicioImpl implements Servicio {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando servicio...");
    }
}
