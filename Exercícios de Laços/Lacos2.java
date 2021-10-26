package Exercícios;

import java.util.Scanner;

public class Lacos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println ("\n Insirea o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println ("\n Insira o segundo número: ");
		n2 = leia.nextInt();
		System.out.println ("\n Insira o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1 <= n2 && n2 <= n3)
		{
			System.out.println ("\n"+n1 +"\n"+ n2+"\n" + n3);
		}
		
		else if (n1<=n3 && n3<=n2)
		{
			System.out.println ("\n"+n1 +"\n"+n3 +"\n"+n2);
		}
		
		else if (n2 <= n1 && n1 <= n3)
		{
			System.out.println ("\n" +n2+"\n"+n1 + "\n"+n3);
		}
		
		else if (n2 <= n3 && n3 <= n2)
		{
			System.out.println ("\n" +n2+"\n" +n3+"\n" +n1);
		}
		else if (n3<= n1 && n1 <= n2)
		{
			System.out.println ("\n" +n3+"\n" +n1 +"\n" +n2);
		}
		else 
		{
			System.out.println ("\n" +n3+"\n" +n2+"\n" +n1);
		}
	}
     
	
	
}
