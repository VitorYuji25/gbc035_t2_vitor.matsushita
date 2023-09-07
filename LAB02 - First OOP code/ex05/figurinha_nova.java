import java.time.LocalDate;

public class figurinha_nova {

    
    private String nome_jogador;
    private LocalDate  data_nasc;
    private float  altura;
    private String posicao;
    private String pais;

    
    //Construtor:
    public figurinha_nova(String pais) {
        this.pais = pais;
    }

    //Getter and Setter:
    public String getNome_jogador() {
        return nome_jogador;
    }
    public void setNome_jogador(String nome_jogador) {
        this.nome_jogador = nome_jogador;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }
    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
