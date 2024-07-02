package solid_java_cuartoPrincipio;

public interface CrudUsuario {
    Usuario obtenerUsuario(long id);
    Usuario crearUsuario(Usuario usuario);
    void eliminarUsuario(long id);
    Usuario actializarUsuario(Usuario usuario);
}
