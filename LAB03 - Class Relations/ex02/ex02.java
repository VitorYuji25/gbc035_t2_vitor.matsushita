package ex02;

import java.util.Scanner;

/*
 # Ex02
- Faça um pequeno programa que utiliza o conceito de Agregação
- os objetos são independentes?
-> OS OBJETOS NÃO SÃO INDEPENDENTES
 */

public class ex02 {
    public static void main(String[] args){

        casa casa1 = new casa();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da casa: ");
        String nome = sc.nextLine();
        casa1.setNome(nome);


        System.out.println("Digite a largura do tijolo: ");
        double largura = sc.nextDouble();
        casa1.t.setLargura(largura);

        System.out.println("Digite a altura do tijolo: ");
        double altura = sc.nextDouble();
        casa1.t.setAltura(altura);

        int qtd_tijolos = casa1.constroi();
        System.out.println(qtd_tijolos + " tijolos");



    }

    
}
