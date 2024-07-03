package modelmapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.*;

import java.util.List;

/**
 * UsuarioController expone los endpoints REST para interactuar con los usuarios.
 */
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    /**
     * Endpoint para obtener todos los usuarios.
     */
    @GetMapping
    public List<UsuarioDTO> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();
    }

    /**
     * Endpoint para guardar un nuevo usuario.
     */
    @PostMapping
    public UsuarioDTO guardarUsuario(@RequestBody UsuarioDTO usuarioDto) {
        return usuarioService.guardarUsuario(usuarioDto);
    }
}
