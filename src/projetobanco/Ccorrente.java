package projetobanco;

public class Ccorrente extends Cbancaria {
    double taxa = 0.08 * saldo;
    public Ccorrente(int saldo) {
        super(saldo);
        this.taxa = taxa;
       
    }
    
    
    @Override
    public double saque(double valorSaque){
        this.saldo = saldo - (valorSaque + taxa);
        return saldo;
    }
    
    @Override
    public double deposito(double valorDeposito){
        this.saldo = saldo + valorDeposito;
        return saldo;
    }
    
    @Override
    public double consulta(){
        return getSaldo();
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
}
