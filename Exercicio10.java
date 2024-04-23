/*
- Crie uma classe chamada "Calendario" com os atributos dia, mês e ano. Implemente
um método para verificar se uma data é válida.
*/

public class Exercicio10 {
    public static void main(String[]args){
        Calendario calendario = new Calendario(29,2,2017);
        System.out.println(calendario.verificaData());
    }
}

class Calendario{
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    boolean verificaData(){
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;


        if (mes < 1 || mes > 12) {
            return false;
        }


        if (mes == 2) { // Fevereiro
            if (bissexto) {
                return dia > 0 && dia < 30;
            } else {
                return dia > 0 && dia < 29;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia > 0 && dia < 31;
        } else {
            return dia > 0 && dia < 32;
        }

    }
}
