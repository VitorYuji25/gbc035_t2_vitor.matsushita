import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class ex04 {

    /*
    # Ex04
    Crie uma nova classe chamada Selecao, 
    que é composta pelo nome da seleção, 
    por 11 jogadores titulares, 
    o nome do técnico, 
    e outras informações que julgar pertinente. 
    Instancie 2 seleções.
     */

    public static void main(String[] args){

        ArrayList <String> players = new ArrayList <>();
        Selecao nova_Selecao = new Selecao();

        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Scanner sc = new Scanner(System.in);
        

    String nome;
    String nome_selecao;
    String nome_tecnico;

    System.out.println("Digite o nome da nova selecao: ");
    nome_selecao=sc.nextLine();
    nova_Selecao.setNome_selecao(nome_selecao);
    System.out.println("Digite o nome do tecnico da seleção:");
    nome_tecnico=sc.nextLine();
    nova_Selecao.setNome_tecnico(nome_tecnico);
    for(int i = 0;i<11;i++){
    System.out.format("Digite o nome do jogador[%d]: ",i);
    nome=sc.nextLine();
    players.add(nome);
    }
    nova_Selecao.setList_players(players);

    System.out.println("O nome da selecao eh: "+ nova_Selecao.getNome_selecao());
    System.out.println("O nome do tecnico eh: "+ nova_Selecao.getNome_tecnico());
    System.out.println("O nome dos palyers são: "+ nova_Selecao.getList_players());
    

        sc.close();
    }
    
}
