package ex04;



/*
 * # Ex04
Teste de chamada de herança
 Faça um programa que contenha três classes: C1; C2; C3

- A classe C1 é base da Classe C2, que por sua vez é base da Classe C3
- Para cada classe, inclua um atributo público, protegido e privado (pode ser de qualquer tipo)
- Para cada classe, construa um construtor padrão sem parâmetros e um construtor com parâmetros
- Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor. Por exemplo, para C1:
  "Classe C1: chamada do construtor padrao, sem parametros"
  "Classe C3: chamada do construtor com parametros"
- Na classe C3 inclua um construtor que use o "super" para chamar o construtor da classe C2 com parâmetro
- Em todas as classes, inclua um método que chama mostar_atributos, que mostra os valores de *todos* os atributos de um objeto (não utilizar *super*)
- Lembre que as classes herdam os atributos, inclusive os privados - e esses também devem ser mostrados 
- Em todas as classes, inclua um método que chama mostar_atributos_super, que mostra os valores de *todos* os atributos de um objeto e que utilize *super*
 */

public class class3 extends class2{
    public int dia;
    protected int mes;
    private int ano;

    public class3(){
        super();
        System.out.println("Construct 3");
        
    }

    public class3(String nome, int idade, String pais, String sexo, double altura, double peso, int dia, int mes,
            int ano) {
        super(nome, idade, pais, sexo, altura, peso);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String mostra_atributos() {
        return  "class3 [nome=" + nome + ", idade=" + idade + ", pais=" + getPais() + "sexo=" + sexo + ", altura=" + altura + ", peso=" + getPeso() + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
    }

    @Override
    public String mostra_atributos_super() {
        return  super.mostra_atributos_super() + "class3 ["+ "dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
    }

    

    
    
}
