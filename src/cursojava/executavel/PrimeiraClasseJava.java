package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/**
	 * M�todo padr�o que executa os programas escritos em Java
	 */
	public static void main(String[] args) {
		
		// new Aluno() � uma inst�ncia da classe Aluno (cria��o do objeto)
		// aluno1 � uma refer�ncia para o objeto
		
		// Entrada de dados com o teclado (Dados do aluno)
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");
		String rg = JOptionPane.showInputDialog("Digite o RG do aluno:");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno:");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da m�e do aluno:");
		String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
		String dataMatricula = JOptionPane.showInputDialog("Digite a data da matr�cula do aluno:");
		String serieMatriculado = JOptionPane.showInputDialog("Digite a s�rie do aluno:");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola do aluno:");				
		
		System.out.println("===================== ALUNO 1 =======================");	
		Aluno aluno1 = new Aluno(); // Jo�o		
		
		// Dados do aluno1
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matem�tica");
		disciplina2.setNota(80);		
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);		
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);		
		
		System.out.println(aluno1); // Representa��o textual do objeto
		System.out.println("M�dia das notas do aluno 1 �: " + aluno1.getMediaNota());
		System.out.println("Resultado STRING: " + aluno1.getAlunoAprovadoString());		
	}

}
