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
public class Pt1Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = (int)(Math.random()*50+1), b = (int)(Math.random()*50+1); // Definim els dos valors
        System.out.println("Var a: "+a+"\nVar b: "+b+"\n"); // Mostrem els valors
        int cal = a+b, cal1 = b/2, cal2 = cal1*cal, cal3 = a+cal2; // Fem les operacions per separat
        System.out.println(a+"+"+b+"="+cal+"\n"+b+"/2="+cal1+"\n"+cal1+"*"+cal+"="+cal2+"\n"+a+"+"+cal2+"="+cal3+"\n"); // Mostrem el pas a pas
        System.out.println("Resposta: "+(a+b/2*(a+b))); // Fem el calcul i el mostrem
    }
    
}
