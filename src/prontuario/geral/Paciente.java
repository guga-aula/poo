package prontuario.geral;

public class Paciente {

	String cpf;
	String nome;
	char tipoSanguineo;
	char fatorRH;
	float altura;
	float peso;
	
	static int CONTADOR_INSTANCIAS = 0;
	
	public Paciente(String cpf, String nome, char tipo, char fator, float altura, float peso)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.tipoSanguineo = tipo;
		this.fatorRH = fator;
		this.altura = altura;
		this.peso = peso;
		CONTADOR_INSTANCIAS++;
	}
	
	public Paciente(String cpf, String nome)
	{
		this.nome = nome;
		this.cpf = cpf;
		CONTADOR_INSTANCIAS++;
	}
	
	public float calcularIMC()
	{
		return this.peso/(this.altura*this.altura);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

	
}
