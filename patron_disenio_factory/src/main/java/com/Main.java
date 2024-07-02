package com;

import com.pagos.Pago;
import com.pagos.PagoFactory;
import com.pagos.TipoDePago;

public class Main {
    public static void main(String[] args) {
        PagoFactory pagoFactory = new PagoFactory();
        Pago pago = pagoFactory.obtenerPago(TipoDePago.PAYPAL);
        pago.crearPago();
    }
}