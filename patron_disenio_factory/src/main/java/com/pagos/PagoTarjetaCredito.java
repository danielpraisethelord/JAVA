package com.pagos;

public class PagoTarjetaCredito implements Pago{
    @Override
    public void crearPago() {
        System.out.println("Se ha pagado con Tarjeta de Credito");
    }
}
