package patron_de_disenio_singleton;

public class Version {
    private final int major;
    private final int minor;
    private final int revision;

    /*
    Para implementar el patrón de diseño Singleton, es necesario tener un
    único constructor, el cual será de tipo privado para restringir la creación
    de objetos fuera de la clase.
    
    private Version(int major, int minor, int revision) {
        this.major = major;
        this.minor = minor;
        this.revision = revision;
    }
    */
    
    /* 
     * Al realizar este patrón de diseño, se limita la creación de un objeto de Version.
     * Creando un único constructor de tipo privado, no podemos instanciar la clase
     * directamente desde fuera de la misma. Dentro del constructor privado se inicializan
     * las propiedades. De esta forma, se garantiza que cada vez que el objeto se cree,
     * sea exactamente 1.0.0.
     */
    private Version() {
        this.major = 1;
        this.minor = 0;
        this.revision = 0;
    }

    /* 
     * Dentro de la clase, se crea de manera estática una instancia privada de Version.
     * Esto asegura que la instancia sea creada una única vez y compartida a lo largo de
     * la aplicación.
     */
    private static final Version instance = new Version();

    /* 
     * Este método retorna la instancia de la clase, permitiendo acceder a la única
     * instancia creada. Si la instancia ya ha sido creada previamente, simplemente 
     * devuelve la misma instancia.
     */
    public static Version getInstance() {
        return instance;
    }

    /* 
     * Otra forma de realizar este patrón de diseño es utilizando el patrón de inicialización
     * perezosa (Lazy Initialization), donde la instancia se crea sólo cuando es necesaria.
     * Esto puede ser útil en escenarios donde la creación de la instancia es costosa.
     */
    private static Version instance2;

    public synchronized static Version getInstanceLazy() {
        if (instance2 == null) {
            instance2 = new Version();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "{" +
            " major='" + major + "'" +
            ", minor='" + minor + "'" +
            ", revision='" + revision + "'" +
            "}";
    }

    /* 
     * Otra recomendación es sobrescribir el método clone() para evitar la duplicidad
     * de instancias y devolver un CloneNotSupportedException.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /*
     * Adicionalmente, es recomendable implementar la interfaz Serializable si se espera 
     * que el Singleton sea serializado. Esto puede requerir la implementación del método
     * readResolve() para asegurar que después de la deserialización, no se cree una nueva 
     * instancia.
     */
    private Object readResolve() {
        return instance;
    }
}
