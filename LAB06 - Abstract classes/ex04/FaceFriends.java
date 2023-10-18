package ex04;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FaceFriends {
    private static final Amigos[] Contato = null;

    public static void main(String[] args) {
        new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de contatos");
        int qtdContato = sc.nextInt();
        


        Contato[] contato = new Contato[qtdContato];

        
        Contato[0] = new Amigos("Jaja","Janaina","bababa", 25/10/2023,1);
        
    }
    
}
