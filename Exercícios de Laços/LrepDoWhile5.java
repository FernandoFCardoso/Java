package Exerc�cios;

import java.util.Scanner;

public class LrepDoWhile5 {
	
	public static void main(String[] args) {
		
		int numero, x=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		
	    do 
		{
	    	System.out.println("\n Insira um n�mero: ");
	    	numero = leia.nextInt();
	    	
	    	x+=numero;
	    	}
	    
		while (numero!=0);
	    System.out.println("\n A soma dos n�meros: "+x);
		      
	}    

}