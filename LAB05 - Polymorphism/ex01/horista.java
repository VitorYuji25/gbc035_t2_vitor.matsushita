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

public class horista extends funcionario{

    private double salario;
    private double val_hora;
    private int qtd_horas;

    public horista(){
        super();
        this.val_hora = 200;
    }


    public horista(double salario_horista, double val_hora, int qtd_horas) {
        this.salario = salario_horista;
        this.val_hora = val_hora;
        this.qtd_horas = qtd_horas;
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

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario_horista) {
        this.salario = salario_horista + (val_hora*qtd_horas);
    }

    
    
}
