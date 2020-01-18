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
public class Pt1Ex01 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = (int)(Math.random()*50+1); // Primer num random
        int b = (int)(Math.random()*50+1); // Segón num random
        System.out.println("Num1: "+a+"\nNum2: "+b+"\n"); // Es mostren per pantalla
        
        // Fem les operacions mentres les mostrem per pantalla
        System.out.println("Suma: "+(a+b)+"\nResta: "+(a-b)+"\nMultiplicació: "+(a*b)+"\nDivisió: "+((double)a/b)+"\nQuocient: "+(a%b));
        
        
    }
    
}
