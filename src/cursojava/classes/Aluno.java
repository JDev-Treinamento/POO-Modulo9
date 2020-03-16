package cursojava.classes;

/**
 * Classe que representa um Aluno
 */
public class Aluno {

	// Atributos da classe Aluno
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	// Construtor vazio do objeto (padr�o)
	public Aluno() {

	}

	// Construtor de par�metro �nico
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	// Construtor de dois par�metros
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
