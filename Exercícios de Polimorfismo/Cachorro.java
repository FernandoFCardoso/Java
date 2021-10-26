package ExercíciosPoo;

public class Cachorro extends Animal{
	
	private int correr;
	
	public Cachorro (int correr, String nome, int idade, String emitirSom)
	
	{
		super(nome, idade, emitirSom);
		this.correr=correr;
	}

	public void imprimirInfo()
	{
		System.out.println ("\t\t\n*********" + getNome() +"*********"+ " \n Tem a idade de " +getIdade() + " anos " + " \n Ele(a) faz " 
	+getEmitirSom()+"\n Atinge a velocidade de " +correr+"Km/h");
	}
	
	
	public int getCorrer() {
		return correr;
	}

	public void setCorrer(int correr) {
		this.correr = correr;
	}
	
	
	
	
	
}
