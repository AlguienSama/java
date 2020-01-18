/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planets.Planeta;

// import exTrash.*;

/**
 *
 * @author alu2019222
 */
public class Planeta {
    private double masa;
    private long distancia;
    private String id;
    private String nombre;
    private static int totales;

    public Planeta(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        totales++;
    }

}
