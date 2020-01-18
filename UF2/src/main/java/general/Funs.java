package general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funs {

    // IMPORTS
    static public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    /**
     * String a int.
     *
     * Pedir un número con BufferedReader
     * @return integer value
     */
    public static int pedirInt() throws IOException {
        String cantS = br.readLine();
        return Integer.parseInt(cantS);
    }

    /**
     *
     * @param min Mínimo
     * @param max Máximo
     * @return integer value
     * @throws IOException
     */
    public static int pedirNum(int min, int max) throws IOException {
        boolean exit = false;
        int num = 0;
        while (!exit) {
            num = pedirInt();
            if (num <= max & num >= min)
                exit = true;
            else
                System.out.println("Número inválido");
        }
        return num;
    }

    /**
     *
     * @param frase Frase para mostrar al usuario
     * @param min Mínimo
     * @param max Máximo
     * @return integer value
     * @throws IOException
     */
    public static int pedirNum(String frase, int min, int max) throws IOException {
        boolean exit = false;
        int num = 0;
        while (!exit) {
            System.out.println(frase);
            num = pedirInt();
            if (num <= max & num >= min)
                exit = true;
        }
        return num;
    }

    /**
     * Pedir una frase y un número mínimo.
     *
     * @param frase Frase que muestra al usuario
     * @param min Mínimo que puede introducir
     * @return
     */
    public static int pedirNumWithStringAndMinimo(String frase, int min) throws IOException {
        boolean salir = false;
        int num;
        do {
            System.out.println(frase);
            num = pedirInt();
            if (num >= min)
                salir = true;
        } while (!salir);
        return num;
    }

    /**
     * Número a día de mes
     * @param num
     * @return string mes
     */
    public static String nameMes(int num) {
        String mes;
        switch (num) {
            case 1:
                mes = "enero";
                break;
            case 2:
                mes = "febrero";
                break;
            case 3:
                mes = "marzo";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "mayo";
                break;
            case 6:
                mes = "junio";
                break;
            case 7:
                mes = "julio";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "septiembre";
                break;
            case 10:
                mes = "octubre";
                break;
            case 11:
                mes = "noviembre";
                break;
            case 12:
                mes = "diciembre";
                break;
            default:
                mes = null;
                break;
        }
        return mes;
    }


}
