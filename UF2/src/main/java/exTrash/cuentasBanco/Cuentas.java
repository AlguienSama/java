/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exTrash.cuentasBanco;
import exTrash.cuentasBanco.Cuenta;

import java.io.*;
import java.util.ArrayList;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 *
 * @author alu2019222
 */
public class Cuentas {

    /**
     * @param userInput
     * @param args the command line arguments
     * @return 
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Cuenta> listAccounts = new ArrayList<>();

    // Create Cuenta
    static void createCuenta() throws IOException {

        System.out.println("Ingresa el número de cuenta ");
        String numCuenta = br.readLine();

        System.out.println("Ingresa el titular de la cuenta ");
        String titular = br.readLine();

        System.out.println("Ingresa el saldo inicial de la cuenta ");
        String sal = br.readLine();
        double saldo = Double.parseDouble(sal);

        // Insert data to build cuenta
        Cuenta account = new Cuenta(numCuenta, titular, saldo);
        listAccounts.add(account);

    }

    // Select cuenta to make thinks
    static Cuenta selectCuenta() throws IOException {

        System.out.println("Que cuenta desea utilizar?");
        // Show all accounts
        for (int i = 0; i < listAccounts.size(); i++) {
            Cuenta cuenta = listAccounts.get(i);
            System.out.println(i+") "+ cuenta.getNumero());
        }

        // Get account selected
        String elect = br.readLine();
        int el = Integer.parseInt(elect);
        // Test if cuenta position exist
        if (el >= listAccounts.size()) selectCuenta();
        Cuenta selCuenta = listAccounts.get(el);
        return selCuenta;
    }

    // Operations account
    static int eleccion(Cuenta account) throws IOException {

        System.out.println("\nPon el número de la opción que desea ejecutar\n"
            + "1) Obtener saldo\n" 
            + "2) Ingresar dinero\n" 
            + "3) Sacar dinero\n"
            + "4) Transferencia\n"
            + "6) Salir de la ejecución\n");
        String ele = br.readLine();
        int elect = Integer.parseInt(ele);
        // Make oparation
        return operaciones(account, elect);
    }

    // Making operations
    static int operaciones(Cuenta account, int elect) throws IOException {
        
        if (elect == 1) { // Get saldo

            System.out.println("Saldo actual: " + account.getSaldo());
            eleccion(account);

        }

        else if (elect == 2) { // Set saldo

            System.out.println("Introduce el saldo que desea ingresar");
            String valu = br.readLine();
            double val = Double.parseDouble(valu);

            // Test positive value
            if (val < 0) {
                System.out.println("No puedes sacar en negativo");
                return 6;

            }

            // Operations
            account.restarSaldo(val);
            account.sumarSaldo(val);
            eleccion(account);

        }

        else if (elect == 3) { // Set saldo extract

            System.out.println("Introduce el saldo que desea sacar");
            String valu = br.readLine();
            double val = Double.parseDouble(valu);

            // Test value
            if (account.getSaldo() > val) {
                System.out.println("No puedes sacar más de lo que tienes");
                return 6;
            }

            if (val < 0) {
                System.out.println("No puedes sacar en negativo");
                return 6;
            }

            // Operation
            account.restarSaldo(val);
            eleccion(account);
        }

        else if (elect == 4) { // Transfer

            System.out.println("Introduce el número de cuenta que le quieres transferir el dinero");
            // Show transfer number accounts
            for (int i = 0; i < listAccounts.size(); i++) {
                Cuenta cuenta = listAccounts.get(i);
                if (cuenta != account)
                    System.out.println("=> "+ cuenta.getNumero());
            }
            System.out.println("00 para cancelar");
            
            // Get number account
            String numCuenta = br.readLine();
            
            if (numCuenta == "00") { // Exit
                elect = 6;
            } 
            
            else { // Get numCuenta

                // Find account number
                Cuenta cuenta = findAccount(account, numCuenta);

                // if cuenta doesn't exist
                if (cuenta == account) {
                    System.out.println("La cuenta no existe");
                    return 6;
                }

                // Taking money
                System.out.println("Inserte el dinero que quiera ingresar");
                String din = br.readLine();
                Double dinero = Double.parseDouble(din);

                // Test value
                if (account.getSaldo()-dinero < 0) {
                    System.out.println("No puedes donar más de lo que tienes");
                    return 6;
                }

                if (dinero < 0) {
                    System.out.println("No puedes donar en negativo");
                    return 6;
                }

                // Operations
                account.restarSaldo(dinero);
                cuenta.sumarSaldo(dinero);
                System.out.println("Transacción echa correctamente");
                eleccion(account);
            }

        } 
        
        // Invalid operation teset
        else if (elect != 6) {
            System.out.println("Opción no válida");
            eleccion(account);
        }

        return elect;
        
    }

    // Searching account
    static Cuenta findAccount(Cuenta account, String numCuenta) {
        // Copy direction of user account
        Cuenta useCuenta = account;
        // Comparing all users account number with number user input (numCuenta)
        for (int i = 0; i < listAccounts.size(); i++) {
            Cuenta cuenta = listAccounts.get(i);
            String numero = cuenta.getNumero();

            // If number is equals, update useCuenta with cuenta direction
            if (numero.equals(numCuenta)) {
                useCuenta = cuenta;
            }

        }
        // Return cuenta direction
        return useCuenta;
    }


    public static void main(final String[] args) throws IOException {

        int elect = 6;
        // First account
        createCuenta();
        do {
            // Select options
            System.out.println(
                "\nQue opción desea ejecutar?\n"
                + "1) Crear nueva cuenta\n"
                + "2) Usar una cuenta\n"
                + "3) Salir");

            String opc = br.readLine();
            int opcion = Integer.parseInt(opc);

            if (opcion == 1) {
                createCuenta();
                elect = 1;
            } else if (opcion == 2) {
                Cuenta cuenta = selectCuenta();
                elect = eleccion(cuenta);
            } else {
                elect = 6;
            }
            
        } while(elect != 6);
        
    }
    
}
