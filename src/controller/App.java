package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Gerente;
import model.Pedido;
import model.Suculenta;
import model.Vendedor;

public class App {
	
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Suculenta> suculentas = new ArrayList<Suculenta>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	private ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public ArrayList<Suculenta> getSuculentas() {
		return suculentas;
	}

	public void setSuculentas(ArrayList<Suculenta> suculentas) {
		this.suculentas = suculentas;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}
	
	public ArrayList<Gerente> getGerentes() {
		return gerentes;
	}

	public void setGerentes(ArrayList<Gerente> gerentes) {
		this.gerentes = gerentes;
	}

	public void cadastrarCliente(Cliente cliente) throws Exception {
		boolean adicionar = getClientes().add(cliente);
		if (!adicionar) {
			throw new Exception("Não foi possível cadastrar cliente, tente novamente!");
		}
	}
	
	public void cadastrarSuculenta(Suculenta suculenta) throws Exception {
		boolean adicionar = getSuculentas().add(suculenta);
		if (!adicionar) {
			throw new Exception("Não foi possível cadastrar suculenta, tente novamente!");
		}
	}
	
	public void fazerPedido(Pedido pedido) throws Exception {
		boolean adicionar = getPedidos().add(pedido);
		if (!adicionar) {
			throw new Exception("Não foi possível fazer pedido, tente novamente!");
		}
	}
	
	public void cadastrarVendedor(Vendedor vendedor) throws Exception {
		boolean adicionar = getVendedores().add(vendedor);
		if (!adicionar) {
			throw new Exception("Não foi possível cadastrar vendedor, tente novamente!");
		}
	}
	
	public void cadastrarGerente(Gerente gerente) throws Exception {
		boolean adicionar = getGerentes().add(gerente);
		if (!adicionar) {
			throw new Exception("Não foi possível cadastrar gerente, tente novamente!");
		}
	}
	
	public Cliente consultarCliente(String cpf) throws Exception {
		for (Cliente objCliente : getClientes()) {
			if (cpf.equals(objCliente.getCpf())) {
				return objCliente;
			}
		} throw new Exception("Não foi possível consultar cliente, tente novamente!");
	}
	
	public String consultarClienteNome(String cpf) throws Exception {
		for (Cliente objCliente : getClientes()) {
			if (cpf.equals(objCliente.getCpf())) {
				return objCliente.getNome();
			}
		} throw new Exception("Não foi possível consultar cliente, tente novamente!");
	}
	
	public Suculenta consultarSuculenta(String cadastro) throws Exception {
		for (Suculenta objSuculenta : getSuculentas()) {
			if (cadastro.equals(objSuculenta.getCadastro())) {
				return objSuculenta;
			}
		} throw new Exception("Não foi possível consultar suculenta, tente novamente!");
	}
	
	public String consultarSuculentaNome(String cadastro) throws Exception  {
		for (Suculenta objSuculenta : getSuculentas()) {
			if (cadastro.equals(objSuculenta.getCadastro())) {
				return objSuculenta.getNome();
			}
		} throw new Exception("Não foi possível consultar suculenta, tente novamente!");
	}
	
	public double consultarSuculentaValor(String cadastro) throws Exception  {
		for (Suculenta objSuculenta : getSuculentas()) {
			if (cadastro.equals(objSuculenta.getCadastro())) {
				return objSuculenta.getValor();
			}
		} throw new Exception("Não foi possível consultar suculenta, tente novamente!");
	}
	
	public Pedido consultarPedido(int numero) throws Exception{
		for (Pedido objPedido : getPedidos()) {
			if(numero == objPedido.getNumero()) {
				return objPedido;
			}
		} throw new Exception("Não foi possível consultar pedido, tente novamente!");
	}
	
	public Vendedor consultarVendedor(String matricula) throws Exception{
		for (Vendedor objVendedor : getVendedores()) {
			if(matricula == objVendedor.getMatricula()) {
				return objVendedor;
			}
		} throw new Exception("Não foi possível consultar vendedor, tente novamente!");
	}
	
	public String consultarVendedorNome(String matricula) throws Exception{
		for (Vendedor objVendedor : getVendedores()) {
			if(matricula == objVendedor.getMatricula()) {
				return objVendedor.getNome();
			}
		} throw new Exception("Não foi possível consultar vendedor, tente novamente!");
	}
	
	public Gerente consultarGerente(String matricula) throws Exception {
		for (Gerente objGerente : getGerentes()) {
			if (matricula.equals(objGerente.getMatricula())) {
				return objGerente;
			}
		} throw new Exception("Não foi possível consultar gerente, tente novamente!");
	}
	
	public void cancelarPedido(int numero) throws Exception{
		Pedido objPedidos = consultarPedido(numero);
		boolean remove = getPedidos().remove(objPedidos);
		if (! remove) {
			throw new Exception("Não foi possível cancelar o pedido, tente novamente!");
		}
	}
	
	public void excluirCliente(String cpf) throws Exception{
		Cliente objClientes = consultarCliente(cpf);
		boolean remove = getClientes().remove(objClientes);
		if (!remove) {
			throw new Exception("Não foi possível excluir cliente, tente novamente!");
		}
	}
	
	public void excluirSuculenta(String cadastro) throws Exception{
		Suculenta objSuculentas = consultarSuculenta(cadastro);
		boolean remove = getSuculentas().remove(objSuculentas);
		if (!remove) {
			throw new Exception("Não foi possível excluir suculenta, tente novamente!");
		}
	}
	
	public void excluirGerente(String matricula) throws Exception{
		Gerente objGerentes = consultarGerente(matricula);
		boolean remove = getGerentes().remove(objGerentes);
		if (!remove) {
			throw new Exception("Não foi possível excluir gerente, tente novamente!");
		}
	}
	
	public void excluirVendendor(String matricula) throws Exception{
		Vendedor objVendedores = consultarVendedor(matricula);
		boolean remove = getVendedores().remove(objVendedores);
		if (!remove) {
			throw new Exception("Não foi possível excluir vendedor, tente novamente!");
		}
	}
	
	public ArrayList<Cliente> listarClientes() {
		return clientes;
	}
	
	public ArrayList<Gerente> listarGerentes() {
		return gerentes;
	}
	
	public ArrayList<Vendedor> listarVendedores() {
		return vendedores;
	}
	
	public ArrayList<Suculenta> listarSuculentas() {
		return suculentas;
	}
	
	public ArrayList<Pedido> listarPedidos() {
		return pedidos;
	}
}
