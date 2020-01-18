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

public class OrderArray {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
        
        int[] array = Function.createArray(29, 0, 30);
        
        Function.showArray(array, "ln");
        
        Function.orderArrayDes(array);
        
        Function.showArray(array, "ln");
        
        Function.orderArrayAsc(array);
        
        Function.showArray(array, "ln");
        
    }
    
}
