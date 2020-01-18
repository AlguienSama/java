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
public class Ex108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10), num2 = (int)(Math.random()*10), num3 = (int)(Math.random()*10);
        if(num1 >= num2 && num1 >= num3){
            System.out.println("1, 2, 3: "+num1 +" "+ num2 +" "+ num3);
        } else
        if(num1 >= num2 && num2 <= num3 && num1 >= num3){
            System.out.println("1, 3, 2: "+num1 +" "+ num3 +" "+ num2);
        } else
        if(num2 >= num1 && num1 >= num3){
            System.out.println("2, 1, 3: "+num2 +" "+ num1 +" "+ num3);
        } else
        if(num2 >= num1 && num1 <= num3 && num2 >= num3){
            System.out.println("2, 3, 1: "+num2 +" "+ num3 +" "+ num1);
        } else
        if(num3 >= num1 && num1 >= num2){
            System.out.println("3, 1, 2: "+num3 +" "+ num1 +" "+ num2);
        } else
        if(num3 >= num1 && num1 <= num2 && num3 >= num2){
            System.out.println("3, 2, 1: "+num3 +" "+ num2 +" "+ num1);
        }
    }
    
}
