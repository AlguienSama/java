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
public class Pt1Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = (int)(Math.random()*(999-100)+100); // Generem el número
        System.out.println("Número: "+num); // Mostrem el número
        
        int cent = num / 100, dece = (num - (cent*100)) / 10, unit = (num-(cent*100)-(dece*10)); // Calculem les centenes, decenes i unitats
        
        System.out.println("Primera xifra: "+cent+".\nSegona xifra: "+dece+".\nTercera xifra: "+unit+"."); // Mostrem el resultat
    }
    
}
