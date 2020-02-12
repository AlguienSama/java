package exTrash.fechas;
import exSuperheroes.Funs;
import org.jetbrains.annotations.NotNull;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1990;
    }

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        valida();
    }

    public boolean bisiesto() {
        boolean bisiesto = false;
        if ((this.ano % 4 == 0 && this.ano % 100 != 0) || this.ano % 400 == 0)
            bisiesto = true;
        return bisiesto;
    }

    public int diasMes(int mes) {
        int dias = 0;
        if (mes == 2) {
            if (bisiesto()) {
                dias = 29;
            } else
                dias = 28;
        } else if (mes < 7 && mes % 2 == 0 || mes > 7 && mes % 2 == 0)
            dias = 30;
        else
            dias = 31;

        return dias;
    }

    private void valida() {
        // DIA
        if (mes == 2) {
            if (bisiesto()) {
                if (dia > 29)
                    dia = 1;
            } else {
                if (dia > 28)
                    dia = 1;
            }
        } else if (mes < 7 && mes % 2 == 0 || mes > 7 && mes % 2 == 0) {
            if (dia > 30)
                dia = 1;
        } else if (dia > 31 || dia < 1)
            dia = 1;

        // MES
        if (mes > 12 || mes < 1)
            mes = 1;

        // ANY
        if (ano < 1900 || ano > 2050)
            ano = 1900;
    }

    public String corta() {
        return dia + "-" + mes + "-" + ano;
    }

    public String larga() {
        String mes = Funs.nameMes(this.mes);
        return dia + " de " + mes + " de " + ano;
    }

    public int diasEntre(String fecha2) {
        boolean menor = false;
        String[] fech2 = fecha2.split("-");
        int dia2 = Integer.parseInt(fech2[0]);
        int mes2 = Integer.parseInt(fech2[1]);
        int ano2 = Integer.parseInt(fech2[2]);
        if (ano < ano2)
            menor = true;
        if (ano == ano2 && mes < mes2)
            menor = true;
        if (ano == ano2 && mes == mes2 && dia < dia2)
            menor = true;

        //return menor;
        return 0;
    }

    public void siguiente() {
        dia++;
        if (mes == 2) {
            if (bisiesto()) {
                if (dia > 29) {
                    dia = 1;
                    mes+=1;
                }
            } else {
                if (dia > 28) {
                    dia = 1;
                    mes+=1;
                }
            }
        } else if (mes < 7 && mes % 2 == 0 || mes > 7 && mes % 2 == 0) {
            if (dia > 30) {
                dia = 1;
                mes+=1;
            }
        } else if (dia > 31 || dia < 1) {
            dia = 1;
            mes+=1;
        }

        // MES
        if (mes > 12) {
            mes = 1;
            ano+=1;
        }
    }

    public void anterior() {
        dia-=1;
        if (dia <= 0) {
            if (mes == 3) {
                if (bisiesto()) {
                    dia = 29;
                    mes-=1;
                } else {
                    dia = 28;
                    mes-=1;
                }
            } else if (mes < 7 && mes % 2 == 0 || mes > 7 && mes % 2 == 0) {
                dia = 30;
                mes-=1;
            } else {
                dia = 31;
                mes-=1;
            }
        }


        // MES
        if (mes <= 0) {
            mes = 12;
            ano-=1;
        }
    }

    public boolean igualQue(String fecha2) {
        boolean igual = false;
        String fecha1 = this.corta();
        if (fecha1.equals(fecha2))
            igual = true;
        return igual;
    }

    public boolean menorQue(@NotNull String fecha2) {
        boolean menor = false;
        String[] fech2 = fecha2.split("-");
        int dia2 = Integer.parseInt(fech2[0]);
        int mes2 = Integer.parseInt(fech2[1]);
        int ano2 = Integer.parseInt(fech2[2]);
        if (ano < ano2)
            menor = true;
        if (ano == ano2 && mes < mes2)
            menor = true;
        if (ano == ano2 && mes == mes2 && dia < dia2)
            menor = true;

        return menor;
    }

    public boolean mayorQue(@NotNull String fecha2) {
        boolean mayor = false;
        String[] fech2 = fecha2.split("-");
        int dia2 = Integer.parseInt(fech2[0]);
        int mes2 = Integer.parseInt(fech2[1]);
        int ano2 = Integer.parseInt(fech2[2]);
        if (ano > ano2)
            mayor = true;
        if (ano == ano2 && mes > mes2)
            mayor = true;
        if (ano == ano2 && mes == mes2 && dia > dia2)
            mayor = true;

        return mayor;
    }

}
