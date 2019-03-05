/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import patronadapter.ClienteMoroso;
import patronadapter.ClienteNuevo;
import patronadapter.ClientePremium;

/**
 *
 * @author Jedidian
 */
public class TestAdapter {
    
    public static void main(String[] args) {
        
        Cliente[] carteraClientes = {
            
            new ClienteNuevoAdapter( new ClienteNuevo("Jesus")),
            new ClienteMorosoAdapter( new ClienteMoroso("Jose")),
            new ClientePremiumAdapter( new ClientePremium("Herzh"))
            
        };
        
        float cuotaMensual = 500.0f;
        float multa = 5.0f;
        float descuento = 10.0f;
        
        for (Cliente cliente : carteraClientes) {
            
            cliente.cobrarCuotaMensual(cuotaMensual, multa, descuento);
            
            System.out.println("------------");
        }
  
        
    }   
}
