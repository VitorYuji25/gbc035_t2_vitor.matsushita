import java.util.Scanner;

public class AlteraPreco {
    public static void main(String[] args) {

        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtd_estoque = new int[4];
        int op = 0;
        float porcentagem;
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i< 4; i++)
        {
            System.out.format("\nDigite o nome do produto [#%d]: ",i);
            nome[i] = leia.nextLine();
            System.out.format("\nDigite o valor de compra da %s: R$",nome[i]);
            preco[i] =leia.nextFloat();
            System.out.format("\nDigite a quantidadde em estoque da %s: ",nome[i]);
            qtd_estoque[i] = leia.nextInt();
            leia.nextLine();
        }
        for (int i = 0; i< 4; i++){
        System.out.format("O nomes dos produto eh: %s e seu preço eh: %.0f e sua quantidade em estoque eh: %d \n",nome[i],preco[i],qtd_estoque[i]);
            
        }
        while (op != 5){
            System.out.println("Qual o produto que tera seu preco a ser alterado: ");
            System.out.format("\nOpcao 0: %s",nome[0]);
            System.out.format("\nOpcao 1: %s",nome[1]);
            System.out.format("\nOpcao 2: %s",nome[2]);
            System.out.format("\nOpcao 3: %s",nome[3]);
            System.out.println("\nSair 5");
            op = leia.nextInt();
            switch (op){
                case 0 -> {
                   System.out.println("Qual a porcentagem alterada: ");
                    porcentagem = leia.nextFloat();

                    preco[op] = (alterapreco(preco[op],porcentagem));
                    System.out.printf("%nO novo valor é:%f",preco[op]);

                
                if((alterapreco(preco[op],porcentagem))==-1){
                    System.out.printf("Erro ao atualizar!");
                }
            }
                case 1 ->{
                 System.out.println("Qual a porcentagem alterada: ");
                    porcentagem = leia.nextFloat();

                    preco[op] = (alterapreco(preco[op],porcentagem));
                    System.out.printf("%nO novo valor é:%f",preco[op]);

                
                if((alterapreco(preco[op],porcentagem))==-1){
                    System.out.printf("Erro ao atualizar!");
                }
            }
            case 2 ->{
                System.out.println("Qual a porcentagem alterada: ");
                    porcentagem = leia.nextFloat();

                    preco[op] = (alterapreco(preco[op],porcentagem));
                    System.out.printf("%nO novo valor é:%f",preco[op]);

                
                if((alterapreco(preco[op],porcentagem))==-1){
                    System.out.printf("Erro ao atualizar!");
                }
            }
            case 3 ->{
                System.out.println("Qual a porcentagem alterada: ");
                    porcentagem = leia.nextFloat();

                    preco[op] = (alterapreco(preco[op],porcentagem));
                    System.out.printf("%nO novo valor é:%f",preco[op]);

                
                if((alterapreco(preco[op],porcentagem))==-1){
                    System.out.printf("Erro ao atualizar!");
                }
            }
                default->{
                    System.out.println("Opcao Invalida");
                }
                }

            }
            
        }
    
    public static float alterapreco(float preco, float porcentagem){
        float temp;

        if(porcentagem > -100) {
            temp = 1 + porcentagem / 100;
            preco = preco * temp;
            return preco; //Sucesso
        }
        else{
            return -1; //Erro
        }

    }
}

