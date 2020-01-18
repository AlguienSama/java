/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exTrash.notasAlumnos;

import java.util.HashMap;

/**
 *
 * @author alu2019222
 */

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private HashMap<String, Integer> notas = new HashMap<String, Integer>();

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public HashMap getNotas() {
        return this.notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setModulo(String nombre) {
        this.notas.put(nombre, null);
    }

    public boolean setNotas(String modulo, int nota) {
        if (!this.notas.containsKey(modulo)) {
            this.notas.put(modulo, nota);
            return false;
        }
        return true;
    }

    public void setNota(String ass, int nota) {
        this.notas.put(ass, nota);
    }

    public boolean existModulo(String modulo) {
        boolean existe = false;
        HashMap notas = this.getNotas();
        for (Object vals: notas.keySet()) {
            String ass = vals.toString();
            if (ass.equals(modulo))
                existe = true;
        }
        return existe;
    }
}