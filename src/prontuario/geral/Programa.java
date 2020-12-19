package prontuario.geral;

public class Programa {

	public static void main(String[] args) {
		


		System.out.println(Paciente.getContador());
		
		PacienteOncologico po1 = new PacienteOncologico("111", "Gustavo", 'A', '+', 1.7f, 80f, 0, 0);
		
		PacienteOncologico po2 = new PacienteOncologico("111", "Gustavo", 'A', '+', 1.7f, 80f, 0, 0);
		
		PacienteOncologico po3 = new PacienteOncologico("111", "Gustavo", 'A', '+', 1.7f, 80f, 0, 0);
		
		PacienteOncologico po4 = new PacienteOncologico("111", "Gustavo", 'A', '+', 1.7f, 80f, 0, 0);
				
		System.out.println(Paciente.getContador());
		
	}
}
