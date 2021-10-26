package Exercícios;

import java.util.Scanner;

public class Lacos3 {

	public static void main(String[] args) {
		
		int Idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("\n Insira sua idade: ");
		Idade = leia.nextInt();
		
		
		
		if (Idade<=10 && Idade<=14)
		{
			System.out.println ("\n Seu filho esta na categoria infantil");
		}
		
		else if (Idade>=15 && Idade <=17)
		{
			System.out.println ("\n Seu filho esta na categoria juvenil");
		}
		else if (Idade >=18 && Idade <=25)
		{
			System.out.println ("\n Seu filho esta na categoria adulto");
		}
		else if (Idade<10 || Idade>25)
		{
			System.out.println ("\n Seu filho não tem categoria");
		}
			
	}

}