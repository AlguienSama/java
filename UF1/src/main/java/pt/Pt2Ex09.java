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
public class Pt2Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = Function.createArray(10, 20, 10); // Creamos el array
        Function.showArray(array, "ln"); // Mostramos el array
        
        int count = 0; // Iniciamos una variable contador
        for(int i = 0; i < array.length; i++) { // Recorremos el array
            if(array[i] == 12){ // Si el número del array es 12, suma uno a la variable contador
                count++;
            }
            int pos = i+count; // La posición donde se encuentra el futuro número del array
            if(pos < array.length) { // Si el largo del array es más pequeño que array, pon el número corresponiente
                array[i] = array[pos];
            } else { // Sino, ponle un 0
                array[i] = 0;
            }
            
        }
        Function.showArray(array, ""); // Mostramos el array
    }
    
}
