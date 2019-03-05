
package adapter;

import patronadapter.ClienteMoroso;

/**
 *
 * @author Jedidian
 */
public class ClienteMorosoAdapter implements Cliente {
 
    private ClienteMoroso adaptado;

    public ClienteMorosoAdapter() {
    }

    public ClienteMorosoAdapter(ClienteMoroso adaptado) {
        this.adaptado = adaptado;
    }

    @Override
    public void cobrarCuotaMensual(float cuota, float multa, float descuento) {
        adaptado.cobrarCuotaMensual(cuota, multa);
    }
    
   
    
}
