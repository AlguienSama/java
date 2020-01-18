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
public class Ex111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota = Math.round((Math.random()*11)*100)/100d;
        System.out.println("Nota: "+nota);
        if(nota < 3){
            System.out.println("E");
        }
        else if(nota < 5){
            System.out.println("D");
        }
        else if(nota < 6.5){
            System.out.println("C");
        }
        else if(nota < 9){
            System.out.println("B");
        }
        else if(nota >= 9){
            System.out.println("A");
        } else {
            System.out.println("Nota incorrecta");
        }
    }
    
}
