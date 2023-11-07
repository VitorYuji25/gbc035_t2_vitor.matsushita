package ex01;

public class Serviço implements Classificavel {
    
    
    private double preco;

    
    public Serviço(double d) {
        this.preco = d;
    }


    public boolean eMenorQue(Classificavel o) {
        Serviço compara = (Serviço) o;
        if(this.preco < compara.preco){
            return true;
            } else {
                return false;
        }
    }
    
}
