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

public class horista extends funcionario{

    private double salario;
    private double val_hora;
    private int qtd_horas;

    public horista(){
        this.val_hora = 200;
    }


    public horista(double salario_horista, double val_hora, int qtd_horas) {
        this.salario = salario_horista;
        this.val_hora = val_hora;
        this.qtd_horas = qtd_horas;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario_horista) {
        this.salario = salario_horista + (val_hora*qtd_horas);
    }

    
    
}
