package com.pagos;

public class PagoPayPal implements Pago{
    @Override
    public void crearPago(){
        System.out.println("Se ha pagado con PayPal");
    }
}
