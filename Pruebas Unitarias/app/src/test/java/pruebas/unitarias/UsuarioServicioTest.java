package pruebas.unitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UsuarioServicioTest {
    
    private UsuarioServicio usuarioServicio;

    @BeforeEach
    public void setUp() {
        usuarioServicio = new UsuarioServicio();
    }

    @DisplayName("Dado un Usuario que deseamos crear" +
                " Se espera que los dos nombres de usuario sean iguales" +
                " Y que los objetos sean iguales")
    @Test
    public void test1() {
        UsuarioDto esperado = new UsuarioDto(1L, "Nombre");

        final UsuarioDto resultado = 
            usuarioServicio.crearUsuario(1L, "Nombre");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre, "Los nombres son diferentes");
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void test2() {
        UsuarioDto esperado = new UsuarioDto(1L, "Nombre");

        final UsuarioDto resultado =
                usuarioServicio.crearUsuario(1L, "Prueba");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertNotEquals(esperado.nombre, resultado.nombre, "Los nombres no son diferentes");
        Assertions.assertNotEquals(esperado, resultado);
    }

    @DisplayName("EL usuario no existe")
    @Test
    public void test3() {
        final UsuarioDto resultado =
                usuarioServicio.obtenerUsuario(1L);
        Assertions.assertEquals(null, resultado);
    }

    @DisplayName("EL usuario existe")
    @Test
    public void test4() {
        UsuarioDto esperado = new UsuarioDto(1l, "Nombre");
        
        usuarioServicio.crearUsuario(1L, "Nombre");

        final UsuarioDto resultado =
                usuarioServicio.obtenerUsuario(1L);
        Assertions.assertEquals(esperado,resultado);
    }
}
