package cursojava.executavel;

import static cursojava.util.Util.buscarDisciplinaPorNome;
import static cursojava.util.Util.concatenate;

import java.util.ArrayList;
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

		if (logar(login, senha)) {

			JOptionPane.showMessageDialog(null, "Acesso liberado ao sistema! Pressione OK!");
			
			String qtdAlunos = JOptionPane.showInputDialog("Quantos alunos deseja cadastrar?");

			List<Aluno> alunos = new ArrayList<>();
			HashMap<String, List<Aluno>> alunosStatus = new HashMap<>();

			for (int qtd = 1; qtd <= Integer.parseInt(qtdAlunos); qtd ++) {

				String nome = JOptionPane.showInputDialog("Digite o nome do Aluno " + qtd + " :");				
				String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
				String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:"); 
				String rg = JOptionPane.showInputDialog("Digite o RG do aluno:"); 
				String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno:");
				String nomeMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno:");
				String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
				String dataMatricula = JOptionPane.showInputDialog("Digite a data da matrícula do aluno:");
				String serieMatriculado = JOptionPane.showInputDialog("Digite a série do aluno:");
				String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola do aluno:");

				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setIdade(Integer.valueOf(idade));
				aluno.setDataNascimento(dataNascimento); 
				aluno.setRegistroGeral(rg);
				aluno.setNumeroCpf(cpf); 
				aluno.setNomeMae(nomeMae);
				aluno.setNomePai(nomePai); 
				aluno.setDataMatricula(dataMatricula);
				aluno.setSerieMatriculado(serieMatriculado);
				aluno.setNomeEscola(nomeEscola);	

				informarDisciplinas(aluno);
				removerDisciplinas(aluno);	
				
				alunos.add(aluno);
			}
			
			separarListasPorStatus(alunos, alunosStatus);			
			imprimir(alunosStatus);			
		} else {
			JOptionPane.showMessageDialog(null, "Login ou senha inválido(s)! Acesso não autorizado! Pressione OK para finalizar!");
		}
	}

	private static void imprimir(HashMap<String, List<Aluno>> alunosStatus) {		
		verificarAlunosAprovados(alunosStatus);		
		verificarAlunosReprovados(alunosStatus);	
		verificarAlunosEmRecuperacao(alunosStatus);
	}

	private static void verificarAlunosEmRecuperacao(HashMap<String, List<Aluno>> alunosStatus) {
		System.out.println("==============================");
		System.out.println("Lista dos alunos em RECUPERAÇÃO!");
		System.out.println("==============================");
		if (!alunosStatus.get(StatusAluno.RECUPERACAO).isEmpty()) {
			for (Aluno aluno : alunosStatus.get(StatusAluno.RECUPERACAO)) {
				imprimirDadosAluno(aluno, alunosStatus.get(StatusAluno.RECUPERACAO).size() > 1);
			}
		} else {
			System.err.println("Não há alunos em Recuperação!");
		}			
	}

	private static void verificarAlunosReprovados(HashMap<String, List<Aluno>> alunosStatus) {
		System.out.println("==============================");
		System.out.println("Lista dos alunos REPROVADOS!");
		System.out.println("==============================");
		if (!alunosStatus.get(StatusAluno.REPROVADO).isEmpty()) {
			for (Aluno aluno : alunosStatus.get(StatusAluno.REPROVADO)) {
				imprimirDadosAluno(aluno, alunosStatus.get(StatusAluno.REPROVADO).size() > 1);				
			}			
		} else {
			System.err.println("Não há alunos Reprovados!");			
		}
	}

	private static void verificarAlunosAprovados(HashMap<String, List<Aluno>> alunosStatus) {
		System.out.println("==============================");
		System.out.println("Lista dos alunos APROVADOS!");
		System.out.println("==============================");
		if (!alunosStatus.get(StatusAluno.APROVADO).isEmpty()) {
			for (Aluno aluno : alunosStatus.get(StatusAluno.APROVADO)) {
				imprimirDadosAluno(aluno, alunosStatus.get(StatusAluno.APROVADO).size() > 1);
			}
		} else {
			System.err.println("Não há alunos Aprovados!");			
		}
	}

	private static void imprimirDadosAluno(Aluno aluno, boolean separacao) {
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Média: " + aluno.getMediaNota());
		if (separacao)
			System.out.println("------------------------------");
	}

	private static void separarListasPorStatus(List<Aluno> alunos, HashMap<String, List<Aluno>> alunosStatus) {
		
		alunosStatus.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		alunosStatus.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		alunosStatus.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosStatus.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				alunosStatus.get(StatusAluno.REPROVADO).add(aluno);
			} else {
				alunosStatus.get(StatusAluno.RECUPERACAO).add(aluno);
			}
		}
	}

	private static void informarDisciplinas(Aluno aluno) {
		String qtdDisciplinas = JOptionPane.showInputDialog("Quantas disciplinas deseja cadastrar para o aluno " + aluno.getNome() + " ?");
		for (int pos = 1; pos <= Integer.parseInt(qtdDisciplinas); pos++) {					
			String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da " + pos + "º disciplina:");
			String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da " + pos + "º disciplina:");
			Disciplina disciplina = new Disciplina();
			disciplina.setNome(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			aluno.getDisciplinas().add(disciplina);
		}
	}

	private static boolean logar(String login, String senha) {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}

	private static void removerDisciplinas(Aluno aluno1) {
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
	}
	
}
