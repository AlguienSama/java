package exBanco.clases;

import exBanco.Funs;
import exBanco.clases.*;

import java.util.ArrayList;

public class Cliente {
    private String nombreApe;
    private String id;
    private ArrayList<Cuenta> clienteCuentas;

    public Cliente(String nombreApe) {
        this.nombreApe = nombreApe;
        this.id = newID();
        clienteCuentas = new ArrayList<>();
    }

    public String getNombreApe() {
        return nombreApe;
    }

    public void setNombreApe(String nombreApe) {
        this.nombreApe = nombreApe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Cuenta> getClienteCuentas() {
        return clienteCuentas;
    }

    public void setClienteCuentas(ArrayList<Cuenta> clienteCuentas) {
        this.clienteCuentas = clienteCuentas;
    }

    public String newID() {
        String id = "";

        for (int i = 0; i < 3; i++) {
            id += String.valueOf(Funs.randomMayus());
        }

        id += Funs.mathRandom(1_000_000_000L, 5_000_000_000L);

        return id;
    }

    public void addCuenta (Cuenta numCuenta) {
        clienteCuentas.add(numCuenta);
    }

    public void delCuenta(Cuenta cuenta) {
        this.clienteCuentas.remove(cuenta);
    }

    /*public static boolean existID(Cliente[] array, String id) {
        for (Cliente client : array) {
            if (client.getId().equals(id))
                return true;
        }
        return false;
    }*/
}
