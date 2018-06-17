package view;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;

import controller.App;
import model.Cliente;
import model.Gerente;
import model.Pedido;
import model.Suculenta;
import model.Vendedor;
import utilitarios.Console;
import utilitarios.LtpLib;

public class Admin {
	
private static App objApp = new App();
	
//	public static void main(String[] args) {
//		
//	lerArquivo();
//	
//	JFrame face = new Interface_Admin();
//	face.pack();
//	face.setVisible(true);
//	face.setSize(700, 500);
//	
//	gravarArquivo(objApp);
//	menu();
//	
//	}
	
	@SuppressWarnings("unchecked")
	public static App lerArquivo() {
		
		if (new File("Clientes.obj").exists()) {
			try {
			objApp.setClientes(LtpLib.lerArquivoObjetosArray("Clientes.obj"));
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
		
		if (new File("Gerentes.obj").exists()) {
			try {
			objApp.setGerentes(LtpLib.lerArquivoObjetosArray("Gerentes.obj"));
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}

		if (new File("Pedidos.obj").exists()) {
			try {
			objApp.setPedidos(LtpLib.lerArquivoObjetosArray("Pedidos.obj"));
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
		
		if (new File("Vendedores.obj").exists()) {
			try {
			objApp.setVendedores(LtpLib.lerArquivoObjetosArray("Vendedores.obj"));
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
		
		if (new File("Suculentas.obj").exists()) {
			try {
			objApp.setSuculentas(LtpLib.lerArquivoObjetosArray("Suculentas.obj"));
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
		
		return objApp;
		
	}
	
	public static void gravarArquivo(App objApp2) {
		try {
			LtpLib.gravarArquivoObjetosArray("Clientes.obj", objApp2.getClientes());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			LtpLib.gravarArquivoObjetosArray("Gerentes.obj", objApp2.getGerentes());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			LtpLib.gravarArquivoObjetosArray("Pedidos.obj", objApp2.getPedidos());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			LtpLib.gravarArquivoObjetosArray("Vendedores.obj", objApp2.getVendedores());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			LtpLib.gravarArquivoObjetosArray("Suculentas.obj", objApp2.getSuculentas());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void menu() {
		
		int opcao = 0;
		
		do {
			System.out.println("");
			System.out.println("Sistema de Suculentíneas");
			System.out.println("1- Cadastrar Cliente");
			System.out.println("2- Cadastrar Gerente");
			System.out.println("3- Cadastrar Vendedor");
			System.out.println("4- Cadastrar Suculenta");
			System.out.println("5- Fazer pedido");
			System.out.println("6- Consultar Cliente");
			System.out.println("7- Consultar Gerente");
			System.out.println("8- Consultar Vendedor");
			System.out.println("9- Consultar Suculenta");
			System.out.println("10- Consultar Pedido");
			System.out.println("11- Editar Cliente");
			System.out.println("12- Editar Gerente");
			System.out.println("13- Editar Vendedor");
			System.out.println("14- Editar Suculenta");
			System.out.println("15- Editar Pedido");
			System.out.println("16- Excluir Cliente");
			System.out.println("17- Excluir Gerente");
			System.out.println("18- Excluir Vendedor");
			System.out.println("19- Excluir Suculenta");
			System.out.println("20- Excluir Pedido");
			System.out.println("21- Lista de Clientes");
			System.out.println("22- Lista de Gerentes");
			System.out.println("23- Lista de Vendedores");
			System.out.println("24- Lista de Suculentas");
			System.out.println("25- Lista de Pedidos");
			System.out.println("26- Adicionar Suculenta ao estoque");
			System.out.println("0- Sair");
			System.out.println("");
			opcao = Console.readInt("Opção: ");
			System.out.println("");
			
			switch (opcao) {
			case 1:
				cadastrarCliente();
				break;
			case 2:
				cadastrarGerente();
				break;
			case 3:
				cadastrarVendedor();
				break;
			case 4:
				cadastrarSuculenta();
				break;
			case 5:
				fazerPedido();
				break;
			case 6:
				consultarCliente();
				break;
			case 7:
				consultarGerente();
				break;
			case 8:
				consultarVendedor();
				break;
			case 9:
				consultarSuculenta();
				break;
			case 10:
				consultarPedido();
				break;
			case 11:
				editarCliente();
				break;
			case 12:
				editarGerente();
				break;
			case 13:
				editarVendedor();
				break;
			case 14:
				editarSuculenta();
				break;
			case 15:
				editarPedido();
				break;
			case 16:
				excluirCliente();
				break;
			case 17:
				excluirGerente();
				break;
			case 18:
				excluirVendedor();
				break;
			case 19:
				excluirSuculenta();
				break;
			case 20:
				cancelarPedido();
				break;
			case 21:
				listarClientes();
				break;
			case 22:
				listarGerentes();
				break;
			case 23:
				listarVendedores();
				break;
			case 24:
				listarSuculentas();
				break;
			case 25:
				listarPedidos();
				break;
			case 26:
				adicionarSuculenta();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida. Escolha um opção acima.");
				break;
			
			} 	
		} while (opcao != 0);
		
	}
	
	public static void cadastrarCliente() {
		System.out.println("Cadastro de cliente");
		
		String nome = Console.readLine("Nome: "); 
		String cpf = Console.readLine("CPF: "); 
		String email = Console.readLine("E-mail: ");
		Date dataEntrada = new Date(); 
		int qntPedidos = 0;
		
		try {
			String dataNasc = Console.readLine("Data de nascimento: ");
			
			Cliente cliente = new Cliente(nome, cpf, email, dataNasc, dataEntrada, qntPedidos);
			objApp.cadastrarCliente(cliente);
			System.out.println("");
			System.out.println("Cliente cadastrado com sucesso!");
			System.out.println("");
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("E-mail: " + email);
			System.out.println("Data de Nascimento: " + dataNasc);
			System.out.println("Data de entrada: " + dataEntrada);
			System.out.println("Quantidade de pedidos realizados: " + qntPedidos); 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void cadastrarGerente() {
		System.out.println("Cadastro de Gerente");
		
		String nome = Console.readLine("Nome: ");
		String cpf = Console.readLine("CPF: ");
		String email = Console.readLine("E-mail: ");
		String matricula;
		int senha = Console.readInt("Senha: ");
		double salarioBase = Console.readDouble("Salário base: ");
		
		try {
			String dataNasc = Console.readLine("Data de nascimento: ");
			
			if (objApp.getGerentes().isEmpty()) {
				matricula = "G" + 1;
			} else {
				matricula = "G" + (objApp.getGerentes().size() + 1);
			}
			
			Gerente gerente = new Gerente(nome, cpf, email, dataNasc, matricula, senha, salarioBase);
			objApp.cadastrarGerente(gerente);
			System.out.println("");
			System.out.println("Gerente cadastrado com sucesso! ");
			System.out.println("");
			System.out.println("Matrícula: " + matricula);
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("E-mail: " + email);
			System.out.println("Data de Nascimento: " + dataNasc);
			System.out.println("Senha: " + senha);
			System.out.println("Salário-base: " + salarioBase);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void cadastrarVendedor() {
		System.out.println("Cadastro de Vendedor");
		
		String nome = Console.readLine("Nome: ");
		String cpf = Console.readLine("CPF: ");
		String email = Console.readLine("E-mail: ");
		String matricula;
		int senha = Console.readInt("Senha: ");
		int numVendas = 0;
		
		try {
			String dataNasc = Console.readLine("Data de nascimento: ");
			
			double comissao = 600 + (numVendas * 50);
			
			if (objApp.getVendedores().isEmpty()) {
				matricula = "V" + 1;
			} else {
				matricula = "V" + (objApp.getVendedores().size() + 1);
			}
			
			Vendedor vendedor = new Vendedor(nome, cpf, email, dataNasc, matricula, senha, comissao, numVendas);
			objApp.cadastrarVendedor(vendedor);
			System.out.println("");
			System.out.println("Vendedor cadastrado com sucesso!");
			System.out.println("");
			System.out.println("Matrícula: " + matricula);
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("E-mail: " + email);
			System.out.println("Data de Nascimento: " + dataNasc);
			System.out.println("Senha: " + senha);
			System.out.println("Salário-base: " + comissao);
			System.out.println("Número de vendas: " + numVendas);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void cadastrarSuculenta() {
		System.out.println("Cadastro de Suculenta");
		
		String nome = Console.readLine("Nome: "); 
		String tipo = Console.readLine("Tipo: "); 
		String raridade = Console.readLine("Raridade: "); 
		String tamanho = Console.readLine("Tamanho: "); 
		int qntEstoque = Console.readInt("Quantidade em estoque: "); 
		double valor = Console.readDouble("Valor: ");
		String cadastro;
		
		try {
			
			if (objApp.getSuculentas().isEmpty()) {
				cadastro = "S" + 1;
			} else {
				cadastro = "S" + (objApp.getSuculentas().size() + 1);
			}
			
		Suculenta suculenta = new Suculenta(nome, cadastro, tipo, raridade, tamanho, qntEstoque, valor);
		objApp.cadastrarSuculenta(suculenta);
		System.out.println("");
		System.out.println("Suculenta cadastrada com sucesso!");
		System.out.println("");
		System.out.println("Código de cadastro: " + cadastro);
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Raridade: " + raridade);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Quantidade em estoque: " + qntEstoque);
		System.out.println("Valor unitário: " + valor);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void fazerPedido() {
		System.out.println("Cadastro de Pedido");
		
		int numero;
		int qntPedida = Console.readInt("Quantidade: ");
		double suculentaValor = 0;
		double valorTotal = 0;
		
		try {
			String suculentaPedido = objApp.consultarSuculentaNome(Console.readLine("Suculenta: "));
			String vendedorPedido = objApp.consultarVendedorNome(Console.readLine("Vendedor: "));
			String clientePedido = objApp.consultarClienteNome(Console.readLine("Cliente: "));
			
			for (Suculenta suculenta : objApp.getSuculentas()) {
				if(suculentaPedido.equals(suculenta.getNome())) {
					suculentaValor = suculenta.getValor();
					valorTotal = suculenta.getValor() * qntPedida;
				}
			}
			
			for (Vendedor vendedor : objApp.getVendedores()) {
				if(vendedorPedido.equals(vendedor.getNome())) {
					vendedor.setNumVendas(vendedor.getNumVendas() + 1);
				}
			}
			
			if (objApp.getVendedores().isEmpty()) {
				numero =  1;
			} else {
				numero = objApp.getVendedores().size() + 1;
			}
			
			Pedido pedido = new Pedido(numero, suculentaPedido, suculentaValor, qntPedida, valorTotal, vendedorPedido, clientePedido);
			objApp.fazerPedido(pedido);
			System.out.println("");
			System.out.println("Pedido cadastrado com sucesso!");
			System.out.println("");
			System.out.println("Número do pedido: " + numero);
			System.out.println("Suculenta: " + suculentaPedido);
			System.out.println("Quantidade: " + qntPedida);
			System.out.println("Valor total do pedido: " + valorTotal);
			System.out.println("Vendedor: " + vendedorPedido);
			System.out.println("Cliente: " + clientePedido);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void consultarCliente() {
		System.out.println("Consultar Cliente");
		
		try {
			Cliente objClientes = objApp.consultarCliente(Console.readLine("CPF do cliente: "));
			System.out.println(objClientes.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static void consultarGerente() {
		System.out.println("Consultar Gerente");
		
		try {
			Gerente objGerentes = objApp.consultarGerente(Console.readLine("Matricula do gerente: "));
			System.out.println(objGerentes.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static void consultarVendedor() {
		System.out.println("Consultar Vendedor");
		
		try {
			Vendedor objVendedores = objApp.consultarVendedor(Console.readLine("Matricula do vendedor: "));
			System.out.println(objVendedores.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static void consultarSuculenta() {
		System.out.println("Consultar Suculenta");
		
		try {
			Suculenta objSuculentas = objApp.consultarSuculenta(Console.readLine("Código de cadastro da suculenta: "));
			System.out.println(objSuculentas.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static void consultarPedido() {
		System.out.println("Consultar Pedido");
		
		try {
			Pedido objPedidos = objApp.consultarPedido(Console.readInt("Número do pedido: "));
			System.out.println(objPedidos.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static void editarCliente() {
		System.out.println("Editar Cliente");
		
		try {
			Cliente objClientes = objApp.consultarCliente(Console.readLine("CPF do cliente: "));
		if (objClientes != null) {
			
			
			objClientes.setNome(Console.readLine("Novo nome: "));
			objClientes.setCpf(Console.readLine("Novo CPF: "));
			objClientes.setEmail(Console.readLine("Novo e-mail: "));
			
			
			objClientes.setDataNasc(Console.readLine("Nova data de nascimento: ")); 
			
			System.out.println("Cliente editado com sucesso.");
		} 
		
		} catch (Exception e) {
			System.out.println("Cliente não encontrado");
		}
	}
	
	public static void editarGerente() {
		System.out.println("Editar Gerente");
		
		try {
			Gerente objGerentes = objApp.consultarGerente(Console.readLine("Matrícula do gerente: "));
		if (objGerentes != null) {
			
			objGerentes.setNome(Console.readLine("Novo nome: "));
			objGerentes.setCpf(Console.readLine("Novo CPF: "));
			objGerentes.setEmail(Console.readLine("Novo e-mail: "));
			
			objGerentes.setDataNasc(Console.readLine("Nova data de nascimento: "));
			
			objGerentes.setSenha(Console.readInt("Nova senha: "));
			objGerentes.setSalarioBase(Console.readDouble("Novo salário-base: "));
			
			System.out.println("Gerente editado com sucesso.");
		} 
		
		} catch (Exception e) {
			System.out.println("Gerente não encontrado");
		}
	}
	
	public static void editarVendedor() {
		System.out.println("Editar Vendedor");
		
		try {
			Vendedor objVendedores = objApp.consultarVendedor(Console.readLine("Matrícula do vendedor: "));
		if (objVendedores != null) {
			
			objVendedores.setNome(Console.readLine("Novo nome: "));
			objVendedores.setCpf(Console.readLine("Novo CPF: "));
			objVendedores.setEmail(Console.readLine("Novo e-mail: "));
			
			objVendedores.setDataNasc(Console.readLine("Nova data de nascimento: "));
			
			objVendedores.setSenha(Console.readInt("Nova senha: "));
			objVendedores.setComissao(Console.readDouble("Nova comissão: "));
			
			System.out.println("Vendedor editado com sucesso.");
		} 
		
		} catch (Exception e) {
			System.out.println("Vendedor não encontrado");
		}
	}
	
	public static void editarSuculenta() {
		System.out.println("Editar Suculenta");
		
		try {
			Suculenta objSuculentas = objApp.consultarSuculenta(Console.readLine("Código de cadastro da suculenta: "));
		if (objSuculentas != null) {
			
			objSuculentas.setNome(Console.readLine("Novo nome: "));
			objSuculentas.setTipo(Console.readLine("Novo tipo: "));
			objSuculentas.setRaridade(Console.readLine("Nova raridade: "));
			objSuculentas.setTamanho(Console.readLine("Novo tamanho: "));
			objSuculentas.setValor(Console.readDouble("Novo valor: "));
			
			System.out.println("Suculenta editada com sucesso.");
		} 
		
		} catch (Exception e) {
			System.out.println("Suculenta não encontrada");
		}
	}
	
	public static void editarPedido() {
		System.out.println("Editar Pedido");
		
		try {
			Pedido objPedidos = objApp.consultarPedido(Console.readInt("Número do pedido: "));
		if (objPedidos != null) {
			
			Suculenta suculenta = objApp.consultarSuculenta("");
			Vendedor vendedor = objApp.consultarVendedor(Console.readLine(""));
			Cliente cliente = objApp.consultarCliente(Console.readLine(""));
			
			suculenta.setNome(Console.readLine("Nova suculenta: "));
			objPedidos.setQntPedida(Console.readInt("Nova quantidade: "));
			vendedor.setNome(Console.readLine("Novo vendedor: "));
			cliente.setNome(Console.readLine("Novo cliente: "));
			
			System.out.println("Pedido editado com sucesso.");
		} 
		
		} catch (Exception e) {
			System.out.println("Pedido não encontrado");
		}
	}
	
	public static void excluirCliente() {
		System.out.println("Excluir Cliente");
		
		try {
			objApp.excluirCliente(Console.readLine("CPF: "));
			System.out.println("Cliente excluído com sucesso.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void excluirGerente() {
		System.out.println("Excluir Gerente");
		
		try {
			objApp.excluirGerente(Console.readLine("Matrícula gerente: "));
			System.out.println("Gerente excluído com sucesso.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void excluirVendedor() {
		System.out.println("Excluir Vendedor");
		
		try {
			objApp.excluirVendendor(Console.readLine("Matrícula vendedor: "));
			System.out.println("Vendedor excluído com sucesso.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void excluirSuculenta() {
		System.out.println("Excluir Suculenta");
		
		try {
			objApp.excluirSuculenta(Console.readLine("Código de cadastro da suculenta: "));
			System.out.println("Suculenta excluída com sucesso.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void cancelarPedido() {
		System.out.println("Cancelar pedido");
		
		try {
			objApp.cancelarPedido(Console.readInt("Número do pedido: "));
			System.out.println("Pedido excluído com sucesso.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void listarClientes() {
		System.out.println("Lista de clientes");
		System.out.println(objApp.getClientes().toString());
	}
	
	public static void listarGerentes() {
		System.out.println("Lista de gerentes");
		System.out.println(objApp.getGerentes().toString());
	}
	
	public static void listarVendedores() {
		System.out.println("Lista de vendedores");
		System.out.println(objApp.getVendedores().toString());
	}
	
	public static void listarSuculentas() {
		System.out.println("Lista de suculentas");
		System.out.println(objApp.getSuculentas().toString());
	}
	
	public static void listarPedidos() {
		System.out.println("Lista de pedidos");
		System.out.println(objApp.getPedidos().toString());
	}
	
	public static void adicionarSuculenta() {
		System.out.println("Adicionar suculentas ao estoque");
		
		try {
			
			Suculenta objSuculentas = objApp.consultarSuculenta(Console.readLine("Código de cadastro da suculenta: "));
			
			int qntNova = Console.readInt("Quantidade a ser estocada: ");
			
			objSuculentas.setQntEstoque(objSuculentas.getQntEstoque() + qntNova);
			
			System.out.println("Quantidade adicionada com sucesso ao estoque!");
			System.out.println("Quantidade em estoque atual: " + objSuculentas.getQntEstoque());
			
		} catch (Exception e) {
			System.out.println("Não foi possível adicionar essa quantidade ao estoque, tente novamente.");
		}
		
	}
	
}
