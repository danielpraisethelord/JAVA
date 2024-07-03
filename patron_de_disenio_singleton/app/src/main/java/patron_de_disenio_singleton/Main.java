package patron_de_disenio_singleton;

public class Main {

    /*
    Tener la instancia a nivel de clase puede funcionar, pero no es óptimo si es necesario 
    utilizar la instancia de Version en otra clase.
    Por ejemplo:
    Version version = new Version(1, 0, 0);
    */

    public static void main(String[] args) {
        /*
        Si pasamos la instancia del objeto Version a través del constructor, se crean dos
        instancias diferentes. Una posible solución es crear una instancia fuera del constructor:

        UsuarioServicio usuarioServicio = new UsuarioServicio(new Version(1, 0, 0));
        CarritoDeCompraServicio carritoDeCompraServicio = new CarritoDeCompraServicio(new Version(1, 0, 0));
        */

        /*
        Esto soluciona la duplicación de una misma instancia. Sin embargo, acarrea otro problema:
        si queremos utilizar la versión en otra clase que no sea Main o fuera del método,
        por ejemplo, instanciando nuevamente Version en otroMetodo(), habría que instanciar
        nuevamente Version, lo que genera otro problema.

        Version version = new Version(1, 0, 0);
        UsuarioServicio usuarioServicio = new UsuarioServicio(version);
        CarritoDeCompraServicio carritoDeCompraServicio = new CarritoDeCompraServicio(version);
        */

        /* 
         * La forma correcta de llamar a la instancia con el patrón de diseño Singleton
         * es utilizando el método estático getInstance().
         * De esta manera, se asegura tener una única instancia en memoria de Version.
         */

        Version version = Version.getInstance();
        UsuarioServicio usuarioServicio = new UsuarioServicio(version);
        CarritoDeCompraServicio carritoDeCompraServicio = new CarritoDeCompraServicio(version);
    }

    public static void otroMetodo() {
        /* 
         * En lugar de instanciar una nueva versión:
         * Version version = new Version(1, 0, 0);
         * Se debe obtener la instancia única con getInstance().
         */
        Version version = Version.getInstance();
    }
}
