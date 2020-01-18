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
public class Ex016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] nums = {16, 2, 10, 3, 3.7, 1.2, 3.7, 2};
        double[] suma = {nums[0] + nums[1], nums[2] + nums[3], nums[4] + nums[5], nums[6] + nums[7]};
        double[] resta = {nums[0] - nums[1], nums[2] - nums[3], nums[4] - nums[5], nums[6] - nums[7]};
        double[] mult = {nums[0] * nums[1], nums[2] * nums[3], nums[4] * nums[5], nums[6] * nums[7]};
        double[] div = {nums[0] / nums[1], nums[2] / nums[3], nums[4] / nums[5], nums[6] / nums[7]};
        double[] quo = {nums[0] % nums[1], nums[2] % nums[3], nums[4] % nums[5], nums[6] % nums[7]};
        
        System.out.println("Sumes: " + suma[1] +" i "+ suma[2]);
        System.out.println("Restes: " + resta[1] +" i "+ resta[2]);
        System.out.println("Producte: " + mult[1] +" i "+ mult[2]);
        System.out.println("Residu: " + div[1] +" i "+ div[2]);
        System.out.println("Quocient: " + quo[1] +" i "+ quo[2]);
        System.out.println("Divisió entre 10 i 3: " + div[1]);
        System.out.println("Divisió entre 3.7 i 1.2: " + div[2]);
    }
    
}
