package ex01;

import java.time.LocalDate;
/*
 * # Ex 01
Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas. Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir: 

Chefe: salário fixo e predefinido;
Vendedor: valor fixo + comissão X vendas;
Operario: valor por produção X quantidade produzida;
Horista: valor por hora X total de horas trabalhadas.


Crie as classes correspondentes, adicionando atributos e métodos que achar necessário. A classe *Funcionario* deve incluir os campos privados *nome*, *dataNascimento* e *salario*. Além disso, crie uma classe *Empresa*, que conterá o método *main()*. A empresa tem vários funcionários, logo crie um vetor (array)  de *funcionários*. Adicione a ele ao menos um tipo de cada funcionário definido anteriormente. Criar também uma classe {FolhaPagamento}, que lê dados referentes ao conjunto de empregados de uma empresa e mostra a folha de pagamento da empresa.

* Criar o vetor utilizando variáveis do tipo Funcionário, mas instancie os objetos com elementos das subclasses de Funcionario (polimorfismo) *

 */


public class funcionario {

    private String nome;
    private LocalDate dataNascimento;
    private double salario;


    public funcionario() {
    
    }
    public funcionario(String nome, LocalDate dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String MostraDados() {
        return "funcionario [nome=" + nome + ", dataNascimento=" + dataNascimento + ", salario=" + salario + "]";
    }
    
    

    

    
    
}
