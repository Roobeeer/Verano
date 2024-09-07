package T1.Banco;

public class Persona {

    private String DNI;

    private Cuenta[] cuentas;

    private int sizeCuentas;

    public Persona(String DNI) {
        this.DNI = DNI;
        this.cuentas = new Cuenta[3];
        sizeCuentas = 0;
    }

    public String getDNI(){
        return this.DNI;
    }


    public int getSizeCuentas() {
        return sizeCuentas;
    }

    public void anyadirCuenta(Cuenta nuevaCuenta) {
        if (sizeCuentas < 3) {
            cuentas[sizeCuentas] = nuevaCuenta;
            sizeCuentas++;
            System.out.println("Cuenta añadida correctamente"); ;
        }else{
            System.out.println("Error, tienes más de 3 cuentas asociadas a tu nombre");
        }


    }

    public boolean esMorosa(){
        for (int i = 0; i <sizeCuentas ; i++) {
            if(cuentas[i].getSaldo()<0){
                return true;
            }
        }
        return false;

    }
    @Override
    public String toString(){
        return "Persona : DNI "+DNI+ " || Nº de cuentas : "+sizeCuentas;
    }

}

