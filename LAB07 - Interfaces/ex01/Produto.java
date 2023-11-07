package ex01;

public class Produto implements Classificavel{

    protected int codigo;

    
    public Produto(int i) {
        this.codigo = i;
    }


    public boolean eMenorQue(Classificavel o) {
        Produto compara = (Produto) o;
        if(this.codigo < compara.codigo){
            return true;
            } else {
                return false;
        }
    }
    
}
