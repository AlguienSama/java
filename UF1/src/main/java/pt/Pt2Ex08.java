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
public class Pt2Ex08 {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
    	int max = 20; // Definimos un máximo
    	int min = 10; // Definimos un mínimo
    	int largo = 10; // Definimos un número que será el largo del array
    	
    	int[] array1 = Function.createArray(max, min, largo); // Creamos el primer array
    	int[] array2 = Function.createArray(max, min, largo); // Creamos el segundo array
    	
        Function.showArray(array1, "ln"); // Mostramos el primer array
        Function.showArray(array2, "ln"); // Mostramos el segundo array
        
    	Function.compareArray(array1, array2); // Comparamos los array
    }
    
}
    