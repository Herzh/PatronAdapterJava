package patronadapter;

/**
 *
 * @author Jedidian
 */
public class ClienteMoroso {
    
    //Atributos
    private String nombre;

    //Constructores
    public ClienteMoroso() {
    }

    public ClienteMoroso(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual(float cuota, float multa){
        System.out.println("Estimado(a) Sr(ta) " + nombre + ";");
        System.out.println("Tiene un atraso de pagos por lo cual");
        System.out.println("Debe pagar un " + multa + "% por recargos");
        System.out.println("Total a pagar = " + ( cuota * (1+ (multa/100) ) ));
    }
    
    
}
