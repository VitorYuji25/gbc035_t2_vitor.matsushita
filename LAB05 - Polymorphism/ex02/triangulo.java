package ex02;

public class triangulo extends formaBidimensional{

    private double base, altura, area;

    public triangulo(){
        super();
    }
    
    public triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
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



   @Override
   public double obterArea(){
    area= (this.getBase() * this.getAltura())/2;
    return area;
   }
    
}

