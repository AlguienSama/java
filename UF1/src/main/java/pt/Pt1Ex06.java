/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt;

/**
 *
 * @author alu2019222
 */
public class Pt1Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora = (int)(Math.random()*23), min = (int)(Math.random()*59), seg = (int)(Math.random()*59); // Generem l'hora
        
        long segTotal = (hora*3600) + (min*60) + seg; // Calcul del total dels segons
        
        System.out.println("Hora generada: "+hora+":"+min+":"+seg+" i el total dels segons són: "+segTotal); // Mostrem els resultats per pantalla
    }
    
}
