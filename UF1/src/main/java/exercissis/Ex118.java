/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercissis;

/**
 *
 * @author alu2019222
 */
public class Ex118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int so = 110, sec = (int)(Math.random()*60);
        
        int vel = so * sec;
        
        System.out.println("Distancia: "+vel+" peus");
    }
    
}
