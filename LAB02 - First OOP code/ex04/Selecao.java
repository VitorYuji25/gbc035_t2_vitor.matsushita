
/*
 * # Ex04
Crie uma nova classe chamada Selecao, 
que é composta pelo nome da seleção, 
por 11 jogadores titulares, 
o nome do técnico, e 
outras informações que julgar pertinente. 
Instancie 2 seleções.
 */

import java.util.ArrayList;

public class Selecao {

    private ArrayList<String> list_players;
    private String nome_tecnico;
    private String nome_selecao;

    

    

    public String getNome_tecnico() {
        return nome_tecnico;
    }
    public void setNome_tecnico(String nome_tecnico) {
        this.nome_tecnico = nome_tecnico;
    }
    public String getNome_selecao() {
        return nome_selecao;
    }
    public void setNome_selecao(String nome_selecao) {
        this.nome_selecao = nome_selecao;
    }
    public ArrayList<String> getList_players() {
        return list_players;
    }
    public void setList_players(ArrayList<String> list_players) {
        this.list_players = list_players;
    }

    
}
