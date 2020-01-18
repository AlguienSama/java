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
public class Pt2Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 100; i+=2) { // Iniciamos un bucle que vaya pasando numeros impares iniciando i a 1 y sumandole 2 siempre
            if(i%7!=0){ // Si i no es divisible por 7, mostramos el valor de i
                System.out.println(i);
            }
        }
    }
    
}
