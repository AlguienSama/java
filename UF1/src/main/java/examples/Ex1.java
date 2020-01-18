package examples;

import java.util.Arrays;

/* class = nameFile */
public class Ex1 {
    /* main = crear bloque de código dentro de {} */
    public static void main(String[] args) { // args = array
         /* VARIABLES */
        
        // boolean = true false
        boolean isDAW = true;
        
        // nums
        byte numByte = 3; //[-128,127]
        short numShort = 2; //[-32768,32767]
        int numInt = 234543; //[2147483648, 2147483647] 
        long numLong = 234l; //[- 9223372036854775808,9223372036854775807] x64
        
        float numFloat = 23.2f; //Precisió simple
        double numDouble = 123.12; // Precisió doble x64
        
        // text
        char letra = 'M';
        String frase = "hola que tal";
        
        // constante
        final char a = 'a';
        
        /*wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww*/
        
        double num1 = 2;
        double num2 = 4;
        
        /*
        Suma = num1 + num2;             ||  num1 += num2
        Resta = num1 - num2;            ||  num1 -= num2
        Multiplicación = num1 * num2;   ||  num1 *= num2
        División = num1 / num2;         ||  num1 /= num2
        Resto división = num1 % num2;   ||  num1 %= num2
        */
        
        /* mostrar en pantalla */
        System.out.println("isDAW: " + isDAW + "\n");
        System.out.println("Primer num = " + numByte + "\nSegón num = " + numShort);
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicació: " + (num1 * num2));
        System.out.println("Divisió: " + (num1 / num2));
        System.out.println("Resta divisió: " + (num1 % num2));

        final String constante = "const";
        /*
        Al poner final al principio, no se puede cambiar la variable
        */
        
        /* OPERADORES
        ++num1 * 2 = (1 + 2) * 2 = num1: 6
        num1++ * 2 = 2 * 2 = num1: 5
        --num1 * 2 = (1 - 2) * 2 = num1: 2
        num1-- * 2 = 2 * 2 = num1: 3
        */
        
        /*
        \' // Comilla com text
        \" // Comilles com text
        \\ // Barra invertida
        \n // Salt de linia
        \t // Tabulació
        */
        
        
        
        // Operadores
        /*       
        num1 < num2 = $num1 más pequeño que $num2
        num1 > num2 = $num1 más grande que $num2
        num1 == num2 = $num1 igual que $num2
        num1 === num2 = $num1 igual que $num2 y tipo de variable
        num1 <= num2 = $num1 más pequeño o igual que $num2
        num1 >= num2 = $num1 más grande o igual que $num2
        num1 != num2 = $num1 no es igual que $num2
        num1 !== num2 = $num1 no es el mismo tipo de variable que $num2
        */
        
        
        
        // Promocionar
        
        long num4 = numInt + numLong; // Promociona automáticamente
        //int num5 = numInt + numLong; // Error
        int num6 = numInt + (int)numLong; // Promocionamos el long a int quitandole los bites de la izquierda
        
        
        // long t = (x = 3) => t = 3, x = 3;
        
        
        
        // Pasar argumentos
        /*
        Project > Properties > Run > Main Class: <file.java> > Arguments: <"Hola que" tal 4>
        args[0] = Hola que;
        args[1] = tal;
        args[2] = 4;
        */
        
        
        
        // Sumar char
        char c1 = 'H', c2= 'o', c3 = 'l', c4 = 'a';
        System.out.println(c1+c2+c3+c4); // Suma los numeros ascii (r: 388)
        
        
        
        // Tabla de la verdad
        /*
        OR |           || Hace terminar la sentencia       | Continua la sentencia
        true || true == true
        true || false == true
        false || true == true
        false || false == false
        
        AND &          && Hace terminar la sentencia       & Continua la sentencia
        true && true == true
        true && false == false
        false && true == false
        false && false == false
        */
        
        
        // SENTENCIAS
        /*
        if
        if else
        switch
        
        while
        do while
        for
        for each
        */
        
        /* IF */
        if (num1 == 2){ // Boolean true / false
            System.out.println("Num1 = 2");
        } else if (num1 == 4){
            System.out.println("Num1 = 4");
        } else {
            System.out.println("Num1 != 2 && 4");
        }
        
        // Formas de if
        int y = 10;
        int x = (y>5)?(2*y):(3*y); 
        /*
        ? => true
        : => false
        */
        
        if (y>5){
            int X = 2*y;
        } else {
            int X = 3*y;
        }
        
        /* SWITCH */
        /*
        byte, short, char, int, String
        */
        int dia = 2;
        switch(dia){
            case 1: // Los case tienen que ser valores fijos y mismo tipo que la variable del switch
                System.out.println("Dia 1");
                break; // Opcional, te hace salir del switch
            case 2:
                System.out.println("Dia 2");
                break;
            default: // Si nada coincide, se ejecuta el default
                System.out.println("No es ni 1 ni 2");
                break;
        }
        
        String nombre = "Hola";//args[0]; // args[0] = Hola
        
        final String name1 = "Pepe";
        
        switch(nombre){
            case "Fran":
                System.out.println("Nombre es Fran");
                break;
            case "Mar":
                System.out.println("Nombre Mar"); // Al no tener break, lo mostrará
            case "Jota":
                System.out.println("Nombre Jota");
                break;
            case name1:
                System.out.println("Nombre "+name1);
                break;
            default:
                System.out.println("Ningún nombre");
                break;        
        } // Resultado => Nombre Mar Ningún nombre
        
        
        // While
        int w = 0;
        while (w<5){
            System.out.println("Var w: "+w);
            w++;
        }
        
        // Do While
        do{
            System.out.println("Var w: "+w);
            w++;
        }while (w<5);
        
        
        // For
        for(int i=0; i<10; i++){
            System.out.println("I vale: "+i);
        }
        
        /*
        for(valores; comparaciones true / false; operaciones)
        pueden haber 2 o más valores pero deben ser el del mismo tipo
        */
        
        
        // Arrays
        /* Array bidimencional */
        int[] nums = {1, 2, 3};
        /* Resultado
        0 \ 1 \ 2 \ 3 // Posición
        1   2   3     // Valor  
        */
        
        nums[1] = 4;
        /* Resultado
        0 \ 1 \ 2 \ 3 // Posición
        1   4   3     // Valor  
        */
        System.out.println(nums[2]); // 3
        
        int largoArray = nums.length; // 3
        
        /* Array multidimencional */
        int [] array1 = new int[3]; // 0, 1, 2
        
        int[][] multinums = {{10, 11, 12}, {20, 21, 22}, {30, 31, 32},};
        /* Resultado 
          0  \  1  \  2
        0 10    11    12
        1 20    21    22
        2 30    31    32
        */
        
        multinums[0][1] = 41;
        /* Resultado 
          0  \  1  \  2
        0 10    41    12
        1 20    21    22
        2 30    31    32
        */
        System.out.println(multinums[0][1]); // 41
        
        // Break Continue
        /*
        para el bloque de codigo que se ejecuta
        */
        
        int[][] array = {{10, 11, 12}, {20, 21, 22}, {30, 31, 32}};
        STOP_LOOP: for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                if (array[i][j] == 20){
                    System.out.println("Fila "+i+"\nColumna "+j);
                    break STOP_LOOP; // Detiene el primer for (si no tiene nombre detiene el bucle donde se encuentra)
                }
            }
        }
        
        
        // FOREACH
        for (int[] numero : array) {
            System.out.println(Arrays.toString(numero));
            for (int numero1 : numero) {
                System.out.println(numero1);
            }
        }
        
        
        
        
    }
    
    
    
}
