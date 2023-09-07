package ex02;
/*
# Ex02
Crie um novo projeto, semelhante ao exercício anterior. 
Torne todas os atributos do exercício 1 privados. 
Crie métodos para alterar os valores dos atributos e 
para mostrar os valores dos atributos na tela. 
Instancie os mesmos três jogadores.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ex02 {
    
    public static void main(String[] args){

        Figurinha player1 = new Figurinha();
        Figurinha player2 = new Figurinha();
        Figurinha player3 = new Figurinha();

        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        

    String data_nascimento1 = "2000-07-25";
    player1.setNome_jogador("Hulk");
    LocalDate dataNascimento1 = LocalDate.parse(data_nascimento1,date);
    player1.setData_nasc(dataNascimento1);
    player1.setAltura(1.80);
    player1.setPosicao("Atacante");
    player1.setPais("Brasil");

    String data_nascimento2 = "2000-09-20";
    player2.setNome_jogador("Pele");
    LocalDate dataNascimento2 = LocalDate.parse(data_nascimento2,date);
    player2.setData_nasc(dataNascimento2);
    player2.setAltura(1.80);
    player2.setPosicao("Atacante");
    player2.setPais("Brasil");

    String data_nascimento3 = "2000-07-25";
    player3.setNome_jogador("Messi");
    LocalDate dataNascimento3 = LocalDate.parse(data_nascimento3,date);
    player3.setData_nasc(dataNascimento3);
    player3.setAltura(1.80);
    player3.setPosicao("Atacante");
    player3.setPais("Argentina");

    System.out.println("==========================");
    System.out.println(player1.getNome_jogador());
    System.out.println(player1.getData_nasc());
    System.out.println(player1.getAltura());
    System.out.println(player1.getPosicao());
    System.out.println(player1.getPais());
    System.out.println("==========================");


    System.out.println(player2.getNome_jogador());
    System.out.println(player2.getData_nasc());
    System.out.println(player2.getAltura());
    System.out.println(player2.getPosicao());
    System.out.println(player2.getPais());
    System.out.println("==========================");

    System.out.println(player3.getNome_jogador());
    System.out.println(player3.getData_nasc());
    System.out.println(player3.getAltura());
    System.out.println(player3.getPosicao());
    System.out.println(player3.getPais());  
    System.out.println("==========================");

    }


}
