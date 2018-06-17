package model;

import java.io.Serializable;
import java.util.Date;

public class Vendedor extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String matricula;
	private int senha;
	private double comissao;
	private int numVendas;
	
	public Vendedor() {}
	
	public Vendedor(String nome, String cpf, String email, String dataNasc, String matricula, int senha, double comissao,
			int numVendas) {
		super(nome, cpf, email, dataNasc);
		this.matricula = matricula;
		this.senha = senha;
		this.comissao = comissao;
		this.numVendas = numVendas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public int getNumVendas() {
		return numVendas;
	}

	public void setNumVendas(int numVendas) {
		this.numVendas = numVendas;
	}

	@Override
	public String toString() {
		return "Vendedor [matricula=" + matricula + ", senha=" + senha + ", comissao=" + comissao + ", numVendas="
				+ numVendas + ", getMatricula()=" + getMatricula() + ", getSenha()=" + getSenha() + ", getComissao()="
				+ getComissao() + ", getNumVendas()=" + getNumVendas() + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getEmail()=" + getEmail() + ", getDataNasc()=" + getDataNasc() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
