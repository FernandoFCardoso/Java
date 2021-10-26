package ExercíciosPoo;

public class Cavalo extends Animal{
	
	private int correr;
	private int salto;
	
	public Cavalo (int correr, String nome, int idade, String emitirSom, int salto)
	{
		super(nome, idade, emitirSom);
		this.correr=correr;
		this.salto=salto;
	}
	
	public void imprimirInfo()
	{
		System.out.println ("\t\t\n*********" + getNome() +"*********"+ "\n"+ " Tem a idade de "+ getIdade() + " anos" + "\n Ele(a) faz: " 
	+getEmitirSom()+"\n Atinge a velocidade de " +correr+" Km/h"+ "\n Ele salta " +salto+ " metros");
	}

	public int getCorrer() {
		return correr;
	}

	public void setCorrer(int correr) {
		this.correr = correr;
	}

	public int getSalto() {
		return salto;
	}

	public void setSalto(int salto) {
		this.salto = salto;
	}
	
	

}
