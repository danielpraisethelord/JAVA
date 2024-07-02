package solid_java_segundoPrincipio;

import java.util.List;

public class Admin extends Usuario {
    public Admin() {
        super(Rol.ADMIN, List.of(Permiso.LECTURA_ESCRITURA));
    }
}
