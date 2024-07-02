package com.pagos;

import java.util.HashMap;
import java.util.Map;

public class PagoFactory {

    private final static Map<TipoDePago, Pago> pagos = new HashMap<>(){{
        put(TipoDePago.PAYPAL, new PagoPayPal());
        put(TipoDePago.TARJETA_CREDITO, new PagoTarjetaCredito());
        put(TipoDePago.TARJETA_DEBITO, new PagoTarjetaDebito());
    }};
    
    public Pago obtenerPago(TipoDePago tipoDePago) {
        return pagos.get(tipoDePago);
        /*return switch(tipoDePago){
            case PAYPAL -> new PagoPayPal();
            case TARJETA_CREDITO -> new PagoTarjetaCredito();
            case TARJETA_DEBITO -> new PagoTarjetaDebito();
        };*/
    }
}
