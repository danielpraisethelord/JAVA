package pruebasunitarias_mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UsuarioServicioTest {

    @Mock //Se puede eliminar ya que en el setUp se declara también, pero es más claro asi
    private UsuarioRepositorio usuarioRepositorio;
    @InjectMocks //La clase usuarioServicio recibirá como dependencia el Mock indicado
    private UsuarioServicio usuarioServicio;
    
    /* 
    @BeforeEach
    public void setUp() {
        //UsuarioRepositorio mock = Mockito.mock(UsuarioRepositorio.class);
        usuarioServicio = new UsuarioServicio(usuarioRepositorio);
    }
        Al usar @InjectMocks se puede omitir el @BeforeEach
    */
    
    @DisplayName("Dado un usuario que queremos crear, cuando llamamos a " +
                "'crearUsuario' esperamos que el usuario este creado")

    @Test
    public void test1() {
        UsuarioDto objetoSimulado = new UsuarioDto(1L, "Prueba");
        UsuarioDto esperado = new UsuarioDto(1L, "Prueba");
        Mockito.when(usuarioRepositorio.crearUsuario("Prueba"))
                .thenReturn(objetoSimulado);
        final UsuarioDto resultado = 
            usuarioServicio.crearUsuario("Prueba");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre, "Los nombres no son iguales");
        Assertions.assertEquals(esperado, resultado);
        Mockito.verify(usuarioRepositorio).crearUsuario("Prueba");
    }

    @DisplayName("Obtener usuario con Mockito")
    @Test
    public void test2() {
        UsuarioDto objetoSimulado = new UsuarioDto(1L, "Juan");
        UsuarioDto esperado = new UsuarioDto(1L, "Juan");
        Mockito.when(usuarioRepositorio.obtenerUsuario(1L))
                .thenReturn(objetoSimulado);
        final UsuarioDto resultado = usuarioServicio.obtenerUsuario(1L);
        Assertions.assertEquals(esperado, resultado);
        Mockito.verify(usuarioRepositorio).obtenerUsuario(1L);
    }
}
