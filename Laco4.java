package Exercícios;

import java.util.Scanner;

public class Laco4 {

	public static void main(String[] args) {
		
		int numero;
		double resultado;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println ("\n Entre com o número: ");
		numero = ler.nextInt();
		
		if (numero%2 == 0)
		{
			resultado = Math.sqrt(numero);
		}
		else 
		{
			resultado = Math.pow(numero, 2);
		}
		
		System.out.println ("\n Resultado: " +resultado);
		
	}

}
