package T1.TorneoTenis;

public class Main {
public static void main(String args[]){
         Torneo t = new Torneo("ATP Masters 1000 Indian Wells", 2024);
         Raquetas r1 = new Raquetas("Head", "Speed Pro LTD", 24.0);
         Raquetas r2 = new Raquetas("Babolat", "Pure Aero VS", 25.0);
         Jugadores j1 = new Jugadores("Novak Djokovic", "001", r1);
         t.inscribir(j1);
        Jugadores j2 = new Jugadores("Carlos Alcaraz", "002", r2);
        t.inscribir(j2);
         Jugadores j3 = new Jugadores("Rafa Nadal", "003", r2);
         t.inscribir(j3);

         Jugadores jug_aux = t.buscarJugador("003");
         Raquetas raq_aux = jug_aux.getRaqueta();
         raq_aux.setTension(26.5);
         System.out.println(raq_aux);
         t.jugadoresMismaRaqueta(jug_aux);
        t.eliminar(jug_aux);
         System.out.println(t);
         }
 }
