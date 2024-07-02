package com.pagos;

public class PagoTarjetaDebito implements Pago{
    @Override
    public void crearPago() {
        System.out.println("Se ha pagado con tarjeta de debito");
    }
}
