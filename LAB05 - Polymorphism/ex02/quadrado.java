package ex02;

public class quadrado extends formaBidimensional{

    public quadrado(){
        super();
    }

    @Override
    public double obterArea(){
        return lado*lado;
    }
    
}
