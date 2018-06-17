package model;

import java.util.Date;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String email;
	private String dataNasc;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String cpf, String email, String dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNasc="
				+ dataNasc + "]";
	}

}
