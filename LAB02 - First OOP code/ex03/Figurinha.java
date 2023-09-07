package ex03;
/*
# Ex03
Crie no programa principal um vetor de figurinhas e 
instancie os jogadores de sua preferência. 
Mostre as informações de todos os jogadores. 
Utilize laços para manipulação do vetor.
 */

import java.time.LocalDate;

public class Figurinha {

    private String nome_jogador;
    private LocalDate  data_nasc;
    private float  altura;
    private String posicao;
    private String pais;

    public String getNome_jogador() {
        return nome_jogador;
    }
    public void setNome_jogador(String nome_jogador) {
        this.nome_jogador = nome_jogador;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }
    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
