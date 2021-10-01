package Exercícios;

import java.util.Scanner;

public class Exe4 { 
	
	public static void main(String[] args) {
		
	int a, b, c;
	double D, S, R;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\n Escreva o valor de a: ");
	a=leia.nextInt();
	System.out.println("\n Escreva o valor de b: ");
	b=leia.nextInt();
	System.out.println("\n Escreva o valor de c: ");
	c=leia.nextInt();
	
	
	
	R=Math.pow((a+b), 2);
	S=Math.pow((b+c), 2);
	
	D=(R+S)/2;
	
	System.out.println("\n Este é o valor de D: " +D);
	
	}


}
