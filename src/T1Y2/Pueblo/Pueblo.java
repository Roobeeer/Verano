package T1.Pueblo;

import java.sql.SQLOutput;

public class Pueblo {
    private String nombre, provincia;
    private Persona []Lista;
    private int habitantes;


    public Pueblo(String nombre, String provincia){
        this.nombre = nombre;
        habitantes =10000;
        this.provincia = provincia;
        Lista = new Persona[habitantes];
        habitantes =0;

    }

    public int getHabitantes(){
        return habitantes;
    }

    private int buscarPos(String DNI){
        for (int i = 0; i <habitantes; i++) {
            if(Lista[i].getDNI().equals(DNI)){
                return i;
            }
        }
        return -1;
    }

    public Persona buscar(String DNI){
        int pos = buscarPos(DNI);

        if(pos == -1){
            System.out.println("Persona no registrada");
            return null;
        }
        return Lista[pos];
    }

    public void registrar(Persona p) {

        int pos = buscarPos(p.getDNI());

        if (pos == -1) {
            System.out.println("Persona no registrada");
        } else if (pos >= 0) {
            System.out.println("Persona " + p.getNombre() + " " + p.getApellidos() + " ya está registrada");
        } else {
            Lista[habitantes] = p;
            habitantes++;
            System.out.println("Persona con DNI " + p.getDNI() + " y nombre y apellidos " + p.getNombre() + p.getApellidos() + " registrada");
        }
    }

        public void eliminar(String DNI){
        int pos = buscarPos(DNI);

        if(pos == -1){
            System.out.println("El DNI no está registrado");
            return;
        }
            for (int i = 0; i <habitantes-1 ; i++) {
                Lista[i] = Lista[i+1];
            }
            habitantes--;

            Lista[habitantes] = null;
            System.out.println("Persona con DNI "+DNI+" eliminada");
        }

        public void listar(){
            System.out.println("Lista de habitantes");
            for (int i = 0; i <habitantes ; i++) {
                System.out.println(Lista[i]);
            }
    }

    @Override public String toString() {
        return String.format("(Pueblo: [nombre: %s; " +
                        "provincia: %s; " +
                        "habitantes: %d])",
                nombre, provincia, habitantes);
    }



    public static void main(String[] args) {
        Pueblo pueblo = new Pueblo("Alcoi", "Alacant");
        System.out.println(pueblo);
        System.out.println("\n-------------------------------\n");
        Persona p1 = new Persona("48000000-A", "Pau",
                "Sanjuan Ferre", new Direccion("Sant Nicolau", 24, "2"));
        Persona p2 = new Persona("48000001-B", "J´ulia",
                "Reig Sempere", new Direccion("El Cam´ı", 7, "4C"));
        Persona p3 = new Persona("48000002-C", "Joan",
                "Molina Parra", new Direccion("Zorrilla", 1, "5"));
        Persona p4 = new Persona("48000003-D", "Aleix",
                "Molina Parra", new Direccion("Zorrilla", 1, "5"));
        Persona p5 = new Persona("48000004-E", "Artur",
                "Sempere Vany´o", new Direccion("Zorrilla", 1, "2"));
        pueblo.registrar(p1);
        pueblo.registrar(p2);
        pueblo.registrar(p3);
        pueblo.registrar(p4);
        pueblo.registrar(p5);
        System.out.println("\n" + pueblo);
        pueblo.listar();
        System.out.println("\n-------------------------------\n");
        System.out.println("- Pau es vecino de Joan? " + p1.esVecino(p3));
        System.out.println("- J´ulia es vecina de Joan? " + p2.esVecino(p3));
        System.out.println("- Artur es vecino de Joan? " + p5.esVecino(p3));
        System.out.println("- Artur vive con Joan? " + p5.viveCon(p3));
        System.out.println("- Aleix vive con Joan? " + p4.viveCon(p3));
        System.out.println("\n-------------------------------\n");
        System.out.println("Buscamos DNI 48000002-C:");
        System.out.println(pueblo.buscar("48000002-C"));
        System.out.println("\n-------------------------------\n");
        System.out.println("Buscamos DNI 1234:");
        System.out.println(pueblo.buscar("1234"));
        System.out.println("\n-------------------------------\n");
        System.out.println("Eliminamos DNI 48000002-C:");
        pueblo.eliminar("48000002-C");
        System.out.println("\n" + pueblo);
        pueblo.listar();
        System.out.println("\n-------------------------------\n");
        System.out.println("Buscamos DNI 48000002-C:");
        System.out.println(pueblo.buscar("48000002-C"));
        System.out.println("\n-------------------------------\n");
        System.out.println("Eliminamos DNI 5678:");
        pueblo.eliminar("5678");
        System.out.println("\n" + pueblo);
        pueblo.listar();
        System.out.println("\n-------------------------------\n");
        System.out.println("Volvemos a a~nadir DNI 480000002-C:");
        pueblo.registrar(new Persona("48000002-C", "Joan",
                "Molina Parra",
                new Direccion("Zorrilla", 1, "5")));
        System.out.println("\n" + pueblo);
        pueblo.listar();
        System.out.println("\n-------------------------------\n");
        System.out.println("Buscamos DNI 48000002-C:");
        System.out.println(pueblo.buscar("48000002-C"));
    }
}
