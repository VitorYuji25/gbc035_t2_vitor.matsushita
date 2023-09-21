package ex01;
/*# Ex01 
- Faça um pequeno programa que utiliza o conceito de Associação
- os objetos são independentes?
*/

//OBJETOS SÃO INDEPENDENTES

import java.util.Scanner;

public class ex01{
    public static void main(String[] args){
        Pneu p1 = new Pneu();
        Pneu p2 = new Pneu();
        Pneu p3 = new Pneu();
        Pneu p4 = new Pneu();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modelo do pneu1: ");
        p1.setModelo(sc.nextLine());
        System.out.println("Digite o modelo do pneu2: ");
        p2.setModelo(sc.nextLine());
        System.out.println("Digite o modelo do pneu3: ");
        p3.setModelo(sc.nextLine());
        System.out.println("Digite o modelo do pneu4: ");
        p4.setModelo(sc.nextLine());


        System.out.printf("%s\n", p1.getModelo() );
        System.out.printf("%s\n", p2.getModelo() );
        System.out.printf("%s\n", p3.getModelo() );
        System.out.printf("%s\n", p4.getModelo() );


        
    
    }

}