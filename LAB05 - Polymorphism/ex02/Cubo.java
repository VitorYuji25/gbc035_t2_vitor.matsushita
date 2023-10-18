package ex02;

public class Cubo extends formaTridimensional{

    public Cubo(){
        super();
    }

    @Override
    public double obterArea(){
        return 6 * Math.pow(super.getLado(), 2);
    }

    @Override
    public double obterVolume(){
        return (Math.pow((double)super.getLado() / 3, 3));
    }
    
}
