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
public class Pt1Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preu = (int)(Math.random()*100), desc = (int)(Math.random()*(50-10)+10); // Generem el preu i descompte
        System.out.println("Preu: "+preu+"€\nDescompte: "+desc+"%");
        
        double descTotal1 = desc/100; // Calculem el descompte
        double descTotal2 = preu*descTotal1;
        double descTotal = preu-descTotal2;
        System.out.println("Descompte total: "+descTotal);
        
        double restant = 100; // Fem la resta del total de diners que tenim
        System.out.println("Diners restants: "+(restant-descTotal));
    }
    
}
