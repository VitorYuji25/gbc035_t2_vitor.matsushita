package ex04;

import java.util.Date;
import java.util.zip.DataFormatException;


public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected Date aniversario;

    public Contato(){
    }
    public Contato(String apelido,String nome,String email, DataFormatException aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public String imprimeBasico(){
        return "Nome: "+this.nome+"\nApelido: "+ this.apelido +"\nEmail: "+this.email + "\nAniversario: "+ this.aniversario;
    }

    public abstract void imprimeContato();

}
