package ex02;


import java.util.Scanner;



public class ex02 {
    public static void main(String[] args) {
    forma[] forma = new forma[6];

    
    forma[0] = new circulo();
    forma[1] = new triangulo();
    forma[2] = new quadrado();
    forma[3] = new esfera();
    forma[4] = new Cubo();
    forma[5] = new tetraedro();
    

        for(int j=0;j<forma.length;j++){
    System.out.println("==========================");
    forma[j].descricaoforma();
    System.out.println("=========================");
        }
      
    }
    public void descricaoforma(){
        return System.out.println("Area "+ this.obterArea());
        return System.out.println("Volume: " + obterVolume());
    }
}
    
