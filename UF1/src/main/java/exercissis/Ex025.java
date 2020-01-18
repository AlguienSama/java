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
public class Ex025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean calor, fred, tebi;
       int temperatura = 27;
       calor = temperatura > 30; // Si la temp és més que 30, retorna true
       fred = temperatura < 15; // Si la temp és menys que 15, retorna true
       tebi = temperatura >= 15 && temperatura <=30; // Si la temp es igual o més que 15 i igual o menys que 30, retorna true
       System.out.println("Fa calor? " + calor); // False
       System.out.println("Fa fred? " + fred); // False
       System.out.println("No fa ni calor ni fred? " + tebi); // True 
    }
    
}
