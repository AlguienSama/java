/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exTrash.planetas;

/**
 *
 * @author alu2019222
 */
public class Planeta {
    double masa;
    double densidad;
    double diametro;
    long distancia;
    String id;
    String nombre;
    static int totales;

    Planeta(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        totales++;
    }
    
    

}
