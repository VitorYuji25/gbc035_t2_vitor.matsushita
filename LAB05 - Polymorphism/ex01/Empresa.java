package ex01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
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
public class Empresa {

    public static void main(String[] args){
        funcionario[] func = new funcionario[4];
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        

    String nome;
    String data_nascimento;
    double salario;

    for(int i = 0;i<1;i++){
    func[i] = new chefe();
    System.out.format("Digite o nome do chefe[%d]: ",i);
    nome=sc.nextLine();
    ((chefe) func[i]).setNome(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    ((chefe) func[i]).setDataNascimento(dataNascimento);
    System.out.format("Digite o salario do chefe[%d]: ",i);
    salario = sc.nextDouble();
    ((chefe) func[i]).setSalario(salario);
    sc.nextLine();
    }
    for(int k = 1;k<2;k++){
    func[k] = new operario();
    System.out.format("Digite o nome do operario[%d]: ",k);
    nome=sc.nextLine();
    ((operario)func[k]).setNome(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    ((operario)func[k]).setDataNascimento(dataNascimento);
    System.out.format("Digite o salario do operario[%d]: ",k);
    salario = sc.nextDouble();
    ((operario) func[k]).setSalario(salario);
    sc.nextLine();
    }
    for(int i = 2;i<3;i++){
    func[i] = new horista();
    System.out.format("Digite o nome do horista[%d]: ",i);
    nome=sc.nextLine();
    ((horista)func[i]).setNome(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    ((horista)func[i]).setDataNascimento(dataNascimento);
    System.out.format("Digite o salario do horista[%d]: ",i);
    salario = sc.nextDouble();
    ((horista)func[i]).setSalario(salario);
    sc.nextLine();
    }
    for(int i = 3;i<4;i++){
    func[i] = new vendedor();
    System.out.format("Digite o nome do vendedor[%d]: ",i);
    nome=sc.nextLine();
    ((vendedor)func[i]).setNome(nome);
    System.out.println("\nData nascimento (AAAA/MM/DD): ");
    data_nascimento = sc.next();
    LocalDate dataNascimento = LocalDate.parse(data_nascimento,date);
    ((vendedor)func[i]).setDataNascimento(dataNascimento);
    System.out.format("Digite o salario do vendedor[%d]: ",i);
    salario = sc.nextDouble();
    ((vendedor)func[i]).setSalario(salario);
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
