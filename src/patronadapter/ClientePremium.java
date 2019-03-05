package patronadapter;

/**
 *
 * @author Jedidian
 */
public class ClientePremium {
    
    private String nombre;

    public ClientePremium() {
    }

    public ClientePremium(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual(float cuota, float descuento){
        System.out.println("Su excelencia " + nombre);
        System.out.println("Por su excelente comportamiento");
        System.out.println("le estamos haciendo un descuento del %" + descuento);
        System.out.println("Total a pagar = $" + cuota * (1 - (descuento/100) ));
    }
    
}
