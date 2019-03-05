package patronadapter;

/**
 *
 * @author Jedidian
 */
public class ClienteNuevo {
    
    //Atributos
    private String nombre;

    //Constructores
    public ClienteNuevo() {
    }

    public ClienteNuevo(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual(float cuota){
        System.out.println("Gracias por elegirnos");
        System.out.println("Sr(ta). " + this.nombre + " pague $" + cuota);
        System.out.println("antes del fin de mes");
    }
    
}
