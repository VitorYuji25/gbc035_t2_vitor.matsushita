package ex05;
/*
 * # Ex05
Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas.
 Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir: 

Chefe: salário fixo e predefinido;
Vendedor: valor fixo + comissão * vendas;
Operario: valor por produção * quantidade produzida;
Horista: valor por hora * total de horas trabalhadas.


Crie as classes correspondentes, adicionando atributos e métodos que achar necessários. 
A classe *Funcionario* deve incluir os campos privados *nome*, *dataNascimento* e *salario*. 
 disso, crie uma classe *Empresa*, que conterá o método *main()*. 
 A empresa tem vários funcionários, logo crie um vetor (array) para cada tipo de funcionário, 
 instancie no mínimo 2 exemplos de cada tipo de funcionário. Mostre uma chamada para cálculo do salário
 */
public class operario extends funcionario{

    private double salario;
    private int qtd_prod;
    private double val_prod = 200;


    public operario(){
        this.val_prod = 200;
    }


    public operario(double salario_operario, int qtd_prod, double val_prod) {
        this.salario = salario_operario;
        this.qtd_prod = qtd_prod;
        this.val_prod = val_prod;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario_operario) {
        this.salario = salario_operario + (val_prod * qtd_prod);
    }

    
    
}
