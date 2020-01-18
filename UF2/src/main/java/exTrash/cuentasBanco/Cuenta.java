/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exTrash.cuentasBanco;

/**
 *
 * @author alu2019222
 */
public class Cuenta {
    private String numCuenta;
    private double saldo;
    private String titular;
    
    public Cuenta(final String numCuenta, final String titular, final double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public String getNumero() {
        return numCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
    
    public void sumarSaldo(double val) {
        this.saldo+=val;
    }

    public void restarSaldo(double val) {
        this.saldo-=val;
    }
    
}
