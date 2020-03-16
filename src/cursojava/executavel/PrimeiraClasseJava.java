package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/**
	 * M�todo padr�o que executa os programas escritos em Java
	 */
	public static void main(String[] args) {
		
		// new Aluno() � uma inst�ncia da classe Aluno (cria��o do objeto)
		// aluno1 � uma refer�ncia para o objeto
		Aluno aluno1 = new Aluno(); // Jo�o
		aluno1.nome = "Jo�o";
		aluno1.idade = 50;
		
		System.out.println("O nome do aluno 1 � = " + aluno1.nome);
		System.out.println("A idade do aluno 1 � = " + aluno1.idade);
		
		Aluno aluno2 = new Aluno(); // Pedro
		
		Aluno aluno3 = new Aluno(); // Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);

	}

}
