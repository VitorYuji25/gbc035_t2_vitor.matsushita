package ex02;

import java.util.ArrayDeque;
import java.util.Deque;

public class ex02 {
    private static Deque<Object> EstudanteDeque = new ArrayDeque<>();
    public static void main(String[] args) {
       
        EstudanteDoutorado est1 = new EstudanteDoutorado("Bruno","Rua Inverno",
"Tecnologia","Processamento de Imagens","Carros Inteligentes");

        EstudanteDoutorado est2 = new EstudanteDoutorado("Maria","Rua Verão",
"Tecnologia","Processamento de Imagens","Casas Inteligentes");

        EstudanteDoutorado est3 = new EstudanteDoutorado("Ana","Rua Primavera",
"Tecnologia","Processamento de Imagens","Cidades Inteligentes");


        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
        "Vacinas de RNA", "academico","Anticorpos");

        EstudanteDeque.addFirst(est1);
        EstudanteDeque.addLast(eg);
        EstudanteDeque.addFirst(epm);
        EstudanteDeque.addLast(est2);
        EstudanteDeque.addFirst(est3);
        System.out.println("\n\nExibindo os estudantes da fila: \n");
        while(!EstudanteDeque.isEmpty()){
            Object obj = EstudanteDeque.poll();
            if(obj instanceof EstudanteDoutorado){
                ((EstudanteDoutorado)obj).print();
                }else if(obj instanceof EstudanteMestrado){
                    ((EstudanteMestrado)obj).print();
                    }
                    else{
                        ((EstudanteGraduacao)obj).print();
                    }
                }

                //Teste Exception
                try {
                    Object elem = EstudanteDeque.peekFirst();
                    System.out.println("Elemento na posição 1: " + elem);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Erro: " + e.getMessage());
                }

    


    }
}
