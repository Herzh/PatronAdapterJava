package adapter;

import adapter.Cliente;
import patronadapter.ClienteNuevo;

/**
 *
 * @author Jedidian
 */
public class ClienteNuevoAdapter implements Cliente {
    
    private ClienteNuevo adaptado;

    public ClienteNuevoAdapter() {
    }

    public ClienteNuevoAdapter(ClienteNuevo adaptado) {
        this.adaptado = adaptado;
    }

    @Override
    public void cobrarCuotaMensual(float cuota, float multa, float descuento) {
      
        adaptado.cobrarCuotaMensual(cuota);
    }
    
    
    
    
    
}
