package modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * UsuarioService es un servicio que utiliza ModelMapper para mapear entre UsuarioEntity y UsuarioDTO.
 */
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Convertir una entidad UsuarioEntity a un DTO UsuarioDTO.
     */
    private UsuarioDTO convertToDto(UsuarioEntity usuarioEntity) {
        return modelMapper.map(usuarioEntity, UsuarioDTO.class);
    }

    /**
     * Convertir un DTO UsuarioDTO a una entidad UsuarioEntity.
     */
    private UsuarioEntity convertToEntity(UsuarioDTO usuarioDto) {
        return modelMapper.map(usuarioDto, UsuarioEntity.class);
    }

    /**
     * Obtener todos los usuarios y mapearlos a una lista de DTOs.
     */
    public List<UsuarioDTO> obtenerTodosLosUsuarios() {
        List<UsuarioEntity> usuarios = usuarioRepository.findAll();
        return usuarios.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    /**
     * Guardar un nuevo usuario en la base de datos a partir de un DTO.
     */
    public UsuarioDTO guardarUsuario(UsuarioDTO usuarioDto) {
        UsuarioEntity usuarioEntity = convertToEntity(usuarioDto);
        UsuarioEntity usuarioGuardado = usuarioRepository.save(usuarioEntity);
        return convertToDto(usuarioGuardado);
    }
}
