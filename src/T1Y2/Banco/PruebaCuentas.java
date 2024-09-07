package T1.Banco;

public class PruebaCuentas {

    public static void  mostrarMorosidad(Persona p){
        if(p.esMorosa()){
            System.out.println("Persona morosa");
        }else{
            System.out.println("Esta persona no es morosa");
        }
    }

    public static void main(String[] args){
        Persona p = new Persona("12345678-A");
        Cuenta c1 = new Cuenta("1234");
        p.anyadirCuenta(c1);
        Cuenta c2 = new Cuenta("5678");
        p.anyadirCuenta(c2);
        Cuenta c3 = new Cuenta("1357");
        p.anyadirCuenta(c3);
        System.out.println(p);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        p.anyadirCuenta(new Cuenta("2468"));
        System.out.println("");
        System.out.println("- Cuenta 5678 recibe un abono de 700¿.");
        c2.recibirAbonos(700); // Saldo inicial
        System.out.println("- Cuenta 1234 recibe un abono de 1100¿.");
        c1.recibirAbonos(1100); // N´omina
        c2.recibirCargos(750); // Alquiler
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        mostrarMorosidad(p);
        System.out.println("");
        System.out.println("- Ordenamos transferencia de 200¿ " +
                "de la cuenta 1234 a la cuenta 5678.");
        c1.realizarTransferencia(c2,200);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        mostrarMorosidad(p);
    }
}
