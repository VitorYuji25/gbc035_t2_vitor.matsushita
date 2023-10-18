package ex02;

public class esfera extends formaTridimensional{

    public esfera(){
        super();
    }

    @Override
    public double obterArea(){
        return 4 * Math.PI * (raio*raio);
    }

    @Override
    public double obterVolume(){
        return (4/3) * Math.PI * (raio*raio)*raio;
    }
    
}
