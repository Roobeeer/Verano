package T1.TorneoTenis;

public class    Raquetas {

    public String marca;
    public String modelo;
    public double tension;

    public Raquetas(String marca, String modelo, double tension){
        this.marca = marca;
        this.modelo = modelo;
        this.tension = tension;
    }

    public String getMarca(){
        return marca;
    }

    public String etModelo(){
        return modelo;
    }

    public double getTension(){
        return tension;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setTension(double tension){
        this.tension = tension;
    }
}
