
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
  

public class ex01 {

    public static void main(String[] args){

        Figurinha player1 = new Figurinha();
        Figurinha player2 = new Figurinha();
        Figurinha player3 = new Figurinha();

        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        

    String data_nascimento1 = "2000-07-25";
    player1.nome_jogador = "Hulk";
    LocalDate dataNascimento = LocalDate.parse(data_nascimento1,date);
    player1.data_nasc = dataNascimento;
    player1.altura = 1.80;
    player1.posicao = "Atacante";
    player1.pais = "Brasil";

    String data_nascimento2 = "2000-06-03";
    player2.nome_jogador = "Pele";
    LocalDate dataNascimento2 = LocalDate.parse(data_nascimento2,date);
    player2.data_nasc = dataNascimento2;
    player2.altura = 1.80;
    player2.posicao = "Atacante";
    player2.pais = "Brasil";

    String data_nascimento3 = "2000-08-30";
    player3.nome_jogador = "Messi";
    LocalDate dataNascimento3 = LocalDate.parse(data_nascimento3, date);
    player3.data_nasc = dataNascimento3;
    player3.altura = 1.80;
    player3.posicao = "Atacante";
    player3.pais = "Brasil";

    System.out.println("==========================");
    System.out.println(player1.nome_jogador);
    System.out.println(player1.data_nasc);
    System.out.println(player1.altura);
    System.out.println(player1.posicao);
    System.out.println(player1.pais);
    System.out.println("==========================");


    System.out.println(player2.nome_jogador);
    System.out.println(player2.data_nasc);
    System.out.println(player2.altura);
    System.out.println(player2.posicao);
    System.out.println(player2.pais);
    System.out.println("==========================");

    System.out.println(player3.nome_jogador);
    System.out.println(player3.data_nasc);
    System.out.println(player3.altura);
    System.out.println(player3.posicao);
    System.out.println(player3.pais);    
    System.out.println("==========================");

    }
    
}
