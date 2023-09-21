package ex02;

public class casa {
    private String nome;
    tijolos t = new tijolos();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int constroi(){
        System.out.println("Digite quantos tijolos precisa: ");
        int n=Integer.parseInt (System.console().readLine());
        return n;
    }
    
}
