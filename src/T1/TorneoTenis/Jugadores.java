package T1.TorneoTenis;

public class Jugadores {
    private String nombre;
    private String pasaporte;
    private Raquetas raqueta;

    public Jugadores(String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        raqueta = new Raquetas();
    }

    public String getNombre(){
        return nombre;
    }

    public String getPasaporte(){
        return pasaporte;
    }

    public Raquetas getRaqueta(){
        return raqueta;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPasaporte(String pasaporte){
        this.pasaporte = pasaporte;
    }

    public void setRaqueta(Raquetas raqueta){
        this.raqueta = raqueta;
    }


}
