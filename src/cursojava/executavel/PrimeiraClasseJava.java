package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/**
	 * Método padrão que executa os programas escritos em Java
	 */
	public static void main(String[] args) {
		
		// new Aluno() é uma instância da classe Aluno (criação do objeto)
		// aluno1 é uma referência para o objeto
		
		// Entrada de dados com o teclado (Dados do aluno)
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");
		String rg = JOptionPane.showInputDialog("Digite o RG do aluno:");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno:");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno:");
		String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
		String dataMatricula = JOptionPane.showInputDialog("Digite a data da matrícula do aluno:");
		String serieMatriculado = JOptionPane.showInputDialog("Digite a série do aluno:");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola do aluno:");				
		
		System.out.println("===================== ALUNO 1 =======================");	
		Aluno aluno1 = new Aluno();
		
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
		
		for (int pos = 1; pos <= 4; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da " + pos + "º disciplina:");
			String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da " + pos + "º disciplina:");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		System.out.println(aluno1); // Representação textual do objeto
		System.out.println("Média das notas do aluno 1 é: " + aluno1.getMediaNota());
		System.out.println("Resultado STRING: " + aluno1.getAlunoAprovadoString());		
	}

}
