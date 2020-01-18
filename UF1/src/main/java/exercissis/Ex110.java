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
public class Ex110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for
        for(int i=20;i>0;i--){
            System.out.println("for: "+i);
        }
        
        int j = 20;
        while(j>0){
            System.out.println("while: "+j);
            j--;
        }
        
        int k = 20;
        do{
            System.out.println("do while: "+k);
            k--;
        } while(k>0);
    }
    
}
