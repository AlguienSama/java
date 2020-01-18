/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author alu2019222
 */
public class Execute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo veh1 = new Vehiculo();
        
        veh1.prueba(veh1, 0);
        
        // this(int boolean) Llama a un constructor con el mimso nombre y tipos de variables
        // this.variable // Llama a la variable del constructor
        
        //Vehiculo veh2 = new Vehiculo("1234abc", 123, 'b', true);
        
        /*
        veh1.matricula = "1234abc";
        veh1.color = 'b';
        veh1.consumo = 0.75;
        veh1.plazas = 2;
        System.out.println(veh1);
        System.out.println(veh1.matricula + "\n" + veh1.color);
        System.out.println(veh1.consumoLitros(123));
        eh1.Tipo();
        */
    }
    
}
