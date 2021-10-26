package Exercícios;

import java.util.Scanner;

public class LacosDecisao1 {

	public static void main(String[] args) {
		

	
        double n1, n2, n3, numMaior=0;
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println ("\n Insira o primeiro número: ");
         n1= leia.nextDouble();
         System.out.println ("\n Insira o segundo número: ");
         n2= leia.nextDouble();
         System.out.println ("\n Insira o terceiro número: ");
         n3= leia.nextDouble();
        
        
       if (n1>numMaior && n1>n2)
    		   {
    			   numMaior=n1;
    			   System.out.println ("\n O maior número é: " +numMaior);
    		   }
    		   else if (n2>n1 && n2>n3)
    		   {
    			   numMaior=n2;
    			   System.out.println ("\n O maior número é: " +numMaior);
    		   }
    		   else
    		   {
    			   numMaior=n3;
    		       System.out.println ("\n O maior número é: " +numMaior);
    		   }
        
	}
}
