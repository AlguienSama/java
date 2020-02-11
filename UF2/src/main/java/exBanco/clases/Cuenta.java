package exBanco.clases;

import exBanco.Funs;
import exBanco.clases.*;

import java.util.ArrayList;

public class Cuenta {
    private String numero;
    private double saldo;
    ArrayList<Cliente> cuentaClientes;

    public Cuenta(Cliente c) {
        numero = newId();
        cuentaClientes = new ArrayList<>();
        cuentaClientes.add(c);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cliente> getCuentaClientes() {
        return cuentaClientes;
    }

    public void setCuentaClientes(ArrayList<Cliente> cuentaClientes) {
        this.cuentaClientes = cuentaClientes;
    }

    public void addCliente(Cliente c) {
        cuentaClientes.add(c);
    }

    public void delCliente(Cliente c) {
        cuentaClientes.remove(c);
    }

    private String newId() {
        String id = "";
        String[] chars = new String[3];
        for (int i = 0; i < 10; i++) {
            chars[0] = String.valueOf(Funs.randomMayus());
            chars[1] = String.valueOf(Funs.randomMinus());
            chars[2] = String.valueOf(Funs.mathRandom(0,9));
            id+=chars[(int) (Math.random() * chars.length)];
        }
        return id;
    }
}
