package ex02;

public class tetraedro extends formaTridimensional{

    private double base;
    private double altura;

    public tetraedro(){
        super();
    }

    public tetraedro(double base,double altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public double obterArea(){
        return (Math.sqrt(3)*super.getLado()*super.getLado())/4;
    }
    
    public double obterVolume(){
        return ((getBase())/3) * getAltura();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
