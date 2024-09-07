package T1.Pelicula;

public class Main {
    public static void main(String[] args) {
        Filmoteca f1 = new Filmoteca();

        f1.add(new Pelicula("El señorde los anillos",2018,8));
        f1.add(new Pelicula("SpiderMan La Era",2024,3));
        f1.add(new Pelicula("The Dark Knight", 2008, 9));
        f1.add(new Pelicula("The Prestige", 2006, 8));
        f1.add(new Pelicula("Memento", 2000, 9));

        f1.showAll();
        f1.showBest();
        f1.showWorst();

        Pelicula p;
        p = f1.buscar("Memento");
        System.out.println("Resultado "+p);
        f1.delete("The Prestige");
        f1.delete("Memento");

        f1.showWorst();
        f1.showAll();
        f1.showBest();

        p = f1.buscar("Intersetellar");
        System.out.println("Resultado "+p);
    }

}
