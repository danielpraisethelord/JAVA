package observer_rxjava.ejemplo2;

public class Articulo {
    private String titulo;
    private String contenido;

    public Articulo(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}

