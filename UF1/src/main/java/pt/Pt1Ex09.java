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
public class Pt1Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double diners = (Math.random()*4.9+0.1); // Generem un random
        diners = Math.round(diners * 100) / 100d; // Deixem el random amb 2 decimals
        System.out.println("Diners: "+diners); // Mostrem el total
        
        int euros = (int)diners; // Diem els euros que tenim
        int m2 = euros / 2, m1 = euros - (m2*2); // Calculem les monedes de 2€ i 1€
      
        double centD = (diners - euros)*100; // Obtenim els centims
        int cent = (int)centD; // Pasem els centims a int per poder operar millor
        int cent50 = cent / 50, cent20 = (cent - (cent50*50))/20, cent10 = ((cent - (cent50*50)) - (cent20*20))/10; // Calculem les monedes de 50, 20 i 10
        int centU = cent - ((cent50*50) + (cent20*20) + (cent10*10)); // Deixem només les unitats dels centims
        int cent5 = centU / 5, cent2 = (centU - (cent5*5))/2, cent1 = ((centU - (cent5*5)) - (cent2*2))/1; // Calculem les unitats dels centims
        
        System.out.println("Monedes de 2€: "+m2+"\nMonedes de 1€: "+m1); // Mostrem els euros
        System.out.println("Monedes de 50cent: "+cent50+"\nMonedes de 20cent: "+cent20+"\nMonedes de 10cent: "+cent10); // Mostrem les decenes dels centims
        System.out.println("Monedes de 5cent: "+cent5+"\nMonedes de 2cent: "+cent2+"\nMonedes de 1cent: "+cent1); // Mostrem les unitats dels centims
    }
    
}
