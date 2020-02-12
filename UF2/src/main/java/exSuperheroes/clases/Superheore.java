package exSuperheroes.clases;

public class Superheore {
    private String nombre;
    private String superpoder;
    private int nivel;

    public Superheore(String nombre, String superpoder, int nivel) {
        this.nombre = nombre;
        this.superpoder = superpoder;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel=nivel;
    }
}
