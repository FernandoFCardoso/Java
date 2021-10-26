package TreinamentoJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		
		double totEvento, hora, min, seg;
		
		System.out.println("\n Insira a quantidade de segundos: ");
		totEvento = leia.nextInt();
		
		hora = (totEvento / 3600);
		min = ((totEvento % 3600)/60); // divide e pega  PORRA da SOBRAAAA seu merda
        seg = (totEvento % 3600)%60;
        
        System.out.println("\n "+hora +"\n "+ min +"\n "+ seg);
        
	}

}
