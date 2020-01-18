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
public class Pt1Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generem les notes
        double n1 = (int)(Math.random()*10+1), n2 = (int)(Math.random()*10+1), n3 = (int)(Math.random()*10+1), n4 = (int)(Math.random()*10+1);
        
        System.out.println("Notes: "+n1+", "+n2+", "+n3+", "+n4); // Mostrem les notes
        
        double mitjana = (n1+n2+n3+n4)/4; // Calculem la mitjana
        System.out.println("Mitjana: "+mitjana); // La mostrem
        
        boolean aprovat = mitjana > 5; // Mirem si ha aprovat
        System.out.println("Aprovat: "+aprovat); // Ho mostrem
    }
    
}
