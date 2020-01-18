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
public class Pt2Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = (int)(Math.random()*90)+10; // Generamos dos numeros
        int div = (int)(Math.random()*8)+2;
        int val = num;
        int count = 0;
        do {
            int i = val-div; // i será el resultado
            count++;
            
            System.out.println(val +" - "+ div +" = "+ i); // Mostramos la operación
            val -= div; // Le restamos al numero a dividir el numero por dividir
            
        } while (val > div); // Comparamos si el numero puede ser divisible
        
        System.out.println("Resultado: "+count+"\nResto: " + val);
        
               
                
    }
    
}
