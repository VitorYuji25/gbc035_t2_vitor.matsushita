import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        funcionario[] func = new funcionario[3];
        Scanner sc = new Scanner(System.in);
        double porcentagem;

        for(int i =0;i < func.length;i++){
        //String nome, int cpf, double salario,double teto_sal
        func[i] = new funcionario("Joaquim",369,3000,6000);
        System.out.println("Digite a porcentagem a ser aumentada no salario do funcionario: "+func[i].getNome());
        porcentagem = sc.nextDouble();
        try {
            func[i].aumentaSalario(porcentagem);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }finally{
            System.out.println(func[i].getSalario());
        }
    }
  sc.close();
}
    
}
