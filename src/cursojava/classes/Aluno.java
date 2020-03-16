package cursojava.classes;

/**
 * Classe que representa um Aluno
 */
public class Aluno {

	// Atributos da classe Aluno
	public String nome;
	public int idade;
	public String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	// Construtor vazio do objeto (padrão)
	public Aluno() {

	}

	// Construtor de parâmetro único
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	// Construtor de dois parâmetros
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
