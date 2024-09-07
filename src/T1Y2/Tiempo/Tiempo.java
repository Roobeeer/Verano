package T1.Tiempo;

import javax.management.relation.RelationNotFoundException;

public class Tiempo {
    private int horas, minutos, segundos;

    public Tiempo(int horas, int minutos, int segundos){
        if(horas<0){
            throw new RuntimeException("Error, horas deben ser positivas");
        }
        this.horas = horas;
        if(minutos < 0 || minutos >=60){
            throw new RuntimeException("Error, minutos deben ser entre 1 y 59");
        }
        this.minutos = minutos;
        if(segundos < 0 || segundos >=60){
            throw new RuntimeException("Error, segundos deben ser entre 1 y 59");
        }
        this.segundos = segundos;
    }

    public Tiempo(int horas, int minutos){
        this(horas,minutos,0);
    }

    public Tiempo(int horas){
        this(horas,0,0);
    }
    public Tiempo(double segundos) {
        if (segundos < 0) {
            throw new RuntimeException("ERROR, segundos deben ser mayor que 0");
        }
        this.horas = (int)segundos/3600;
        this.minutos = (int)(segundos%3600)/60;
        this.segundos = (int)segundos%60;
    }
    public int getHoras(){return horas;}
    public int getMinutos(){return minutos;}
    public int getSegundos(){
        return segundos;
    }
}
class TestTiempo{
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(2);
        Tiempo t2 = new Tiempo(2,34);
        Tiempo t3 = new Tiempo(2,54,23);
        Tiempo t4 = new Tiempo(1213514.2222);
    }
}
