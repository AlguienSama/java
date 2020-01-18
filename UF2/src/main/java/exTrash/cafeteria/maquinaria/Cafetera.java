package exTrash.cafeteria.maquinaria;

public class Cafetera {
    private int capacidadMax;
    private int cantidadActual;

    public Cafetera() {
        cantidadActual = 0;
        capacidadMax = 1000;
    }

    public Cafetera(int max) {
        capacidadMax = max;
        cantidadActual = max;
    }

    public Cafetera(int max, int act) {
        capacidadMax = max;
        cantidadActual = act > max ? max : act;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMax;
    }

    public void servirTaza(int cap) {
        cantidadActual = cantidadActual < cap ? 0 : cantidadActual - cap;
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cant) {
        this.cantidadActual += cant;
        if (cantidadActual > capacidadMax)
            cantidadActual = capacidadMax;
    }

    public int getCapacidadMax() {
        return this.capacidadMax;
    }

    public int getCantidadActual() {
        return this.cantidadActual;
    }
}
