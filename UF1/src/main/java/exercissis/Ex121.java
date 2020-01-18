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
public class Ex121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*25);
        int num2 = (int)(Math.random()*(300 - 25 + 1) +1);
        
        
        for(int j = num1; j < num2; j++){
            int div = 0;
            for (int i = j - 1; i > 1; i--){
                if (j % i == 0) {
                    div++;
                    break;
                }
            } if (div == 0) {
                System.out.println(j);
            }
        }
    }
    
}
