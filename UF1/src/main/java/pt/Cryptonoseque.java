/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt;

import java.util.Arrays;

/**
 *
 * @author alu2019222
 */
public class Cryptonoseque {

    /**
     * @param frase
     * @param key
     * @param vige
     * @return 
     */
    
    public static String startCript(String frase, String key, char[][] vige) {
      // Ponemos la clave en minusculas
        key = key.toLowerCase();
        
        // Comprobamos si han introducido valores correctos
        testFrase(frase);
        testClave(key);
        
        // Ponemos la frase y la clave en un array
        char[] fraseArray = frase.toCharArray();
        //System.out.print(Arrays.toString(fraseArray));
        char[] keyArray = key.toCharArray();
        
        char[] cript = cript(fraseArray, keyArray, vige);
        
        //System.out.print(Arrays.toString(cript));
        // Pasamos el array a String y lo mostramos
        String fraseCript = new String(cript);
        return fraseCript;        
    }
    
    // public static String startDecript(String frase, String key, char[][] vige) {
    //     // Ponemos la clave en minusculas
    //     key = key.toLowerCase();
        
    //     // Comprobamos si han introducido valores correctos
    //     testFrase(frase);
    //     testClave(key);
        
    //     // Ponemos la frase y la clave en un array
    //     char[] fraseArray = frase.toCharArray();
    //     //System.out.print(Arrays.toString(fraseArray));
    //     char[] keyArray = key.toCharArray();
        
    //     char[] decript = decript(fraseArray, keyArray, vige);
        
    //     //System.out.print(Arrays.toString(cript));
    //     // Pasamos el array a String y lo mostramos
    //     String fraseCript = new String(decript);
    //     return fraseCript;        
    // }
    
    public static void testFrase(String frase) {
        // Comprobación carácteres de la frase
        if (frase.matches(".*[^a-zA-Z\\s].*")) {
          System.out.print("La frase solo puede contener palabras (sin acentos) y espacios");
        }
    }
    
    
    public static void testClave(String key) {
        // Comprobación carácteres de la clave
        if (key.matches(".*[^a-z].*") ) {
            System.out.println("Error. La clave solo puede contener carácteres alfabéticos");
        }
    }
    
    
    public static char[] cript(char[] fraseArray, char[] keyArray, char[][] vige) {
        // Array con el mensaje encryptado
        char[] cript = new char [fraseArray.length];
        
        // Variable para la posición de la letra de la key
        int keyPosition = 0;
        
        for (int i = 0; i < fraseArray.length; i++) {
            // Para los espacios
            if (fraseArray[i] == ' ') {
                cript[i] = ' ';
            
            } else {
                //System.out.println(fraseArray[i] + " - "+ keyArray[keyPosition]);
                // Para las minus
                if (Character.isLowerCase(fraseArray[i])) {
                    cript[i] = calc(vige, fraseArray[i], keyArray[keyPosition], true, false);
            
                // Para las mayus
                } else if (Character.isUpperCase(fraseArray[i])) {
                    cript[i] = calc(vige, fraseArray[i], keyArray[keyPosition], false, false);
                }
            
                else {
                    System.out.println("ERROR upper lower case");
                }
            
            // Actualizamos la posición de la key
            keyPosition++;
            if (keyPosition >= keyArray.length) 
                keyPosition = 0;
            
            }
          
        }
        return cript;
    }
    
    
    // public static char[] decript(char[] fraseArray, char[] keyArray, char[][] vige) {
    //     // Array con el mensaje encryptado
    //     char[] decript = new char [fraseArray.length];
        
    //     // Variable para la posición de la letra de la key
    //     int keyPosition = 0;
        
    //     for (int i = 0; i < fraseArray.length; i++) {
    //         // Para los espacios
    //         if (fraseArray[i] == ' ') {
    //             decript[i] = ' ';
            
    //         } else {
    //             //System.out.println(fraseArray[i] + " - "+ keyArray[keyPosition]);
    //             // Para las minus
    //             if (Character.isLowerCase(fraseArray[i])) {
    //                 decript[i] = calc(vige, fraseArray[i], keyArray[keyPosition], true, true);
            
    //             // Para las mayus
    //             } else if (Character.isUpperCase(fraseArray[i])) {
    //                 decript[i] = calc(vige, fraseArray[i], keyArray[keyPosition], false, true);
    //             }
            
    //             else {
    //                 System.out.println("ERROR upper lower case");
    //             }
            
    //         // Actualizamos la posición de la key
    //         keyPosition++;
    //         if (keyPosition >= keyArray.length) 
    //             keyPosition = 0;
            
    //         }
          
    //     }
    //     return decript;
    // }
    
       
    public static char calc(char[][] vige, char letra, char key, boolean minus, boolean dcript) {
    
        int key1 = val(vige, key); // Obtenemos la posición de la clave
        letra = Character.toLowerCase(letra); // Pasamos a minus la letra
        int letra1 = val(vige, letra); // Obtenemos la posición de la letra
        // System.out.println(letra);
        if (dcript) {
            letra1 = vige[key1].length-letra1-1; 
        }
        // System.out.println(key1 +" "+ letra1);
        if (minus) { // Si minus es true
            return vige[letra1][key1]; // Devolvemos la letra respectiva a la posición
        }
      
        else {
            char cript = vige[letra1][key1]; //Obtenemos la letra
            return Character.toUpperCase(cript); // La pasamos a mayus
        }
    }
    
    public static int val(char[][] vige, char letra) {
        // Obtenemos la posición donde se encuentra la letra
        int i = 0;
        while(vige[0][i] != letra) { 
            i++;
        }
        return i;
    }
       
    public static void main(String[] args) {
        
        /* 
        String frase = "";
        String key = "";
        frase ---
   key  a b c
    |   b
    |   c
        
        char a = frase.charAt(posicion) // 
        */
        
        
        /* PREPARACIÓN */
          
        // Tabla que usaremos
        String str = "abcdefghijklmnopqrstuvwxyz";
        // Pasamos el string anterior a array
        char[] alf = str.toCharArray();
        
        // Preparamos el array para la tabla
        char[][] vige = new char [str.length()][str.length()];
        
        //System.out.println(Arrays.toString(alf));
        
        // Crearemos el nuevo array que servirá de tabla (Primer index)
        for (int i = 0; i < vige.length; i++) {
            // Posición del array alf
            int count = i;
            
            for (int j = 0; j < vige.length; j++) { // (Segundo index)
                // Miramos si el número es más grande que el largo de la frase
                if(count >= str.length()) count = 0;
                // Colocamos la letra correspondiente
                vige[i][j] = alf[count];
                
                count++;
                //System.out.println(vige[i][j]);
            }
            //System.out.println(Arrays.toString(vige[i]));
        }
        
        
        /*WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW*/
        
        /* PROCESO */
        
        String frase = "hola que tal";
        String key = "Patata";
        
        String fraseCript = startCript(frase, key, vige);
        
        System.out.println(fraseCript);
        
        /*  DECRYPT  */
        // String dfrase = fraseCript;
        // String dkey = "c";
        
        // String fraseDcript = startDecript(dfrase, dkey, vige);
        
        // System.out.println(fraseDcript);
        
        
          
          
    }
    
}
    
    