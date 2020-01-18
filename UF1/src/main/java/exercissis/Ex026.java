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
public class Ex026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int en1 = 3, en2 = 2, res_en;
        double re1 = 3.0, re2 = -1.0, res_re;
        boolean bo1 = true, bo2 = true, res_bo;
        
        res_re= en1 + re1*en1; // true 12
        res_re = (en1 + re1) * en1; // true 18
        res_en= en2 /en1 +en1;; // true 3
        res_re = en2 / en1 + re1; // true 3
        res_bo = !(en1 > en2); // false
        res_bo= (en1 != en2) || en2 == 4; //true
        res_bo = en1%2 ==0; // false
        res_bo = en1%2 !=0 && en2%2!=0; // false
        res_bo = en1>=0 || en2<=4; // true
        res_bo = bo1 || bo2 && !bo1; // true
        
        
    }
    
}
