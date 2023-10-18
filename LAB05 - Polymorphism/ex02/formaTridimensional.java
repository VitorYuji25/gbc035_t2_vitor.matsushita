package ex02;

public class formaTridimensional extends forma{

    public formaTridimensional(){
        super();
    }

    public double obterVolume(){
        return 1.5 * Math.pow(super.obterArea(), 3);
    }
    
}
