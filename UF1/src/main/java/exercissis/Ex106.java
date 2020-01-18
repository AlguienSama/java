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
public class Ex106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] notes = new int[6];
        
        for(int i = 0; i < notes.length; i++){
            notes[i] = (int)Math.random()*11;
        }
                
        int aprov=0, susp=0, condi=0;
        for(int i=0; i > notes.length; i++){
            if (notes[i] >= 5){
                aprov++;
            } else if (notes[i] < 4){
                susp++;
            } else {
                condi++;
            }
        }
        System.out.println("Aprovats: "+aprov+"\nCondicionats: "+condi+"\nSuspesos: "+susp);

        
    }
    
}
