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
public class Ex116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1;
        System.out.println("Num: "+num);
        int fiv1 = 1;
        int fiv2 = 1;
        for(int i = 0; i < num; i++){
            System.out.println(fiv1);
            int fiv = fiv1 + fiv2;
            fiv1 = fiv2;
            fiv2 = fiv;
        }
    }
    
}
