package Exerc�cios;

import java.util.Scanner;

public class Lrep2for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  impar=0, par=0, num,x;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		for ( x=1; x<=10; x++);
		{
		System.out.println("\n Entre com um n�mero: ");
		num = leia.nextInt();
		
	     if (x%2==0)
	     {
	    	 par++;
	     }
	        
	     else 
	     {
	    	 impar ++;
	     }
	     
		}
		
		System.out.printf("voc� informou %d n�meros pares"
				+ ",%n e %d n�meros impares",par,impar);
	}

}
