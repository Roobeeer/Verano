package T1.Pelicula;

public class Pelicula {
    private String titulo;
    private int anyo, calificacion;

    public Pelicula(String titulo, int anyo, int calificacion){
        this.titulo = titulo;
        this.anyo = anyo;
        setCalificacion(calificacion);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAnyo(){
        return anyo;
    }

    public void setAnyo(int anyo){
        this.anyo = anyo;
    }

    public int getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if(calificacion<0 ||calificacion>10){
            throw new RuntimeException("Error, calificación no puede ser menor que 0 o mayor que 10");
        }else{
            this.calificacion = calificacion;
        }
    }

    public boolean equals(Object o){
        Pelicula p = (Pelicula) o;
        return titulo.equals(p.getTitulo()) && anyo == p.getAnyo();
    }
    public String toString(){
        return "Pelıcula: \"" + titulo + "\" (" + anyo +
                "). Calificacion: " + calificacion;
    }
}
