public class funcionario {
    private String nome;
    private int CPF;
    private double salario;
    private double teto_sal;

    public funcionario(){
        this.nome = "";
        this.CPF = 0;
        this.salario = 0;
        this.teto_sal = 40000;
    }


    public funcionario(String nome, int cpf, double salario,double teto_sal) {
        this.nome = nome;
        this.CPF = cpf;
        this.salario = salario;
        this.teto_sal = teto_sal;

    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCPF() {
        return CPF;
    }


    public void setCPF(int cPF) {
        CPF = cPF;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double getTeto_sal() {
        return teto_sal;
    }


    public void setTeto_sal(double teto_sal) {
        this.teto_sal = teto_sal;
    }


    /*
    - Crie um método para aumentar o salário, 
      passando como parâmetro um valor porcentual.
    - Note que o método pode gerar valores inválidos. 
      É possível que o salário fique negativo ou que atinja um valor acima do teto. 
      Não deixe que isso ocorra. Para retornar o erro, crie uma classe de exceção que herde 
      a classe .IllegalArgumentException (essa classe, por sua vez, herda RuntimeException).
     */
    // Método para aumentar o salário
    public void aumentaSalario(double percentual) throws RuntimeException{
        if(percentual < 0){
            throw new IllegalArgumentException("O percentual deve ser positivo");
        }else{
        }if(percentual > teto_sal){
            throw new IllegalArgumentException("O percentual ultrapassa o teto salarial");
        }else{
            setSalario(getSalario()+(getSalario()*percentual)/100);
        }
        
    }

    

    
}
