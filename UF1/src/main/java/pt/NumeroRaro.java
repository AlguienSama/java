/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt;

/**
 *
 * @author DarkSpace
 */
public class NumeroRaro {

    /**
     * @param array
     * @param x
     * @param y
     * @return 
     */
    
    public static int determinantSuma(int[][] array, int x, int y) {
        int mult = 1;
        for(int i = 0; i < array.length; i++) {
            if (x == array.length) x = 0;
            if (y == array.length) y = 0;
            
            mult*=array[x][y];
            
            x++;
            y++;
        }
        
        return mult;
    }
    
    public static int determinantResta(int[][] array, int x, int y) {
        int mult = 1;
        for(int i = 0; i < array.length; i++) {
            if (x == -1) x = array.length-1;
            if (y == array.length) y = 0;
            
            mult*=array[x][y];
            
            x--;
            y++;
        }
        
        return mult;
    }
    
    public static void main(String[] args) {
        /*
        
        1 2 3
        4 5 6
        7 8 9
        
        1*5*9 + 4*8*3 + 2*6*7 - 1*6*8 - 2*4*9 - 3*5*7
        
        */
        
        int[][] array = { // Montamos el array bidimensional
            {1, 2, 3},
            {4, 5, 6}, // Funciona con el N * N
            {7, 8, 9}
        };
        
        int x = 0; // eje de la columna
        int y = 0; // eje de la fila
        int sum = 0; // resultado de la suma de las multiplicaciones
        for (int i = 0; i < array.length; i++) { // Definimos las veces que pasaremos por cada fila
            x=i; // Posición que iniciaremos la fila
            
            sum += determinantSuma(array, x, y); // ejecutamos el metodo determinantSuma y guardamos el resultado sumandolo a la variable suma
            
        }
        
        //System.out.println(sum); // Mostramos el resultado de la primera parte
        
        x = 0; // eje de la columna
        y = 0;  // eje de la fila
        int res = 0; // resultado total de la resta de los resultados
        for (int i = 0; i < array.length; i++) { // Bucle con las veces que pasaremos por una fila
            x=i; // posición inical en la columna
            
            res -= determinantResta(array, x, y); // Restamos el resultado de la multiplicación de la función
            if (i == 0) res*=-1; // Si es la primera resta, ponemos el numero en positivo
        }
        
        //System.out.println(res); // Mostramos el resultado de la segunda parte
        
        System.out.println("Resultado: " + (sum-res)); // Mostramos el resultado final
    }
    
}
