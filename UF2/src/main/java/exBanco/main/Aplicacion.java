package exBanco.main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Objects;

import exBanco.clases.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Aplicacion {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    /*
    #####################################################

                            MENÚS

    #####################################################
     */

    private static void menuInicio() {
        System.out.println("Que opción desea ejecutar?" +
                "\n1) Dar de alta / baja a un cliente" +
                "\n2) Mostrar clientes" +
                "\n3) Mostrar cuentas" +
                "\n0) Salir");
    }

    private static boolean elecInicio() throws IOException {
        menuInicio();

        boolean salir;
        boolean exit = false;
        do {
            String elec = br.readLine();
            salir = true;
            switch (elec) {
                case "1":
                    alterCliente();
                    break;
                case "0":
                    System.out.println("Bye bye!");
                    exit = true;
                    break;
                case "2":
                    mostrarClientes();
                    break;
                case "3":
                    mostrarCuentas();
                    break;
                default:
                    salir = false;
            }
        } while (!salir);
        return exit;
    }

    private static void menuElecCuenta(Cliente c) throws IOException {
        System.out.println("Que opción desea ejecutar?" +
                "\n1) Crear cuenta" +
                "\n2) Vincular cuenta");

        boolean salir;
        do {
            String elec = br.readLine();
            salir = true;
            switch (elec) {
                case "1":
                    crearCuenta(c);
                    break;
                case "2":
                    vincularCuenta(c);
                    break;
                default:
                    System.out.println("Opción incorrecta!");
                    salir = false;
                    break;
            }
        } while (!salir);
    }

    private static void alterCliente() throws IOException {
        System.out.println("Que opción desea ejecutar?" +
                "\n1) Dar de alta" +
                "\n2) Dar de baja");
        boolean salir;
        do {
            String elec = br.readLine();
            salir = true;
            switch (elec) {
                case "1":
                    crearCliente();
                    break;
                case "2":
                    eliminarCliente(pedirClienteExistente());
                    break;
                default:
                    System.out.println("Opción incorrecta!");
                    salir = false;
            }
        } while (!salir);
    }

    /*
    #####################################################

                          FIN MENÚS

    #####################################################
     */

    /*
    #####################################################

                         INFORMACIÓN

    #####################################################
     */

    private static void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("###############");
            System.out.println(cliente.getNombreApe());
            for (Cuenta cuenta : cliente.getClienteCuentas()) {
                System.out.println(cuenta.getNumero());
            }
        }
    }

    private static void mostrarCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println("###############");
            System.out.println(cuenta.getNumero());
            for (Cliente cliente : cuenta.getCuentaClientes()) {
                System.out.println(cliente.getNombreApe());
            }
        }
    }

    @Nullable
    private static Cuenta getCuenta(String numCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero().equals(numCuenta))
                return cuenta;
        }
        return null;
    }

    @Nullable
    private static Cliente getCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombreApe().toLowerCase().equals(nombre))
                return cliente;
        }
        return null;
    }

    private static boolean existCuenta(String numCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero().equals(numCuenta))
                return true;
        }
        return false;
    }

    private static boolean existCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombreApe().equals(nombre.toLowerCase()))
                return true;
        }
        return false;
    }

    /*
    #####################################################

                       FIN INFORMACIÓN

    #####################################################
     */

    /*
    #####################################################

                         INTERACCIÓN

    #####################################################
     */

    private static Cuenta pedirCuentaExistente() throws IOException {
        String numCuenta;
        do {
            numCuenta = br.readLine();
            if (!existCuenta(numCuenta))
                System.out.println("La cuenta no existe!");
        } while (!existCuenta(numCuenta));
        return getCuenta(numCuenta);
    }

    @NotNull
    private static String pedirCliente() throws IOException {
        String nombre = pedirInfo("Introduzca el nombre del cliente");
        nombre += " " + pedirInfo("Introduzca el primer apellido");
        nombre += " " + pedirInfo("Introduzca el segundo apellido");
        return nombre;
    }

    private static Cliente pedirClienteExistente() throws IOException {
        String nombre;
        do {
            nombre = pedirCliente();

            if (!existCliente(nombre))
                System.out.println("El cliente no existe!");
        } while (!existCliente(nombre));
        return getCliente(nombre);
    }

    private static String pedirInfo(String frase) throws IOException {
        String res;
        do {
            System.out.println(frase);
            res = br.readLine();
        } while (res.equals(""));
        return res;
    }

    /*
    #####################################################

                       FIN INTERACCIÓN

    #####################################################
     */

    /*
    #####################################################

                           VARIS

    #####################################################
     */

    private static void crearCliente() throws IOException {
        String nombre = pedirCliente();
        if (existCliente(nombre.toLowerCase())) System.out.println("El cliente ya existe!");
        else {
            Cliente c = new Cliente(nombre);
            clientes.add(c);
            System.out.println("Cliente " + c.getNombreApe() + " agregado correctamente!");
            menuElecCuenta(c);
        }
    }

    private static void eliminarCliente(@NotNull Cliente c) {
        for (Cuenta cuenta : c.getClienteCuentas()) {
            cuenta.delCliente(c);
            if (cuenta.getCuentaClientes().isEmpty()) {
                cuentas.remove(cuenta);
            }
        }
        clientes.remove(c);
        System.out.println("Cliente eliminado correctamente!");
    }

    private static void crearCuenta(Cliente c) {
        Cuenta cuenta = new Cuenta(c);
        cuentas.add(cuenta);
        c.addCuenta(cuenta);
        System.out.println("Cuenta " + cuenta.getNumero() + " creada correctamente!");
    }

    private static void eliminarCuenta(Cuenta c) {
        cuentas.remove(c);
        for (Cliente cliente : clientes) {
            if (cliente.getClienteCuentas().contains(c))
                cliente.delCuenta(c);
        }
        System.out.println("Cuenta eliminada correctamente!");
    }

    private static void vincularCuenta(@NotNull Cliente c) throws IOException {
        System.out.println("Introduzca el número de cuenta que desea vincular");
        Cuenta cuenta = pedirCuentaExistente();
        c.addCuenta(cuenta);
        Objects.requireNonNull(cuenta).addCliente(c);
    }

    /*
    #####################################################

                         FIN VARIS

    #####################################################
     */

    public static void main(String... args) throws IOException {
        boolean exit;
        do {
            exit = elecInicio();
        } while (!exit);
    }
}
