package solid_java_cuartoPrincipio;

public interface UsuarioServicio {
    //En vez de tener tantos metodos para implementar referente a Usuario en una interfaz
    //Mejor delegar las funcionalidades en diferentes interfaces

    /*
    Estos métodos se pueden trasladar a CrudUsuario
    Usuario obtenerUsuario(long id);
    Usuario crearUsuario(Usuario usuario);
    void eliminarUsuario(long id);
    Usuario actializarUsuario(Usuario usuario);
    */
    /* 
    Esto no tiene mucho que ver en UsuarioServicio, mejor trasladarlo a SesionUsuario
    void iniciarSesion(Usuario usuario);
    void terminarSesion(Usuario usuario);
    */
}
