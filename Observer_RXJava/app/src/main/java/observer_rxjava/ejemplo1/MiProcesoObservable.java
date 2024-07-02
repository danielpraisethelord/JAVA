package observer_rxjava.ejemplo1;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

public class MiProcesoObservable extends Observable<String>{

    private List<Observer<? super String>> misObservadores = new LinkedList<>();
    private String mensaje;

    public MiProcesoObservable (String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    protected void subscribeActual(Observer<? super String> observer) {
        misObservadores.add(observer);
    }
    
    public void enviarMensaje() {
        Timer timerMensaje = new Timer();
        timerMensaje.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run () {
                misObservadores.forEach(obs -> obs.onNext(mensaje));
                misObservadores.forEach(obs -> obs.onComplete());
                timerMensaje.cancel();
            }
        }, 4000, 1);
    }
}
