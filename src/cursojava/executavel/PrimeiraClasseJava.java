package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/**
	 * M�todo padr�o que executa os programas escritos em Java
	 */
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		for(int qtd = 1; qtd <= 2; qtd++) {
			
			// new Aluno() � uma inst�ncia da classe Aluno (cria��o do objeto)
			// aluno1 � uma refer�ncia para o objeto
			
			// Entrada de dados com o teclado (Dados do aluno)
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + qtd + " :");
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
				
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da " + pos + "� disciplina:");
				String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da " + pos + "� disciplina:");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
			if (escolha == 0) { // Op��o SIM = 0
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog(null, "Informe a disciplina a ser removida [1, 2, 3 ou 4]");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao ++; // Incremente 1 ao valor atual da vari�vel posicao
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
				}			
			}
			
			alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {			
			if (aluno.getNome().equalsIgnoreCase("alex")) {				
				alunos.remove(aluno);				
				break;
			} else {
				System.out.println(aluno); // Representa��o textual do objeto
				System.out.println("M�dia das notas do aluno 1 �: " + aluno.getMediaNota());
				System.out.println("Resultado STRING: " + aluno.getAlunoAprovadoString());
				System.out.println("=====================================================");
			}
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos remanescentes na lista:");
			System.out.println(aluno.getNome());
			System.out.println("Disciplinas dos alunos remanescentes:");
			for (Disciplina discplina : aluno.getDisciplinas()) {
				System.out.println(discplina.getDisciplina());
			}
		}
	}

}
