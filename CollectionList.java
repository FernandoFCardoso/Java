package ExercíciosPoo;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList {
	
	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		
		ArrayList<String> lista = new ArrayList(); // Este Array serve para um "vetor infinito" 
		                                           //(precisa da biblioteca)
		
		
		do // ir fazendo até selecionar a opção 0
		{
			// Menu de opções
			System.out.println("\n*****************************************************************************");
			System.out.println("\n (1) Deseja inserir algum produto na lista?");
			System.out.println("\n (2) Deseja remover algum produto da lista?");		
			System.out.println("\n (3) Deseja atualizar sua lista?");
			System.out.println("\n (4) Deseja ver todos os dados de sua lista?");
			System.out.println("\n (0) Deseja sair do programa?");
			System.out.println("\n*****************************************************************************");
			
			System.out.println("\nDigite sua opção: ");
			
			op = ler.nextInt(); //Variável opção
			
			switch(op) //escolha caso
			{
			
			case 1:
				ler.nextLine();
				System.out.println("\n Insira o produto desejado: ");
				String produto = ler.nextLine();
				lista.add(produto); // Aqui ele vai adicionar o produto dentro da lista
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\n Indique o produto a ser removido: ");
				String removedor = ler.nextLine(); // Aqui remove o produto da lista
				
				if (lista.contains(removedor)) // Se o produto a ser removio o "Removedor" está ai dentro... 
				{
				   lista.remove(removedor);	// Remove este produto
				}
				
				else
				{
					System.out.println("\nProduto em falta :/"); // Se não, Aparece que ele esta em falta
				}	
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nIndique o produto que deseja a alteração");
				String troca = ler.nextLine();
				
				
				if (lista.contains(troca)) // Se o troca esta dentro da lista
				{
					System.out.println("\nIndique o novo produto a ser inserido: "+troca+" :");//Indica o que quer trocar
					String atual = ler.nextLine();//produto atual
					lista.remove(troca); // tirar o produto que trocou
					lista.add(atual);// Adicionar o produto novo
				}
				
				else
				{
					System.out.println("\n " + troca + " está em falta na loja!!!");// Aparece caso nao tenha este produto 
				}
				break;
				
			case 4:
				ler.nextLine();
				System.out.println("\nOs produtos em nosso departmento atualmene são esses:" +lista);//Mostra a lista atual
				break;
			default:
				System.out.println("Desculpe não temos essa opção no sistema :/");
			
			}
			
		}
		while(op!=0);
		
		 
		
	}

}
