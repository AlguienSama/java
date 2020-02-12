/*
 * Menú alumnos
 * Menú gets / sets
 *
 * */


package exTrash.notasAlumnos;

import java.util.ArrayList;
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Alumnos {

    // Alumnos de prueba ~_~
    //static Alumno alu1 = new Alumno("Marc", "Font", 18);
    //static Alumno alu2 = new Alumno("Rog", "Val", 20);

    // Listado de alumnos ARRAY
    //static ArrayList<Alumno> alus = new ArrayList<>(4);
    private static Alumno[] alus = new Alumno[4];

    // Leer escritura usuario
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Panel de opciones inicial
    public static boolean panelInicial() throws IOException {
        System.out.println("\nQue opción desea ejecutar?");
        if (hasAlumno() < alus.length)
            System.out.println("1) Añadir alumno");
        if (hasAlumno() != 0)
            System.out.println("2) Usar alumno" + "\n3) Eliminar alumno");
        System.out.println("4) Salir del programa");


        String elect = new String(br.readLine());
        System.out.println(elect);
        if (elect.equals("1")) {
            if (hasAlumno() >= alus.length) panelInicial();
            // Alumnos de prueba ~_~
            alus[0] = new Alumno("Marc", "Font", 18);
            alus[2] = new Alumno("1234", "qwer", 18);
            alus[3] = new Alumno("5678", "asdf", 20);

            createAlumno();

            // Creación de alumno
        } else if (elect.equals("2")) {
            // Si no se ha creado un alu, lo mandamos al inicio
            if (hasAlumno() == 0) panelInicial();
            // Elección de alumno
            selectAlu();
        } else if (elect.equals("3")) {
            // Si no se ha creado un alu, lo mandamos al inicio
            if (hasAlumno() == 0) panelInicial();
            // Eliminar alumno
            deleteAlu();
        } else if (elect.equals("4")) {
            // Salir del programa
            return true;
        } else {
            // QUe el user es tonto y no sabe
            panelInicial();
        }
        return false;
    }

    static public void selectAlu() throws IOException {
        System.out.println("Introduce el nombre del alumno que desea utilizar");
        for (int i = 0; i < alus.length; i++) {
            if (alus[i] != null) {
                System.out.println("=> " + alus[i].getNombre());
            }
        }

        String nombre = br.readLine();
        int pos = -1;
        for (int i = 0; i < alus.length; i++) {
            if (alus[i].getNombre().equals(nombre))
                pos = i;
        }
        if (pos == -1) {
            System.out.println("El alumno no existe!");
            selectAlu();
        }

        optionsAlu(pos);
    }

    static public void createAlumno() throws IOException {
        System.out.println("Introduce el nombre del alumno");
        String nombre = br.readLine();
        System.out.println("Introduce el apellido del alumno");
        String apellido = br.readLine();
        System.out.println("Introduce la edad del alumno");
        String edadS = br.readLine();
        int edadi = Integer.parseInt(edadS);

        insertAlum(nombre, apellido, edadi);

    }

    private static int insertAlum(String nombre, String apellido, int edadi) {
        for (int i = 0; i < alus.length; i++) {
            if (alus[i] == null) {
                alus[i] = new Alumno(nombre, apellido, edadi);
                return i;
            }
        }
        return -1;
    }

    static public int hasAlumno() {
        // Comprobamos si existe un alumno
        // retornando true en el caso de
        // que si exista
        int num = 0;
        for (int i = 0; i < alus.length; i++) {
            if (alus[i] != null)
                num += 1;
        }
        return num;
    }

    static public void deleteAlu() throws IOException {
        boolean error = false;
        int j = 0;
        int elect3i;
        do {
            System.out.println("\nQue alumno desea eliminar?");
            // Mostramos alumnos
            for (Alumno alumno : alus) {
                if (alumno != null) {
                    j++;
                    System.out.println(j + ") " + alumno.getNombre() + " " + alumno.getApellido());
                }
            }
            String elect3S = br.readLine();
            elect3i = Integer.parseInt(elect3S);
            // Que el usuario no se cole
            if (elect3i < 1 || elect3i > 4) {
                System.out.println("Número introducido no válido");
                error = true;
                //deleteAlu();
            } else {
                error= false;
            }
        } while (error);
        // Proceso de eliminación
        for (int i = alus.length - 1; i >= 0; i--) {
            if (j == elect3i) {
                alus[i] = null;
                break;
            }

            if (alus[i] != null)
                j--;
        }
        System.out.println("\nAlumno eliminado correctamente");
        panelInicial();
    }

    public static void optionsAlu(int pos) throws IOException {
        System.out.println("\nIntroduce el número de la opción que quieras." +
                "\n1) Obtener nombre y apellido" +
                "\n2) Obtener edad" +
                "\n3) Obtener notas" +
                "\n4) Obtener la media de notas" +
                "\n5) Cambiar edad" +
                "\n6) Añadir notas" +
                "\n7) Cambiar nota específica" +
                "\n8) Salir");
        String elect = br.readLine();

        if (elect.equals("1"))
            System.out.println("Nombre y apellido: " + alus[pos].getNombre() + " " + alus[pos].getApellido());
        else if (elect.equals("2"))
            System.out.println("Edad: " + alus[pos].getEdad());
        else if (elect.equals("3")) {
            HashMap<String, Integer> notas = alus[pos].getNotas();
            for (String vals : notas.keySet()) {
                //String ass = vals.toString();
                String nota = notas.get(vals).toString();
                System.out.println("Asignatura: " + vals + "\tNota: " + nota);
            }
        } else if (elect.equals("4")) {
            HashMap notas = alus[pos].getNotas();
            double media = 0;
            int i = 0;
            for (Object vals : notas.keySet()) {
                String ass = vals.toString();
                String nota = notas.get(ass).toString();
                media += Integer.parseInt(nota);
                i++;
            }
            System.out.println("La media de sus notas es: " + (media / i));
        } else if (elect.equals("5")) {
            System.out.println("Introduce la nueva edad");
            String edadS = br.readLine();
            int edadi = Integer.parseInt(edadS);
            alus[pos].setEdad(edadi);
        } else if (elect.equals("6")) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Introduce el nombre de la asignatura");
                String ass = br.readLine();
                System.out.println("Introduce la nota");
                String notaS = br.readLine();
                int notai = Integer.parseInt(notaS);
                boolean repetida = alus[pos].setNotas(ass, notai);
                if (repetida) {
                    System.out.println("La asignatura ya existe");
                    i--;
                }
            }
        } else if (elect.equals("7"))
            changeNota(pos);
        else if (elect.equals("8"))
            panelInicial();

        optionsAlu(pos);
    }

    public static void changeNota(int pos) throws IOException {
        System.out.println("Introduce el nombre de la asignatura que le desea cambiar la nota");
        HashMap notas = alus[pos].getNotas();
        for (Object vals : notas.keySet()) {
            String ass = vals.toString();
            System.out.println("=> " + ass);
        }
        String assign = br.readLine();
        if (alus[pos].existModulo(assign)) {
            System.out.println("El módulo no existe!");
            changeNota(pos);
        }
        System.out.println("\nQue nota le desea introducir?");
        String notaS = br.readLine();
        int notai = Integer.parseInt(notaS);
        alus[pos].setNota(assign, notai);
        System.out.println("\nNota introducida correctamente!");
        optionsAlu(pos);
    }

    public static void main(String[] args) throws IOException {
        // Las cuentas ~_~

        boolean exit = false;

        do {
            // Mostrar panel
            exit = panelInicial();
        } while (!exit);
    }

}