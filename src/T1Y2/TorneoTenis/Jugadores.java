package T1.TorneoTenis;

public class Jugadores {
    private String nombre;
    private String pasaporte;
    private Raquetas raqueta;

    public Jugadores(String nombre, String pasaporte, Raquetas raqueta){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.raqueta = raqueta;
    }

    public boolean mismaRaqueta(Jugadores j){
        return this.raqueta.equals(j.raqueta);
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


    public boolean equals(Object o){
        Jugadores j = (Jugadores) o;
        return this.pasaporte.equals(j.pasaporte);
    }


    @Override
    public String toString(){
        return "Jugador : "+nombre+" || Pasaporte ; "+pasaporte+" || Raqueta : "+raqueta;
    }
}
