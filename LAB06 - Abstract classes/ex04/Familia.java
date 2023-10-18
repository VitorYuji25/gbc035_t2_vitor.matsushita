package ex04;

public class Familia extends Contato{

    private String parentesco;

    public Familia(){
    }
    public Familia(String parentesco){
        super();
        this.parentesco = parentesco;
    }

    public String getParentesco(){
        return parentesco;
    }
    public void setParentesco(String parentesco){
        this.parentesco = parentesco;
    }

    public void imprimeContato() {
        this.imprimeBasico();
    }
    
}
