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
public class Ex113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String model = "a", color = "a";
        switch (model) {
            case "a":
                switch (color){
                    case "b":
                        System.out.println("233.24€");
                        break;
                    case "g":
                        System.out.println("340.10€");
                        break;
                    case "a":
                        System.out.println("253.38€");
                        break;
                    default:
                        System.out.println("Color no disponible");
                        break;
                }   break;
            case "b":
                switch (color){
                    case "b":
                        System.out.println("251.32€");
                        break;
                    case "g":
                        System.out.println("351.14€");
                        break;
                    case "a":
                        System.out.println("279.10€");
                        break;
                    default:
                        System.out.println("Color no disponible");
                        break;
                }   break;
            default:
                System.out.println("Model no disponible");
                break;
        }
    }
    
}
