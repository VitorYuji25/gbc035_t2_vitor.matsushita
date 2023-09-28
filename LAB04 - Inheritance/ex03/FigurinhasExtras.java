package ex03;


/*
 * # Ex03
- Modifique a classe Figurinha, transformando os atributos *protected* para *private*
- Entenda o erro que ocorre em MostrarFigurinha() da classe FigurinhaExtra com essa modificação
- Modifique o método MostrarFigurinha() para ser possível vizualizar os atributos privados de Figurinha. Para isso use *super.MostrarFigurinha()*
- Crie um novo construtor, que terá como parâmetro uma Figurinha (normal) e os dois atributo adicionais de FigurinhaExtra. Esse construtor permitirá criar um novo objeto de FigurinhaExtra a partir de um objeto já existente de Figurinha (ou seja, uma figurinha extra de um jogador que já foi criado)

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas
*/


public class FigurinhasExtras extends Figurinha{

    
    private String categoria;
    private String cor;

    public FigurinhasExtras(Figurinha fg,String categoria, String cor){
        super(fg.getNome_jogador(), fg.getData_nasc(), fg.getAltura(),fg.getPeso(), fg.getPosicao(), fg.getPais());
        this.categoria = categoria;
        this.cor = cor;
        
    }

    public FigurinhasExtras() {
        super();
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
    
    
}
