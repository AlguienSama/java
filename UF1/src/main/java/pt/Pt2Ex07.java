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
public class Pt2Ex07 {

    /**
     * @param args
     */
    
    
    
    public static void main(String[] args) {
        
        int[] array = Function.createArray(20, 10, 10); // Llamamos a la funcion createArray
        
        Function.showArray(array, "ln"); // Llamamos la función showArray
        
        int[] newArray = new int [10]; // Generamos un nuevo array
        int c = 0; // Será la posición
        
        for (int i = 0; i < array.length; i++) { // Hacemos un bucle para rellenar un nuevo array
            if (i == 3) { // Vaciamos la posición 3 (el cuarto número)
            } else { // Llenamos el nuevo array
            	newArray[c] = array[i];
            	c++;
            }
        }
        
        Function.showArray(newArray, ""); // Mostramos el array
    }
    
}
