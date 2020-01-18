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
public class Ex104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double galo = 1;
        double liter = 3.7854118;
        
        for(galo=galo; galo<100; galo++){
            double value = galo * liter;
            System.out.println(galo+" gallons is "+value+" liters");
            if(galo%10==0){
                System.out.println("");
            }
            
        }
    }
    
}
