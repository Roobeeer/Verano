package T1.Coche;
import java.util.*;
public class Coche {
    private String color, marca, modelo, motor, matricula;
    private int cv, puertas;

    Scanner tec = new Scanner(System.in);

    public Coche(String marca,String color, String modelo, String motor, String matricula, int cv, int puertas){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        setTipoMotor(motor, cv);
        setColor(color);
        setMatricula(matricula);
    }

    public String getColor(){
        return color;
    }
    public int getCv(){
        return cv;
    }
    public int getPuertas(){
        return puertas;
    }


    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }

    public String getMotor(){
        return motor;
    }
    public void setTipoMotor(String motor, int cv){
        switch(motor){
            case "Diésel":
                break;
            case "Gasolina":
                break;
            case "Híbrido":;
                break;
            case "Eléctrico":
                break;
            default :
                System.out.println("Tipo motor --> "+motor+" no permitido, Valores permitidos --> Diésel, Gasolina, Híbrido y Eléctrico");
        }

        if(cv<=0){
            System.out.println("Error, el valor de los cv debe ser positivo");
            return;
        }
        this.motor = motor;
        this.cv = cv;
    }
    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        if(matricula.length()>8){
            System.out.println("Error, el tamaño de la matricula es demasiado grande, introduzca una matrícula de 8 caracteres(ABCD-1234");
            return;
        }
        if(matricula.charAt(4)!= '-') {
            System.out.println("ERROR, debe seguir el formato ABCD-1234");
        }

        this.matricula = matricula;
    }

    public void setColor(String color){
        this.color = color;
    }
}

class TestCoche{
    public static void printCoche(Coche c){
        System.out.println(c.getColor()+c.getMarca()+c.getMatricula()+c.getModelo()+c.getMotor());
    }

    public static void main(String[] args){
        Coche c = new Coche("Ford", "Rojo", "Focus", "Gasolina", "ABC-1234", 1200, 3);
        System.out.println("==== Coche original ====");
        printCoche(c);
        System.out.println("=========================");
        System.out.println("");
        System.out.println("==== Coche original (toString()) ====");
        System.out.println(c);
        System.out.println("=====================================");
        System.out.println("");
        System.out.println("** Modificando motor... **");
        c.setTipoMotor("Hidrogeno", 100);
        System.out.println("Motor: "+ c.getMotor() + " (" + c.getCv() + "cv)");
        c.setTipoMotor("Eléctrico", -35);
        System.out.println("Motor: "+ c.getMotor() + " (" + c.getCv() + "cv)");
        c.setTipoMotor("Electrico", 350);
        System.out.println("Motor: "+ c.getMotor() + " (" + c.getCv() + "cv)");
        System.out.println("");
        System.out.println("** Rematriculando... **");
        c.setMatricula("V-1325-AX");
        System.out.println("Matr´ıcula: "+ c.getMatricula());
        c.setMatricula("OUTATIME");
        System.out.println("Matr´ıcula: "+ c.getMatricula());
        c.setMatricula("2030-JXP");
        System.out.println("Matr´ıcula: "+ c.getMatricula());
        System.out.println("");
        System.out.println("** Repintando... **");
        c.setColor("Blanco roto");
        System.out.println("Color: "+ c.getColor());
        System.out.println("");
        System.out.println("==== Coche modificado ====");
        printCoche(c);
        System.out.println("===========================");
        System.out.println("");
        System.out.println("==== Coche modificado (toString()) ====");
        System.out.println(c);
        System.out.println("=======================================");
    }
}

