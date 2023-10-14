package ex01;/*
 * # Ex 01
Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas. Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir: 

Chefe: salário fixo e predefinido;
Vendedor: valor fixo + comissão X vendas;
Operario: valor por produção X quantidade produzida;
Horista: valor por hora X total de horas trabalhadas.


Crie as classes correspondentes, adicionando atributos e métodos que achar necessário. A classe *Funcionario* deve incluir os campos privados *nome*, *dataNascimento* e *salario*. Além disso, crie uma classe *Empresa*, que conterá o método *main()*. A empresa tem vários funcionários, logo crie um vetor (array)  de *funcionários*. Adicione a ele ao menos um tipo de cada funcionário definido anteriormente. Criar também uma classe {FolhaPagamento}, que lê dados referentes ao conjunto de empregados de uma empresa e mostra a folha de pagamento da empresa.

* Criar o vetor utilizando variáveis do tipo Funcionário, mas instancie os objetos com elementos das subclasses de Funcionario (polimorfismo) *

 */

import java.time.LocalDate;

public class operario extends funcionario{

    private double salario_operario;
    private int qtd_prod;
    private double val_prod = 200;

    public operario(){
        super();
    }

    public operario(String nome, LocalDate dataNascimento, double salario, double salario_operario, int qtd_prod,
            double val_prod) {
        super(nome, dataNascimento, salario);
        this.salario_operario = salario_operario;
        this.qtd_prod = qtd_prod;
        this.val_prod = val_prod;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public LocalDate getDataNascimento() {
        return super.getDataNascimento();
    }
    @Override
    public void setDataNascimento(LocalDate dataNascimento) {
        super.setDataNascimento(dataNascimento);
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(double salario_operario) {
        super.setSalario(salario_operario + (val_prod * qtd_prod));
    }

    
    
}
