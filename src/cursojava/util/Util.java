package cursojava.util;

import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;

public class Util {

	private Util() { }
	
	public static Disciplina buscarDisciplinaPorNome(String nomeDisciplina, List<Disciplina> disciplinas) {
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
				return disciplina;
			}
		}
		JOptionPane.showMessageDialog(null, "Não existe nenhuma disciplina com o nome informado!");
		return null;
	}

	public static String concatenate(Collection<String> strings) {
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
