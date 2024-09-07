package T1.Pueblo;

public class Direccion {

    private String calle, puerta;
    private int numero;

    public Direccion(String calle,int numero, String puerta){
        this.calle = calle;
        this.puerta = puerta;
        this.numero = numero;
    }

    public String getCalle(){
        return calle;

    }

    public String getPuerta(){
        return puerta;
    }

    public int getNumero(){return numero;}

    public void setCalle(String calle){
        this.calle = calle;
    }

    public void setPuerta(String puerta){
        this.puerta = puerta;

    }

    public void setNumero(int numero){
        this.numero = numero;
    }


    public boolean mismoEdificio(Direccion d){
        return calle.equals(d.calle) && numero == d.numero;
    }

    public boolean equals(Object o){
        Direccion d = (Direccion) o;

        return(calle.equals(d.calle) && puerta.equals(d.puerta) && numero == d.numero);
    }

    @Override
    public String toString(){
        return "Calle "+calle+" || Nº "+numero+" || Puerta "+puerta;
    }
}
