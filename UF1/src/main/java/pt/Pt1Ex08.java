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
public class Pt1Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temps = (int)(Math.random()*2000000); // Creem i mostrem la variable temps
        System.out.println("Temps: "+temps);
        
        int hores = temps / 3600; // Fem el calcul de les hores i minuts
        int minF = temps % 3600;
        int min = minF / 60;
        int sec = min % 60;
        
        System.out.println("Temps: "+hores+":"+min+":"+sec); // Mostrem el resultat
    }
    
}
