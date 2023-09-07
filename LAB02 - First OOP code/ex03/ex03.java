package ex03;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * # Ex03
Crie no programa principal um vetor de figurinhas e 
instancie os jogadores de sua preferência.
Mostre as informações de todos os jogadores.
Utilize laços para manipulação do vetor.
 */
public class ex03 {
    public static void main(String[] args){

        Figurinha[] player = new Figurinha[3];

        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Scanner sc = new Scanner(System.in);
        

    String nome;
    String data_nascimento;
    float altura;
    String posicao;
    String pais;

    for(int i = 0;i<player.length;i++){
    player[i] = new Figurinha();
    System.out.format("Digite o nome do jogador[%d]: ",i);
    nome=sc.nextLine();
    player[i].setNome_jogador(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    player[i].setData_nasc(dataNascimento);
    System.out.format("Digite a altura do jogar[%d]: ",i);
    altura = sc.nextFloat();
    player[i].setAltura(altura);
    System.out.format("Digite a posicao do jogador[%d]: ",i);
    posicao = sc.nextLine();
    player[i].setPosicao(posicao);
    sc.nextLine();
    System.out.format("Digite o pais do jogador[%d]: ",i);
    pais = sc.nextLine();
    player[i].setPais(pais);
        }

        for(int j=0;j<player.length;j++){
    System.out.println("==========================");
    System.out.println(player[j].getNome_jogador());
    System.out.println(player[j].getData_nasc());
    System.out.println(player[j].getAltura());
    System.out.println(player[j].getPosicao());
    System.out.println(player[j].getPais());
    System.out.println("==========================");
        }

    }
    
}
