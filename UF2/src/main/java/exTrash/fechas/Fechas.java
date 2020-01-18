package exTrash.fechas;

public class Fechas {

    static Fecha data = new Fecha();

    public static void main(String ... args) {

        System.out.println(data.larga());
        data.anterior();
        System.out.println(data.larga());
        data.siguiente();
        System.out.println(data.larga());

        Fecha data2 = new Fecha(31,13,2001);

        System.out.println(data2.larga());
        data2.siguiente();
        System.out.println(data2.larga());
        data2.anterior();
        System.out.println(data2.larga());

        if (data.igualQue(data2.corta()))
            System.out.println("Ambas datas son iguales");
        else if (data.menorQue(data2.corta()))
            System.out.println(data.corta() +" es menor que " + data2.corta());
        else if (data.mayorQue(data2.corta()))
            System.out.println(data.corta() +" es mayor que " + data2.corta());
    }
}
