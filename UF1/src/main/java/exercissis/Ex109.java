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
public class Ex109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for
        for(int i=1;i<21;i++){
            System.out.println("for: "+i);
        }
        
        int j = 1;
        while(j<21){
            System.out.println("while: "+j);
            j++;
        }
        
        int k = 1;
        do{
            System.out.println("do while: "+k);
            k++;
        } while(k<21);
    }
    
}
