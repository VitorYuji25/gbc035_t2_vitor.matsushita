package ex02;

public class circulo extends formaBidimensional{

    public circulo(){
        super();
    }

    @Override
    public double obterArea(){
        return 3.14 * Math.pow(this.raio, 2);
    }

}
