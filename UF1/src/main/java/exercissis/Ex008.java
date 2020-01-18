/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercissis;

/**
 *
 * @author alu2019222
 */
public class Ex008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] edat = {18, 20};
        double[] pes = {62.3, 75.5};
        String[] name = {"Lluís Mina", "Lluís ja no mina"};
        boolean[] exAlumna = {true, false};
        String[] dni = {"45431234M", "12345678M"};
        double temperatura = 27.5;
        int[] altura = {173, 168};
        char[] inicial = {'L', 'L'};
        boolean[] repetidor = {true, false};
        byte[] germans = {2, 0};
        
        for(byte i=0; i<2; i++){
            System.out.println(edat[i] +" "+ pes[i] +" "+ name[i] +" "+ exAlumna[i] +" "+ dni[i] +" "+ temperatura +" "+ altura[i] +" "+ inicial[i] +" "+ repetidor[i] +" "+ germans[i]);
        }
    }
    
}
