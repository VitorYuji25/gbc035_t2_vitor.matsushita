package ex01;

import java.time.LocalDate;

/*
 Agora crie a classe para as figurinhas extras. 
 Essas são bem mais raras e não fazem parte da coleção regular, 
 sendo caracterizadas como uma coleção à parte. 
 Além de todos os atributos das figurinhas regulares, 
 as raras são divididas em duas categorias, "Legends" e "Rookies", 
 e possuem quatro variações de cor: bordô, bronze, prata e ouro". 
 Crie uma classe chamada FigurinhaExtra, que contenha todos atributos da classe Figurinha e acrescente os dois novos atributos. 
 Utilize boas práticas de POO (atributos privados, métodos get/set), crie um construtor que inicializa todos os parâmetros e crie também o método MostrarFigurinha().
Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
 */


public class FigurinhasExtras {

    private String nome_jogador;
    private LocalDate  data_nasc;
    private double  altura;
    private double peso;
    private String posicao;
    private String pais;
    private String categoria;
    private String cor;

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
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
                + ", peso=" + peso + ", posicao=" + posicao + ", pais=" + pais + ", categoria=" + categoria + ", cor="
                + cor + "]";
    }


    

    /* 
    public void MostrarFigurinha(){
        System.out.println("==========================");
        System.out.printf("\nNome do jogador eh: %s",getNome_jogador());
        System.out.printf("\nA data de nascimento do jogador eh:",getData_nasc());
        System.out.printf("\nA altura do jogador eh: %f",getAltura());
        System.out.printf("\nO peso do jogador eh: %f ",getPeso());
        System.out.printf("\nA posição do jogador eh: %s",getPosicao());
        System.out.printf("\nO pais do jogador eh: %s",getPais());
        System.out.printf("\nA Categoria da Figurinha é %s\n",getCategoria());
        System.out.printf("\nA Cor da Figurinha é %s\n",getCor());
        System.out.println("==========================");

    }*/
    
}
