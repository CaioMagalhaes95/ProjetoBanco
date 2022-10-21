package projetobanco;

public class Cpoupança extends Cbancaria{
    double taxa = 0.01 * saldo;
    public Cpoupança(int saldo) {
        super(saldo);
    }

    @Override
    public double saque(double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Valor invalido");
        }
        return saldo - valorSaque;
    }

    @Override
    public double deposito(double valorDeposito) {
        this.saldo = saldo + (valorDeposito + taxa);
        return saldo;
    }

    @Override
    public double consulta() {
       return getSaldo(); 
    }
    
    
}
