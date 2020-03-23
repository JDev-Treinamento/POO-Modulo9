package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/**
	 * M�todo padr�o que executa os programas escritos em Java
	 */
	public static void main(String[] args) {
		
		// new Aluno() � uma inst�ncia da classe Aluno (cria��o do objeto)
		// aluno1 � uma refer�ncia para o objeto
		
		System.out.println("===================== ALUNO 1 =======================");		
		Aluno aluno1 = new Aluno(); // Jo�o
		
		// Dados do aluno1
		aluno1.setNome("Jo�o da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("44554.4544.545");
		aluno1.setNumeroCpf("54544.545454.5454");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		
		// Notas do aluno1
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome do aluno 1 �: " + aluno1.getNome());
		System.out.println("Idade do aluno 1 �: " + aluno1.getIdade());
		System.out.println("Nascimento do aluno 1 �: " + aluno1.getDataNascimento());
		System.out.println("M�dia das notas do aluno 1 �: " + aluno1.getMediaNota());
		System.out.println("Resultado BOOLEAN: " + (aluno1.getAlunoAprovadoBoolean() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado STRING: " + aluno1.getAlunoAprovadoString());
		// ======================================================================
		
		System.out.println("===================== ALUNO 2 =======================");		
		Aluno aluno2 = new Aluno(); // Pedro
		
		// Dados do aluno2
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("Nome do aluno 2 �: " + aluno2.getNome());
		System.out.println("Idade do aluno 2 �: " + aluno2.getIdade());
		System.out.println("Nascimento do aluno 2 �: " + aluno2.getDataNascimento());
		System.out.println("=====================================================");
		// =====================================================================
		
		Aluno aluno3 = new Aluno(); // Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);

	}

}
