package exJugadores.vista;

import exJugadores.modelo.Jugador;

import general.Funs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Jugador[] jugadores = new Jugador[4];

    /**
     * Crear un nuevo jugador
     * @throws IOException
     */
    public static void crearUsuario() throws IOException {
        // Marcamos que no salga del bucle
        boolean exit = false;
        // Empezamos el bucle
        do {
            // Pedimos como quiere registrar al nuevo jugador
            System.out.println("\nComo lo quieres crear el nuevo jugador?" +
                    "\n1) Jugador nuevo" +
                    "\n2) Jugador con estadística");
            String res = br.readLine();

            // Evaluamos las opciones
            switch (res) {
                case "1":
                    // Nuevo jugador y salimos del bucle
                    newPlayer();
                    exit = true;
                    break;
                case "2":
                    // Nuevo jugador y salimos del bucle
                    newPlayerStadist();
                    exit = true;
                    break;
                default:
                    // Opción no válida y nos quedamos en el bucle
                    System.out.println("Opción incorrecta");
            }

        } while (exit);
        // Informamos de que el jugador se ha registrado correctamente
        System.out.println("Jugador registrado correctamente");
    }

    /**
     * Nuevo jugador con nombre y nacionalidad
     * @throws IOException
     */
    public static void newPlayer() throws IOException {
        // Iniciamos la variable nombre
        String nombre;
        do {
            // Pedimos el nombre del jugador
            System.out.println("Introduzca el nombre del jugador");
            nombre = br.readLine();
            // En caso de que exista, volvemos a pedir el nombre
        } while (existJugador(nombre));
        // Pedimos la nacionalidad
        System.out.println("Introduzca la nacionalidad del jugador");
        String nacionalidad = br.readLine();

        // Buscamos una posición vacía para introducir los datos
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                // Introducimos los datos
                jugadores[i] = new Jugador(nombre, nacionalidad);
                // Paramos el bucle para que no introduzca
                // los datos en todas las posiciones
                break;
            }
        }
    }

    /**
     * Nuevo jugador con todos los datos
     * @throws IOException
     */
    public static void newPlayerStadist() throws IOException {
        // Iniciamos la variable nombre
        String nombre;
        do {
            // Pedimos el nombre del jugador
            System.out.println("Introduzca el nombre del jugador");
            nombre = br.readLine();
            // En caso de que exista, volvemos a pedir el nombre
        } while (existJugador(nombre));
        // Pedimos la nacionalidad
        System.out.println("Introduzca la nacionalidad del jugador");
        String nacionalidad = br.readLine();
        // Pedimos los enteros restantes dándole como mínimo para poner 0
        int goles = Funs.pedirNumWithStringAndMinimo("Introduzca el número de goles", 0);
        int amarillas = Funs.pedirNumWithStringAndMinimo("Introduzca la cantidad de tarjetas amarillas", 0);
        int rojas = Funs.pedirNumWithStringAndMinimo("Introduzca la cantidad de tarjetas rojas", 0);

        // Buscamos una posición vacía para introducir los datos
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                // Introducimos los datos
                jugadores[i] = new Jugador(nombre, nacionalidad, goles, amarillas, rojas);
                // Paramos el bucle para que no introduzca
                // los datos en todas las posiciones
                break;
            }
        }
    }

    /**
     * Comprobar si existe el jugador
     * @param nombre Nombre del jugador
     * @return True si existe, false si no
     */
    public static boolean existJugador(String nombre) {
        // Bucle para recorrer cada jugador
        for (Jugador jugador : jugadores) {
            // Miramos si existe el jugador
            if (jugador != null && jugador.getNombre().equals(nombre)) {
                // En caso afirmativo ya retornamos true
                return true;
            }
        }
        // Si no ha encontrado, retornamos false
        return false;
    }

    /**
     * Mostrar primer menú
     * @return Si salimos o no
     * @throws IOException
     */
    public static boolean mostrarMenu() throws IOException {
        // Marcamos que el usuario no salga del bucle
        boolean exit = false;
        // Le mostramos las opciones que puede elegir el usuario
        System.out.println("\nQue opción desea elegir?" +
                "\n1) Mostrar datos del jugador" +
                "\n2) Modificar datos del jugador" +
                "\n3) Mostrar estadísticas" +
                "\n4) Salir");
        // Ponemos que pida un número entre 1 y 4
        int ele = Funs.pedirNum(1, 4);

        // Evaluamos la opción
        switch (ele) {
            case 1:
                // Elegimos jugador y mostramos los datos
                String jugador = selectJugador();
                if (jugador != null)
                    mostrarDatos(jugador);
                break;
            case 2:
                // Elegimos jugador y vamos a modificar los datos
                jugador = selectJugador();
                if (jugador != null)
                    modificarDatos(jugador);
                break;
            case 3:
                // Mostramos las estadísticas
                mostrarStats();
                break;
            case 4:
                // Salimos del bucle
                System.out.println("Bye!");
                exit = true;
                break;
        }
        // Retornamos si salimos del bucle (programa)
        return exit;
    }

    /**
     * Mostrar todos los datos de un jugador
     * @param nombre Nombre del jugador
     */
    public static void mostrarDatos(String nombre) {
        // Bucle para obtener el jugador seleccionado
        for (Jugador jugador : jugadores) {
            // A la que encuentra el jugador
            if (jugador.getNombre().equals(nombre)) {
                // Muestra los datos
                System.out.println("Nombre: " + jugador.getNombre() +
                        "\nNacionalidad: " + jugador.getNacionalidad() +
                        "\nGoles: " + jugador.getGoles() +
                        "\nAmarillas: " + jugador.getAmarillas() +
                        "\nRojas: " + jugador.getRojas());
            }
        }
    }

    /**
     * Modificar datos de un jugador
     * @throws IOException
     */
    public static void modificarDatos(String jugador) throws IOException {
        // Mostramos los datos del jugador
        mostrarDatos(jugador);

        // Decimos que no salga del bucle
        boolean exit = false;
        do {
            // Pedimos que opción desea modificar
            String ele = modificarEleccion();
            switch (ele) {
                case "1":
                    // Modificamos el nombre
                    modificarNombre(jugador);
                    break;
                case "2":
                    // Modificamos la nacionalidad
                    modificarNacionalidad(jugador);
                    break;
                case "3":
                    // Modificamos los goles
                    modificarGoles(jugador);
                    break;
                case "4":
                    // Modificamos las targetas amarillas
                    modificarAmarillas(jugador);
                    break;
                case "5":
                    // Modificamos las targetas rojas
                    modificarRojas(jugador);
                    break;
                case "6":
                    // Salimos de la modificacion de usuario
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    /**
     * Modificar un usuario
     * @return opción a modificar
     * @throws IOException
     */
    public static String modificarEleccion() throws IOException {
        // Mostramos las opciones
        System.out.println("Que dada deseas podificar?" +
                "\n1) Nombre" +
                "\n2) Nacionalidad" +
                "\n3) Goles" +
                "\n4) Amarillas" +
                "\n5) Rojas" +
                "\n6) Salir");
        // Retornamos el valor introducido por el usuario
        return br.readLine();
    }

    /**
     * Modificar nombre del jugador
     * @param jugador Jugador seleccionado
     * @throws IOException
     */
    private static void modificarNombre(String jugador) throws IOException {
        // Pedimos el nuevo nombre
        System.out.println("Introduce el nuevo nombre");
        String nombre = br.readLine();

        // Iniciamos bucle
        do {
            // Comprobamos si existe un jugador
            // con el mismo nombre
            if (!existJugador(nombre)) {
                // En caso de que no exista, introducimos
                // los datos en el jugador corresponiente
                for (Jugador jugadorA : jugadores) {
                    // A la que encuentra el jugador,
                    // le introduce el nombre
                    if (jugadorA.getNombre().equals(jugador)) {
                        jugadorA.setNombre(nombre);
                    }
                }
                // Si ya existe un jugador con el mismo nombre
                // se le informa al usuario
            } else
                System.out.println("El jugador ya existe!");
            // Si el jugador existe, ejecuta bucle
        } while (existJugador(nombre));
    }

    /**
     * Modificar nacionalidad jugador
     * @param jugador Jugador seleccionado
     * @throws IOException
     */
    private static void modificarNacionalidad(String jugador) throws IOException {
        // Le pedimos la nacionalidad
        System.out.println("Introduce la nueva nacionalidad");
        String nacion = br.readLine();

        // Buscamos el jugador en el array
        for (Jugador jugadorA : jugadores) {
            // Cuando lo encuentre, le introducimos los datos
            if (jugadorA.getNombre().equals(jugador)) {
                jugadorA.setNacionalidad(nacion);
            }
        }
    }

    /**
     * Modificar goles jugador
     * @param jugador Jugador seleccionado
     * @throws IOException
     */
    private static void modificarGoles(String jugador) throws IOException {
        // Pedimos la cantidad de goles, metiendole un mínimo de 0
        int goles = Funs.pedirNumWithStringAndMinimo("Introduce la nueva cantidad de goles", 0);

        // Buscamos el jugador en el array
        for (Jugador jugadorA : jugadores) {
            // Cuando lo encuentre, le introducimos los datos
            if (jugadorA.getNombre().equals(jugador)) {
                jugadorA.setGoles(goles);
            }
        }
    }

    /**
     * Modificar targetas amarillas jugador
     * @param jugador Jugador seleccionado
     * @throws IOException
     */
    private static void modificarAmarillas(String jugador) throws IOException {
        // Pedimos la cantidad de targetas, metiendole un mínimo de 0
        int targ = Funs.pedirNumWithStringAndMinimo("Introduce la nueva cantidad de targetas amarillas", 0);

        // Buscamos el jugador en el array
        for (Jugador jugadorA : jugadores) {
            // Cuando lo encuentre, le introducimos los datos
            if (jugadorA.getNombre().equals(jugador)) {
                jugadorA.setAmarillas(targ);
            }
        }
    }

    /**
     * Modificar targetas rojas jugador
     * @param jugador Jugador seleccionado
     * @throws IOException
     */
    private static void modificarRojas(String jugador) throws IOException {
        // Pedimos la cantidad de targetas, metiendole un mínimo de 0
        int targ = Funs.pedirNumWithStringAndMinimo("Introduce la nueva cantidad de targetas rojas", 0);

        // Buscamos el jugador en el array
        for (Jugador jugadorA : jugadores) {
            // Cuando lo encuentre, le introducimos los datos
            if (jugadorA.getNombre().equals(jugador)) {
                jugadorA.setRojas(targ);
            }
        }
    }

    /**
     * Mostrar estadísticas globales
     */
    public static void mostrarStats() {
        // Preparamos las variables para guardar
        // los jugadores y cantidad que
        // tiene más de cada cosa
        String jugGoles = null;
        int goles = 0;
        String jugAmarillas = null;
        int amarillas = 0;
        String jugRojas = null;
        int rojas = 0;

        // Recorremos el array de jugadores
        for (Jugador jugador : jugadores) {
            // Mira si hay más goles que en la
            // variable goles
            if (jugador.getGoles() > goles) {
                // En caso afirmativo guarda
                // la cantidad de goles y
                // el nombre del jugador
                goles = jugador.getGoles();
                jugGoles = jugador.getNombre();
            }
            // Lo mismo que el anterior
            if (jugador.getAmarillas() > amarillas) {
                amarillas = jugador.getAmarillas();
                jugAmarillas = jugador.getNombre();
            }
            // Lo mismo que el anterior
            if (jugador.getRojas() > rojas) {
                rojas = jugador.getRojas();
                jugRojas = jugador.getNombre();
            }
        }

        // Mostramos los resultados
        System.out.println("\nGoles\nJugador: " + jugGoles + "\nGoles: " + goles);
        System.out.println("\nTargetas amarillas\nJugador: " + jugAmarillas + "\nTarjetas: " + amarillas);
        System.out.println("\nTargetas rojas\nJugador: " + jugRojas + "\nTarjetas: " + rojas);
    }

    /**
     * Seleccionamos un jugador
     * @return Nombre jugador seleccionado
     * @throws IOException
     */
    public static String selectJugador() throws IOException {
        // Le decimos que no salga del bucle
        boolean exit = false;
        // iniciamos el string jugador
        String jugador;
        // Iniciamos bucle
        do {
            // Mostramos todos los jugadores
            System.out.println("Introduce el nombre del jugador que deseas seleccionar");
            mostrarJugadores();
            // El usuario inserta el nombre del jugador
            jugador = br.readLine();
            // En caso de que el jugador no exista
            if (!existJugador(jugador)) {
                // Le pedimos que quiere hacer el usuario
                System.out.println("El jugador no existe, deseas:" +
                        "\n1) Volver a elegir" +
                        "\n2) Salir");
                // Le pedimos un numero de entre 1 y 2
                int res = Funs.pedirNum(1, 2);

                // Si el usuario selecciona 2, salimos
                if (res == 2) {
                    exit = true;
                    // Decimos que no selecciona ningún usuario
                    jugador = null;
                }
                // Si selecciona 1, se ejecuta
                // el bucle otra vez
            } else {
                // En caso de que exista, salimos
                exit = true;
            }
        } while (!exit);
        // Devolvemos el jugador
        return jugador;
    }

    /**
     * Mostramos el nombre de todos los jugadores
     */
    public static void mostrarJugadores() {
        // Bucle para mostrar el nombre
        for (Jugador jugadors : jugadores) {
            System.out.println(" => " + jugadors.getNombre());
        }
    }

    /**
     * Inicio del programa
     * @param args
     * @throws IOException
     */
    public static void main(String... args) throws IOException {

        // Bucle para registrar jugadores
        for (int i = 1; i <= 4; i++) {
            System.out.println("Jugador " + 1);
            crearUsuario();
        }

        // Bucle del menú principal
        boolean exit;
        do {
            exit = mostrarMenu();
        } while (!exit);
    }

}
