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
public class Ex105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10)+1;
        int num2 = (int)(Math.random()*10)+1;
        int num3 = (int)(Math.random()*10)+1;
        
        if(num1 > num2 && num1 > num3){
            System.out.println("Num1 és el més gran");
        } else if (num2 > num1 && num2 > num3){
            System.out.println("Num2 és el més gran");
        } else if (num3 > num1 && num3 > num2){
            System.out.println("Num3 és el més gran");
        } else if (num1 == num2 && num1 > num3){
            System.out.println("Num1 i Num2 són els més grans");
        } else if (num1 == num3 && num1 > num2){
            System.out.println("Num1 i Num3 són els més grans");
        } else if (num2 == num3 && num2 > num1){
            System.out.println("Num2 i Num3 són els més grans");
        } else {
            System.out.println("Tots són igual de grans");
        }
    }
    
}
