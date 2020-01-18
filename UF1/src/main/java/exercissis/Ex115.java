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
public class Ex115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int num = 3;
        for(int i = 0; i < 100; i++){
            if((i%2) == 0){
                num-=2;
                System.out.println(num);
            } else {
                num+=4;
                System.out.println(num);
            }
        }
        */
        for(int i=1; i<100; i=i-2){
            System.out.println(i);
            i+=4;
            System.out.println(i);
        }
    }
    
}
