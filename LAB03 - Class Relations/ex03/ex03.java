package ex03;

import java.util.Scanner;

/*
 # Ex03
- Faça um pequeno programa que utiliza o conceito de Composição
- O que acontece com o objeto parte ao remover um objeto todo?
-> O OBJETO TAMBÉM É REMOVIDO
 */

public class ex03 {
    public static void main(String[] args){

    Banco b1 = new Banco();

    Scanner sc = new Scanner(System.in);

    System.out.println("Digote o nome do banco: ");
    String nomeBanco = sc.nextLine();
    b1.setNomeBanco(nomeBanco);

    System.out.println("Digite o valor doo saque: ");
    double saque = sc.nextDouble();
    b1.p1.saque(saque);
    
    System.out.println("Digite o valor do deposito: ");
    double deposito = sc.nextDouble();
    b1.p1.deposito(deposito);
    
    
    System.out.println("O novo valor do saldo eh: ");
    b1.p1.mostraSaldo();

    }
    
}
