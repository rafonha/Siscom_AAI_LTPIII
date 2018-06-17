package model;

import java.io.Serializable;

public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int numero;
	private String suculentaPedido;
	private double suculentaValor;
	private int qntPedida;
	private double valorTotal;
	private String vendedorPedido;
	private String clientePedido;
	
	public Pedido(int numero, String suculentaPedido, double suculentaValor, int qntPedida, double valorTotal,
			String vendedorPedido, String clientePedido) {
		super();
		this.numero = numero;
		this.suculentaPedido = suculentaPedido;
		this.suculentaValor = suculentaValor;
		this.qntPedida = qntPedida;
		this.valorTotal = valorTotal;
		this.vendedorPedido = vendedorPedido;
		this.clientePedido = clientePedido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getNumero() {
		return numero;
	}

	public String getSuculentaPedido() {
		return suculentaPedido;
	}

	public double getSuculentaValor() {
		return suculentaValor;
	}

	public int getQntPedida() {
		return qntPedida;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public String getVendedorPedido() {
		return vendedorPedido;
	}

	public String getClientePedido() {
		return clientePedido;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSuculentaPedido(String suculentaPedido) {
		this.suculentaPedido = suculentaPedido;
	}

	public void setSuculentaValor(double suculentaValor) {
		this.suculentaValor = suculentaValor;
	}

	public void setQntPedida(int qntPedida) {
		this.qntPedida = qntPedida;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setVendedorPedido(String vendedorPedido) {
		this.vendedorPedido = vendedorPedido;
	}

	public void setClientePedido(String clientePedido) {
		this.clientePedido = clientePedido;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", suculentaPedido=" + suculentaPedido + ", suculentaValor="
				+ suculentaValor + ", qntPedida=" + qntPedida + ", valorTotal=" + valorTotal + ", vendedorPedido="
				+ vendedorPedido + ", clientePedido=" + clientePedido + "]";
	}
	
}
