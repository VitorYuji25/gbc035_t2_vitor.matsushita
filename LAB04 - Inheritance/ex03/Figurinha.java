package ex03;
/*
 # Ex03
- Modifique a classe Figurinha, transformando os atributos *protected* para *private*
- Entenda o erro que ocorre em MostrarFigurinha() da classe FigurinhaExtra com essa modificação
- Modifique o método MostrarFigurinha() para ser possível vizualizar os atributos privados de Figurinha. Para isso use *super.MostrarFigurinha()*
- Crie um novo construtor, que terá como parâmetro uma Figurinha (normal) e os dois atributo adicionais de FigurinhaExtra. Esse construtor permitirá criar um novo objeto de FigurinhaExtra a partir de um objeto já existente de Figurinha (ou seja, uma figurinha extra de um jogador que já foi criado)

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas

 */

import java.time.LocalDate;

public class Figurinha {

    private String nome_jogador;
    private LocalDate  data_nasc;
    private double  altura;
    private double peso;
    private String posicao;
    private String pais;


    
    

    public Figurinha() {
    }
    //construtor com parametros
    
    public Figurinha(String nome_jogador, LocalDate data_nasc, double altura, double peso, String posicao,
            String pais) {
        this.nome_jogador = nome_jogador;
        this.data_nasc = data_nasc;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }
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
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
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

    public String MostrarFigurinha() {
        return "FigurinhasExtras [nome_jogador=" + nome_jogador + ", data_nasc=" + data_nasc + ", altura=" + altura
                + ", peso=" + peso + ", posicao=" + posicao + ", pais=" + pais + "]";
    }
   
    
}
