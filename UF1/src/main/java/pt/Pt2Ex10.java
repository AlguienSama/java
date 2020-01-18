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
public class Pt2Ex10 {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
    	int [] array = {13, 7, 4, 30, 8, 11, 44, 9, 29, 36, 24, 82, 1, 43};
    	int [] max = new int [2];
    	int [] min = new int [2];
        int dif = 0;
    	
        for (int i = 0; i < array.length; i++) { // Primer recorrido por el array
    		for (int j = 0; j < i; j++) { // Segundo recorrido
                               
                    if (array[i] - array[j] > dif) { // Si la diferencia entre el número del primer bucle y el segundo es mayor que la la variable dif
                        dif = array[i] - array[j]; // Guardamos la nueva diferencia
                        max[0] = i+1; // Guardamos los valores, los días serán el número de la posición +1
                        max[1] = array[i];
                        min[0] = j+1;
                        min[1] = array[j];
                    }
                }
    	}
        System.out.println("Máxima diferencia: " + dif); // Mostramos los resultados
        System.out.println("Mejor día de compra: " + min[0] + "\nMejor día de venta: " + max[0]);
        System.out.println("Mejor valor de compra: " + min[1] + "\nMejor valor de venta: " + max[1]);
    }
    
}
    
