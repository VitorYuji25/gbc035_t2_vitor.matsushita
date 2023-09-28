package ex06;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ingresso[] ticket = new ingresso[4];

    ticket[0] = new normal();
    ticket[1] = new vip();
    ticket[2] = new vip();
    ticket[3] = new normal();

    for(int j=0;j<4;j++){
        System.out.println("==========================");
        System.out.println(ticket[j].getValor());
        System.out.println("==========================");
            }
    
            sc.close();
    
    
}
}
