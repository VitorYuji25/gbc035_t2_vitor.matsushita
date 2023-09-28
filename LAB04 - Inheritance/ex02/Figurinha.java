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

public class Figurinha {

    protected String nome_jogador;
    protected LocalDate  data_nasc;
    protected double  altura;
    protected double peso;
    protected String posicao;
    protected String pais;


    
    

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
