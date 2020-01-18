package examples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alu2019222
 */
public class ArrayF {

    /**
     * @param max
     * @param min
     * @param largo
     * @return 
     */
    
    public static int[] createArray(int max, int min, int largo) { // Creamos un nuevo array
        int[] array = new int [largo]; // Declaramos el array con el largo que queremos
        for (int i = 0; i < largo; i++) { // Bucle para establecer los valores del array
            int num;
            
            if (min == 0) { // Si el mínimo es 0, calculamos el random con solo el max
                num = (int)(Math.random()*max);
            } else {
                num = (int)(Math.random()*(max-min+1)+min); // Calculamos un aleatorio entre el máximo y mínimo antes pasado
            }
            
            array[i] = num; // Instertamos el random al array
        }
        return array; // Devolvemos el array
    }
    
    public static void showArray(int[] array, String ln) {
        for (int i = 0; i < array.length; i++) { // Mostramos el array
            System.out.print(array[i] + " ");
        }
        if ("ln".equals(ln)) { // Hacemos un salto de linia si el usuario lo pide
            System.out.println();
        }
    }
    
    public static int[] deleteArrayNumber(int[] array, int val) {
        int[] newArray = new int [10]; // Generamos un nuevo array
        int c = 0; // Será la posición
        
        for (int i = 0; i < array.length; i++) { // Hacemos un bucle para rellenar un nuevo array
            if (i == val) { // Vaciamos la posición 3 (el cuarto número)
            } else { // Llenamos el nuevo array
            	newArray[c] = array[i];
            	c++;
            }
        }
        return array;
    }
    
    public static void compareArray(int[] array1, int[] array2) { // Comparar arrays
    	for (int i = 0; i < array1.length; i++) { // Recorremos el array
    		if (array1[i] == array2[i]) { // Comparamos si los valores del array coinciden
    			System.out.println("El número "+ array1[i] +" en la posción " + i); // Mostramos el número si coincide y la posición
    		}
    	}
    }
    
    public static int[] orderArrayDes(int[] array) {
        for (int i = 0; i < array.length-1; i++) { // Recorremos el array
            int max = i; // Iniciamos la variable max
            
            for (int j = i+1; j < array.length; j++) { // Recorremos el array en busca de un número más grande
                if (array[j] > array[max]){ // Si hay un numero más grande, lo guardamos en la variable max
                    max = j;
                }
            }
            
            if (i != max) { // Si i no es igual que max, significa que en el anterior bucle ha encontrado un número más grande
                int val = array[i]; // Rotamos el número grande encontrado con el de la posición que toca
                array[i] = array[max];
                array[max] = val;
            }            
        }
        return array;
    }
    
    
    public static int[] orderArrayAsc(int[] array) {
        for (int i = 0; i < array.length-1; i++) { // Recorremos el array
            int min = i; // Iniciamos la variable min
            
            for (int j = i+1; j < array.length; j++) { // Recorremos el array en busca de un número más pequeños
                if (array[j] < array[min]){ // Si hay un numero más pequeño, lo guardamos en la variable min
                    min = j;
                }
            }
            
            if (i != min) { // Si i no es igual que min, significa que en el anterior bucle ha encontrado un número más pequeño
                int val = array[i]; // Rotamos el número grande encontrado con el de la posición que toca
                array[i] = array[min];
                array[min] = val;
            }            
        }
        return array;
    }
    
}
