package solid_java_segundoPrincipio;

import java.util.List;

public class Usuario {
    
    private String nombre;
    private final Rol rol;
    private final List<Permiso> permisos;


    public Usuario(Rol rol, List<Permiso> permisos) {
        this.rol = rol;
        this.permisos = permisos;
    }

    public String getNombre() {return nombre; }

    public void setNombre(String nombre) {this.nombre = nombre; }

    public Rol getRol() {return rol; }

    public List<Permiso> getPermisos () {
        return permisos;
    }
}
