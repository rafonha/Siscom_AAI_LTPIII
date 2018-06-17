package model;

import java.io.Serializable;
import java.util.Date;

public class Cliente extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Date dataEntrada;
	private int qntPedidos;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String cpf, String email, String dataNasc, Date dataEntrada,
			int qntPedidos) {
		super(nome, cpf, email, dataNasc);
		this.dataEntrada = dataEntrada;
		this.qntPedidos = qntPedidos;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public int getQntPedidos() {
		return qntPedidos;
	}

	public void setQntPedidos(int qntPedidos) {
		this.qntPedidos = qntPedidos;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cliente [dataEntrada=" + dataEntrada + ", qntPedidos=" + qntPedidos + ", getNome()=" + getNome()
				+ ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getDataNasc()=" + getDataNasc()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
