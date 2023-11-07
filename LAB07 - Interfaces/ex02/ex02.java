package ex02;

public class ex02 {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[3];
        Produto[] prod = new Produto[3];
        Serviço[] servi = new Serviço[3];

        //Criar um array de 3 clientes, 3 produtos e 3 servico.
        clientes[0] = new Cliente("Laura");
        clientes[1] = new Cliente("Joao");
        clientes[2] = new Cliente("Maria");
        prod[0] = new Produto(687);
        prod[1] = new Produto(599);
        prod[2] = new Produto(748);
        servi[0] = new Serviço(50.87);
        servi[1] = new Serviço(20.50);
        servi[2] = new Serviço(16.50);

        Classificador.ordena(clientes);
        System.out.println(clientes);
        Classificador.ordena(prod);
        System.out.println(prod);
        Classificador.ordena(servi);
        System.out.println(servi);





    
}
}
