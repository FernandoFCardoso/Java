package Exercícios;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		

		int dia, mes, ano, dia_ano=365, dia_mes=30,resposta;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o dia: ");
		dia = leia.nextInt();
		System.out.println("\nEntre com o mes: ");
		mes = leia.nextInt();
		System.out.println("\nEntre com o ano: ");
		ano = leia.nextInt();
		
		resposta=((ano*dia_ano) + (mes*dia_mes) + (dia));
		System.out.println("\n A sua idade em dias é de: " + resposta);
		
	}

}

