/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt;

import java.util.Arrays;

/**
 *
 * @author alu2019222
 */
public class Pt2Ex06 {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
        
        int[] array = Function.createArray(10, 0, 20); // Llamamos a la funcion createArray
        
        for (int i = 0; i < array.length; i++) { // Mostramos el array
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        //System.out.println(Arrays.toString(array)); // Mostramos el array 2.0
        //Function.showArray(array, "ln"); // Mostramos el array 4.0
        
        int val = 0;
        
        for (int i = 0; i < array.length; i++) { // Sumamos todos los numeros del array
            val += array[i]; 
        }
        
        System.out.println("Suma: "+ val); // Mostramos la suma
        System.out.println("Media: "+ ((double)val / array.length)); // Mostramos la media
    }    
}
