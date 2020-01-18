/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exTrash.planetas;

import exTrash.planetas.Planeta;

/**
 *
 * @author alu2019222
 */
public class Planetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("A123", "ASDF");
        
        System.out.println("ID: " +planeta1.id +"\nNombre: "+ planeta1.nombre +"\nTotal de planetas: "+ Planeta.totales +"\n");
        
        Planeta planeta2 = new Planeta("B324", "QWER");
        
        System.out.println("ID: " +planeta2.id +"\nNombre: "+ planeta2.nombre +"\nTotal de planetas: "+ Planeta.totales);
        
        
    }
    
}
