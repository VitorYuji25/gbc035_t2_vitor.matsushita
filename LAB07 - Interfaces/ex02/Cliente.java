package ex02;

public class Cliente implements Classificavel{

    private String nome;
    

    
    public Cliente(String nome) {
        this.nome = nome;
    }



    public int eMenorQue(Classificavel o) {
        Cliente compara = (Cliente) o;
        if(this.nome.compareTo(compara.nome) == -1){
            return -1;
            } else {
                return 1;
        }
    }
    
}
