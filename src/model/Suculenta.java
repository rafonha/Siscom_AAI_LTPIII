package model;

import java.io.Serializable;

public class Suculenta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nome;
	private String cadastro;
	private String tipo;
	private String raridade;
	private String tamanho;
	private int qntEstoque;
	private double valor;
	
	public Suculenta(String nome, String cadastro, String tipo, String raridade, String tamanho, int qntEstoque,
			double valor) {
		super();
		this.nome = nome;
		this.cadastro = cadastro;
		this.tipo = tipo;
		this.raridade = raridade;
		this.tamanho = tamanho;
		this.qntEstoque = qntEstoque;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaridade() {
		return raridade;
	}

	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double d) {
		this.valor = d;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "Suculenta [nome=" + nome + ", cadastro=" + cadastro + ", tipo=" + tipo + ", raridade=" + raridade
				+ ", tamanho=" + tamanho + ", qntEstoque=" + qntEstoque + ", valor=" + valor + "]";
	}

}
