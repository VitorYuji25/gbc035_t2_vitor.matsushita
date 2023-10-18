package ex03;

import java.util.Scanner;

public class UsaBanco extends ContaEspecial{

    public UsaBanco(float val, int num, int pwd, double limite) {
        super(val, num, pwd, limite);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    ContaEspecial contaEsp = new ContaEspecial(2000, 10, 20, 1500);
    
    System.out.println("Digite o valor a ser debitado: ");
    double valDebito = sc.nextDouble();
    contaEsp.debitaValor(valDebito);

    System.out.println("Digite o valor a ser creditado: ");
    double valCredito = sc.nextDouble();
    contaEsp.debitaValor(valCredito);

    System.out.print("O valor do saldo da conta:"+ contaEsp.getNumConta() + "eh de: "+ contaEsp.getSaldo(20));
    }
}
