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
public class Ex107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*11);
        System.out.println(num1);
        int num2 = 2;
        System.out.println(num2);
        int rest = num1 % num2;
        
        if (rest == 0){
            System.out.println("És divisible");
        } else {
            System.out.println("No és divisible");
        }
    }
    
}
