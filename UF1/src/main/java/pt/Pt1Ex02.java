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
public class Pt1Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = (int)(Math.random()*50+1), b = (int)(Math.random()*50+1); // Definim els dos valors
        int c; // Creem la var c
        
        System.out.println("Var a: "+a+"\nVar b: "+b+"\n"); // Mostrem els valors
        c = a; a = b; b = c; // Intercanviem els valors 
        System.out.println("Var a: "+a+"\nVar b: "+b); // Mostrem els nous valors
    }
    
}
