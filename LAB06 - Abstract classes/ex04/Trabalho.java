package ex04;

import java.util.zip.DataFormatException;

public class Trabalho extends Contato{

    private String tipo;


    public Trabalho(String apelido, String nome, String email, DataFormatException aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }


    public Trabalho() {
        super();
    }


    public void imprimeContato() {
        this.imprimeBasico();
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
