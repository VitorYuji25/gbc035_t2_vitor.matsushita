package ex02;

public class Produto implements Classificavel{

    protected int codigo;

    
    public Produto(int i) {
        this.codigo = i;
    }


    public int eMenorQue(Classificavel o) {
        Produto compara = (Produto) o;
        if(this.codigo < compara.codigo){
            return -1;
            } else {
                return 1;
        }
    }
    
}
