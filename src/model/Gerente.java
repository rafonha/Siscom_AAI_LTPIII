package model;

import java.io.Serializable;
import java.util.Date;

public class Gerente extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String matricula;
	private int senha;
	private double salarioBase;
	
	public Gerente() {}
	
	public Gerente(String nome, String cpf, String email, String dataNasc, String matricula, int senha,
			double salarioBase) {
		super(nome, cpf, email, dataNasc);
		this.matricula = matricula;
		this.senha = senha;
		this.salarioBase = salarioBase;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double d) {
		this.salarioBase = d;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Gerente [matricula=" + matricula + ", senha=" + senha + ", salarioBase=" + salarioBase
				+ ", getMatricula()=" + getMatricula() + ", getSenha()=" + getSenha() + ", getSalarioBase()="
				+ getSalarioBase() + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getEmail()="
				+ getEmail() + ", getDataNasc()=" + getDataNasc() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
