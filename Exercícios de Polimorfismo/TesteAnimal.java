package ExercíciosPoo;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		
		Cachorro dog1 = new Cachorro (27,"Flofis", 7, "AuuuuAuuu");
		
		dog1.imprimirInfo();
		
		Cavalo horse1 = new Cavalo (80, "Spirit", 89, "HIHIHI",50);
		
		horse1.imprimirInfo();
		
		Preguica soninho1 = new Preguica ("Fernando", 100, "Onomatopéia Bocejo", "24","12");
		
		soninho1.imprimirInfo();
		
	}

}
