package br.com.academia;

import java.time.LocalDate;

import br.com.academia.model.Aluno;

public class AppAcademia {

	public static void main(String[] args) {
		Aluno alunoJoao = new Aluno ();
		alunoJoao.setNome("Jo�o Pereira");
		alunoJoao.setAltura(1.89);
		alunoJoao.setPeso(104);
		alunoJoao.setDataNascimento(LocalDate.of(2002, 02, 19));
		alunoJoao.setGenero("Masculino");
		alunoJoao.setNivelatividade("Moderado");
		System.out.println(alunoJoao.getNome());
		System.out.println(alunoJoao.getAltura());
		System.out.println(alunoJoao.getPeso());
		System.out.println(alunoJoao.getImc());
		System.out.println(alunoJoao.getStatusImc());
		System.out.println(alunoJoao.getIdade());
		System.out.println(alunoJoao.getGenero());
		System.out.println(alunoJoao.getNivelatividade());
	
	
	}

}
