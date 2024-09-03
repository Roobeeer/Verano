package T1.Banco;

public class Cuenta {
    private String numero;
    private float saldo;

    public float getSaldo(){
        return saldo;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setSaldo(double saldo){}

    public Cuenta(String numero){
        this.numero = numero;
        this.saldo = 0;
    }

    public void saldoDisponible(){
        System.out.println("Saldo disponible --> "+saldo + " €");
    }

    public void recibirAbonos(float abono){
        if(abono<=0){
            throw new RuntimeException("ERROR, no puedes abonar cantidades negativas o 0");
        }else{
            saldo += abono;
            System.out.println("Dinero abonado correctamente, saldo actual de "+saldo+" €");
        }
    }

    public void recibirCargos(float abono){
        if(abono<=0){
            throw new RuntimeException("ERROR, no puedes abonar cantidades negativas o 0");
        }else{
            saldo -= abono;
            System.out.println("Dinero abonado correctamente, saldo actual de "+saldo+" €");
        }
    }

    public void realizarTransferencia(Cuenta c,double dinero){
        if(dinero<=0){
            throw new RuntimeException("ERROR, no puedes abonar cantidades negativas o 0");
        }else if(dinero>saldo) {
            System.out.println("Error, No tienes suficiente saldo");
        }else {
            double saldocuenta = c.getSaldo();
            saldocuenta+=dinero;
            System.out.println("Dinero transferido correctamente, saldo de la cuenta "+saldocuenta +" €");
        }
        }
    @Override public String toString(){
        return "Cuenta: " + numero + " (saldo: " + saldo + " Euros)";
    }
}
