package ex02;

import java.time.LocalDate;

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


public class FigurinhasExtras extends Figurinha{

    
    protected String categoria;
    protected String cor;

    public FigurinhasExtras(){
        super();
    }

    public FigurinhasExtras(String nome_jogador, LocalDate data_nasc, double altura, double peso, String posicao,
            String pais, String categoria, String cor) {
        super(nome_jogador, data_nasc, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }
    
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

    @Override
    public String MostrarFigurinha() {
        return super.MostrarFigurinha() + "FigurinhasExtras [categoria=" + categoria + ", cor=" + cor + "]";
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
