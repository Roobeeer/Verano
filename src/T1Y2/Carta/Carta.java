package T1.Carta;
import java.sql.SQLOutput;
import java.util.*;
public class Carta {

    public static int CRIATURA = 0;
    public static int ENCANTAMIENTO = 1;

    private String nombre;
    private int tipo,ataque,defensa;
    private double valor;

    public Carta(String nombre, int tipo, int ataque, int defensa){
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;

        valor = (ataque+defensa)/2;
    }

    public int frecuencia(){
        int min = 25;
        int max = 75;

        Random random = new Random();

        int numerorand = random.nextInt(min-max+1)+min;

        int valorRedon = (int)Math.round(numerorand);

        int resultado = Math.max(25,numerorand-valorRedon);
        return resultado;
    }

    public int getAtaque(){
        return ataque;
    }

    public int getDefensa(){
        return defensa;
    }

    public void  encantar(Carta c1){
        ataque += c1.getAtaque();
        defensa += c1.getDefensa();
    }

    public void mostrar(){
        System.out.println(nombre+"("+ataque+") {"+defensa+"}");
    }
}

class TestCarta{
    public static void main(String[] args) {
        Carta c1 = new Carta("R. Daneel Olivaw", 0,3,2);
        String nombre;
        int ataque, defensa;
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce el nombre de tu carta :");
        nombre = tec.nextLine();
        System.out.print("Introduce el ataque de tu carta : ");
        ataque = tec.nextInt();
        System.out.print("Introduce la defensa de tu carta : ");
        defensa = tec.nextInt();

        Carta c2 = new Carta(nombre,1, ataque, defensa);

        c1.encantar(c2);
        c1.mostrar();
        c2.mostrar();
    }
}
