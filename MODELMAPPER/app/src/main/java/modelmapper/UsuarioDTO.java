package modelmapper;

/**
 * UsuarioDTO es un Data Transfer Object (DTO) que se utiliza para transferir datos entre las capas de la aplicación.
 * 
 * Sustituye el uso directo de entidades JPA en las operaciones de la capa de servicio o controlador.
 */
public class UsuarioDTO {
    private Long id;
    private String nombre;
    private String email;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
