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
public class Ex112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int km = (int)(Math.random()*1200)+1;
        System.out.println("Kilometres: "+km);
        double price = 30;
        
        if (km < 300){
            price = 30;
        } else if (km < 1000){
            price += ((double)km-300)*0.2;
        } else if (km >= 1000){
            price += ((double)km-1000-300)*0.2;
            price += ((double)km - 1000)*0.18;
        }
        System.out.println("Preu total: "+price);
    }
    
}
