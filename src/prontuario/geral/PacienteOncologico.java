package prontuario.geral;

public final class PacienteOncologico extends Paciente{

	int quantidadeRadioterapia;
	int quantidadeQuimioterapia;
	
	
	public PacienteOncologico(String cpf, String nome, int radio, int quimio) {
		super(cpf, nome);
		// TODO Auto-generated constructor stub
		this.quantidadeQuimioterapia = quimio;
		this.quantidadeRadioterapia = radio;
	}
	
	public PacienteOncologico(String cpf, String nome, char tipo, char fator, 
			float altura, float peso,int radio, int quimio)
	{
		super(cpf, nome, tipo, fator, altura, peso);
		this.quantidadeQuimioterapia = quimio;
		this.quantidadeRadioterapia = radio;
	}

	public float calcularIMC2()
	{
		return (this.peso/(this.altura*this.altura))*0.6f;
	}

	@Override
	public String toString() {
		return "PacienteOncologico [quantidadeRadioterapia=" + quantidadeRadioterapia + ", quantidadeQuimioterapia="
				+ quantidadeQuimioterapia + ", cpf=" + cpf + ", nome=" + nome + ", tipoSanguineo=" + tipoSanguineo
				+ ", fatorRH=" + fatorRH + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
	


}
