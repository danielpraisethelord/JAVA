package com;
import java.util.Objects;

public class UsuarioDto {
    private String nombre;
    private String email;

    public UsuarioDto(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioDto)) {
            return false;
        }
        UsuarioDto usuarioDto = (UsuarioDto) o;
        return Objects.equals(nombre, usuarioDto.nombre) && Objects.equals(email, usuarioDto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, email);
    }

}
