package ex05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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

public class Empresa {

    public static void main(String[] args){
        funcionario[] func = new funcionario[8];
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        

    String nome;
    String data_nascimento;
    double salario;

    for(int i = 0;i<2;i++){
    func[i] = new chefe();
    System.out.format("Digite o nome do chefe[%d]: ",i);
    nome=sc.nextLine();
    func[i].setNome(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    func[i].setDataNascimento(dataNascimento);
    System.out.format("Digite o salario do chefe[%d]: ",i);
    salario = sc.nextDouble();
    func[i].setSalario(salario);
    sc.nextLine();
    }
    for(int k = 2;k<4;k++){
    func[k] = new operario();
    System.out.format("Digite o nome do operario[%d]: ",k);
    nome=sc.nextLine();
    func[k].setNome(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    func[k].setDataNascimento(dataNascimento);
    System.out.format("Digite o salario do operario[%d]: ",k);
    salario = sc.nextDouble();
    func[k].setSalario(salario);
    sc.nextLine();
    }
    for(int i = 4;i<6;i++){
    func[i] = new horista();
    System.out.format("Digite o nome do horista[%d]: ",i);
    nome=sc.nextLine();
    func[i].setNome(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    func[i].setDataNascimento(dataNascimento);
    System.out.format("Digite o salario do horista[%d]: ",i);
    salario = sc.nextDouble();
    func[i].setSalario(salario);
    sc.nextLine();
    }
    for(int i = 6;i<8;i++){
    func[i] = new vendedor();
    System.out.format("Digite o nome do vendedor[%d]: ",i);
    nome=sc.nextLine();
    func[i].setNome(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    func[i].setDataNascimento(dataNascimento);
    System.out.format("Digite o salario do vendedor[%d]: ",i);
    salario = sc.nextDouble();
    func[i].setSalario(salario);
    sc.nextLine();
    }

        for(int j=0;j<func.length;j++){
    System.out.println("==========================");
    System.out.println(func[j].getNome());
    System.out.println(func[j].getDataNascimento());
    System.out.println(func[j].getSalario());
    System.out.println("==========================");
        }

        sc.close();
      
    }
    
}
