package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class TestaAluno {

	public static void main(String[] args) {
		
//		Set<String> alunos = new HashSet<>();
//        alunos.add("Paulo");
//        alunos.add("Alberto");
//        alunos.add("Pedro");    
//        alunos.add("Nico");    
//
//        for(String aluno: alunos) {
//            System.out.println(aluno);
//        }
//
//        System.out.println(alunos.size());
//
//        //tente adicionar um aluno que existe
//        alunos.add("Pedro");
//        boolean adicionou = alunos.add("Pedro");
//        System.out.println("Pedro foi adicionado ao Set? " + adicionou);
//        System.out.println(alunos.size())

		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos);

		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);
		
		System.out.println(alunosEmLista);
	}
	
}
