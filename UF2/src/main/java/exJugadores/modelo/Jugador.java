package exJugadores.modelo;

public class Jugador {
    // Los datos del jugador
    private String nombre;
    private String nacionalidad;
    private int goles;
    private int amarillas;
    private int rojas;

    public Jugador(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Jugador(String nombre, String nacionalidad, int goles, int amarillas, int rojas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
        this.amarillas = amarillas;
        this.rojas = rojas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getGoles() {
        return goles;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public int getRojas() {
        return rojas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }
}
