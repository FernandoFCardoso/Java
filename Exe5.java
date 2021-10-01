package Exercícios;

import java.util.Scanner;

public class Exe5 { 
	
	public static void main(String[] args) {
		
	int n1, n2, n3;
	double n1_2, n2_3, n3_5, M;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\n Valor de n1: ");
	n1=leia.nextInt();
	System.out.println("\n Valor de n1: ");
	n2=leia.nextInt();
	System.out.println("\n Valor de n1: ");
	n3=leia.nextInt();
	
	
	
	n1_2= n1*2;
    n2_3= n2*3;
	n3_5= n3*5;
	M= (n1_2+n2_3+n3_5)/3;
	
	System.out.println("A média do aluno é de M: "+M);
	
	}


}
