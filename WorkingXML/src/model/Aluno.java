package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Aluno")
public class Aluno {

	private String nome;
	private int idade;
	private int matricula;

	public Aluno(String nome, int idade, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " - Idade: " + this.idade + " - Matrícula:" + this.matricula;
	}
}