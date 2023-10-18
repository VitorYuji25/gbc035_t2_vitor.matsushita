package ex02;

public class forma{

    protected int lado;
    protected double raio;
    protected double pi = 3.14;


    public forma(){
    }


    public forma(int lado, double raio, double pi) {
        this.lado = lado;
        this.raio = raio;
        this.pi = pi;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }

    public void perimetro(){
    }
    public double obterArea(){
        return (this.getLado()) * (this.getLado());
    }
    

}
