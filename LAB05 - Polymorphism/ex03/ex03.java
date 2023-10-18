package ex03;

/*
 * Copie o exemplo Estudante disponível na pasta 'samples/polimorfismo'. Crie uma classe Universidade, que tem como propriedade o nome da Universidade e a data de Fundação. A universidade possui no máximo 100 alunos, que podem ser de graduação e pós-graduação. 

(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui (para facilitar, é permitido instanciar os alunos no próprio código)

(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente o título da tese a linha de pesquisa

(c) Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto - não há necessidade de duplicar o objeto na memóra). Percorra o vetor e mostre as informações completas dos alunos.

(d) Faça, para as classes de estudante de graduação, estudante de mestrado e estudante de doutorado, uma *sobrecarga* do método print(), fazendo receber como parâmetro um valor booleano que indica se o print será na mesma linha ou em várias linhas. No caso da mesma linha, são mostrados todos os atributos da classe separados por ponto e vírgula. No caso de várias linhas, cada atributo é exibido em uma linha diferente.

(e)  Referente ao exercício anterior, é possível utilizar o recém criado método print(boolean) em um polimorfismo tendo como base um vetor da classe Estudante? Justifique. Caso não seja possível, altere somente o código da classe Estudante para que passe a ser possível. O que ocorre neste caso com a classe Estudante de Pós-gradução?
 */

public class ex03 {
    public static void main(String[] args) {

        Estudante e = new Estudante("Carlos","Rua 1o de Abril");

        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        e.print();


        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());

        ep.print();
        System.out.println("Formação prévia: " + ep.getFormacao());

        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());



        // casos com polimorfismo
        Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        // exemplo de uso com vetor e com CAST
        Estudante[] ev = new Estudante[4];
        ev[0] = eg;
        eg.print();
        eg.getTituloTCC();
        ev[0].print();;
        String x = ((EstudanteGraduacao) ev[0]).getTituloTCC();
        String x2 = ((EstudantePosGrad) ev[0]).getFormacao();



        e2.print();
        eg2.print();
        epd2.print();
        ep2.print();
        epd2.print();
     //   EstudanteDoutorado epd3;
      //  epd3 = (EstudanteDoutorado)epd2;
       // System.out.println(epd3.getTituloTese());
       // System.out.println(((EstudanteDoutorado)epd2).getTituloTese());

/*
        eg2.print();
        System.out.println(eg2.getTituloTCC());

        ep2.print();
        System.out.println(ep2.getFormacao());

        epm2.print();
        System.out.println(epm2.getTituloDissertacao());

*/
        /*
        Estudante e2 = new Estudante();
        Estudante eg2 = new EstudanteGraduacao();
        Estudante ep2 = new EstudantePosGrad();
        Estudante epm2 = new EstudanteMestrado();
        Estudante epd2 = new EstudanteDoutorado();

        //EstudantePosGrad e3 = new Estudante();
        //EstudantePosGrad eg3 = new EstudanteGraduacao();
        */

        // polimorfismo com pós-graduação
        // construtor incompleto
        /*
        EstudantePosGrad ep3 = new EstudantePosGrad();
        EstudantePosGrad epm3 = new EstudanteMestrado();
        EstudantePosGrad epd3 = new EstudanteDoutorado();
        */


}
}
