package ExercíciosPoo;

public class TestePaciente {
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente ("Fernando", "Fernandes","Cardoso", 40 ,2,70,27);
		
		paciente1.imprimirInfo();
		System.out.println ("\n\t\t********O PACIENTE ESTÁ COM FEBRE :( ********");
		paciente1.setTemperatura(37);
		paciente1.imprimirInfo();
		
		System.out.println ("\n\t\t********O CLIENTE MELHOROU APÓS O USO DE DIPIRONA :) ********");
		

	}

}
