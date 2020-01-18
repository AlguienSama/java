/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt;

/**
 *
 * @author alu2019222
 */
public class Pt2Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia = (int)(Math.random()*30)+1; // Establecemos el día
        System.out.print("Dia: " + dia); // Mostramos el día
        int mes = (int)(Math.random()*12)+1; // Establecemos el mes
        System.out.println(" mes: " + mes); // Mostramos el mes
        
        if ((mes == 2 && dia > 28) || (mes < 7 && mes%2 == 0) && dia == 31 || (mes > 8 && mes%2 == 1) && dia == 31) { // Si el mes es 2, miramos que no supere el 28 o si el mes no es 2 y es par, miramos que no tenga el día 31
            System.out.println("Día incorrecto"); // Mostramos si el día es incorrecto
        }
        else {
        String signo = " "; //Definimos la variable signo
        // Calculamos todo lo de los meses
        switch (mes) { // Ponemos el valor de mes para compararlo
            case 1: // Si el mes es 1
            {
                signo =  dia >= 21 ? "Acuario" : "Capricornio"; // Si el día es igual o mayor que 21, la variable signo valdrá Acuario, sino Capricornio
                break; // Finalizamos el switch
            } // El resto son lo mismo
            case 2:
            {
                signo = dia >= 20 ? "Piscis" : "Acuario";
                break;
            }
            case 3:
            {
                signo = dia >= 21 ? "Aries" : "Piscis";
                break;
            }
            case 4:
            {
                signo = dia >= 21 ? "Tauro" : "Aries";
                break;
            }
            case 5:
            {
                signo = dia >= 21 ? "Géminis" : "Tauro";
                break;
            }
            case 6:
            {
                signo = dia >= 21 ? "Cáncer" : "Géminis";
                break;
            }
            case 7:
            {
                signo = dia >= 23 ? "Leo" : "Cáncer";
                break;
            }
            case 8:
            {
                signo = dia >= 24 ? "Virgo" : "Leo";
                break;
            }
            case 9:
            {
                signo = dia >= 23 ? "Libra" : "Virgo";
                break;
            }
            case 10:
            {
                signo = dia >= 22 ? "Escorpio" : "Libra";
                break;
            }
            case 11:
            {
                signo = dia >= 22 ? "Sagitario" : "Escorpio";
                break;
            }
            case 12:
            {
                signo = dia >= 22 ? "Capricornio" : "Sagitario";
                break;
            }
            default:
                break;
        }
        System.out.println(signo); // Mostramos el signo
        }
    }
    
}
