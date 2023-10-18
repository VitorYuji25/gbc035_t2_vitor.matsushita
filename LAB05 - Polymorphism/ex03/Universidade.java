package ex03;
/*
 * 
Copie o exemplo Estudante disponível na pasta 'samples/polimorfismo'. Crie uma classe Universidade, que tem como propriedade o nome da Universidade e a data de Fundação. A universidade possui no máximo 100 alunos, que podem ser de graduação e pós-graduação. 

(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui (para facilitar, é permitido instanciar os alunos no próprio código)

(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente o título da tese a linha de pesquisa

(c) Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto - não há necessidade de duplicar o objeto na memóra). Percorra o vetor e mostre as informações completas dos alunos.

(d) Faça, para as classes de estudante de graduação, estudante de mestrado e estudante de doutorado, uma *sobrecarga* do método print(), fazendo receber como parâmetro um valor booleano que indica se o print será na mesma linha ou em várias linhas. No caso da mesma linha, são mostrados todos os atributos da classe separados por ponto e vírgula. No caso de várias linhas, cada atributo é exibido em uma linha diferente.

(e)  Referente ao exercício anterior, é possível utilizar o recém criado método print(boolean) em um polimorfismo tendo como base um vetor da classe Estudante? Justifique. Caso não seja possível, altere somente o código da classe Estudante para que passe a ser possível. O que ocorre neste caso com a classe Estudante de Pós-gradução?
 */

import java.util.Scanner;

import javax.xml.crypto.Data;

public class Universidade extends Estudante{
    
    private String nome_universidade;
    private Data data_fundacao;
    private int qtdmax_estudantes_garduacao = 100;
    private int qtdmax_estudantes_posgrad = 100;

    public Universidade(String nome, String endereco, String nome_universidade, Data data_fundacao) {
        super(nome, endereco);
        this.nome_universidade = nome_universidade;
        this.data_fundacao = data_fundacao;
    }

    public String getNome_universidade() {
        return nome_universidade;
    }

    public void setNome_universidade(String nome_universidade) {
        this.nome_universidade = nome_universidade;
    }

    public Data getData_fundacao() {
        return data_fundacao;
    }

    public void setData_fundacao(Data data_fundacao) {
        this.data_fundacao = data_fundacao;
    }
    
    public int getQtdmax_estudantes_garduacao() {
        return qtdmax_estudantes_garduacao;
    }

    public int getQtdmax_estudantes_posgrad() {
        return qtdmax_estudantes_posgrad;
    }

    public static void main(String[] args){

    Estudante[] estudante_grad = new Estudante[getQtdmax_estudantes_garduacao()];
    Estudante [] estudante_pos = new Estudante[getQtdmax_estudantes_posgrad()];
    Scanner scanner = new Scanner (System.in);

    int qtd_est_grad = 0;
    int qtd_est_posgrad = 0;
    int qtd_est_mestrado = 0;
    int qtd_est_doutorado = 0;

    for (int i;i<2;i+=1){
    estudante_grad[i] = new EstudanteGraduacao("joao","Rua tal","Jaca");
    estudante_pos[i] = new EstudantePosGrad("joao","Rua tal","Bio","JAVA");
    }

    public void mostra_estdudantes(){
        System.out.println ("A quantidade de estudantes de graduação eh: "+ estudante_grad.length);
        System.out.println ("A quantidade de estudantes de pos-graduação eh: "+ estudante_pos.length);
        System.out.println ("A quantidade de estudantes de Mestrado eh: "+ qtd_est_mestrado);
        System.out.println ("A quantidade de estudantes de Doutorado eh: "+ qtd_est_doutorado);
    }
}
}