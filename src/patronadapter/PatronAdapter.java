package patronadapter;

/**
 *
 * @author Jedidian
 */
public class PatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//        ClienteNuevo c= new ClienteNuevo("Jesus");
//        c.cobrarCuotaMensual(500);
//        
        
        Object[] carteraClientes = {
            new ClienteNuevo("Jesus"),
            new ClienteMoroso("Juanito"),
            new ClienteNuevo("Marcos"),
            new ClienteMoroso("Diana"),
            new ClienteMoroso("Josefa"),
            new ClientePremium("Herzh"),
        };
        
        float cuotaMensual = 500.0f;
        float multa = 5.0f;
        float descuento = 10.0f;
        
        for (Object cliente : carteraClientes) {
            
            if( cliente.getClass().getSimpleName().equals("ClienteMoroso") ){
                
                ((ClienteMoroso)cliente).cobrarCuotaMensual(cuotaMensual, multa);
                
            }else if( cliente.getClass().getSimpleName().equals("ClienteNuevo") ){
                
                ((ClienteNuevo)cliente).cobrarCuotaMensual(cuotaMensual);
                
            }else if( cliente.getClass().getSimpleName().equals("ClientePremium") ){
                
                ((ClientePremium)cliente).cobrarCuotaMensual(cuotaMensual, descuento);
                
            }
            
            System.out.println("---------------------------------------");
        }
        
        
    }
}
