package solid_java_segundoPrincipio;

import java.util.Collections;
import java.util.List;

public class PermisoServicio {
    
    private final UsuarioServicio usuarioServicio;

    public PermisoServicio(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    public List<Permiso> obtenerPermisos(long usuarioId) {
        final Usuario usuario = usuarioServicio.obtenerUsuario(usuarioId);
        /*
        ¿Por qué no se aplica el switch en este caso?, porque rompe el segundo principio de SOLID,
        ya que si por alguna razón se crea un Rol nuevo, por ejemplo SUPER_ADMIN, Habría que modificar
        el switch y se viola el principio de abierto cerrado

        switch (usuario.getRol()) {
            case ANONIMO -> {
                return Collections.emptyList();
            }
            
            case MODERADOR -> {
                return List.of(Permiso.LECTURA, Permiso.ESCRITURA);
            }

            case ADMIN -> {
                return List.of(Permiso.LECTURA_ESCRITURA);
            }
            
            // Aquí se agregaría el rol nuevo, pero esto es erroneo en SOLID
            case SUPER_ADMIN -> {
                return List.of(Permiso.values());
            }
        }
        */

        /*
         Para resolver esto, en vez de usar un switch case, en usuario también agregaríamos los permisos de ese Usuario
         Y por cada Rol se crea una clase extendiendo de usuario, donde se asigna su rol y su permiso
         */
        return usuario.getPermisos(); //Retornando unicamente usuario.getPermisos(), nuetra clase esta cerrada a modificaciones cumpliendo el principio SOLID
    }

    public void eliminarPermiso(long usuarioId, Permiso permiso) {

    }
}
