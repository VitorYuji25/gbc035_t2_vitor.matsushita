package ex04;

import java.util.Date;

public class Amigos extends Contato{

    private int grau;
    

    public Amigos(){
    super();
    }

    public Amigos(String apelido, String nome, String email, Date aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public void imprimeContato() {
        this.imprimeBasico();
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
    
}
