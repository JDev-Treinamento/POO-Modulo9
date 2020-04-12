package cursojava.executavel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

			JOptionPane.showMessageDialog(null, "Acesso liberado ao sistema! Pressione OK!");

			List<Aluno> alunos = new ArrayList<>();

			HashMap<String, List<Aluno>> maps = new HashMap<>();

			for (int qtd = 1; qtd <= 1; qtd++) {

				String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + qtd + " :");
				/*
				 * String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
				 * String dataNascimento =
				 * JOptionPane.showInputDialog("Digite a data de nascimento do aluno:"); String
				 * rg = JOptionPane.showInputDialog("Digite o RG do aluno:"); String cpf =
				 * JOptionPane.showInputDialog("Digite o CPF do aluno:"); String nomeMae =
				 * JOptionPane.showInputDialog("Digite o nome da mãe do aluno:"); String nomePai
				 * = JOptionPane.showInputDialog("Digite o nome do pai do aluno:"); String
				 * dataMatricula =
				 * JOptionPane.showInputDialog("Digite a data da matrícula do aluno:"); String
				 * serieMatriculado = JOptionPane.showInputDialog("Digite a série do aluno:");
				 * String nomeEscola =
				 * JOptionPane.showInputDialog("Digite o nome da escola do aluno:");
				 */

				Aluno aluno1 = new Aluno();

				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));
				 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
				 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
				 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
				 * aluno1.setSerieMatriculado(serieMatriculado);
				 * aluno1.setNomeEscola(nomeEscola);
				 */

				for (int pos = 1; pos <= 2; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da " + pos + "º disciplina:");
					String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da " + pos + "º disciplina:");

					Disciplina disciplina = new Disciplina();
					disciplina.setNome(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));
					aluno1.getDisciplinas().add(disciplina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				if (escolha == 0) {
					int continuarRemover = 0;
					while (continuarRemover == 0 && !aluno1.getDisciplinas().isEmpty()) {
						List<String> opcoes = new ArrayList<>();
						for (Disciplina disciplina : aluno1.getDisciplinas()) {
							opcoes.add(disciplina.getNome());
						}
						String nomeDisciplinaRemover = JOptionPane.showInputDialog(null, "Informe a disciplina a ser removida [ " + concatenate(opcoes) + " ]");
						Disciplina disciplinaOpcao = buscarDisciplinaPorNome(nomeDisciplinaRemover, aluno1.getDisciplinas());
						if (disciplinaOpcao != null) {
							aluno1.getDisciplinas().remove(disciplinaOpcao);
							JOptionPane.showMessageDialog(null, "Disciplina removida com sucesso!");
						}
						if (!aluno1.getDisciplinas().isEmpty()) {
							continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
						} else {
							JOptionPane.showMessageDialog(null, "Todas as disciplinas foram removidas! Processo finalizado!");
						}
					}
				}
				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else if (aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("Lista dos alunos APROVADOS!");
			System.out.println("==============================");
			if (!maps.get(StatusAluno.APROVADO).isEmpty()) {
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Nome: " + aluno.getNome());
					System.out.println("Média: " + aluno.getMediaNota());
					System.out.println("------------------------------");
				}
			} else {
				System.out.println("Não há alunos Aprovados!");
			}
			System.out.println("==============================");

			System.out.println("Lista dos alunos REPROVADOS!");
			System.out.println("==============================");
			if (!maps.get(StatusAluno.REPROVADO).isEmpty()) {
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Nome: " + aluno.getNome());
					System.out.println("Média: " + aluno.getMediaNota());
					System.out.println("--------------------------");
				}
			} else {
				System.out.println("Não há alunos Reprovados!");
			}
			System.out.println("==============================");

			System.out.println("Lista dos alunos em RECUPERAÇÃO!");
			System.out.println("==============================");
			if (!maps.get(StatusAluno.RECUPERACAO).isEmpty()) {
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Nome: " + aluno.getNome());
					System.out.println("Média: " + aluno.getMediaNota());
					System.out.println("--------------------------");
				}
			} else {
				System.out.println("Não há alunos em Recuperação!");
			}
			System.out.println("==============================");
		} else {
			JOptionPane.showMessageDialog(null,
					"Login ou senha inválido(s)! Acesso não autorizado! Pressione OK e tente novamente!");
		}
	}

	private static Disciplina buscarDisciplinaPorNome(String nomeDisciplina, List<Disciplina> disciplinas) {
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
				return disciplina;
			}
		}
		JOptionPane.showMessageDialog(null, "Não existe nenhuma disciplina com o nome informado!");
		return null;
	}

	private static String concatenate(Collection<String> strings) {
		if (strings == null || strings.isEmpty()) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		String delimiter = ", ";
		boolean first = true;
		for (String string : strings) {
			if (!first) {
				sb.append(delimiter);
			}
			sb.append(string);
			first = false;
		}
		return sb.toString();
	}

}
