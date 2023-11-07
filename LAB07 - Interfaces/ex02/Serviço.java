package ex02;

public class Serviço implements Classificavel {
    
    
    private double preco;

    
    public Serviço(double d) {
        this.preco = d;
    }


    public int eMenorQue(Classificavel o) {
        Serviço compara = (Serviço) o;
        if(this.preco < compara.preco){
            return -1;
            } else {
                return 1;
        }
    }
    
}
