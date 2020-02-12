package exSuperheroes.main;

import exSuperheroes.Funs;
import exSuperheroes.clases.*;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    // Variables globales
    public static Superheore[] superheores = new Superheore[2];
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Menú principal
    private static boolean menuPrincipal() throws IOException {
        // Variable para retornar si salimos o no del programa
        boolean exit = false;
        // Mostrar el menú
        System.out.print("######## MENÚ ########");
        // Miramos si han puesto ya los héroes o no
        // para mostrar las opciones disponibles
        // al usuario
        if (!lleno())
            System.out.print("\n1) Registrar héroe");
        if (lleno()) {
            System.out.print("\n2) Mejorar habilidad" +
                    "\n3) La Gran Batalla" +
                    "\n4) El Resultado Final");
        }
        System.out.println("\n5) Salir" +
                "\n######################");

        // Obtenemos la elección
        String ele = br.readLine();

        // Comprobamos la elección del usuario
        // y si se puede ejectuar con respecto
        // a los héroes disponibles
        if (!lleno() && ele.equals("1"))
            newHeroe();
        else if (ele.equals("5")) {
            String[] despedida = {
                    " ~~ Inserte frase motivadora de despedida ¬w¬ ~~ ",
                    " ~~ La violencia no soluciona las cosas, hablen en persona ~~ \n(De la misma forma que tienes la frase motivadora, yo quiero el 10 en la práctica)"
            };
            // Mostramos una frase aleatoria de las del array de arriba
            System.out.println(despedida[((int) (Math.random() * despedida.length))]);
            // Marcamos que se sale del programa
            exit = true;
        } else if (lleno()) {
            switch (ele) {
                case "2":
                    updateHabilidad();
                    break;
                case "3":
                    granBatalla();
                    break;
                case "4":
                    finalResult();
                    break;
                default:
                    System.out.println("Opción incorrecta! u.u");
            }
        } else
            System.out.println("Opción incorrecta! u.u");

        // Retornamos si salimos o no del programa
        return exit;
    }


    /**
     * Mensaje resultado final
     * @param win héroe ganador
     * @param lose héroe perdedor
     */
    private static void finalResultMsg(Superheore win, Superheore lose) {
        // Mostramos el mensaje al usuario del resultado
        System.out.println("El ganador es " + win.getNombre() +
                "\ncon nivel " + win.getNivel());
        System.out.println("\nEl perdedor es " + lose.getNombre() +
                "\ncon nivel " + lose.getNivel());
    }


    /**
     * Comprobar el resultado final
     */
    private static void finalResult() {
        // Obtenemos los héroes
        Superheore s0 = superheores[0];
        Superheore s1 = superheores[1];
        // Miramos el que tenga el nivel más alto
        // Y le mostramos el resultado
        // al usuario
        if (s0.getNivel() < s1.getNivel())
            finalResultMsg(s1, s0);
        else if (s0.getNivel() > s1.getNivel())
            finalResultMsg(s0, s1);
        else
            System.out.println("EMPATE!! OwO");
    }


    /*
        PLANIFICACIÓN PIEDRA PAPEL TIJERAS
        tijera == 3
        papel == 2
        piedra == 1

        num1  num2
         3      2      1    num1
         3	    1      2    num2
         2	    1      1    num1
         2	    3     -1    num2
         1	    3     -2    num1
         1	    2     -1    num2

         3      2      1    num1
         2	    1      1    num1
         1	    3     -2    num1

         3	    1      2    num2
         2	    3     -1    num2
         1	    2     -1    num2
    */

    /**
     * Inicio juego piedra papel tijeras
     * @return array resultado usuario
     * @throws IOException
     */
    private static int[] juego() throws IOException {
        // Pedimos el usuario que vaya introduciendo números
        // y los guardamos en un array
        System.out.println("Introduce el número de lo que deseas realizar");
        int[] mazo = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Tirada " + (i + 1));
            System.out.println("1) Piedra\n2) Papel\n3) Tijera");
            // Comprobamos que el número sea válido y lo guardamos
            mazo[i] = Funs.pedirNum(1, 3);
        }
        // Devolvemos el array
        return mazo;
    }


    /**
     * Inicio del piedra papel tijeras
     * @throws IOException
     */
    private static void granBatalla() throws IOException {
        // Pedir los resultados de ambos héroes
        System.out.println("Primer jugador, Superman!!");
        int[] jug1 = juego();
        System.out.println("Segundo jugador, Batman!!");
        int[] jug2 = juego();

        // Variables con las victorias
        int wins1 = 0;
        int wins2 = 0;

        // Comprobamos quien gana en cada ronda
        // y sumamos las victorias en la variable
        // correspondiente
        for (int i = 0; i < jug1.length; i++) {
            int num = jug1[i] - jug2[i];
            if (num == 1 || num == -2) {
                wins1++;
            } else if (num == 2 || num == -1) {
                wins2++;
            }
        }

        // Obtenemos la posición en el
        // array de cada héroe
        int pos1 = selectPosition("superman");
        int pos2 = selectPosition("batman");

        // Sumamos los niveles que han ganaod
        lvlUp(pos1, wins1);
        lvlUp(pos2, wins2);

        // Mostramos el resultado al usuario
        System.out.println("\n ~~ Victorias ~~ " +
                "\nSuperman: " + wins1 +
                "\nBatman: " + wins2 +
                "\n~~ ~~ ~~ ~~ ~~ ~~");
    }


    /**
     * Elegir el nivel de entrenamiento
     * @throws IOException
     */
    private static void updateHabilidad() throws IOException {
        // Obtenemos la posición en el array
        // del héroe que desee usar el usuario
        int pos = selectHero();
        // Iniciamos bucle y que
        // por defecto salga del mismo
        boolean exit = true;
        do {
            // Le pedimos al usuario que nivel
            // de entrenamiento desea hacer
            System.out.println("Que nivel de entrenamiento deseas hacer?" +
                    "\n1) Bajo" +
                    "\n2) Alto");
            String ele = br.readLine();
            // Comprobamos la opción del usuario
            if (ele.equals("1"))
                entrenamientoBajo(pos);
            else if (ele.equals("2"))
                entrenamientoAlto(pos);
            else
                exit = false;
        } while (!exit);

    }


    /**
     * Entrenamiento de nivel bajo
     * @param pos Posición del héroe
     * @throws IOException
     */
    private static void entrenamientoBajo(int pos) throws IOException {
        // Generamos número aleatorio
        int num = Funs.mathRandom(1, 20);
        // Bucle con la cantidad de intentos
        for (int i = 0; i < 5; i++) {
            // Pedimos el número al usuario
            System.out.println("Introduce un número entre 1 y 20");
            // Funcion para pedir un int
            int numU = Funs.pedirInt();

            // Comprobamos si ha acertado o no el número
            if (numU == num) {
                System.out.println("Acertaste el número! Owo");
                // En caso de acertar, sube un nivel
                lvlUp(pos, 1);
                break;
            } else if (i == 4) {
                System.out.println("No acertaste, fin del juego 7.7");
            } else if (numU > num)
                System.out.println("El número es más pequeño");
            else
                System.out.println("El número es más grande");
        }
    }


    // Obtener divisores de un número
    private static int divisores(int num) {
        // En este caso como mucho el divisor podrá ser 1000
        int divisor = 1000;
        // Comprobamos si se puede dividir más
        while (num / divisor < 1) {
            // Le quitamos un 0 al divisor
            divisor /= 10;
        }
        // Devolvemos el divisor
        return divisor;
    }

    private static int calculoEntrenamientoAlto(int num1, int num2) {
        // Calculamos los divisores de cada número
        int divisor1 = divisores(num1);
        int divisor2 = divisores(num2);

        // Obtenemos el largo del número final
        int largo = divisor1 * divisor2 * 10;

        // Variable con el número final
        int num = 0;

        // Comprobamos si aún se pueden extraer las unidades
        while (divisor1 >= 1 || divisor2 >= 1) {
            // Si se pueden extraer aún una cifra del
            // primer número, se procede a extraerla
            if (divisor1 >= 1) {
                // Sumamos la cifra en el sitio que corresponde
                num = num + ((num1 / divisor1) * largo);
                // Le quitamos dicha cifra al número
                num1 -= ((num1 / divisor1) * divisor1);
                // Movemos las posición donde se
                // pondrá y calculará el siguiente número
                largo /= 10;
                divisor1 /= 10;
            }
            // Lo mismo que el anterior
            if (divisor2 >= 1) {
                num = num + ((num2 / divisor2) * largo);
                num2 -= ((num2 / divisor2) * divisor2);
                largo /= 10;
                divisor2 /= 10;
            }
        }
        // Devolvemos el número final
        return num;
    }


    /**
     * Inicio del entrenamiento alto
     * @param pos Posición del héroe en el array
     * @throws IOException
     */
    private static void entrenamientoAlto(int pos) throws IOException {
        // Generamos los números
        int num1 = (int) (Math.random() * 999 + 1);
        int num2 = (int) (Math.random() * 999 + 1);

        // Mostramos los números y pedimos al usuario la respuesta
        System.out.println("Num1: " + num1 + "\nNum2: " + num2);
        System.out.println("Cual es el número correcto?");
        int num = Funs.pedirInt();

        // Comprobamso si el usuario acertó
        if (num == calculoEntrenamientoAlto(num1, num2)) {
            System.out.println("Acertaste! Uwu");
            // Sumamos dos niveles al usuario
            lvlUp(pos, 2);
        } else
            System.out.println("Fallaste! Q.Q");

    }


    /**
     * Para registrar un nuevo héroe
     * @throws IOException
     */
    private static void newHeroe() throws IOException {
        // Bucle para saber si el nómbre
        // del héroe es correcto o no
        boolean correct = true;
        String nombre;
        do {
            // Pedimos el nombre
            System.out.println("Nombre del heroe:");
            nombre = br.readLine();

            // Comprobamos si es correcto el nombre
            if (!testName(nombre)) {
                // En caso de que no sea correcto
                // le informamos al usuario
                System.out.println("Nombre no es correcto!");
                correct = false;
            }

            // Comprobamos si el héroe ya a
            // sido registrado
            else if (existHeroe(nombre)) {
                // En caso de que ya exista, le avisamos
                // al usuario
                System.out.println("El heroe ya está registrado!");
                correct = false;
            }
            // Si no hay errores, decimos que es true
            else
                correct = true;
        } while (!correct);

        // Pedimos los datos restantes
        System.out.println("Especifíca su superpoder");
        String superpoder = br.readLine();
        System.out.println("Especifíca el nivel");
        int nivel = Funs.pedirNum(0, 10);

        // Buscamos una posición vacía y registramos el
        // héroe en dicha posición
        for (int i = 0; i < superheores.length; i++) {
            if (superheores[i] == null) {
                superheores[i] = new Superheore(nombre, superpoder, nivel);
                break;
            }
        }
        System.out.println("Héroe registrado correctamente! 7w7");
    }


    // Comprobar el nómbre del héroe con los nombres disponibles
    public static boolean testName(String nombre) {
        boolean correcto = false;
        if (nombre.equalsIgnoreCase("superman") || nombre.equalsIgnoreCase("batman"))
            correcto = true;
        return correcto;
    }


    /**
     * Saber la posición del héroe en el array
     * @param hero Nombre del héroe
     * @return Array position
     */
    private static int selectPosition(String hero) {
        // Comprobamos si la posición 0 es la del héroe
        // en caso de que no lo sea, ya sabemos que será
        // la posición 1
        return superheores[0].getNombre().equalsIgnoreCase(hero) ? 0 : 1;
    }


    /**
     * Para que el usuario seleccione un héroe
     * @return array hero position
     * @throws IOException
     */
    private static int selectHero() throws IOException {
        // Bool para confirmar que el usuario
        // a introducido un héroe existente
        boolean exist;
        // String para el nombre del héroe
        String hero;
        do {
            // Pedimos al usuario que introduzca el nombre
            // del héroe que desea usuar, mostrandole los
            // héroes disponibles
            System.out.println("Escribe el nombre del superheroe que desea seleccionar");
            for (Superheore superhero : superheores) {
                System.out.println("=> " + superhero.getNombre());
            }
            // el usuario introduce el nombre
            hero = br.readLine();
            // Marcamos si el héroe existe o no
            exist = existHeroe(hero);
            // En caso de que no exista,
            // mostramos mensaje de error
            // y le volvemos a pedir héroe al
            // usuario
            if (!exist)
                System.out.println("El héroe no existe!");
        } while (!exist);

        // Devuelve la posición del héroe
        return selectPosition(hero);
    }


    /**
     * Subir de nivel a un héroe
     * @param pos Posición en el array
     * @param lvl Niveles a subir
     */
    private static void lvlUp(int pos, int lvl) {
        // Obtenemos el nivel futuro del héroe
        lvl += superheores[pos].getNivel();
        // En caso de que supere a 10, lo dejamos en 10
        if (lvl > 10)
            lvl = 10;
        superheores[pos].setNivel(lvl);
    }


    /**
     * Si existe el héroe
     * @param nombre Nombre del héroe
     * @return bool
     */
    private static boolean existHeroe(String nombre) {
        // Buscamos en cada posición del array
        // si el nombre del héroe es coincide
        // con el que ha puesto el usuario
        for (Superheore superhero : superheores) {
            if (superhero != null && superhero.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Para comprobar si ya hay ambos héroes creados
     * @return bool
     */
    private static boolean lleno() {
        // Comprueba si hay algún héroe
        // en la última posición del array
        // para saber si está lleno o vacío
        return superheores[superheores.length-1] != null;
    }

    public static void main(String[] args) throws IOException {
        // Para si salimos del programa
        boolean exit;
        do {
            // Mostramos el menú principal
            exit = menuPrincipal();
            // Comprobamos si el usuario eligió salir
        } while (!exit);
    }
}
