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
public class Vehiculo {
    /* VARIABLES DE INSTANCIA */
    String matricula;
    int potencia;
    char color;
    boolean automatico;
    
    
    Vehiculo() {
        
    }
    
    Vehiculo(String matricula, int potencia, char color, boolean automatico) {
        // Al poner this. distinges a la clase
        this.matricula = matricula;
        this.potencia = potencia;
        this.color = color;
        this.automatico = automatico;
    }
    
    void prueba(Vehiculo a, int b) {
        a.color='h';
    }
    
    
    /*
    String marca;
    int plazas;
    int numPuertas;
    double consumo;
    double km;
    String modelo;
    int numRuedas;
    */
    
    /*
    public double consumoLitros(double km) {
        return km*consumo;
    }
    
    public void Tipo(){
        if (plazas == 2) {
            System.out.println("Moto");
        } else if (plazas == 4) {
            System.out.println("Coche");
        } else {
            System.out.println("Nani wtf");
        }
    }

    */
    
}
