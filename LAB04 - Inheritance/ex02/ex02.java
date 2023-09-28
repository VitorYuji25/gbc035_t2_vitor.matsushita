package ex02;

/*
 * # Ex02
O conceito de herança (inheritance) em POO é muito utilizado para reaproveitamento de código.

- Modifique a classe Figurinha, transformando os atributos *private* para *protected*
- Modifique a classe FigurinhaExtra, 
  eliminando todos os atributos e métodos reduntantes de Figurinha. 
  Obtenha os valores desses atributos por herança utilizando a palavra chave *extends*, 
  isto é: "public class FigurinhaExtra extends Figurinha {".
- Note que a herança irá trazer os atributos e os métodos para a classe FigurinhaExtra.
- Note que o método MostrarFigurinha() 
  deve continuar em FigurinhaExtra, pois ele é diferente do método FigurinhaExtra() da classe Figurinha
- O construtor deve ser modificado, 
  de forma a inicializar somente os atributos de FigurinhaExtra. 
  Os atributos que são originais de classe Figurinha 
  (chamada de superclasse ou classe mãe/pai) deverão ser inicializados por meio da chamada do construtor original de Figurinha. 
  Isso é feito usando a palavra reservada *super*

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex02 {
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
    int op = -1;


    while(op != 0){
    System.out.println("Digite se a figurinha eh normal(1) ou extra(2): ");
    op = sc.nextInt();
    sc.nextLine();
    if(op == 0){
        break;
    }
    if (op == 1){
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
    System.out.format("Digite a posicao do jogador: ");
    posicao = sc.nextLine();
    player.setPosicao(posicao);
    sc.nextLine();
    System.out.format("Digite o peso do jogador: ");
    peso = sc.nextDouble();
    player.setPeso(peso);
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
    }else{
    playerEx = new FigurinhasExtras();
    System.out.format("Digite o nome do jogador: ");
    nome=sc.nextLine();
    playerEx .setNome_jogador(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    playerEx.setData_nasc(dataNascimento);
    System.out.format("Digite a altura do jogar: ");
    altura = sc.nextFloat();
    playerEx.setAltura(altura);
    System.out.format("Digite o peso do jogador: ");
    peso = sc.nextDouble();
    player.setPeso(peso);
    System.out.format("Digite a posicao do jogador: ");
    posicao = sc.nextLine();
    playerEx.setPosicao(posicao);
    sc.nextLine();
    System.out.format("Digite o pais do jogador: ");
    pais = sc.nextLine();
    playerEx.setPais(pais);
    System.out.format("Digite o categoria do jogador: ");
    categoria = sc.nextLine();
    playerEx.setCategoria(categoria);
    System.out.format("Digite o cor do jogador: ");
    cor = sc.nextLine();
    playerEx.setCor(cor);
         }
         System.out.println(player.MostrarFigurinha());
         System.out.println(playerEx.MostrarFigurinha());

        }
        sc.close();
    
    
    
    }
}
