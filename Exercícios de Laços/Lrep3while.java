package Exercícios;

import java.util.Scanner;

public class Lrep3while {
	public static void main(String[] args) {
		
		int idade,x=0 , y=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println ("\n Entre com sua idade: ");
		idade = leia.nextInt();
		
	     while (idade!=-99)
	     {
	    	 
	    	 if (idade <=21 && idade>0)
	    	 {
	    	     x++;
	    	 }
	    	 
	    	 else if (idade >=50)
	    	 {
	    		 y++;
	    	 }
	    	 System.out.println ("\n Entre com sua idade: ");
	 		idade = leia.nextInt();
	     }
	    	System.out.println("\n O número de idade menor que 21 é de: " +x+ "\n A idade com maiores de 50 é de "+y); 
	    	 
	     
	     
		
		
	
		
		
		
		
		
	}

}
