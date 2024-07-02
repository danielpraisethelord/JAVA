/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package observer_rxjava.ejemplo1;

public class App {

    public static void main(String[] args) {
        String mensaje = "Hola Mundo, aprendiendo Observer";
        MiProcesoObservable miProcesoObservable = new MiProcesoObservable(mensaje);
        miProcesoObservable.subscribe(System.out::println) ;
        miProcesoObservable.enviarMensaje();

        otrosProcesos();
        System.out.println("Esperando que terminen procesos pendientes");
    }

    private static void otrosProcesos() {
        int a = 0;
        for (int i = 0; i < 100000; i++) {
            a+=1;
        }
    }
}