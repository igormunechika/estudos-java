package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java",
	            "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
	    List<Aula> aulas = javaColecoes.getAulas();
	    System.out.println(aulas);

	    javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
	    System.out.println(aulas);
	    
	}

}
