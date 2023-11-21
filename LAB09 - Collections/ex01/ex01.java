/*Ex01 
Copie as classes de Estudante na pasta samples.
Use Collection para criar estrutura de dados como listas, hash, pilhas ou filas (escolher) de estudantes. Implemente pelo menos duas estruturas.

a) Use pelo menos dois métodos disponíveis na interface de cada estrutura (por exemplo, para inserir ou remover os elementos)
b) Faça o uso de import java.util.Collections e use o método sort() para realizar a ordenação de uma das ED escolhidas. Defina um critério para essa ordenação.
*/
package ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

EstudanteDoutorado est1 = new EstudanteDoutorado("Bruno","Rua Inverno",
"Tecnologia","Processamento de Imagens","Carros Inteligentes");

EstudanteDoutorado est2 = new EstudanteDoutorado("Maria","Rua Verão",
"Tecnologia","Processamento de Imagens","Casas Inteligentes");

EstudanteDoutorado est3 = new EstudanteDoutorado("Ana","Rua Primavera",
"Tecnologia","Processamento de Imagens","Cidades Inteligentes");


EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
        "Vacinas de RNA", "academico","Anticorpos");

 // Podemos então criar uma lista com a superclasse comum dessas classes
        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
        estudantes.add(est1); // aluno de doutorado
        estudantes.add(est2);
        estudantes.add(est3);
        estudantes.add(eg); // aluno de graduação
        estudantes.add(epm); // aluno de mestrado

        System.out.println("\n=====  Estudantes (grad/mest/dout)====");

        for (Estudante e : estudantes){
            e.print(); // print é método de estudante, sobrescrito em várias classes
        }


        class EstudanteNome implements Comparator<Estudante> {
        public int compare(Estudante a, Estudante b) {
        return a.getNome().compareTo(b.getNome());
        }
        }

        Collections.sort(estudantes, new EstudanteNome());

        // Interface MAP
        HashMap<Integer,Estudante> map_estudante = new HashMap<Integer,Estudante>();
        map_estudante.put(1,est1);
        map_estudante.put(2,est2);
        map_estudante.put(3,est3);
        map_estudante.put(4,epm);
        map_estudante.put(5,eg);

        int opcao = 0;
        do{
        System.out.println("Digite a opção de ordenação desejada: ");
        System.out.println("[1] ArrayList\n[2] HashMap\n[9] Sair");
        opcao = sc.nextInt();
        if(opcao == 1){
        System.out.println("\n===== Depois de ordenar =====");
        for (Estudante e : estudantes)
            e.print();
        }
        else if(opcao == 2){
        int op = 0;
        Estudante e;
        System.out.println(("Digite a chave do Estudante(1 - 5)\nOu 6 para visualizar todos os estudantes do Hash: "));
        op = sc.nextInt();
        switch (op){
                case (1):
                e = map_estudante.get(1);
                e.print();
                break;
                
                case(2):
                e = map_estudante.get(3);
                e.print();
                break;
                
                case(3):
                e = map_estudante.get(3);
                e.print();
                break;
                
                case(4):
                e = map_estudante.get(4);
                e.print();
                break;
                case(5):
                e = map_estudante.get(5);
                e.print();
                break;
                case(6):
                System.out.println("\n============= MAP =============");

                int i = 1;
                for (Estudante est : estudantes){
                est = map_estudante.get(i);
                est.print();
                 }
                break;
                 
        }
        }
        }while(opcao != 9);

       sc.close();
        }
    }

