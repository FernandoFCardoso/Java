package ExercíciosPoo;

public class Paciente {
	
	private String primeiroNome;
	private String segundoNome;
	private String ultimoNome;
	private float temperatura;
	private float altura;
	private float peso;
    private int idade;
    
	public Paciente (String primeiro, String meio, String ultimo, float temperatura, float altura, float peso, int idade)
	{
		primeiroNome = primeiro;
		segundoNome = meio;
		ultimoNome = ultimo;
		this.setTemperatura(temperatura);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setIdade(idade);
	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+ segundoNome +" "+ ultimoNome;
		return nomeCompleto;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n " + this.getNomeCompleto() + " Sua temperatura é de " + temperatura+
				" ºC "  
				+altura+ " metros " 
				+ peso+ " kilos " 
				+idade+ " anos " );
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
