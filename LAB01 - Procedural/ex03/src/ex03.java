import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
         /*
        //1.
        Scanner sc = new Scanner(System.in);
        int[] listInt = new int[6];
        int i = 0;

        System.out.println("Digite um valor para a posição #" + (i));
        listInt[0] = sc.nextInt();
        System.out.println("Digite um valor para a posição #" + (i+1));
        listInt[1] = sc.nextInt();
        System.out.println("Digite um valor para a posição #" + (i+1));
        listInt[2] = sc.nextInt();
        System.out.println("Digite um valor para a posição #" + (i+1));
        listInt[3] = sc.nextInt();
        System.out.println("Digite um valor para a posição #" + (i+1));
        listInt[4] = sc.nextInt();
        System.out.println("Digite um valor para a posição #" + (i+1));
        listInt[5] = sc.nextInt();

        System.out.format("A lista de numeros eh:\n%d %d %d %d %d %d",listInt[0],listInt[1],listInt[2],listInt[3],listInt[4],listInt[5]);
        */
        /*
        //2.
        Scanner sc = new Scanner(System.in);
        int[] listInt = new int[6];
        int i = 0;

        while(i <6 ){
            System.out.println("Digite um valor para a posição #" + (i));
            listInt[i] = sc.nextInt();
            i++;
        }
        System.out.println("A lista de numero eh:");
        for(int j=0 ;j<6;j++){
            System.out.format(" %d ",listInt[j]);

        }
        */
        /* 
        // 3.
        Scanner sc = new Scanner(System.in);
        int[] listInt = new int[6];
        int i = 0;

        while(i <6 ){
            System.out.println("Digite um valor para a posição #" + (i));
            listInt[i] = sc.nextInt();
            i++;
        }
        System.out.println("A lista de numero eh:");
        for(int j=5 ;j>=0;j--){
            System.out.format(" %d ",listInt[j]);

        }*/
        /*
        //4.
        Scanner sc = new Scanner(System.in);
        int[] listInt = new int[6];
        int i = 0;
        listInt[0] = -1;

        while(i < 6 ){
            System.out.println("Digite um valor para a posição #" + (i));
            listInt[i] = sc.nextInt();
            if(listInt[i]%2 != 0){
                System.out.println("Valor invalido!!");
            }
            else{
            i++;
            }
        }
        System.out.println("A lista de numero eh:");
        for(int j=0 ;j<listInt.length;j++){
            System.out.format(" %d ",listInt[j]);
        }
        */
        /*
        //5.
        Scanner sc = new Scanner(System.in);
        int[] listInt = new int[5];
        int i = 0;
        int maiorVal=0;
        int menorVal =0;
        double media =0;
        int soma = 0;

        while(i < 5 ){
            System.out.println("Digite um valor para a posição #" + (i));
            listInt[i] = sc.nextInt();
            i++;
        }
        System.out.println("A lista de numero eh:");
        for(int j=0 ;j<listInt.length;j++){
            System.out.format(" %d ",listInt[j]);
            soma = soma + listInt[j];
            if(maiorVal<listInt[j]){
                maiorVal = listInt[j];
            }
            if(menorVal>listInt[j]){
                menorVal = listInt[j];
            }
        }
        media = soma/(listInt.length);
        System.out.format("\nO maior valor eh: %d\n",maiorVal);
        System.out.format("O menor valor eh: %d\n",menorVal);
        System.out.format("A media eh: %f\n",media);
        */
        /* 
        //6.
        Scanner sc = new Scanner(System.in);
        int[] listInt = new int[5];
        int i = 0;
        int maiorVal=0;
        int menorVal =0;
        double media =0;
        int soma = 0;
        int indicemaior = 0;
        int indicemenor = 0;

        while(i < 5 ){
            System.out.println("Digite um valor para a posição #" + (i));
            listInt[i] = sc.nextInt();
            i++;
        }
        System.out.println("A lista de numero eh:");
        for(int j=0 ;j<listInt.length;j++){
            System.out.format(" %d ",listInt[j]);
            soma = soma + listInt[j];
            if(maiorVal<listInt[j]){
                maiorVal = listInt[j];
                indicemaior = j;
            }
            if(menorVal>listInt[j]){
                menorVal = listInt[j];
                indicemenor = j;
            }
        }
        media = soma/(listInt.length);
        System.out.format("\nO maior valor eh: %d com indice: %d\n",maiorVal,indicemaior);
        System.out.format("O menor valor eh: %d com indice: %d\n",menorVal,indicemenor);
        System.out.format("A media eh: %f\n",media);
        */
        /* 
        //7.
        Scanner sc = new Scanner(System.in);
        int[] listInt = new int[5];
        int i = 0;
        int maiorVal=0;

        while(i < 5 ){
            System.out.println("Digite Nota #" + (i));
            listInt[i] = sc.nextInt();
            i++;
        }
        System.out.println("A lista de notas normalizadas eh:");
        for(int j=0 ;j<listInt.length;j++){
            System.out.format(" %d ",listInt[j]*2);
            
        }
        */
        /*
        //8.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        double media = 0;
        double desvioPadrao = 0;

        for (int i=0;i<numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        media = soma/numeros.length;

        for (int i=0; i<numeros.length; i++) {
            desvioPadrao += Math.pow(numeros[i]-media,2);
        }

        desvioPadrao = Math.sqrt(desvioPadrao/(numeros.length - 1));

        System.out.println("Média: " +media);
        System.out.println("Desvio padrão amostral: " +desvioPadrao);
        */
        /*
        //9.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de alunos ");
        int numAlunos = sc.nextInt();
        
        int[] notas = new int[numAlunos];
        int soma = 0;
        double media = 0;

        for (int i=0;i<notas.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            notas[i] = sc.nextInt();
            soma += notas[i];
        }

        media = soma/notas.length;
        System.out.println("A lista de notas eh:");
        for(int j=0 ;j<notas.length;j++){
            System.out.format("Nota do aluno #%d: %d\n ",j,notas[j]);
        }
        System.out.println("Média: " +media);
        */
        /*
        //10.
        Scanner sc = new Scanner(System.in);
        int[] VetA = new int[3];
        int[] VetB = new int[3];
        int[] VetC = new int[3];

        for (int i=0;i<VetA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número de A: ");
            VetA[i] = sc.nextInt();
        }
        for (int j=0;j<VetB.length; j++) {
            System.out.print("Digite o " + (j + 1) + "º número de B: ");
            VetB[j] = sc.nextInt();
        }
        System.out.print("O vetor C eh:(");
        for (int k=0;k<VetC.length; k++) {
            VetC[k] = VetA[k]-VetB[k];
            System.out.format(" %d ",VetC[k]);
            
        }
        System.out.print(").");
        */
        /*
        //11
        Scanner sc = new Scanner(System.in);
        int[] VetV = new int[5];
        int[] VetV1 = new int[5];
        int[] VetV2 = new int[5];

        for (int i=0;i<VetV.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número de V: ");
            VetV[i] = sc.nextInt();
        }

        for(int x=0;x<VetV.length;x++){
             if(VetV[x]%2==0){
                VetV1[x]=VetV[x];
            }
            else{
                VetV2[x]=VetV[x];
            }
        }

        System.out.print("Os Pares sao:(");
        for (int j=0;j<VetV1.length; j++) {
            if(VetV1[j] != 0){
            System.out.format(" %d ",VetV1[j]);
            }
        }
        System.out.print(").");

        System.out.print("\nOs Impares sao:(");
        for (int k=0;k<VetV2.length; k++) {
            if(VetV2[k]!=0){
            System.out.format(" %d ",VetV2[k]);
            }
        }
        System.out.print(").");
        */
        /*
        //12.
        Scanner sc = new Scanner(System.in);
        int azul, verde, amarela, vermelha;
        double totalBol, probAzul, probVerde, probAmarela, probVermelha;

        System.out.print("Digite a quantidade de bolinhas azuis: ");
        azul = sc.nextInt();

        System.out.print("Digite a quantidade de bolinhas verdes: ");
        verde = sc.nextInt();

        System.out.print("Digite a quantidade de bolinhas amarelas: ");
        amarela = sc.nextInt();

        System.out.print("Digite a quantidade de bolinhas vermelhas: ");
        vermelha = sc.nextInt();

        totalBol = azul + verde + amarela + vermelha;

        probAzul = azul/totalBol;
        probVerde = verde/totalBol;
        probAmarela = amarela/totalBol;
        probVermelha = vermelha/totalBol;

        System.out.println("Probabilidade de ocorrência da cor azul: " + probAzul);
        System.out.println("Probabilidade de ocorrência da cor verde: " + probVerde);
        System.out.println("Probabilidade de ocorrência da cor amarela: " + probAmarela);
        System.out.println("Probabilidade de ocorrência da cor vermelha: " + probVermelha);

        if (probAzul > probVerde && probAzul > probAmarela && probAzul > probVermelha) {
            System.out.println("A cor com maior probabilidade é a azul.");
        } else if (probVerde > probAzul && probVerde > probAmarela && probVerde > probVermelha) {
            System.out.println("A cor com maior probabilidade é a verde.");
        } else if (probAmarela > probAzul && probAmarela > probVerde && probAmarela > probVermelha) {
            System.out.println("A cor com maior probabilidade é a amarela.");
        } else if (probVermelha > probAzul && probVermelha > probVerde && probVermelha > probAmarela) {
            System.out.println("A cor com maior probabilidade é a vermelha.");
        } else {
            System.out.println("Há mais de uma cor com a maior probabilidade.");
        }
        */
        /*
        //13
        Scanner sc = new Scanner(System.in);
        int[] Vet = new int[5];

        for (int i=0;i<Vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º do vetor: ");
            Vet[i] = sc.nextInt();
        }

        for(int x=0;x<Vet.length;x++){
             if(Vet[x] < 0 ){
                Vet[x]=0;
            }
        }

        System.out.print("Os valores sao:(");
        for (int j=0;j<Vet.length; j++) {
            System.out.format(" %d ",Vet[j]);
        }
        System.out.print(").");
        */
        /*
        //14.
        Scanner sc = new Scanner(System.in);
        int qtd_Alunos = 0;
        System.out.println("Digite a quantidade de alunos da universidade: ");
        qtd_Alunos = sc.nextInt();
        
        int[] VetMat = new int[qtd_Alunos];
        char[] VetClass = new char[qtd_Alunos];
        float[] VetCRA = new float[qtd_Alunos];

        for (int i=0;i<qtd_Alunos; i++) {
            System.out.print("Digite matricula do aluno: " + (i+1) + "°:" );
            VetMat[i] = sc.nextInt();
            System.out.print("Digite a Classe social do aluno: " + (i+1) + "°:" );
            VetClass[i] = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Digite o CRA do aluno: " + (i+1) + "°:" );
            VetCRA[i] = sc.nextFloat();

        }
        System.out.print("Os alunos cadastrados sao:\n");
        for (int j=0;j<qtd_Alunos; j++) {
            System.out.format("O numero do aluno: %d\nClasse Social: %s\nCRA: %f \n",VetMat[j],VetClass[j],VetCRA[j]);
        }
        */
        //15.
        /*
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] repet = new int[8];

        int contador = 0;
        for(int k = 0;k<vet.length;k++){
            System.out.format("Digite os valores das #%d: ",k);
            vet[k] = sc.nextInt();
        }



        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    boolean valorJaExiste = false;
                    for (int k = 0; k < repet.length; k++) {
                        if (repet[k] == vet[i]) {
                            valorJaExiste = true;
                            break;
                        }
                    }
                    if (!valorJaExiste) {
                        repet[contador] = vet[i];
                        contador++;
                    }
                }
            }
        }
        System.out.println("Valores iguais:");
        for (int i = 0; i < contador; i++) {
            System.out.println(repet[i]);
        }
        */
        //16.
        /*
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] repet = new int[8];

        int contador = 0;
        for(int k = 0;k<vet.length;k++){
            System.out.format("Digite os valores das #%d: ",k);
            vet[k] = sc.nextInt();
        }



        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    boolean valorJaExiste = false;
                    for (int k = 0; k < repet.length; k++) {
                        if (repet[k] == vet[i]) {
                            valorJaExiste = true;
                            break;
                        }
                    }
                    if (!valorJaExiste) {
                        repet[contador] = vet[i];
                        contador++;
                    }
                }
            }
        }
        System.out.println("Valores repetidos são:");
        for (int i = 0; i < contador; i++) {
            System.out.println(repet[i]);
            System.out.format("E aparecem vezes %d\n" ,contador);
        }*/
    }

}