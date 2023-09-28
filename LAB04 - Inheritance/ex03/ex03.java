package ex03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * # Ex03
- Modifique a classe Figurinha, transformando os atributos *protected* para *private*
- Entenda o erro que ocorre em MostrarFigurinha() da classe FigurinhaExtra com essa modificação
- Modifique o método MostrarFigurinha() para ser possível vizualizar os atributos privados de Figurinha. Para isso use *super.MostrarFigurinha()*
- Crie um novo construtor, que terá como parâmetro uma Figurinha (normal) e os dois atributo adicionais de FigurinhaExtra. Esse construtor permitirá criar um novo objeto de FigurinhaExtra a partir de um objeto já existente de Figurinha (ou seja, uma figurinha extra de um jogador que já foi criado)

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas

 */

public class ex03 {

     public static void main(String[] args){
        Figurinha player = new Figurinha();
        FigurinhasExtras playerEx = new FigurinhasExtras();

        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Scanner sc = new Scanner(System.in);
        

    String nome;
    String data_nascimento;
    double altura;
    double peso;
    String posicao;
    String pais;
    String categoria;
    String cor;

    player = new Figurinha();
    System.out.format("Digite o nome do jogador: ");
    nome=sc.nextLine();
    player.setNome_jogador(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    player.setData_nasc(dataNascimento);
    System.out.format("Digite a altura do jogador: ");
    altura = sc.nextDouble();
    player.setAltura(altura);
    sc.nextLine();
    System.out.format("Digite a posicao do jogador: ");
    posicao = sc.nextLine();
    player.setPosicao(posicao);
    sc.nextLine();
    System.out.format("Digite o peso do jogador: ");
    peso = sc.nextDouble();
    player.setPeso(peso);
    sc.nextLine();
    System.out.format("Digite o pais do jogador: ");
    pais = sc.nextLine();
    player.setPais(pais);

    System.out.println("==========================");
    System.out.println(player.getNome_jogador());
    System.out.println(player.getData_nasc());
    System.out.println(player.getAltura());
    System.out.println(player.getPeso());
    System.out.println(player.getPosicao());
    System.out.println(player.getPais());
    System.out.println("==========================");
    
    System.out.format("Digite o categoria do jogador: ");
    categoria = sc.nextLine();
    playerEx.setCategoria(categoria);
    System.out.format("Digite o cor do jogador: ");
    cor = sc.nextLine();
    playerEx.setCor(cor);

    playerEx = new FigurinhasExtras(player,playerEx.getCategoria(),playerEx.getCor());
         
         System.out.println(playerEx.MostrarFigurinha());

    
        sc.close();
     }
}
    
