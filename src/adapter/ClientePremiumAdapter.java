package adapter;

import patronadapter.ClientePremium;

/**
 *
 * @author Jedidian
 */
public class ClientePremiumAdapter implements Cliente {
    
    private ClientePremium adaptado;

    public ClientePremiumAdapter() {
    }

    public ClientePremiumAdapter(ClientePremium adaptado) {
        this.adaptado = adaptado;
    }

    @Override
    public void cobrarCuotaMensual(float cuota, float multa, float descuento) {
        adaptado.cobrarCuotaMensual(cuota, descuento);
    }

    
    
    
}
