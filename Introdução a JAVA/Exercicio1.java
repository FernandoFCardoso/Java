package TreinamentoJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int ano=365, mes=30, dia, totalDia, anoF, mesF;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\n Insira o sua idade: ");
		anoF = leia.nextInt();
		System.out.println("\n Insira quantidade de mês após o seu: ");
		mesF = leia.nextInt();
		System.out.println("\n Insira os dias que já passaram do seu aniversário: ");
		dia = leia.nextInt();
		
		totalDia = ((anoF*ano ) + (mesF*mes) + dia );
		
		System.out.println("\n Você viveu: " + totalDia+ "dias");
		
		
	}

}
