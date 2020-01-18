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
public class Pt2Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 0; // Numero que evaluaremos
        int count = 0; // Veces que recorraremos el bucle
        
        while(count < 3){ // Iniciar el bucle
            num++; // Numero que tendremos que calcular
            int suma = 0; // Suma de los divisores
            for (int i = 1; i<num; i++) { // Bucle para comprobar los divisores
                if(num%i == 0) { // Si i es divisor, lo sumamos a la variable suma
                    suma += i;
                }
            }
            if (suma == num) { // Si al finalizar el bucle suma es igual que el numero, significa que es perfecto
                count++; // Sumamos uno a contador
                System.out.println(num); // Mostramos el numero
            }
        }
        
    }
    
}
