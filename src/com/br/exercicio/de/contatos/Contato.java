package com.br.exercicio.de.contatos;

public class Contato {

	// Atributos

	private String nome;
	private int numeroDoTelefone;

	// Construtor
	public Contato(String nome, int numeroDoTelefone) {
		super();
		this.nome = nome;
		this.numeroDoTelefone = numeroDoTelefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDoTelefone() {
		return numeroDoTelefone;
	}

	public void setNumeroDoTelefone(int numeroDoTelefone) {
		this.numeroDoTelefone = numeroDoTelefone;
	}

}
