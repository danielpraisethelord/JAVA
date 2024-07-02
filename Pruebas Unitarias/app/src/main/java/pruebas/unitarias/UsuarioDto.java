package pruebas.unitarias;

import java.util.Objects;

public class UsuarioDto {
    final Long id;
    final String nombre;

    public UsuarioDto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioDto)) {
            return false;
        }
        UsuarioDto usuarioDto = (UsuarioDto) o;
        return Objects.equals(id, usuarioDto.id) && Objects.equals(nombre, usuarioDto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
    

}
