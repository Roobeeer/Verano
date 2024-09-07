package T1.Pelicula;

public class Filmoteca {

    private Pelicula[] filmoteca;

    private int tamanyofilmoteca;

    public Filmoteca() {
        filmoteca = new Pelicula[1000];
        tamanyofilmoteca = 0;
    }

    public int getPos(String titulo) {
        for (int i = 0; i < tamanyofilmoteca; i++) {
            if (filmoteca[i].getTitulo().equals(titulo))
                return i;
        }
        return -1;
    }

    public void add(Pelicula p){
        if(tamanyofilmoteca>10000 || tamanyofilmoteca == filmoteca.length){
            System.out.println("Error, no puedes añadir más peliculas");
            return;
        }

        int i = getPos(p.getTitulo());

        if(i>=0){
            System.out.println("La película ya existe "+p);
            return;
        }
        filmoteca[tamanyofilmoteca] = p;
        tamanyofilmoteca++;
    }

    public Pelicula buscar(String titulo){
        int i = getPos(titulo);
        if(i==-1){
            return null;
        }else{
            return filmoteca[i];
        }
    }

    public void delete(String titulo){
        int i = getPos(titulo);

        if(i==-1) {
            System.out.println("Error, la pelicula no existe");
            return;
        }
        for(int j = i+1;j<tamanyofilmoteca;j++){
            filmoteca[j-1] = filmoteca[j];
        }
        tamanyofilmoteca--;
        filmoteca[tamanyofilmoteca] = null;
    }

    public void showAll(){
        System.out.println("FILMOTECA("+tamanyofilmoteca+" items");

        for (int i = 0; i <tamanyofilmoteca ; i++) {
            System.out.println("Peliculas - "+filmoteca[i]);
        }
    }

    public void showBest(){
        if(tamanyofilmoteca==0){
            System.out.println("No hay peliculas para mostrar");
            return;
        }

        int bestPos = 0;
        int bestRating = filmoteca[0].getCalificacion();

        for (int i = 0; i < tamanyofilmoteca; i++) {
            if(filmoteca[i].getCalificacion()>bestRating){
            bestPos = i;
            bestRating = filmoteca[i].getCalificacion();
            }
        }

        System.out.println("Mejor pelicula : "+filmoteca[bestPos]);
    }

    public void showWorst(){
        if(tamanyofilmoteca==0){
            System.out.println("Error, no hay peliculas");
            return;
        }

        int worstPos = 0;
        int worstRating = filmoteca[0].getCalificacion();

        for (int i = 0; i <tamanyofilmoteca ; i++) {
            if (filmoteca[i].getCalificacion() < worstRating) {

                worstPos = i;
                worstRating = filmoteca[i].getCalificacion();
            }
        }
        System.out.println("Peor pelicula "+filmoteca[worstPos]);
    }

}
