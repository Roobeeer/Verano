package T1.TorneoTenis;

public class Torneo {

    private String nombre;
    private int anyo;

    private int nparticipantes;
    private Jugadores [] participantes;
    private static int MAX_PARTICIPANTES;

    public Torneo(String nombre, int anyo){
        this.nombre = nombre;
        this.anyo = anyo;
        this.nparticipantes = 0;
        MAX_PARTICIPANTES = 64;
        participantes = new Jugadores[MAX_PARTICIPANTES];
    }


    public int buscarPos(String DNI){
        int i = 0;

        while(i<nparticipantes && !participantes[i].getPasaporte().equals(DNI)) {
            i++;
        }
            if(i == nparticipantes){
                return -1;
            }else{
                return i;
            }
        }

        public void inscribir(Jugadores j){
        if(buscarPos(j.getPasaporte()) != -1){
            throw new RuntimeException("Error, el jugador ya está inscrito");
            }
        participantes[nparticipantes] = j;
        nparticipantes++;
        }
        
        public Jugadores buscarJugador(String DNI){
        int pos = buscarPos(DNI);

        if(pos == -1){
            throw new RuntimeException("Error, el jugador no está inscrito");
        }else{
            return participantes[pos];
        }
        }

        public void eliminar(Jugadores j){
        int pos = buscarPos(j.getPasaporte());
        if(pos == -1){
            throw new RuntimeException("Error, el jugador no está inscrito");
        }else{
            for (int i = 0; i <participantes.length-1 ; i++) {
                participantes[i] = participantes[i+1];
            }
            nparticipantes--;
            participantes[nparticipantes] = null;
        }
    }


    public void jugadoresMismaRaqueta(Jugadores j){
        System.out.println("Lista de jugadores con misma raqueta que "+j+ " :");
        for (int i = 0; i <nparticipantes ; i++) {
            if(!participantes[i].equals(j) && participantes[i].mismaRaqueta(j)){
                System.out.println(participantes[i]);
            }
            
        }
    }


    public boolean equals(Object o){
        Torneo t = (Torneo)o;
        return this.nombre == t.nombre && this.anyo == t.anyo;
    }

    @Override
    public String toString(){
        String ret = "Torneo "+nombre + "Año : "+anyo+ " Participantes : "+nparticipantes+ "\n ";
        for(int i = 0; i <nparticipantes ; i++) {
            System.out.println(participantes[i]);
        }
        return ret;
    }
}
