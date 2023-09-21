package ex03;

public class poupança {

    private double saldo;

    public poupança(){
        this.saldo = 1500;
    }

     public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor){
        saldo -= valor;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void mostraSaldo(){
        System.out.println("Seu Saldo é: " + this.saldo);
    }
    
}
