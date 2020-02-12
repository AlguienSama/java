package exTrash.cafeteria.principal;

import exTrash.cafeteria.maquinaria.Cafetera;
import exSuperheroes.Funs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static Cafetera[] cafeteras;
    public static int maxCafeteras;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void verCafeteras() {
        for (int i = 0; i < cafeteras.length; i++) {
            if (cafeteras[i] !=null)
                System.out.println(i+1 +")\tCapacidad = "+ cafeteras[i].getCapacidadMax() +"\n\tCantidad = "+ cafeteras[i].getCantidadActual());
            else
                System.out.println(i+1 +") <Inexistente>");
        }
    }

    public static int selectCafetera() throws IOException {
        verCafeteras();
        System.out.println("0) Salir");
        return Funs.pedirInt();
    }

    public static int totalCafeteras() {
        int val = 0;
        for (int i=0; i < cafeteras.length; i++) {
            if (cafeteras[i] != null)
                val++;
        }
        return val;
    }

    public static int posicionVacia() {
        for (int i=0; i < cafeteras.length; i++) {
            if (cafeteras[i] == null)
                return i;
        }
        return -1;
    }

    public static boolean mostrarMenu() throws IOException {
        boolean exit = false;

        if (totalCafeteras() != maxCafeteras)
            System.out.print("\n1) Registrar cafetera");
        if (totalCafeteras() != 0) {
            System.out.print("\n2) Servir café" +
                    "\n3) Poner café en cafetera" +
                    "\n4) Vaciar cafetera" +
                    "\n5) Llenar cafetera" +
                    "\n6) Borrar cafetera" +
                    "\n7) Ver cafeteras");
        }
        System.out.println("\n0) Salir");

        String elec = br.readLine();

        if (elec.equals("1") && totalCafeteras() != maxCafeteras) {
            newCafetera();
        } else if (elec.equals("0")) {
            exit = true;
        } else if (totalCafeteras() != 0) {
            switch (elec) {
                case "2":
                    servirCafe();
                    break;
                case "3":
                    ponerCafeCafetera();
                    break;
                case "4":
                    vaciarCafetera();
                    break;
                case "5":
                    llenarCafetera();
                    break;
                case "6":
                    borrarCafetera();
                    break;
                case "7":
                    verCafeteras();
                    break;
            }
        }
        return exit;
    }

    public static boolean newCafetera() throws IOException {
        boolean exit = false;
        boolean salir = false;
        do {
            System.out.println("Como quieres registrar la cafetera?" +
                    "\n1) Capacidad máxima 1000 y vacía" +
                    "\n2) Llena al máximo" +
                    "\n3) Llena pero no al máximo" +
                    "\n0) Cancelar");
            String elect = br.readLine();

            switch (elect) {
                case "1":
                    cafeteras[posicionVacia()] = new Cafetera();
                    salir = true;
                    break;
                case "2":
                    cafeteras[posicionVacia()] = new Cafetera(
                            Funs.pedirNumWithStringAndMinimo("Que capacidad tiene la cafetera?", 1)
                    );
                    salir = true;
                    break;
                case "3":
                    cafeteras[posicionVacia()] = new Cafetera(
                            Funs.pedirNumWithStringAndMinimo("Que capacidad tiene la cafetera?", 1),
                            Funs.pedirNumWithStringAndMinimo("Que cantidad de café tiene la cafetera?", 0)
                    );
                    salir = true;
                    break;
                case "0":
                    salir = true;
                    exit = true;
                    break;
                default:
                    System.out.println("Nope");
            }
        } while (!salir);

        return exit;
    }

    public static void servirCafe() throws IOException {
        boolean salir;
        do {
            System.out.println("De que cafetera has servido café?");
            int ele = selectCafetera();
            if (ele == 0)
                salir = true;
            else if (ele-1 < maxCafeteras && ele-1 > -1 && cafeteras[ele-1] != null) {
                int val = Funs.pedirNum("Que cantidad has servido?", 0, cafeteras[ele-1].getCantidadActual());
                cafeteras[ele-1].servirTaza(val);
                salir = true;
            } else {
                salir = false;
                System.out.println("Cafetera no disponible!");
            }
        } while (!salir);
    }

    public static void ponerCafeCafetera() throws IOException {
        boolean salir;
        do {
            System.out.println("En que cafetera has puesto café?");
            int ele = selectCafetera();
            if (ele == 0)
                salir = true;
            else if (ele-1 < maxCafeteras && ele-1 > -1 && cafeteras[ele-1] != null) {
                int val = Funs.pedirNumWithStringAndMinimo("Que cantidad has puesto?", 0);
                cafeteras[ele-1].agregarCafe(val);
                salir = true;
            } else {
                salir = false;
                System.out.println("Cafetera no disponible!");
            }
        } while (!salir);
    }

    public static void vaciarCafetera() throws IOException {
        boolean salir;
        do {
            System.out.println("Que cafetera deseas vaciar?");
            int ele = selectCafetera();
            if (ele == 0)
                salir = true;
            else if (ele-1 < maxCafeteras && ele-1 > -1 && cafeteras[ele-1] != null ) {
                cafeteras[ele-1].vaciarCafetera();
                salir = true;
            } else {
                salir = false;
                System.out.println("Cafetera no disponible!");
            }
        } while (!salir);
    }

    public static void llenarCafetera() throws IOException {
        boolean salir;
        do {
            System.out.println("Que cafetera deseas llenar?");
            int ele = selectCafetera();
            if (ele == 0)
                salir = true;
            else if (ele-1 < maxCafeteras && ele-1 > -1 && cafeteras[ele-1] != null) {
                cafeteras[ele-1].llenarCafetera();
                salir =true;
            } else {
                salir = false;
                System.out.println("Cafetera no disponible!");
            }
        } while (!salir);
    }

    public static void borrarCafetera() throws IOException {
        boolean salir;
        do {
            System.out.println("Que cafetera desea eliminar?");
            int ele = selectCafetera();
            if (ele == 0)
                salir = true;
            else if (ele-1 < maxCafeteras && ele-1 > -1 && cafeteras[ele-1] != null) {
                cafeteras[ele-1] = null;
                salir = true;
            } else {
                salir = false;
                System.out.println("Cafetera no disponible!");
            }
        } while (!salir);
    }

    public static void main(String ... args) throws IOException {
        maxCafeteras = Funs.pedirNumWithStringAndMinimo("Cuantas cafeteras habrán?", 1);
        cafeteras = new Cafetera[maxCafeteras];
        boolean exit;
        do {
            exit = mostrarMenu();
        } while (!exit);
    }
}
