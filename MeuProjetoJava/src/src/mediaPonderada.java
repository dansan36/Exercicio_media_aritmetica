import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		
		float nProva1, nProjeto1, nExercicios1, nContribuicao1;
		
		// insira o nome do aluno 
		Scanner inserir = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno");
        String nome = inserir .next();
        System.out.println(nome );
        
        // informe a nota que o aluno obteve no primeiro bimestre
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a nota da Prova do primeiro bimestre");
        nProva1= entrada.nextFloat();
        
        System.out.println("Digite a nota do Projeto do primeiro bimestre");
        nProjeto1= entrada.nextFloat();
        
        System.out.println("Digite a nota dos Exercicio do primeiro Bimestre");
        nExercicios1=entrada.nextFloat();
        
        System.out.println("Digite a nota da Contribuição do Primeiro Bimestre");
        nContribuicao1=entrada.nextFloat();
        
       // agora o usuário deverá informar as notas obtidas no segundo bimestres
        
        
        //variaveis consideradas para calcular as notas do segundo bimestre
        float nProva2, nProjeto2, nExercicios2, nContribuicao2;
        
        
        System.out.println("Digite a nota da Prova do segundo bimestre");
        nProva2= entrada.nextFloat();
        
        System.out.println("Digite a nota do Projeto do segundo bimestre");
        nProjeto2= entrada.nextFloat();
        
        System.out.println("Digite a nota dos Exercicio do segundo Bimestre");
        nExercicios2=entrada.nextFloat();
        
        System.out.println("Digite a nota da Contribuição do segundo Bimestre");
        nContribuicao2=entrada.nextFloat();
        
        
      //variaveis consideradas para calcular as notas do segundo bimestre
        float nProva3, nProjeto3, nExercicios3, nContribuicao3;
        
        
        System.out.println("Digite a nota da Prova do terceiro bimestre");
        nProva3= entrada.nextFloat();
        
        System.out.println("Digite a nota do Projeto do terceiro bimestre");
        nProjeto3= entrada.nextFloat();
        
        System.out.println("Digite a nota dos Exercicio do terceiro Bimestre");
        nExercicios3=entrada.nextFloat();
        
        System.out.println("Digite a nota da Contribuição do Terceiro Bimestre");
        nContribuicao3=entrada.nextFloat();
        
        
        // Somas as notas e calcular a meia do Primeiro Bimestre conforme seu peso
        float notaBimestre1;
        
        
        //prova peso 3, projeto peso 3, exercicios peso 2 e contribuição peso 3
        
        notaBimestre1 =((nProva1 * 3 + nProjeto1 * 3 + nExercicios1 * 2 + nContribuicao1 * 3)/11);
        System.out.println("Sua média no primeiro Bimestre é:"+notaBimestre1 );
        
        
     // Somas as notas e calcular a meia do Segundo Bimestre conforme seu peso, assim como feito para o primeiro
        float notaBimestre2;
        
        notaBimestre2 =((nProva2 * 3 + nProjeto2 * 3 + nExercicios2 * 2 + nContribuicao2 * 3)/11);
        System.out.println("Sua média no Segundo  Bimestre é:"+notaBimestre2 );
        
     // Somas as notas e calcular a meia do Primeiro Bimestre conforme seu peso
        float notaBimestre3;
        notaBimestre3 =((nProva3 * 3 + nProjeto3 * 3 + nExercicios3 * 2 + nContribuicao3 * 3)/11);
        System.out.println("Sua média no Terceiro  Bimestre é:"+notaBimestre3 );
        
        //Informa a lógica para  que o aluno foi aprovado, está de recuperação e de quanto ele precisará para ser aprovado
        float mediaSemestral;
        mediaSemestral= ((notaBimestre1+notaBimestre2+notaBimestre3)/3);
        System.out.println("Sua Média Semestral é "+ mediaSemestral );
        
       if (mediaSemestral >= 8) {
    	   System.out.println("Parabéns " + nome+ " Voçê foi aprovado sua média semestral é "+ mediaSemestral );
    	   
    	  
       }
       
       else if (mediaSemestral <8) {
    	   
    	   System.out.println("Olá "+nome+" infelizmente voçe está de recuperação, pois sua média semstral é "+ mediaSemestral);
    	   
    	   
       }
       
       if (mediaSemestral <8) {
    	   float pontuacaoNecessaria;
    	   pontuacaoNecessaria=(10-mediaSemestral);
    	   System.out.println("Olá "+ nome + "Voçê precisa obter " + pontuacaoNecessaria + "na prova final para ser aprovado ");
    	   
    	   
    	   
    	   
       }
       
       
       
       
       
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
		
		
		
	
		
		
		

	}

}
