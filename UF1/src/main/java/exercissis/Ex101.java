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
public class Ex101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        
        if(num1 > num2){
            System.out.println("Num1 és més gran");
        } else if (num1 < num2){
            System.out.println("Num2 és més gran");
        } else{
            System.out.println("Els dos son iguals");
        }
        
        num1-=num2;
        if (num1<0){
            System.out.println("Resultat negatiu");
        } else {
            System.out.println("Resultat positiu");
        }
    }
    
}
