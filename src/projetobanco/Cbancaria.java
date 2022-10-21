package projetobanco;

public abstract class Cbancaria {
    protected double saldo;
    
    public abstract double saque(double valorSaque);
    public abstract double deposito(double valorDeposito);
    public abstract double consulta();

    public Cbancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
