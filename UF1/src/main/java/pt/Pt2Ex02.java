package pt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu2019222
 */
public class Pt2Ex02 {

    /**
     * @return 
     */
    public static String[] elements() {
            int num = (int)(Math.random()*2)+1; // Numero random
            String[][] vals = { // Array con un numero y un elemento
                {
                    "3", 
                    "tijera"
                }, 
                {
                    "2", 
                    "papel"
                }, 
                {
                    "1", 
                    "piedra"
                }}; // Creamos e iniciamos un array String
        String[] result = vals[num]; // Guardamos la posición del random que ha salido respecto el array
        return result; // Devolvemos el array con un numero y un valor
    }
    
    /*
        tijera == 3
        papel == 2
        piedra == 1

        num1  num2
         3      2      1    num1
         3	1      2    num2
         2	1      1    num1
         2	3     -1    num2
         1	3     -2    num1
         1	2     -1    num2
    
         3      2      1    num1
         2	1      1    num1
         1	3     -2    num1
    
         3	1      2    num2
         2	3     -1    num2
         1	2     -1    num2
    */
    
    public static void fight(String[] p1, String[] p2) {
        
        int num1 = Integer.parseInt(p1[0]); // Pasamos el numero de la posición 0 a int. Lo mismo con el resto de jugadores
        int num2 = Integer.parseInt(p2[0]);
        
        int result = num1 - num2; // Restamos el numero del p1 con el del p2
        
        if (num1 == num2) { // Comparamos los valores siguiendo la tabla de arriba y mostramos el resultado
            System.out.println("Empate");
        } else if (result == 1 || result == -2) {
            System.out.println("Victoria jugador 1");
        } else if (result == -1 || result == 2) {
            System.out.println("Victoria jugador 2");
        } else {
            System.out.println("Error");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        String[] p1, p2; // Declaramos el jugador 1 y 2 en un String array
        do { // Empezamos un bucle
            p1 = elements(); // Ejecuta el metodo elements y le retorna un array con dos String. Lo mismo para todos los jugadores
            p2 = elements();
        
            System.out.println("Jugador 1: " + p1[1] + "\nJugador 2: " + p2[1]); // Mostramos el elemento que tenga cada jugador
            fight(p1, p2); // Ejecutamos el metodo fight para operar y saber el resultado
        }while (p1[0].equals(p2[0])); // Compara si el String en la posicion 0 de cada jugador son iguales. Si es true vuelve a ejecutar el bucle
        
        
        
        
    }
    
}
