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
public class Ex117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long num = (int)(Math.random()*6)+2;
        System.out.println("Num: "+num);
        long fiv1 = 1;
        long fiv2 = num;
        System.out.println("For");
        for(int i = 0; i < num; i++){
            System.out.println(fiv1);
            fiv2 = fiv1 * fiv2;
            fiv1 = fiv2;
        }
        
        fiv1 = 1;
        fiv2 = num;
        int i = 0;
        System.out.println("While");
        while(i < num){            
            System.out.println(fiv1);
            i++;
            fiv2 = fiv1 * fiv2;
            fiv1 = fiv2;
        }
        
        
    }
    
}
