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
		
		Aluno aluno2 = new Aluno(); // Pedro
		
		Aluno aluno3 = new Aluno(); // Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);

	}

}
