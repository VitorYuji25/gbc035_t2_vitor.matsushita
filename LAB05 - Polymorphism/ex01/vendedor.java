package ex01;
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

import java.time.LocalDate;

public class vendedor extends funcionario{

    private double salario_vendedor;
    private double salario_fixo;
    private int qtd_vendas;
    private double comissão = 200;

    public vendedor(){
        super();
    }
    
    public vendedor(String nome, LocalDate dataNascimento, double salario, double salario_vendedor, double salario_fixo,
            int qtd_vendas, double comissão) {
        super(nome, dataNascimento, salario);
        this.salario_vendedor = salario_vendedor;
        this.salario_fixo = salario_fixo;
        this.qtd_vendas = qtd_vendas;
        this.comissão = comissão;
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
    public double getSalario_vendedor() {
        return salario_vendedor;
    }

    public void setSalario_vendedor(double salario_vendedor) {
        this.salario_vendedor = salario_vendedor;
    }

    public double getSalario_fixo() {
        return salario_fixo;
    }

    public void setSalario_fixo(double salario_fixo) {
        this.salario_fixo = salario_fixo;
    }

    public int getQtd_vendas() {
        return qtd_vendas;
    }

    public void setQtd_vendas(int qtd_vendas) {
        this.qtd_vendas = qtd_vendas;
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }
    @Override
    public void setSalario(double salario_vendedor) {
        super.setSalario(salario_vendedor + salario_fixo + (qtd_vendas*comissão));
    }

    
    
}
