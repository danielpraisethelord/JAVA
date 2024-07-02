package observer_rxjava.ejemplo2;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ServicioNoticias {

    public Observable<Articulo> obtenerArticulos() {
        List<Articulo> articulos = Arrays.asList(
                new Articulo("Titulo 1", "Contenido del articulo 1"),
                new Articulo("Titulo 2", "Contenido del articulo 2"),
                new Articulo("Titulo 3", "Contenido del articulo 3")
        );

        // Simular la recepción de artículos cada segundo
        return Observable.fromIterable(articulos)
                .zipWith(Observable.interval(1, TimeUnit.SECONDS), (articulo, interval) -> articulo);
    }
}

