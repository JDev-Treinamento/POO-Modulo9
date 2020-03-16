package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/**
	 * Método padrão que executa os programas escritos em Java
	 */
	public static void main(String[] args) {
		
		// new Aluno() é uma instância da classe Aluno (criação do objeto)
		// aluno1 é uma referência para o objeto
		Aluno aluno1 = new Aluno(); // João
		aluno1.nome = "João";
		aluno1.idade = 50;
		
		System.out.println("O nome do aluno 1 é = " + aluno1.nome);
		System.out.println("A idade do aluno 1 é = " + aluno1.idade);
		
		Aluno aluno2 = new Aluno(); // Pedro
		
		Aluno aluno3 = new Aluno(); // Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);

	}

}
