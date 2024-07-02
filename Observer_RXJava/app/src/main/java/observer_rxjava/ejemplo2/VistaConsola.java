package observer_rxjava.ejemplo2;

import io.reactivex.rxjava3.disposables.Disposable;

public class VistaConsola {

    private final ServicioNoticias servicioNoticias;
    private Disposable subscription;

    public VistaConsola(ServicioNoticias servicioNoticias) {
        this.servicioNoticias = servicioNoticias;
    }

    public void iniciar() {
        subscription = servicioNoticias.obtenerArticulos()
                .subscribe(
                        articulo -> System.out.println("Nuevo articulo recibido: " + articulo),
                        throwable -> System.err.println("Error recibiendo articulos: " + throwable),
                        () -> System.out.println("Todos los articulos han sido recibidos.")
                );
    }

    public void detener() {
        if (subscription != null && !subscription.isDisposed()) {
            subscription.dispose();
        }
    }
}

