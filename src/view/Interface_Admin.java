package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controller.App;
import model.Cliente;
import model.Gerente;
import model.Pedido;
import model.Suculenta;
import model.Vendedor;
import utilitarios.InterfaceUtil;

public class Interface_Admin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private static App objApp = new App();
	
	private JTextField fieldNomeCli;
	private JTextField fieldCPFCli;
	private JTextField fieldEmailCli;
	private JTextField fieldDataNascCli;
	private JTextField fieldCPFEditClienteCon;
	private JTextField fieldNomeCliEdit;
	private JTextField fieldCPFCliEdit;
	private JTextField fieldEmailCliEdit;
	private JTextField fieldDataNascCliEdit;
	private JTextField fieldCPFDelCliCons;
	private JTextField fieldCPFConsConsCli;
	private JLayeredPane layeredPaneCadastroCli;
	private JTextField fieldNomeMan;
	private JTextField fieldCPFMan;
	private JTextField fieldEmailMan;
	private JTextField fieldDataNascMan;
	private JTextField fieldSalarioMan;
	private JTextField fieldSenhaMan;
	private JTextField fieldMatEditManCons;
	private JTextField fieldNomeEditMan;
	private JTextField fieldCPFEditMan;
	private JTextField fieldEmailEditMan;
	private JTextField fieldDataNascEditMan;
	private JTextField fieldSalarioEditMan;
	private JTextField fieldNSenhaEditMan;
	private JTextField fieldMatDelManCons;
	private JTextField fieldMatConsConsMan;
	private JTextField fieldNomeSel;
	private JTextField fieldCPFSel;
	private JTextField fieldEmailSel;
	private JTextField fieldDataNascSel;
	private JTextField fieldSenhaSel;
	private JTextField fieldMatEditSelCons;
	private JTextField fieldNomeEditSel;
	private JTextField fieldCPFEditSel;
	private JTextField fieldEmailEditSel;
	private JTextField fieldDataNascEditSel;
	private JTextField fieldSenhaEditSel;
	private JTextField fieldMatDelSelCons;
	private JTextField fieldMatConsSelCons;
	private JTextField fieldQntSelSel;
	private JTextField fieldNomeProd;
	private JTextField fieldValorUnitarioProd;
	private JTextField fieldCodEditProdCons;
	private JTextField fieldNomeEditProd;
	private JTextField fieldValorUnitarioEditProd;
	private JTextField fieldCodDelProdCons;
	private JTextField fieldCodConsProdCons;
	private JTextField fieldCodStoProdCons;
	private JTextField fieldEstoqueProd;
	private JTextField fieldQntAddStoProd;
	private JTable tableAllCli;
	private JTable tableAllMan;
	private JTable tableAllSel;
	private JTable tableAllProd;

	
	public Interface_Admin() {
		objApp = Admin.lerArquivo();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 530);
		this.setTitle("Administrador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interface_Admin.class.getResource("/Imagens/icon_admin.png")));
		getContentPane().setBackground(new Color(51, 204, 153));
		getContentPane().setLayout(null);
		setImageBackground();
		
		JLabel lblSistemaDeSuculentneas = new JLabel("Sistema de Suculent\u00EDneas");
		lblSistemaDeSuculentneas.setForeground(new Color(199, 21, 133));
		lblSistemaDeSuculentneas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaDeSuculentneas.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 32));
		lblSistemaDeSuculentneas.setBounds(123, 15, 407, 46);
		getContentPane().add(lblSistemaDeSuculentneas);
		
		JLabel lblreaDeAdministrador = new JLabel("\u00C1rea de Administrador");
		lblreaDeAdministrador.setForeground(new Color(199, 21, 133));
		lblreaDeAdministrador.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		lblreaDeAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
		lblreaDeAdministrador.setBounds(212, 68, 182, 16);
		getContentPane().add(lblreaDeAdministrador);
		
		//Créditos
		JLabel lblCriadoPorRafaela = new JLabel("Criado por Rafaela de Paula");
		lblCriadoPorRafaela.setForeground(new Color(199, 21, 133));
		lblCriadoPorRafaela.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblCriadoPorRafaela.setHorizontalAlignment(SwingConstants.CENTER);
		lblCriadoPorRafaela.setBounds(629, 20, 296, 46);
		getContentPane().add(lblCriadoPorRafaela);
		
		JLabel lblJunho = new JLabel("junho/2018");
		lblJunho.setForeground(new Color(199, 21, 133));
		lblJunho.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		lblJunho.setHorizontalAlignment(SwingConstants.CENTER);
		lblJunho.setBounds(705, 57, 128, 17);
		getContentPane().add(lblJunho);
		
		//Painel principal
		JPanel panelMain = new JPanel();
		panelMain.setBackground(new Color(255, 255, 255));
		panelMain.setBounds(12, 114, 958, 526);
		getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		JTabbedPane tabbedPaneMain = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMain.setBackground(new Color(255, 255, 255));
		tabbedPaneMain.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		tabbedPaneMain.setBounds(12, 13, 934, 500);
		panelMain.add(tabbedPaneMain);

		//Painel cliente
		JLayeredPane panelCliente = new JLayeredPane();
		tabbedPaneMain.addTab("Cliente", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_client.png")), panelCliente, null);
		
		JTabbedPane tabbedPaneCli = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneCli.setBackground(new Color(255, 255, 255));
		tabbedPaneCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		tabbedPaneCli.setBounds(12, 13, 905, 428);
		panelCliente.add(tabbedPaneCli);
		
		//Cadastro cliente
		layeredPaneCadastroCli = new JLayeredPane();
		layeredPaneCadastroCli.setBackground(new Color(152, 251, 152));
		tabbedPaneCli.addTab("Cadastro", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_add.png")), layeredPaneCadastroCli, null);
		tabbedPaneCli.setEnabledAt(0, true);
		tabbedPaneCli.setDisabledIconAt(0, new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_add.png")));
		layeredPaneCadastroCli.setLayout(null);
		
		JLabel lblNomeCli = new JLabel("Nome: ");
		lblNomeCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeCli.setBounds(31, 41, 56, 16);
		layeredPaneCadastroCli.add(lblNomeCli);
		
		fieldNomeCli = new JTextField();
		fieldNomeCli.setBounds(215, 35, 658, 22);
		layeredPaneCadastroCli.add(fieldNomeCli);
		fieldNomeCli.setColumns(10);
		
		JLabel lblCPFCli = new JLabel("CPF: ");
		lblCPFCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFCli.setBounds(31, 90, 56, 16);
		layeredPaneCadastroCli.add(lblCPFCli);
		
		fieldCPFCli = new JTextField();
		fieldCPFCli.setColumns(10);
		fieldCPFCli.setBounds(215, 85, 658, 22);
		layeredPaneCadastroCli.add(fieldCPFCli);
		
		JLabel lblEmailCli = new JLabel("E-mail: ");
		lblEmailCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailCli.setBounds(31, 137, 56, 16);
		layeredPaneCadastroCli.add(lblEmailCli);
		
		fieldEmailCli = new JTextField();
		fieldEmailCli.setColumns(10);
		fieldEmailCli.setBounds(215, 131, 658, 22);
		layeredPaneCadastroCli.add(fieldEmailCli);
		
		JLabel lblDataNascCli = new JLabel("Data de Nascimento:");
		lblDataNascCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascCli.setBounds(31, 184, 172, 16);
		layeredPaneCadastroCli.add(lblDataNascCli);
		
		fieldDataNascCli = new JTextField();
		fieldDataNascCli.setColumns(10);
		fieldDataNascCli.setBounds(215, 178, 658, 22);
		layeredPaneCadastroCli.add(fieldDataNascCli);
		
		//Edição cliente
		JLayeredPane layeredPaneEdicaoCLi = new JLayeredPane();
		tabbedPaneCli.addTab("Edi\u00E7\u00E3o", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_edit.png")), layeredPaneEdicaoCLi, null);
		
		JLabel lblCpfCliEdit = new JLabel("CPF do cliente:");
		lblCpfCliEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCpfCliEdit.setBounds(28, 43, 144, 16);
		layeredPaneEdicaoCLi.add(lblCpfCliEdit);
		
		fieldCPFEditClienteCon = new JTextField();
		fieldCPFEditClienteCon.setBounds(191, 41, 379, 22);
		layeredPaneEdicaoCLi.add(fieldCPFEditClienteCon);
		fieldCPFEditClienteCon.setColumns(10);
		
		JPanel editPanelCli = new JPanel();
		editPanelCli.setVisible(false);
		editPanelCli.setBounds(26, 86, 840, 283);
		layeredPaneEdicaoCLi.add(editPanelCli);
		editPanelCli.setLayout(null);
		
		JLabel lblNomeCliEdit = new JLabel("Nome: ");
		lblNomeCliEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeCliEdit.setBounds(28, 28, 56, 16);
		editPanelCli.add(lblNomeCliEdit);
		
		JLabel lblCpfEditCli = new JLabel("CPF: ");
		lblCpfEditCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCpfEditCli.setBounds(28, 67, 56, 16);
		editPanelCli.add(lblCpfEditCli);

		JLabel lblEmailCliEdit = new JLabel("E-mail: ");
		lblEmailCliEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailCliEdit.setBounds(28, 104, 143, 16);
		editPanelCli.add(lblEmailCliEdit);
		
		JLabel lblDataNascCliEdit = new JLabel("Data de Nascimento: ");
		lblDataNascCliEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascCliEdit.setBounds(28, 141, 143, 16);
		editPanelCli.add(lblDataNascCliEdit);
		
		fieldNomeCliEdit = new JTextField();
		fieldNomeCliEdit.setBounds(191, 26, 590, 22);
		editPanelCli.add(fieldNomeCliEdit);
		fieldNomeCliEdit.setColumns(10);
		
		fieldCPFCliEdit = new JTextField();
		fieldCPFCliEdit.setColumns(10);
		fieldCPFCliEdit.setBounds(191, 65, 590, 22);
		editPanelCli.add(fieldCPFCliEdit);
		
		fieldEmailCliEdit = new JTextField();
		fieldEmailCliEdit.setColumns(10);
		fieldEmailCliEdit.setBounds(191, 102, 590, 22);
		editPanelCli.add(fieldEmailCliEdit);
		
		fieldDataNascCliEdit = new JTextField();
		fieldDataNascCliEdit.setColumns(10);
		fieldDataNascCliEdit.setBounds(191, 139, 590, 22);
		editPanelCli.add(fieldDataNascCliEdit);
		
		JButton btnPesquisarEditCli = new JButton("Pesquisar");
		btnPesquisarEditCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Cliente objCliente = objApp.consultarCliente(fieldCPFEditClienteCon.getText());
					
					if (objCliente != null) {
						editPanelCli.setVisible(true); 
						fieldNomeCliEdit.setText(objCliente.getNome());
						fieldCPFCliEdit.setText(objCliente.getCpf());
						fieldEmailCliEdit.setText(objCliente.getEmail());
						fieldDataNascCliEdit.setText(objCliente.getDataNasc());
					} else {
							JOptionPane.showMessageDialog(null, "Digite o CPF do cliente.");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o cliente desejado, tente novamente.");
				}
			}
		});
		btnPesquisarEditCli.setBackground(new Color(199, 21, 133));
		btnPesquisarEditCli.setForeground(new Color(255, 255, 255));
		btnPesquisarEditCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarEditCli.setBounds(595, 40, 131, 25);
		layeredPaneEdicaoCLi.add(btnPesquisarEditCli);
		
		JButton btnEditarEditCli = new JButton("Editar");
		btnEditarEditCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Cliente objClientes = objApp.consultarCliente(fieldCPFEditClienteCon.getText());

					if (objClientes != null) {
						objClientes.setNome(fieldNomeCliEdit.getText());
						objClientes.setCpf(fieldCPFCliEdit.getText());
						objClientes.setEmail(fieldEmailCliEdit.getText());
						objClientes.setDataNasc(fieldDataNascCliEdit.getText()); 
						
						Admin.gravarArquivo(objApp);
						
						JOptionPane.showMessageDialog(null, "Cliente editado com sucesso.");
					} else {
						JOptionPane.showMessageDialog(null, "Digite o CPF do cliente.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Cliente não encontrado");
				}
			}
		});
		btnEditarEditCli.setForeground(Color.WHITE);
		btnEditarEditCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnEditarEditCli.setBackground(new Color(199, 21, 133));
		btnEditarEditCli.setBounds(265, 195, 276, 43);
		editPanelCli.add(btnEditarEditCli);
		tabbedPaneCli.setEnabledAt(1, true);
		tabbedPaneCli.setDisabledIconAt(1, new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_edit.png")));
		
		//Exclusão cliente
		JLayeredPane layeredPaneExclusaoCLi = new JLayeredPane();
		tabbedPaneCli.addTab("Exclus\u00E3o", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_delete.png")), layeredPaneExclusaoCLi, null);
		
		JPanel delPanelCli = new JPanel();
		delPanelCli.setLayout(null);
		delPanelCli.setBounds(26, 86, 840, 283);
		layeredPaneExclusaoCLi.add(delPanelCli);
		delPanelCli.setVisible(false);
		
		JLabel lblCPFDelCliCons = new JLabel("CPF do cliente:");
		lblCPFDelCliCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFDelCliCons.setBounds(28, 43, 144, 16);
		layeredPaneExclusaoCLi.add(lblCPFDelCliCons);
		
		fieldCPFDelCliCons = new JTextField();
		fieldCPFDelCliCons.setColumns(10);
		fieldCPFDelCliCons.setBounds(191, 41, 379, 22);
		layeredPaneExclusaoCLi.add(fieldCPFDelCliCons);
		
		JLabel lblNomeDelCli = new JLabel("Nome: ");
		lblNomeDelCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeDelCli.setBounds(28, 28, 56, 16);
		delPanelCli.add(lblNomeDelCli);
		
		JLabel lblCPFDelCli = new JLabel("CPF: ");
		lblCPFDelCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFDelCli.setBounds(28, 67, 56, 16);
		delPanelCli.add(lblCPFDelCli);
		
		JLabel lblEmailDelCli = new JLabel("E-mail: ");
		lblEmailDelCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailDelCli.setBounds(28, 104, 72, 16);
		delPanelCli.add(lblEmailDelCli);
		
		JLabel lblDataNascDelCli = new JLabel("Data de Nascimento: ");
		lblDataNascDelCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascDelCli.setBounds(28, 141, 143, 16);
		delPanelCli.add(lblDataNascDelCli);
		
		JLabel lblDataCadDelCli = new JLabel("Data de Cadastro: ");
		lblDataCadDelCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataCadDelCli.setBounds(422, 29, 143, 16);
		delPanelCli.add(lblDataCadDelCli);
		
		JLabel lblPedidosDelCli = new JLabel("Pedidos: ");
		lblPedidosDelCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblPedidosDelCli.setBounds(422, 68, 81, 16);
		delPanelCli.add(lblPedidosDelCli);
		tabbedPaneCli.setDisabledIconAt(2, new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_delete.png")));
		tabbedPaneCli.setEnabledAt(2, true);
		
		JLabel NomeDelCli = new JLabel("");
		NomeDelCli.setBounds(87, 29, 276, 16);
		delPanelCli.add(NomeDelCli);
		
		JLabel CPFDelCli = new JLabel("");
		CPFDelCli.setBounds(71, 68, 292, 16);
		delPanelCli.add(CPFDelCli);
		
		JLabel EmailDelCli = new JLabel("");
		EmailDelCli.setBounds(87, 105, 282, 16);
		delPanelCli.add(EmailDelCli);
		
		JLabel DataNascDelCli = new JLabel("");
		DataNascDelCli.setBounds(179, 142, 184, 16);
		delPanelCli.add(DataNascDelCli);
		
		JLabel DataCadDelCli = new JLabel("");
		DataCadDelCli.setBounds(560, 31, 184, 16);
		delPanelCli.add(DataCadDelCli);
		
		JLabel PedidosDelCli = new JLabel("");
		PedidosDelCli.setBounds(489, 68, 184, 16);
		delPanelCli.add(PedidosDelCli);
		
		JButton btnPesquisarDelCli = new JButton("Pesquisar");
		btnPesquisarDelCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Cliente objCliente = objApp.consultarCliente(fieldCPFDelCliCons.getText());
					
					if (objCliente != null) {
						delPanelCli.setVisible(true); 
						NomeDelCli.setText(objCliente.getNome());
						CPFDelCli.setText(objCliente.getCpf());
						EmailDelCli.setText(objCliente.getEmail());
						DataNascDelCli.setText(objCliente.getDataNasc());
						DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
						String dataCad = df.format(objCliente.getDataEntrada());
						DataCadDelCli.setText(dataCad);
						PedidosDelCli.setText(Integer.toString(objCliente.getQntPedidos()));
					} else {
						JOptionPane.showMessageDialog(null, "Digite o CPF do cliente.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o cliente desejado, tente novamente.");
				}
			}
		});
		btnPesquisarDelCli.setForeground(Color.WHITE);
		btnPesquisarDelCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarDelCli.setBackground(new Color(199, 21, 133));
		btnPesquisarDelCli.setBounds(595, 40, 131, 25);
		layeredPaneExclusaoCLi.add(btnPesquisarDelCli);
		
		JButton btnExcluirDelCli = new JButton("Excluir");
		btnExcluirDelCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					objApp.excluirCliente(fieldCPFDelCliCons.getText());
					
					Admin.gravarArquivo(objApp);
					
					JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnExcluirDelCli.setForeground(Color.WHITE);
		btnExcluirDelCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnExcluirDelCli.setBackground(new Color(199, 21, 133));
		btnExcluirDelCli.setBounds(265, 195, 276, 43);
		delPanelCli.add(btnExcluirDelCli);
		
		//Consulta Cliente
		JLayeredPane layeredPaneConsultaCLi = new JLayeredPane();
		tabbedPaneCli.addTab("Consulta", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_search.png")), layeredPaneConsultaCLi, null);
		layeredPaneConsultaCLi.setLayout(null);
		
		JLabel lblCPFConsConsCli = new JLabel("CPF do cliente:");
		lblCPFConsConsCli.setBounds(28, 43, 144, 16);
		lblCPFConsConsCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		layeredPaneConsultaCLi.add(lblCPFConsConsCli);
		
		fieldCPFConsConsCli = new JTextField();
		fieldCPFConsConsCli.setBounds(191, 41, 379, 22);
		fieldCPFConsConsCli.setColumns(10);
		layeredPaneConsultaCLi.add(fieldCPFConsConsCli);
		
		JScrollPane scrollPaneTableCli = new JScrollPane();
		scrollPaneTableCli.setVisible(false);
		scrollPaneTableCli.setBounds(12, 82, 876, 287);
		layeredPaneConsultaCLi.add(scrollPaneTableCli);
		
		tableAllCli = new JTable();
		tableAllCli.setVisible(true);
		DefaultTableModel modelCli = (DefaultTableModel) tableAllCli.getModel();
		Object[] titleJTableCli  = {"Nome", "CPF", "E-mail", "Data de Nascimento", "Data de cadastro", "Quantidade de Pedidos"};
		
		for (int i = 0; i < titleJTableCli.length; i++) {
			modelCli.addColumn(titleJTableCli[i]);
		}
		tableAllCli.setVisible(true);
		scrollPaneTableCli.setViewportView(tableAllCli);
		
		JButton btnPesquisarConsCli = new JButton("Pesquisar");
		btnPesquisarConsCli.setBounds(595, 40, 131, 25);
		btnPesquisarConsCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DefaultTableModel model = (DefaultTableModel) tableAllCli.getModel();
					
					Cliente cliente = objApp.consultarCliente(fieldCPFConsConsCli.getText());
					Object[] row = new Object[6];
					
					if (cliente != null) {
						scrollPaneTableCli.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Digite o CPF do cliente.");
					}
					
						InterfaceUtil.limparTabela(modelCli);
						row[0] = cliente.getNome();
						row[1] = cliente.getCpf();
						row[2] = cliente.getEmail();
						row[3] = cliente.getDataNasc();
						row[4] = cliente.getDataEntrada();
						row[5] = cliente.getQntPedidos();
						
						model.addRow(row);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o cliente desejado, tente novamente.");
				}
			}
		});
		btnPesquisarConsCli.setForeground(Color.WHITE);
		btnPesquisarConsCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarConsCli.setBackground(new Color(199, 21, 133));
		layeredPaneConsultaCLi.add(btnPesquisarConsCli);
		
		JButton btnVerTudoConsCli = new JButton("Ver tudo");
		btnVerTudoConsCli.setBounds(738, 40, 131, 25);
		btnVerTudoConsCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPaneTableCli.setVisible(true);
				try {
					DefaultTableModel model = (DefaultTableModel) tableAllCli.getModel();
					
					List<Cliente> cliente = objApp.listarClientes();
					Object[] row = new Object[6];
					
					if (cliente != null) {
						scrollPaneTableCli.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Digite o CPF do cliente.");
					}
					
						InterfaceUtil.limparTabela(modelCli);
						row[0] = ((Cliente) cliente).getNome();
						row[1] = ((Cliente) cliente).getCpf();
						row[2] = ((Cliente) cliente).getEmail();
						row[3] = ((Cliente) cliente).getDataNasc();
						row[4] = ((Cliente) cliente).getDataEntrada();
						row[5] = ((Cliente) cliente).getQntPedidos();
						
						model.addRow(row);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o cliente desejado, tente novamente.");
				}
 			}
		});
		btnVerTudoConsCli.setForeground(Color.WHITE);
		btnVerTudoConsCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnVerTudoConsCli.setBackground(new Color(199, 21, 133));
		layeredPaneConsultaCLi.add(btnVerTudoConsCli);
		
		
		//Painel Gerente
		JLayeredPane panelGerente = new JLayeredPane();
		panelGerente.setToolTipText("");
		tabbedPaneMain.addTab("Gerente", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_manager.png")), panelGerente, null);
		
		JTabbedPane tabbedPaneMan = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMan.setBackground(new Color(255, 255, 255));
		tabbedPaneMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		tabbedPaneMan.setBounds(12, 13, 905, 428);
		panelGerente.add(tabbedPaneMan);
		
		JLayeredPane layeredPane_9 = new JLayeredPane();
		tabbedPaneMan.addTab("Cadastro", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_add.png")), layeredPane_9, null);
		
		//Cadastro Gerente
		JLayeredPane layeredPaneCadastroMan = new JLayeredPane();
		layeredPaneCadastroMan.setLayout(null);
		layeredPaneCadastroMan.setBackground(new Color(152, 251, 152));
		layeredPaneCadastroMan.setBounds(0, 0, 900, 382);
		layeredPane_9.add(layeredPaneCadastroMan);
		
		JLabel lblNomeMan = new JLabel("Nome: ");
		lblNomeMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeMan.setBounds(31, 41, 56, 16);
		layeredPaneCadastroMan.add(lblNomeMan);
		
		fieldNomeMan = new JTextField();
		fieldNomeMan.setColumns(10);
		fieldNomeMan.setBounds(196, 35, 658, 22);
		layeredPaneCadastroMan.add(fieldNomeMan);
		
		JLabel lblCPFMan = new JLabel("CPF: ");
		lblCPFMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFMan.setBounds(31, 90, 56, 16);
		layeredPaneCadastroMan.add(lblCPFMan);
		
		fieldCPFMan = new JTextField();
		fieldCPFMan.setColumns(10);
		fieldCPFMan.setBounds(196, 85, 658, 22);
		layeredPaneCadastroMan.add(fieldCPFMan);
		
		fieldEmailMan = new JTextField();
		fieldEmailMan.setColumns(10);
		fieldEmailMan.setBounds(196, 131, 658, 22);
		layeredPaneCadastroMan.add(fieldEmailMan);
		
		fieldDataNascMan = new JTextField();
		fieldDataNascMan.setColumns(10);
		fieldDataNascMan.setBounds(196, 178, 658, 22);
		layeredPaneCadastroMan.add(fieldDataNascMan);
		
		JLabel lblDataNascMan = new JLabel("Data de Nascimento:");
		lblDataNascMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascMan.setBounds(31, 184, 145, 16);
		layeredPaneCadastroMan.add(lblDataNascMan);
		
		JLabel lblEmailMan = new JLabel("E-mail: ");
		lblEmailMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailMan.setBounds(31, 137, 56, 16);
		layeredPaneCadastroMan.add(lblEmailMan);
		
		JLabel lblSenhaMan = new JLabel("Senha:");
		lblSenhaMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSenhaMan.setBounds(31, 279, 145, 16);
		layeredPaneCadastroMan.add(lblSenhaMan);
		
		JLabel lblSalarioMan = new JLabel("Sal\u00E1rio: ");
		lblSalarioMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSalarioMan.setBounds(31, 232, 56, 16);
		layeredPaneCadastroMan.add(lblSalarioMan);
		
		fieldSalarioMan = new JTextField();
		fieldSalarioMan.setColumns(10);
		fieldSalarioMan.setBounds(196, 226, 658, 22);
		layeredPaneCadastroMan.add(fieldSalarioMan);
		
		fieldSenhaMan = new JTextField();
		fieldSenhaMan.setColumns(10);
		fieldSenhaMan.setBounds(196, 273, 658, 22);
		layeredPaneCadastroMan.add(fieldSenhaMan);
		
		//Edição Gerente
		JLayeredPane layeredPane_10 = new JLayeredPane();
		tabbedPaneMan.addTab("Edi\u00E7\u00E3o\r\n", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_edit.png")), layeredPane_10, null);
		
		JLayeredPane layeredPaneEdicaoMan = new JLayeredPane();
		layeredPaneEdicaoMan.setBounds(0, 0, 900, 382);
		layeredPane_10.add(layeredPaneEdicaoMan);
		
		JLabel lblMatManEditCon = new JLabel("Matr\u00EDcula do Gerente:");
		lblMatManEditCon.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblMatManEditCon.setBounds(28, 43, 144, 16);
		layeredPaneEdicaoMan.add(lblMatManEditCon);
		
		fieldMatEditManCons = new JTextField();
		fieldMatEditManCons.setColumns(10);
		fieldMatEditManCons.setBounds(191, 43, 379, 22);
		layeredPaneEdicaoMan.add(fieldMatEditManCons);
		
		JPanel panelEditMan = new JPanel();
		panelEditMan.setVisible(false);
		panelEditMan.setLayout(null);
		panelEditMan.setBounds(26, 86, 840, 283);
		layeredPaneEdicaoMan.add(panelEditMan);
		
		JLabel lblNomeManEdit = new JLabel("Nome: ");
		lblNomeManEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeManEdit.setBounds(28, 15, 56, 16);
		panelEditMan.add(lblNomeManEdit);
		
		JLabel lblCPFManEdit = new JLabel("CPF: ");
		lblCPFManEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFManEdit.setBounds(28, 54, 56, 16);
		panelEditMan.add(lblCPFManEdit);
		
		JLabel lblEmailManEdit = new JLabel("E-mail: ");
		lblEmailManEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailManEdit.setBounds(28, 91, 143, 16);
		panelEditMan.add(lblEmailManEdit);
		
		JLabel lblDataNascManEdit = new JLabel("Data de Nascimento: ");
		lblDataNascManEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascManEdit.setBounds(28, 128, 143, 16);
		panelEditMan.add(lblDataNascManEdit);
		
		fieldNomeEditMan = new JTextField();
		fieldNomeEditMan.setColumns(10);
		fieldNomeEditMan.setBounds(191, 13, 590, 22);
		panelEditMan.add(fieldNomeEditMan);
		
		fieldCPFEditMan = new JTextField();
		fieldCPFEditMan.setColumns(10);
		fieldCPFEditMan.setBounds(191, 52, 590, 22);
		panelEditMan.add(fieldCPFEditMan);
		
		fieldEmailEditMan = new JTextField();
		fieldEmailEditMan.setColumns(10);
		fieldEmailEditMan.setBounds(191, 89, 590, 22);
		panelEditMan.add(fieldEmailEditMan);
		
		fieldDataNascEditMan = new JTextField();
		fieldDataNascEditMan.setColumns(10);
		fieldDataNascEditMan.setBounds(191, 126, 590, 22);
		panelEditMan.add(fieldDataNascEditMan);
		
		JLabel lblSalarioManEdit = new JLabel("Sal\u00E1rio: ");
		lblSalarioManEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSalarioManEdit.setBounds(28, 159, 143, 16);
		panelEditMan.add(lblSalarioManEdit);
		
		fieldSalarioEditMan = new JTextField();
		fieldSalarioEditMan.setColumns(10);
		fieldSalarioEditMan.setBounds(191, 157, 590, 22);
		panelEditMan.add(fieldSalarioEditMan);
		
		JLabel lblSenhaManEdit = new JLabel("Senha: ");
		lblSenhaManEdit.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSenhaManEdit.setBounds(28, 196, 143, 16);
		panelEditMan.add(lblSenhaManEdit);
		
		fieldNSenhaEditMan = new JTextField();
		fieldNSenhaEditMan.setColumns(10);
		fieldNSenhaEditMan.setBounds(191, 194, 590, 22);
		panelEditMan.add(fieldNSenhaEditMan);
		
		JButton btnPesquisarEditMan = new JButton("Pesquisar");
		btnPesquisarEditMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Gerente objGerentes = objApp.consultarGerente(fieldMatEditManCons.getText());
					
					if (objGerentes != null) {
					panelEditMan.setVisible(true); 
					
					} else {
						JOptionPane.showMessageDialog(null, "Digite a matrícula do gerente.");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o gerente desejado, tente novamente.");
				}
				}
		});
		btnPesquisarEditMan.setForeground(Color.WHITE);
		btnPesquisarEditMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarEditMan.setBackground(new Color(199, 21, 133));
		btnPesquisarEditMan.setBounds(595, 43, 131, 25);
		layeredPaneEdicaoMan.add(btnPesquisarEditMan);
		
		JButton btnEditarEditMan = new JButton("Editar");
		btnEditarEditMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Gerente objGerente = objApp.consultarGerente(fieldCPFEditClienteCon.getText());

					if (objGerente != null) {
						objGerente.setNome(fieldNomeEditMan.getText());
						objGerente.setCpf(fieldCPFEditMan.getText());
						objGerente.setEmail(fieldEmailEditMan.getText());
						objGerente.setDataNasc(fieldDataNascEditMan.getText());
						objGerente.setSalarioBase(Double.parseDouble(fieldSalarioEditMan.getText()));
						objGerente.setSenha(Integer.parseInt(fieldNSenhaEditMan.getText()));
						
						Admin.gravarArquivo(objApp);
						
						JOptionPane.showMessageDialog(null, "Gerente editado com sucesso.");
					} else {
						JOptionPane.showMessageDialog(null, "Digite o CPF do gerente.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Gerente não encontrado");
				}
			}
		});
		btnEditarEditMan.setForeground(Color.WHITE);
		btnEditarEditMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnEditarEditMan.setBackground(new Color(199, 21, 133));
		btnEditarEditMan.setBounds(266, 227, 276, 43);
		panelEditMan.add(btnEditarEditMan);
		
		//Exclusão Gerente
		JLayeredPane layeredPane_11 = new JLayeredPane();
		tabbedPaneMan.addTab("Exclus\u00E3o", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_delete.png")), layeredPane_11, null);
		
		JLayeredPane layeredPaneExclusaoMan = new JLayeredPane();
		layeredPaneExclusaoMan.setBounds(0, 0, 900, 382);
		layeredPane_11.add(layeredPaneExclusaoMan);
		
		JLabel lblMatDelManCons = new JLabel("Matr\u00EDcula do Gerente:");
		lblMatDelManCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblMatDelManCons.setBounds(28, 43, 144, 16);
		layeredPaneExclusaoMan.add(lblMatDelManCons);
		
		fieldMatDelManCons = new JTextField();
		fieldMatDelManCons.setColumns(10);
		fieldMatDelManCons.setBounds(191, 43, 379, 22);
		layeredPaneExclusaoMan.add(fieldMatDelManCons);
		
		JPanel panelDelMan = new JPanel();
		panelDelMan.setVisible(false);
		panelDelMan.setLayout(null);
		panelDelMan.setBounds(26, 86, 840, 283);
		layeredPaneExclusaoMan.add(panelDelMan);
		
		JLabel lblNomeDelMan = new JLabel("Nome: ");
		lblNomeDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeDelMan.setBounds(28, 28, 56, 16);
		panelDelMan.add(lblNomeDelMan);
		
		JLabel lblCPFDelMan = new JLabel("CPF: ");
		lblCPFDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFDelMan.setBounds(28, 67, 56, 16);
		panelDelMan.add(lblCPFDelMan);
		
		JLabel lblEmailDelMan = new JLabel("E-mail: ");
		lblEmailDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailDelMan.setBounds(28, 104, 143, 16);
		panelDelMan.add(lblEmailDelMan);
		
		JLabel lblDataNascDelMan = new JLabel("Data de Nascimento: ");
		lblDataNascDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascDelMan.setBounds(28, 141, 143, 16);
		panelDelMan.add(lblDataNascDelMan);
		
		JLabel lblMatDelMan = new JLabel("Matr\u00EDcula: ");
		lblMatDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblMatDelMan.setBounds(422, 29, 143, 16);
		panelDelMan.add(lblMatDelMan);
		
		JLabel lblSalarioDelMan = new JLabel("Sal\u00E1rio: ");
		lblSalarioDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSalarioDelMan.setBounds(422, 68, 81, 16);
		panelDelMan.add(lblSalarioDelMan);
		
		JLabel lblSenhaDelMan = new JLabel("Senha: ");
		lblSenhaDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSenhaDelMan.setBounds(422, 102, 143, 16);
		panelDelMan.add(lblSenhaDelMan);
		
		JLabel lblNomeManDel = new JLabel("");
		lblNomeManDel.setBounds(88, 29, 322, 16);
		panelDelMan.add(lblNomeManDel);
		
		JLabel lblCPFManDel = new JLabel("");
		lblCPFManDel.setBounds(70, 68, 340, 16);
		panelDelMan.add(lblCPFManDel);
		
		JLabel lblEmailManDel = new JLabel("");
		lblEmailManDel.setBounds(88, 105, 322, 16);
		panelDelMan.add(lblEmailManDel);
		
		JLabel lblDataNascManDel = new JLabel("");
		lblDataNascManDel.setBounds(182, 141, 228, 16);
		panelDelMan.add(lblDataNascManDel);
		
		JLabel lblMatriculaManDel = new JLabel("");
		lblMatriculaManDel.setBounds(496, 29, 302, 16);
		panelDelMan.add(lblMatriculaManDel);
		
		JLabel lblSalarioManDel = new JLabel("");
		lblSalarioManDel.setBounds(485, 68, 313, 16);
		panelDelMan.add(lblSalarioManDel);
		
		JLabel lblSenhaManDel = new JLabel("");
		lblSenhaManDel.setBounds(485, 105, 313, 16);
		panelDelMan.add(lblSenhaManDel);
		
		JButton btnPesquisarDelMan = new JButton("Pesquisar");
		btnPesquisarDelMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Gerente objGerentes = objApp.consultarGerente(fieldMatDelManCons.getText());
					
					if (objGerentes != null) {
					editPanelCli.setVisible(true); 
					lblNomeManDel.setText(objGerentes.getNome());
					lblCPFManDel.setText(objGerentes.getCpf());
					lblEmailManDel.setText(objGerentes.getEmail());
					lblDataNascManDel.setText(objGerentes.getDataNasc());
					lblMatriculaManDel.setText(objGerentes.getMatricula());
					lblSalarioManDel.setText(Double.toString(objGerentes.getSalarioBase()));
					lblSenhaManDel.setText(Integer.toString(objGerentes.getSenha()));
					
					} else {
						JOptionPane.showMessageDialog(null, "Digite a matrícula do gerente.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o gerente desejado, tente novamente.");
				
				}
			}
		});
		btnPesquisarDelMan.setForeground(Color.WHITE);
		btnPesquisarDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarDelMan.setBackground(new Color(199, 21, 133));
		btnPesquisarDelMan.setBounds(595, 43, 131, 25);
		layeredPaneExclusaoMan.add(btnPesquisarDelMan);
		
		JButton btnExcluirDelMan = new JButton("Excluir");
		btnExcluirDelMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					objApp.excluirGerente(fieldMatDelManCons.getText());
					
					Admin.gravarArquivo(objApp);
					
					JOptionPane.showMessageDialog(null, "Gerente excluído com sucesso.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnExcluirDelMan.setForeground(Color.WHITE);
		btnExcluirDelMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnExcluirDelMan.setBackground(new Color(199, 21, 133));
		btnExcluirDelMan.setBounds(265, 195, 276, 43);
		panelDelMan.add(btnExcluirDelMan);
		
		//Consulta Gerente
		JLayeredPane layeredPaneConsultaMan = new JLayeredPane();
		tabbedPaneMan.addTab("Consulta", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_search.png")), layeredPaneConsultaMan, null);
		
		JLabel lblMatConsConsMan = new JLabel("Matr\u00EDcula do Gerente:");
		lblMatConsConsMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblMatConsConsMan.setBounds(28, 43, 144, 16);
		layeredPaneConsultaMan.add(lblMatConsConsMan);
		
		fieldMatConsConsMan = new JTextField();
		fieldMatConsConsMan.setColumns(10);
		fieldMatConsConsMan.setBounds(191, 43, 379, 22);
		layeredPaneConsultaMan.add(fieldMatConsConsMan);
		
		JScrollPane scrollPaneTableMan = new JScrollPane();
		scrollPaneTableMan.setVisible(false);
		scrollPaneTableMan.setBounds(12, 82, 876, 287);
		layeredPaneConsultaMan.add(scrollPaneTableMan);
		
		tableAllMan = new JTable();
		tableAllMan.setBounds(28, 89, 842, 280);
		tableAllMan.setVisible(false);
		DefaultTableModel modelMan = (DefaultTableModel) tableAllMan.getModel();
		Object[] titleJTableMan  = {"Matricula", "Nome", "CPF", "E-mail", "Data de Nascimento", "Salário Base", "Senha"};
		
		for (int i = 0; i < titleJTableMan.length; i++) {
			modelMan.addColumn(titleJTableMan[i]);
		}
		tableAllMan.setVisible(true);
		scrollPaneTableMan.setViewportView(tableAllMan);
		
		JButton btnPesquisarConsMan = new JButton("Pesquisar");
		btnPesquisarConsMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					try {
						DefaultTableModel model = (DefaultTableModel) tableAllMan.getModel();
						
						Gerente gerente = objApp.consultarGerente(fieldMatConsConsMan.getText());
						Object[] row = new Object[7];
						
						if (gerente != null) {
							scrollPaneTableCli.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(null, "Digite a matrícula do gerente.");
						}
						
							InterfaceUtil.limparTabela(modelCli);
							row[0] = gerente.getMatricula();
							row[1] = gerente.getNome();
							row[2] = gerente.getCpf();
							row[3] = gerente.getEmail();
							row[4] = gerente.getDataNasc();
							row[5] = gerente.getSenha();
							row[6] = gerente.getSalarioBase();
							
							model.addRow(row);
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Não foi possível acessar o gerente desejado, tente novamente.");
					}
			}
		});
		btnPesquisarConsMan.setForeground(Color.WHITE);
		btnPesquisarConsMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarConsMan.setBackground(new Color(199, 21, 133));
		btnPesquisarConsMan.setBounds(595, 43, 131, 25);
		layeredPaneConsultaMan.add(btnPesquisarConsMan);
		
		JButton btnVerTudoConsMan = new JButton("Ver tudo");
		btnVerTudoConsMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPaneTableMan.setVisible(true);
				
				try {
					DefaultTableModel model = (DefaultTableModel) tableAllMan.getModel();
					
					List<Gerente> gerente = objApp.listarGerentes();
					Object[] row = new Object[7];
					
					if (gerente != null) {
						scrollPaneTableCli.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Digite a matrícula do gerente.");
					}
					
						InterfaceUtil.limparTabela(modelCli);
						row[0] = ((Gerente) gerente).getMatricula();
						row[1] = ((Gerente) gerente).getNome();
						row[2] = ((Gerente) gerente).getCpf();
						row[3] = ((Gerente) gerente).getEmail();
						row[4] = ((Gerente) gerente).getDataNasc();
						row[5] = ((Gerente) gerente).getSenha();
						row[6] = ((Gerente) gerente).getSalarioBase();
						
						model.addRow(row);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o gerente desejado, tente novamente.");
				}
			}
		});
		btnVerTudoConsMan.setForeground(Color.WHITE);
		btnVerTudoConsMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnVerTudoConsMan.setBackground(new Color(199, 21, 133));
		btnVerTudoConsMan.setBounds(738, 43, 131, 25);
		layeredPaneConsultaMan.add(btnVerTudoConsMan);
		
		//Painel Vendedor
		JLayeredPane panelVendedor = new JLayeredPane();
		tabbedPaneMain.addTab("Vendedor", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_seller.png")), panelVendedor, null);
		
		JTabbedPane tabbedPaneSel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		tabbedPaneSel.setBackground(new Color(255, 255, 255));
		tabbedPaneSel.setBounds(12, 13, 905, 428);
		panelVendedor.add(tabbedPaneSel);
		
		//Cadastro Vendedor
		JLayeredPane layeredPane_14 = new JLayeredPane();
		tabbedPaneSel.addTab("Cadastro", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_add.png")), layeredPane_14, null);
		
		JLayeredPane layeredPaneCadastroSel = new JLayeredPane();
		layeredPaneCadastroSel.setLayout(null);
		layeredPaneCadastroSel.setBackground(new Color(152, 251, 152));
		layeredPaneCadastroSel.setBounds(0, 0, 900, 382);
		layeredPane_14.add(layeredPaneCadastroSel);
		
		JLabel lblNomeSel = new JLabel("Nome: ");
		lblNomeSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeSel.setBounds(31, 41, 56, 16);
		layeredPaneCadastroSel.add(lblNomeSel);
		
		fieldNomeSel = new JTextField();
		fieldNomeSel.setColumns(10);
		fieldNomeSel.setBounds(196, 35, 658, 22);
		layeredPaneCadastroSel.add(fieldNomeSel);
		
		JLabel lblCPFSel = new JLabel("CPF: ");
		lblCPFSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFSel.setBounds(31, 90, 56, 16);
		layeredPaneCadastroSel.add(lblCPFSel);
		
		fieldCPFSel = new JTextField();
		fieldCPFSel.setColumns(10);
		fieldCPFSel.setBounds(196, 85, 658, 22);
		layeredPaneCadastroSel.add(fieldCPFSel);
		
		fieldEmailSel = new JTextField();
		fieldEmailSel.setColumns(10);
		fieldEmailSel.setBounds(196, 131, 658, 22);
		layeredPaneCadastroSel.add(fieldEmailSel);
		
		fieldDataNascSel = new JTextField();
		fieldDataNascSel.setColumns(10);
		fieldDataNascSel.setBounds(196, 178, 658, 22);
		layeredPaneCadastroSel.add(fieldDataNascSel);
		
		JLabel lblDataNascSel = new JLabel("Data de Nascimento:");
		lblDataNascSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascSel.setBounds(31, 184, 145, 16);
		layeredPaneCadastroSel.add(lblDataNascSel);
		
		JLabel lblEmailSel = new JLabel("E-mail: ");
		lblEmailSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailSel.setBounds(31, 137, 56, 16);
		layeredPaneCadastroSel.add(lblEmailSel);
		
		JLabel lblSenhaSel = new JLabel("Senha: ");
		lblSenhaSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSenhaSel.setBounds(31, 232, 56, 16);
		layeredPaneCadastroSel.add(lblSenhaSel);
		
		fieldSenhaSel = new JTextField();
		fieldSenhaSel.setColumns(10);
		fieldSenhaSel.setBounds(196, 226, 658, 22);
		layeredPaneCadastroSel.add(fieldSenhaSel);

		//Edição Vendedor
		JLayeredPane layeredPane_15 = new JLayeredPane();
		tabbedPaneSel.addTab("Edi\u00E7\u00E3o", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_edit.png")), layeredPane_15, null);
		
		JLayeredPane layeredPaneEdicaoSel = new JLayeredPane();
		layeredPaneEdicaoSel.setBounds(0, 0, 900, 382);
		layeredPane_15.add(layeredPaneEdicaoSel);
		
		JLabel lblMatEditSelCons = new JLabel("Matr\u00EDcula do Vendedor:");
		lblMatEditSelCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblMatEditSelCons.setBounds(28, 43, 166, 16);
		layeredPaneEdicaoSel.add(lblMatEditSelCons);
		
		fieldMatEditSelCons = new JTextField();
		fieldMatEditSelCons.setColumns(10);
		fieldMatEditSelCons.setBounds(191, 43, 379, 22);
		layeredPaneEdicaoSel.add(fieldMatEditSelCons);
		
		JPanel panelEditSel = new JPanel();
		panelEditSel.setVisible(false);
		panelEditSel.setLayout(null);
		panelEditSel.setBounds(26, 86, 840, 283);
		layeredPaneEdicaoSel.add(panelEditSel);
		
		JButton btnPesquisarEditSel = new JButton("Pesquisar");
		btnPesquisarEditSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Vendedor objVendedor = objApp.consultarVendedor(fieldMatEditSelCons.getText());
					
					if (objVendedor != null) {
						panelEditSel.setVisible(true); 
					} else {
						JOptionPane.showMessageDialog(null, "Digite a matrícula do vendedor.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o vendedor desejado, tente novamente.");
				
				}
			}
		});
		btnPesquisarEditSel.setForeground(Color.WHITE);
		btnPesquisarEditSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarEditSel.setBackground(new Color(199, 21, 133));
		btnPesquisarEditSel.setBounds(595, 43, 131, 25);
		layeredPaneEdicaoSel.add(btnPesquisarEditSel);
		
		JLabel lblNomeEditSel = new JLabel("Nome: ");
		lblNomeEditSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeEditSel.setBounds(28, 15, 56, 16);
		panelEditSel.add(lblNomeEditSel);
		
		JLabel lblCPFEditSel = new JLabel("CPF: ");
		lblCPFEditSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFEditSel.setBounds(28, 54, 56, 16);
		panelEditSel.add(lblCPFEditSel);
		
		JLabel lblEmailEditSel = new JLabel("E-mail: ");
		lblEmailEditSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailEditSel.setBounds(28, 91, 143, 16);
		panelEditSel.add(lblEmailEditSel);
		
		JLabel lblDataNascEditSel = new JLabel("Data de Nascimento: ");
		lblDataNascEditSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascEditSel.setBounds(28, 128, 143, 16);
		panelEditSel.add(lblDataNascEditSel);
		
		fieldNomeEditSel = new JTextField();
		fieldNomeEditSel.setColumns(10);
		fieldNomeEditSel.setBounds(191, 13, 590, 22);
		panelEditSel.add(fieldNomeEditSel);
		
		fieldCPFEditSel = new JTextField();
		fieldCPFEditSel.setColumns(10);
		fieldCPFEditSel.setBounds(191, 52, 590, 22);
		panelEditSel.add(fieldCPFEditSel);
		
		fieldEmailEditSel = new JTextField();
		fieldEmailEditSel.setColumns(10);
		fieldEmailEditSel.setBounds(191, 89, 590, 22);
		panelEditSel.add(fieldEmailEditSel);
		
		fieldDataNascEditSel = new JTextField();
		fieldDataNascEditSel.setColumns(10);
		fieldDataNascEditSel.setBounds(191, 126, 590, 22);
		panelEditSel.add(fieldDataNascEditSel);
		
		JButton btnEditarEditSel = new JButton("Editar");
		btnEditarEditSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Vendedor objVendedor = objApp.consultarVendedor(fieldMatEditSelCons.getText());

					if (objVendedor != null) {
						objVendedor.setNome(fieldNomeCliEdit.getText());
						objVendedor.setCpf(fieldCPFCliEdit.getText());
						objVendedor.setEmail(fieldEmailCliEdit.getText());
						objVendedor.setDataNasc(fieldDataNascCliEdit.getText());
						objVendedor.setSenha(Integer.parseInt(fieldNSenhaEditMan.getText()));
						
						Admin.gravarArquivo(objApp);
						
						JOptionPane.showMessageDialog(null, "Vendedor editado com sucesso.");
					} else {
						JOptionPane.showMessageDialog(null, "Digite a matrícula do vendedor.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Vendedor não encontrado");
				}
			}
		});
		btnEditarEditSel.setForeground(Color.WHITE);
		btnEditarEditSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnEditarEditSel.setBackground(new Color(199, 21, 133));
		btnEditarEditSel.setBounds(266, 227, 276, 43);
		panelEditSel.add(btnEditarEditSel);
		
		JLabel lblSenhaEditSel = new JLabel("Senha: ");
		lblSenhaEditSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSenhaEditSel.setBounds(28, 159, 143, 16);
		panelEditSel.add(lblSenhaEditSel);
		
		fieldSenhaEditSel = new JTextField();
		fieldSenhaEditSel.setColumns(10);
		fieldSenhaEditSel.setBounds(191, 157, 590, 22);
		panelEditSel.add(fieldSenhaEditSel);
		
		JLayeredPane layeredPane_16 = new JLayeredPane();
		tabbedPaneSel.addTab("Exclus\u00E3o", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_delete.png")), layeredPane_16, null);
		
		//Exclusão Vendedor
		JLayeredPane layeredPaneExclusaoSel = new JLayeredPane();
		layeredPaneExclusaoSel.setBounds(0, 0, 900, 382);
		layeredPane_16.add(layeredPaneExclusaoSel);
		
		JLabel lblMatDelSelCons = new JLabel("Matr\u00EDcula do Vendedor:");
		lblMatDelSelCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblMatDelSelCons.setBounds(28, 43, 167, 16);
		layeredPaneExclusaoSel.add(lblMatDelSelCons);
		
		fieldMatDelSelCons = new JTextField();
		fieldMatDelSelCons.setColumns(10);
		fieldMatDelSelCons.setBounds(191, 43, 379, 22);
		layeredPaneExclusaoSel.add(fieldMatDelSelCons);
		
		JPanel panelDelSel = new JPanel();
		panelDelSel.setVisible(false);
		panelDelSel.setLayout(null);
		panelDelSel.setBounds(26, 86, 840, 283);
		layeredPaneExclusaoSel.add(panelDelSel);
		
		JLabel lblNomeDelSel = new JLabel("Nome: ");
		lblNomeDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeDelSel.setBounds(28, 28, 56, 16);
		panelDelSel.add(lblNomeDelSel);
		
		JLabel lblCPFDelSel = new JLabel("CPF: ");
		lblCPFDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCPFDelSel.setBounds(28, 67, 56, 16);
		panelDelSel.add(lblCPFDelSel);
		
		JLabel lblEmailDelSel = new JLabel("E-mail: ");
		lblEmailDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblEmailDelSel.setBounds(28, 104, 143, 16);
		panelDelSel.add(lblEmailDelSel);
		
		JLabel lblDataNascDelSel = new JLabel("Data de Nascimento: ");
		lblDataNascDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblDataNascDelSel.setBounds(28, 141, 143, 16);
		panelDelSel.add(lblDataNascDelSel);
		
		JButton btnExcluirDelSel = new JButton("Excluir");
		btnExcluirDelSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					objApp.excluirVendendor(fieldMatDelSelCons.getText());
					
					Admin.gravarArquivo(objApp);
					
					JOptionPane.showMessageDialog(null, "Vendedor excluído com sucesso.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnExcluirDelSel.setForeground(Color.WHITE);
		btnExcluirDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnExcluirDelSel.setBackground(new Color(199, 21, 133));
		btnExcluirDelSel.setBounds(265, 195, 276, 43);
		panelDelSel.add(btnExcluirDelSel);
		
		JLabel lblMatDelSel = new JLabel("Matr\u00EDcula: ");
		lblMatDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblMatDelSel.setBounds(422, 29, 143, 16);
		panelDelSel.add(lblMatDelSel);
		
		JLabel lblVendasDelSel = new JLabel("Vendas: ");
		lblVendasDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblVendasDelSel.setBounds(422, 68, 81, 16);
		panelDelSel.add(lblVendasDelSel);
		
		JLabel lblSenhaDelSel = new JLabel("Senha: ");
		lblSenhaDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSenhaDelSel.setBounds(422, 102, 143, 16);
		panelDelSel.add(lblSenhaDelSel);
		
		JLabel lblNomeSelDel = new JLabel("");
		lblNomeSelDel.setBounds(85, 29, 307, 16);
		panelDelSel.add(lblNomeSelDel);
		
		JLabel lblCPFSelDel = new JLabel("");
		lblCPFSelDel.setBounds(70, 67, 322, 16);
		panelDelSel.add(lblCPFSelDel);
		
		JLabel lblEmailSelDel = new JLabel("");
		lblEmailSelDel.setBounds(85, 105, 307, 16);
		panelDelSel.add(lblEmailSelDel);
		
		JLabel lblDataNascSelDel = new JLabel("");
		lblDataNascSelDel.setBounds(183, 142, 209, 16);
		panelDelSel.add(lblDataNascSelDel);
		
		JLabel lblMatSelDel = new JLabel("");
		lblMatSelDel.setBounds(506, 29, 285, 16);
		panelDelSel.add(lblMatSelDel);
		
		JLabel lblVendasSelDel = new JLabel("");
		lblVendasSelDel.setBounds(488, 68, 303, 16);
		panelDelSel.add(lblVendasSelDel);
		
		JLabel lblSenhaSelDel = new JLabel("");
		lblSenhaSelDel.setBounds(485, 105, 306, 16);
		panelDelSel.add(lblSenhaSelDel);
		
		JButton brnPesquisarDelSel = new JButton("Pesquisar");
		brnPesquisarDelSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Vendedor objVendedor = objApp.consultarVendedor(fieldMatDelSelCons.getText());
					
					if (objVendedor != null) {
						panelDelSel.setVisible(true); 
						lblNomeSelDel.setText(objVendedor.getNome());
						lblCPFSelDel.setText(objVendedor.getCpf());
						lblEmailSelDel.setText(objVendedor.getEmail());
						lblDataNascSelDel.setText(objVendedor.getDataNasc());
						lblMatSelDel.setText(objVendedor.getMatricula());
						lblVendasSelDel.setText(Integer.toString(objVendedor.getNumVendas()));
						lblSenhaSelDel.setText(Integer.toString(objVendedor.getSenha()));
						
					} else {
						JOptionPane.showMessageDialog(null, "Digite a matrícula do vendedor.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o vendedor desejado, tente novamente.");
				
				}
			}
		});
		brnPesquisarDelSel.setForeground(Color.WHITE);
		brnPesquisarDelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		brnPesquisarDelSel.setBackground(new Color(199, 21, 133));
		brnPesquisarDelSel.setBounds(595, 43, 131, 25);
		layeredPaneExclusaoSel.add(brnPesquisarDelSel);
		
		//Consulta Vendedor
		JLayeredPane layeredPane_17 = new JLayeredPane();
		tabbedPaneSel.addTab("Consulta", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_search.png")), layeredPane_17, null);
		
		JLayeredPane layeredPaneConsultaSel = new JLayeredPane();
		layeredPaneConsultaSel.setBounds(0, 0, 900, 382);
		layeredPane_17.add(layeredPaneConsultaSel);
		
		JLabel lblMatConsSelCons = new JLabel("Matr\u00EDcula do Vendedor:");
		lblMatConsSelCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblMatConsSelCons.setBounds(28, 43, 165, 16);
		layeredPaneConsultaSel.add(lblMatConsSelCons);
		
		fieldMatConsSelCons = new JTextField();
		fieldMatConsSelCons.setColumns(10);
		fieldMatConsSelCons.setBounds(191, 43, 379, 22);
		layeredPaneConsultaSel.add(fieldMatConsSelCons);
		
		JScrollPane scrollPaneTableSel = new JScrollPane();
		scrollPaneTableSel.setVisible(false);
		scrollPaneTableSel.setBounds(12, 82, 876, 287);
		layeredPaneConsultaSel.add(scrollPaneTableSel);
		
		tableAllSel = new JTable();
		tableAllSel.setBounds(28, 89, 842, 280);
		DefaultTableModel modelSel = (DefaultTableModel) tableAllSel.getModel();
		Object[] titleJTableSel  = {"Matricula", "Nome", "CPF", "E-mail", "Data de Nascimento", "Quantidade de Vendas", "Senha"};
		
		for (int i = 0; i < titleJTableSel.length; i++) {
			modelSel.addColumn(titleJTableSel[i]);
		}
		tableAllSel.setVisible(true);
		scrollPaneTableSel.setViewportView(tableAllSel);
		
		JButton btnPesquisarConsSel = new JButton("Pesquisar");
		btnPesquisarConsSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DefaultTableModel model = (DefaultTableModel) tableAllSel.getModel();
					
					Vendedor vendedor = objApp.consultarVendedor(fieldMatConsSelCons.getText());
					Object[] row = new Object[7];
					
					if (vendedor != null) {
						scrollPaneTableCli.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Digite a matrícula do vendedor.");
					}
					
						InterfaceUtil.limparTabela(modelCli);
						row[0] = vendedor.getMatricula();
						row[1] = vendedor.getNome();
						row[2] = vendedor.getCpf();
						row[3] = vendedor.getEmail();
						row[4] = vendedor.getDataNasc();
						row[5] = vendedor.getNumVendas();
						row[6] = vendedor.getSenha();
						
						model.addRow(row);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o vendedor desejado, tente novamente.");
				}
			}
		});
		btnPesquisarConsSel.setForeground(Color.WHITE);
		btnPesquisarConsSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarConsSel.setBackground(new Color(199, 21, 133));
		btnPesquisarConsSel.setBounds(595, 43, 131, 25);
		layeredPaneConsultaSel.add(btnPesquisarConsSel);
		
		JButton btnVerTudoConsSel = new JButton("Ver tudo");
		btnVerTudoConsSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPaneTableSel.setVisible(true);
				
				try {
					DefaultTableModel model = (DefaultTableModel) tableAllSel.getModel();
					
					List<Vendedor> vendedor = objApp.listarVendedores();
					Object[] row = new Object[7];
					
					if (vendedor != null) {
						scrollPaneTableCli.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Digite a matrícula do vendedor.");
					}
					
						InterfaceUtil.limparTabela(modelCli);
						row[0] = ((Vendedor) vendedor).getMatricula();
						row[1] = ((Vendedor) vendedor).getNome();
						row[2] = ((Vendedor) vendedor).getCpf();
						row[3] = ((Vendedor) vendedor).getEmail();
						row[4] = ((Vendedor) vendedor).getDataNasc();
						row[5] = ((Vendedor) vendedor).getNumVendas();
						row[6] = ((Vendedor) vendedor).getSenha();
						
						model.addRow(row);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o vendedor desejado, tente novamente.");
				}
			}
		});
		btnVerTudoConsSel.setForeground(Color.WHITE);
		btnVerTudoConsSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnVerTudoConsSel.setBackground(new Color(199, 21, 133));
		btnVerTudoConsSel.setBounds(738, 43, 131, 25);
		layeredPaneConsultaSel.add(btnVerTudoConsSel);
		
		//Venda Vendedor
		JLayeredPane layeredPane_18 = new JLayeredPane();
		tabbedPaneSel.addTab("Venda", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_orders.png")), layeredPane_18, null);
		
		JLayeredPane layeredPaneVendaSel = new JLayeredPane();
		layeredPaneVendaSel.setLayout(null);
		layeredPaneVendaSel.setBackground(new Color(152, 251, 152));
		layeredPaneVendaSel.setBounds(0, 0, 900, 382);
		layeredPane_18.add(layeredPaneVendaSel);
		
		JLabel lblSuculentaSelSel = new JLabel("Suculenta: ");
		lblSuculentaSelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblSuculentaSelSel.setBounds(31, 41, 145, 16);
		layeredPaneVendaSel.add(lblSuculentaSelSel);
		
		List<String> suculentaList = new ArrayList<String>();
		for(Suculenta suculenta : objApp.getSuculentas()) {
			suculentaList.add(suculenta.getNome());
		}
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox comboBoxSuculentaSelSel = new JComboBox(suculentaList.toArray());
		comboBoxSuculentaSelSel.setBounds(196, 39, 658, 22);
		layeredPaneVendaSel.add(comboBoxSuculentaSelSel);
		
		JLabel lblQuantidadeSelSel = new JLabel("Quantidade: ");
		lblQuantidadeSelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblQuantidadeSelSel.setBounds(31, 90, 131, 16);
		layeredPaneVendaSel.add(lblQuantidadeSelSel);
		
		JLabel lblValorTotalSelSel = new JLabel("Valor Total: ");
		lblValorTotalSelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblValorTotalSelSel.setBounds(31, 232, 131, 16);
		layeredPaneVendaSel.add(lblValorTotalSelSel);
		
		fieldQntSelSel = new JTextField();
		fieldQntSelSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JLabel lblValorTotalStoRes = new JLabel();
				lblValorTotalStoRes.setBounds(196, 233, 56, 16);
				layeredPaneVendaSel.add(lblValorTotalStoRes);
			}
		});
		fieldQntSelSel.setColumns(10);
		fieldQntSelSel.setBounds(196, 85, 658, 22);
		layeredPaneVendaSel.add(fieldQntSelSel);
		
		JLabel lblVendedorSelSel = new JLabel("Vendedor:");
		lblVendedorSelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblVendedorSelSel.setBounds(31, 184, 145, 16);
		layeredPaneVendaSel.add(lblVendedorSelSel);
		
		List<String> vendedorList = new ArrayList<String>();
		for(Vendedor vendedor : objApp.getVendedores()) {
			vendedorList.add(vendedor.getNome());
		}
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox comboBoxVendedorSelSel = new JComboBox(vendedorList.toArray());
		comboBoxVendedorSelSel.setBounds(196, 182, 658, 22);
		layeredPaneVendaSel.add(comboBoxVendedorSelSel);
		
		JLabel lblClienteSelSel = new JLabel("Cliente: ");
		lblClienteSelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblClienteSelSel.setBounds(31, 137, 131, 16);
		layeredPaneVendaSel.add(lblClienteSelSel);
		
		List<String> clienteList = new ArrayList<String>();
		for(Cliente cliente : objApp.getClientes()) {
			clienteList.add(cliente.getNome());
		}
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox comboBoxClienteSelSel = new JComboBox(clienteList.toArray());
		comboBoxClienteSelSel.setBounds(196, 135, 658, 22);
		layeredPaneVendaSel.add(comboBoxClienteSelSel);
		
		//Panel Produto
		JLayeredPane panelProduto = new JLayeredPane();
		tabbedPaneMain.addTab("Produto", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_succulent.png")), panelProduto, null);
		panelProduto.setLayout(null);
		
		JTabbedPane tabbedPaneProd = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneProd.setBounds(12, 13, 905, 428);
		tabbedPaneProd.setBackground(new Color(255, 255, 255));
		tabbedPaneProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		panelProduto.add(tabbedPaneProd);

		//Cadastro Produto
		JLayeredPane layeredPane_19 = new JLayeredPane();
		tabbedPaneProd.addTab("Cadastro", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_add.png")), layeredPane_19, null);
		
		JLayeredPane layeredPaneCadastroProd = new JLayeredPane();
		layeredPaneCadastroProd.setLayout(null);
		layeredPaneCadastroProd.setBackground(new Color(255, 255, 255));
		layeredPaneCadastroProd.setBounds(0, 0, 900, 382);
		layeredPane_19.add(layeredPaneCadastroProd);
		
		JLabel lblNomeProd = new JLabel("Nome: ");
		lblNomeProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeProd.setBounds(31, 41, 56, 16);
		layeredPaneCadastroProd.add(lblNomeProd);
		
		fieldNomeProd = new JTextField();
		fieldNomeProd.setColumns(10);
		fieldNomeProd.setBounds(196, 35, 658, 22);
		layeredPaneCadastroProd.add(fieldNomeProd);
		
		JLabel lblTipoProd = new JLabel("Tipo: ");
		lblTipoProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblTipoProd.setBounds(31, 83, 56, 16);
		layeredPaneCadastroProd.add(lblTipoProd);
		
		JLabel lblTamanhoProd = new JLabel("Tamanho:");
		lblTamanhoProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblTamanhoProd.setBounds(31, 177, 145, 16);
		layeredPaneCadastroProd.add(lblTamanhoProd);
		
		JLabel lblRaridadeProd = new JLabel("Raridade: ");
		lblRaridadeProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblRaridadeProd.setBounds(31, 130, 134, 16);
		layeredPaneCadastroProd.add(lblRaridadeProd);
		
		String[] listaTipoProd = {"Cacto", "Planta"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBoxTipoProd = new JComboBox(listaTipoProd);
		comboBoxTipoProd.setBounds(196, 81, 658, 22);
		layeredPaneCadastroProd.add(comboBoxTipoProd);
		
		String[] listaRaridadeProd = {"Normal", "Raro"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBoxRaridadeProd = new JComboBox(listaRaridadeProd);
		comboBoxRaridadeProd.setBounds(196, 124, 658, 22);
		layeredPaneCadastroProd.add(comboBoxRaridadeProd);
		
		String[] listaTamanhoProd = {"Pequeno", "Médio", "Grande"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBoxTamanhoProd = new JComboBox(listaTamanhoProd);
		comboBoxTamanhoProd.setBounds(196, 171, 658, 22);
		layeredPaneCadastroProd.add(comboBoxTamanhoProd);
		
		JLabel lblValorUnitarioProd = new JLabel("Valor unit\u00E1rio: ");
		lblValorUnitarioProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblValorUnitarioProd.setBounds(31, 225, 145, 16);
		layeredPaneCadastroProd.add(lblValorUnitarioProd);
		
		fieldValorUnitarioProd = new JTextField();
		fieldValorUnitarioProd.setColumns(10);
		fieldValorUnitarioProd.setBounds(196, 219, 658, 22);
		layeredPaneCadastroProd.add(fieldValorUnitarioProd);
		
		JLabel lblQntEstoqueProd = new JLabel("Quantidade estocada: ");
		lblQntEstoqueProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblQntEstoqueProd.setBounds(31, 270, 168, 16);
		layeredPaneCadastroProd.add(lblQntEstoqueProd);
		
		fieldEstoqueProd = new JTextField();
		fieldEstoqueProd.setColumns(10);
		fieldEstoqueProd.setBounds(196, 264, 658, 22);
		layeredPaneCadastroProd.add(fieldEstoqueProd);
		
		//Edição Produto
		JLayeredPane layeredPane_20 = new JLayeredPane();
		tabbedPaneProd.addTab("Edi\u00E7\u00E3o", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_edit.png")), layeredPane_20, null);

		JLayeredPane layeredPaneEdicaoProd = new JLayeredPane();
		layeredPaneEdicaoProd.setBounds(0, 0, 900, 382);
		layeredPane_20.add(layeredPaneEdicaoProd);
		
		JLabel lblCodEditProdCons = new JLabel("C\u00F3digo da Suculenta:");
		lblCodEditProdCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCodEditProdCons.setBounds(28, 43, 166, 16);
		layeredPaneEdicaoProd.add(lblCodEditProdCons);
		
		fieldCodEditProdCons = new JTextField();
		fieldCodEditProdCons.setColumns(10);
		fieldCodEditProdCons.setBounds(191, 43, 379, 22);
		layeredPaneEdicaoProd.add(fieldCodEditProdCons);
		
		JPanel paneEditProd = new JPanel();
		paneEditProd.setVisible(false);
		paneEditProd.setLayout(null);
		paneEditProd.setBounds(26, 86, 840, 283);
		layeredPaneEdicaoProd.add(paneEditProd);
		
		JButton btnPesquisarEditProd = new JButton("Pesquisar");
		btnPesquisarEditProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Suculenta objSuculenta = objApp.consultarSuculenta(fieldCodEditProdCons.getText());
					
					if (objSuculenta != null) {
						paneEditProd.setVisible(true); 
					} else {
						JOptionPane.showMessageDialog(null, "Digite o código do produto.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o produto desejado, tente novamente.");
				
				}
			}
		});
		btnPesquisarEditProd.setForeground(Color.WHITE);
		btnPesquisarEditProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarEditProd.setBackground(new Color(199, 21, 133));
		btnPesquisarEditProd.setBounds(595, 43, 131, 25);
		layeredPaneEdicaoProd.add(btnPesquisarEditProd);
		
		JLabel lblNomeEditProd = new JLabel("Nome: ");
		lblNomeEditProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeEditProd.setBounds(28, 15, 56, 16);
		paneEditProd.add(lblNomeEditProd);
		
		JLabel lblTipoEditProd = new JLabel("Tipo: ");
		lblTipoEditProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblTipoEditProd.setBounds(28, 53, 56, 16);
		paneEditProd.add(lblTipoEditProd);
		
		JLabel lblRaridadeEditProd = new JLabel("Raridade: ");
		lblRaridadeEditProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblRaridadeEditProd.setBounds(28, 93, 143, 16);
		paneEditProd.add(lblRaridadeEditProd);
		
		JLabel lblTamanhoEditProd = new JLabel("Tamanho: ");
		lblTamanhoEditProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblTamanhoEditProd.setBounds(28, 134, 143, 16);
		paneEditProd.add(lblTamanhoEditProd);
		
		fieldNomeEditProd = new JTextField();
		fieldNomeEditProd.setColumns(10);
		fieldNomeEditProd.setBounds(191, 13, 590, 22);
		paneEditProd.add(fieldNomeEditProd);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBoxTipoEditProd = new JComboBox(listaTipoProd);
		comboBoxTipoEditProd.setBounds(191, 51, 590, 22);
		paneEditProd.add(comboBoxTipoEditProd);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBoxRaridadeEditProd = new JComboBox(listaRaridadeProd);
		comboBoxRaridadeEditProd.setBounds(191, 91, 590, 22);
		paneEditProd.add(comboBoxRaridadeEditProd);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBoxTamanhoEditProd = new JComboBox(listaTamanhoProd);
		comboBoxTamanhoEditProd.setBounds(191, 132, 590, 22);
		paneEditProd.add(comboBoxTamanhoEditProd);
		
		JButton btnEditarEditProd = new JButton("Editar");
		btnEditarEditProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Suculenta objSuculenta = objApp.consultarSuculenta(fieldCodEditProdCons.getText());

				if (objSuculenta != null) {
					objSuculenta.setNome(fieldNomeCliEdit.getText());
					objSuculenta.setTipo(comboBoxTipoEditProd.getSelectedItem().toString());
					objSuculenta.setRaridade(comboBoxRaridadeEditProd.getSelectedItem().toString());
					objSuculenta.setTamanho(comboBoxTamanhoEditProd.getSelectedItem().toString());
					objSuculenta.setValor(Double.parseDouble(fieldValorUnitarioEditProd.getText()));
					
					Admin.gravarArquivo(objApp);
					
					JOptionPane.showMessageDialog(null, "Produto editado com sucesso.");
				} else {
					JOptionPane.showMessageDialog(null, "Digite o código do produto.");
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Produto não encontrado");
			}
			}
		});
		btnEditarEditProd.setForeground(Color.WHITE);
		btnEditarEditProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnEditarEditProd.setBackground(new Color(199, 21, 133));
		btnEditarEditProd.setBounds(266, 227, 276, 43);
		paneEditProd.add(btnEditarEditProd);
		
		JLabel lblValorUnitarioEditProd = new JLabel("Valor Unit\u00E1rio: ");
		lblValorUnitarioEditProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblValorUnitarioEditProd.setBounds(28, 175, 143, 16);
		paneEditProd.add(lblValorUnitarioEditProd);
		
		fieldValorUnitarioEditProd = new JTextField();
		fieldValorUnitarioEditProd.setColumns(10);
		fieldValorUnitarioEditProd.setBounds(191, 173, 590, 22);
		paneEditProd.add(fieldValorUnitarioEditProd);
		
		//Exclusão produto
		JLayeredPane layeredPane_21 = new JLayeredPane();
		tabbedPaneProd.addTab("Exclus\u00E3o", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_delete.png")), layeredPane_21, null);
		
		JLayeredPane layeredPaneExclusaoProd = new JLayeredPane();
		layeredPaneExclusaoProd.setBounds(0, 0, 900, 382);
		layeredPane_21.add(layeredPaneExclusaoProd);
		
		JLabel lblCodDelProdCons = new JLabel("C\u00F3digo da Suculenta:");
		lblCodDelProdCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCodDelProdCons.setBounds(28, 43, 167, 16);
		layeredPaneExclusaoProd.add(lblCodDelProdCons);
		
		fieldCodDelProdCons = new JTextField();
		fieldCodDelProdCons.setColumns(10);
		fieldCodDelProdCons.setBounds(191, 43, 379, 22);
		layeredPaneExclusaoProd.add(fieldCodDelProdCons);
		
		JPanel panelDelProd = new JPanel();
		panelDelProd.setVisible(false);
		panelDelProd.setLayout(null);
		panelDelProd.setBounds(26, 86, 840, 283);
		layeredPaneExclusaoProd.add(panelDelProd);
		
		JLabel lblNomeDelProd = new JLabel("Nome: ");
		lblNomeDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblNomeDelProd.setBounds(28, 28, 56, 16);
		panelDelProd.add(lblNomeDelProd);
		
		JLabel lblTipoDelProd = new JLabel("Tipo: ");
		lblTipoDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblTipoDelProd.setBounds(28, 67, 56, 16);
		panelDelProd.add(lblTipoDelProd);
		
		JLabel lblRaridadedDelProd = new JLabel("Raridade: ");
		lblRaridadedDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblRaridadedDelProd.setBounds(28, 104, 143, 16);
		panelDelProd.add(lblRaridadedDelProd);
		
		JLabel lblTamanhoDelProd = new JLabel("Tamanho: ");
		lblTamanhoDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblTamanhoDelProd.setBounds(28, 141, 143, 16);
		panelDelProd.add(lblTamanhoDelProd);
		
		JLabel lblCodDelProd = new JLabel("C\u00F3digo: ");
		lblCodDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCodDelProd.setBounds(422, 29, 143, 16);
		panelDelProd.add(lblCodDelProd);
		
		JLabel lblValorDelProd = new JLabel("Valor: ");
		lblValorDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblValorDelProd.setBounds(422, 68, 81, 16);
		panelDelProd.add(lblValorDelProd);
		
		JLabel lblQntEstocadaDelProd = new JLabel("Quantidade em estoque: ");
		lblQntEstocadaDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblQntEstocadaDelProd.setBounds(422, 102, 180, 16);
		panelDelProd.add(lblQntEstocadaDelProd);

		JLabel lblNomeProdDel = new JLabel("");
		lblNomeProdDel.setBounds(77, 29, 296, 16);
		panelDelProd.add(lblNomeProdDel);
		
		JLabel lblTipoProdDel = new JLabel("");
		lblTipoProdDel.setBounds(77, 68, 296, 16);
		panelDelProd.add(lblTipoProdDel);
		
		JLabel lblRaridadeProdDel = new JLabel("");
		lblRaridadeProdDel.setBounds(103, 105, 270, 16);
		panelDelProd.add(lblRaridadeProdDel);
		
		JLabel lblTamanhoProdDel = new JLabel("");
		lblTamanhoProdDel.setBounds(115, 142, 258, 16);
		panelDelProd.add(lblTamanhoProdDel);
		
		JLabel lblCodigoProdDel = new JLabel("");
		lblCodigoProdDel.setBounds(487, 29, 296, 16);
		panelDelProd.add(lblCodigoProdDel);
		
		JLabel lblValorProdDel = new JLabel("");
		lblValorProdDel.setBounds(485, 68, 298, 15);
		panelDelProd.add(lblValorProdDel);
		
		JLabel lblEstoqueProdDel = new JLabel("");
		lblEstoqueProdDel.setBounds(604, 105, 179, 16);
		panelDelProd.add(lblEstoqueProdDel);
		
		JButton btnPesquisarDelProd = new JButton("Pesquisar");
		btnPesquisarDelProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Suculenta objSuculenta = objApp.consultarSuculenta(fieldCodEditProdCons.getText());
					
					if (objSuculenta != null) {
						panelDelProd.setVisible(true); 
						lblNomeProdDel.setText(objSuculenta.getNome());
						lblTipoProdDel.setText(objSuculenta.getTipo());
						lblRaridadeProdDel.setText(objSuculenta.getRaridade());
						lblTamanhoProdDel.setText(objSuculenta.getTamanho());
						lblCodigoProdDel.setText(objSuculenta.getCadastro());
						lblValorProdDel.setText(Double.toString(objSuculenta.getValor()));
						lblEstoqueProdDel.setText(Integer.toString(objSuculenta.getQntEstoque()));
						
					} else {
						JOptionPane.showMessageDialog(null, "Digite o código do produto.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o produto desejado, tente novamente.");
				
				}
			}
		});
		btnPesquisarDelProd.setForeground(Color.WHITE);
		btnPesquisarDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarDelProd.setBackground(new Color(199, 21, 133));
		btnPesquisarDelProd.setBounds(595, 43, 131, 25);
		layeredPaneExclusaoProd.add(btnPesquisarDelProd);
		
		JButton btnExcluirDelProd = new JButton("Excluir");
		btnExcluirDelProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					objApp.excluirSuculenta(fieldCodDelProdCons.getText());
					
					Admin.gravarArquivo(objApp);
					
					JOptionPane.showMessageDialog(null, "Produto excluído com sucesso.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnExcluirDelProd.setForeground(Color.WHITE);
		btnExcluirDelProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnExcluirDelProd.setBackground(new Color(199, 21, 133));
		btnExcluirDelProd.setBounds(265, 195, 276, 43);
		panelDelProd.add(btnExcluirDelProd);
		
		//Consulta Produto
		JLayeredPane layeredPane_22 = new JLayeredPane();
		tabbedPaneProd.addTab("Consulta", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_search.png")), layeredPane_22, null);
		
		JLayeredPane layeredPaneConsultaProd = new JLayeredPane();
		layeredPaneConsultaProd.setBounds(0, 0, 900, 382);
		layeredPane_22.add(layeredPaneConsultaProd);
		
		JLabel lblCodConsProdCons = new JLabel("C\u00F3digo da Suculenta:");
		lblCodConsProdCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCodConsProdCons.setBounds(28, 43, 165, 16);
		layeredPaneConsultaProd.add(lblCodConsProdCons);
		
		JScrollPane scrollPaneTableProd = new JScrollPane();
		scrollPaneTableProd.setVisible(false);
		scrollPaneTableProd.setBounds(12, 80, 876, 289);
		layeredPaneConsultaProd.add(scrollPaneTableProd);
		
		tableAllProd = new JTable();
		tableAllProd.setBounds(28, 89, 842, 280);
		DefaultTableModel modelProd = (DefaultTableModel) tableAllProd.getModel();
		Object[] titleJTableProd  = {"Código", "Nome", "Tipo", "Raridade", "Tamanho", "Valor Unitário", "Quantidade em estoque"};
		
		for (int i = 0; i < titleJTableProd.length; i++) {
			modelProd.addColumn(titleJTableProd[i]);
		}

		tableAllProd.setVisible(true);
		scrollPaneTableProd.setViewportView(tableAllProd);
		
		fieldCodConsProdCons = new JTextField();
		fieldCodConsProdCons.setColumns(10);
		fieldCodConsProdCons.setBounds(191, 43, 379, 22);
		layeredPaneConsultaProd.add(fieldCodConsProdCons);
		
		JButton btnPesquisarConsProd = new JButton("Pesquisar");
		btnPesquisarConsProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DefaultTableModel model = (DefaultTableModel) tableAllProd.getModel();
					Suculenta suculenta = objApp.consultarSuculenta(fieldCodConsProdCons.getText());
					Object[] row = new Object[7];
					
					if (suculenta != null) {
						scrollPaneTableProd.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Digite o código do produto.");
					}
					
						InterfaceUtil.limparTabela(modelProd);
						row[0] = suculenta.getCadastro();
						row[1] = suculenta.getNome();
						row[2] = suculenta.getTipo();
						row[3] = suculenta.getRaridade();
						row[4] = suculenta.getTamanho();
						row[5] = suculenta.getValor();
						row[6] = suculenta.getQntEstoque();
						
						model.addRow(row);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o produto desejado, tente novamente.");
				}
			}
		});
		btnPesquisarConsProd.setForeground(Color.WHITE);
		btnPesquisarConsProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarConsProd.setBackground(new Color(199, 21, 133));
		btnPesquisarConsProd.setBounds(595, 43, 131, 25);
		layeredPaneConsultaProd.add(btnPesquisarConsProd);
		
		JButton btnAllConsProd = new JButton("Ver tudo");
		btnAllConsProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPaneTableProd.setVisible(true);
				
				try {
					DefaultTableModel model = (DefaultTableModel) tableAllProd.getModel();
					List<Suculenta> suculenta = objApp.listarSuculentas();
					Object[] row = new Object[7];
					
					if (suculenta != null) {
						scrollPaneTableProd.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Digite o código do produto.");
					}
						InterfaceUtil.limparTabela(model);
						row[0] = ((Suculenta) suculenta).getCadastro();
						row[1] = ((Suculenta) suculenta).getNome();
						row[2] = ((Suculenta) suculenta).getTipo();
						row[3] = ((Suculenta) suculenta).getRaridade();
						row[4] = ((Suculenta) suculenta).getTamanho();
						row[5] = ((Suculenta) suculenta).getValor();
						row[6] = ((Suculenta) suculenta).getQntEstoque();
						
						model.addRow(row);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o produto desejado, tente novamente.");
				}
			}
		});
		btnAllConsProd.setForeground(Color.WHITE);
		btnAllConsProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnAllConsProd.setBackground(new Color(199, 21, 133));
		btnAllConsProd.setBounds(738, 43, 131, 25);
		layeredPaneConsultaProd.add(btnAllConsProd);
		
		//Estoque Produto
		JLayeredPane layeredPane_23 = new JLayeredPane();
		tabbedPaneProd.addTab("Estoque", new ImageIcon(Interface_Admin.class.getResource("/Imagens/icon_storage.png")), layeredPane_23, null);
		
		JLayeredPane layeredPaneEstoqueProd = new JLayeredPane();
		layeredPaneEstoqueProd.setBounds(0, 0, 900, 382);
		layeredPane_23.add(layeredPaneEstoqueProd);
		
		JLabel lblCodStoProdCons = new JLabel("C\u00F3digo da Suculenta");
		lblCodStoProdCons.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblCodStoProdCons.setBounds(28, 43, 165, 16);
		layeredPaneEstoqueProd.add(lblCodStoProdCons);
		
		fieldCodStoProdCons = new JTextField();
		fieldCodStoProdCons.setColumns(10);
		fieldCodStoProdCons.setBounds(191, 43, 379, 22);
		layeredPaneEstoqueProd.add(fieldCodStoProdCons);
		
		JPanel panelStoProd = new JPanel();
		panelStoProd.setVisible(false);
		panelStoProd.setLayout(null);
		panelStoProd.setBounds(28, 78, 840, 283);
		layeredPaneEstoqueProd.add(panelStoProd);
		
		JLabel lblQntEstoqueStoProdRes = new JLabel("");
		lblQntEstoqueStoProdRes.setBounds(265, 29, 186, 16);
		panelStoProd.add(lblQntEstoqueStoProdRes);
		
		JButton btnPesquisarStoProd = new JButton("Pesquisar");
		btnPesquisarStoProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Suculenta objSuculenta = objApp.consultarSuculenta(fieldCodStoProdCons.getText());
					
					if (objSuculenta != null) {
						panelStoProd.setVisible(true);
						lblQntEstoqueStoProdRes.setText(Integer.toString(objSuculenta.getQntEstoque()));
					} else {
						JOptionPane.showMessageDialog(null, "Digite o código do produto.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o produto desejado, tente novamente.");
				
				}
			}
		});
		btnPesquisarStoProd.setForeground(Color.WHITE);
		btnPesquisarStoProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		btnPesquisarStoProd.setBackground(new Color(199, 21, 133));
		btnPesquisarStoProd.setBounds(595, 43, 131, 25);
		layeredPaneEstoqueProd.add(btnPesquisarStoProd);
		
		JLabel lblQntEstocadaStoProd = new JLabel("Quantidade em estoque: ");
		lblQntEstocadaStoProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblQntEstocadaStoProd.setBounds(28, 28, 276, 16);
		panelStoProd.add(lblQntEstocadaStoProd);
		
		JLabel lblQntAddStoProd = new JLabel("Quantidade a ser adicionada: ");
		lblQntAddStoProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblQntAddStoProd.setBounds(28, 67, 264, 16);
		panelStoProd.add(lblQntAddStoProd);
		
		fieldQntAddStoProd = new JTextField();
		fieldQntAddStoProd.setBounds(265, 65, 116, 22);
		panelStoProd.add(fieldQntAddStoProd);
		fieldQntAddStoProd.setColumns(10);
		
		JLabel lblPecasStoProd = new JLabel("pe\u00E7as");
		lblPecasStoProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblPecasStoProd.setBounds(393, 67, 264, 16);
		panelStoProd.add(lblPecasStoProd);
		
		JButton btnAdicionarStoProd = new JButton("Adicionar");
		btnAdicionarStoProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int qntEstocar = 0;
				int soma = 0;
				
				try {
					Suculenta objSuculenta = objApp.consultarSuculenta(fieldCodStoProdCons.getText());
					
					if (objSuculenta != null) {
						qntEstocar = Integer.parseInt(fieldQntAddStoProd.getText());
						
						soma = qntEstocar + objSuculenta.getQntEstoque();
						
						Admin.gravarArquivo(objApp);
						
						JOptionPane.showMessageDialog(null, "Estoque aumentado com sucesso! Quantidade atual: " + soma);
						
					} else {
						JOptionPane.showMessageDialog(null, "Digite o código do produto.");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível acessar o produto desejado, tente novamente.");
				
				}
			}
		});
		btnAdicionarStoProd.setForeground(Color.WHITE);
		btnAdicionarStoProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnAdicionarStoProd.setBackground(new Color(199, 21, 133));
		btnAdicionarStoProd.setBounds(265, 195, 276, 43);
		panelStoProd.add(btnAdicionarStoProd);
		
		JButton btnCadastrarCli = new JButton("Cadastrar");
		btnCadastrarCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String nome = fieldNomeCli.getText();
					String cpf = fieldCPFCli.getText();
					String email = fieldEmailCli.getText();
					String dataNasc = fieldDataNascCli.getText();
					Date dataEntrada = new Date();
					int qntPedidos = 0;
					
					Cliente objCliente = new Cliente(nome, cpf, email, dataNasc, dataEntrada, qntPedidos);
					objApp.cadastrarCliente(objCliente);
					Admin.gravarArquivo(objApp);
					
					limparbotao();
					
					JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnCadastrarCli.setForeground(new Color(255, 255, 255));
		btnCadastrarCli.setBackground(new Color(199, 21, 133));
		btnCadastrarCli.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnCadastrarCli.setBounds(290, 262, 276, 43);
		layeredPaneCadastroCli.add(btnCadastrarCli);
		
		JButton btnCadastrarMan = new JButton("Cadastrar");
		btnCadastrarMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String nome = fieldNomeMan.getText();
					String cpf = fieldCPFMan.getText();
					String email = fieldEmailMan.getText();
					String dataNasc = fieldDataNascMan.getText();
					String matricula;
					int senha = Integer.parseInt(fieldSenhaMan.getText());
					double salarioBase = Double.parseDouble(fieldSalarioMan.getText());
					
					if (objApp.getGerentes().isEmpty()) {
						matricula = "G" + 1;
					} else {
						matricula = "G" + (objApp.getGerentes().size() + 1);
					}
					
					Gerente objGerente = new Gerente(nome, cpf, email, dataNasc, matricula, senha, salarioBase);
					objApp.cadastrarGerente(objGerente);
					Admin.gravarArquivo(objApp);
					
					limparbotao();
					
					JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnCadastrarMan.setForeground(Color.WHITE);
		btnCadastrarMan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnCadastrarMan.setBackground(new Color(199, 21, 133));
		btnCadastrarMan.setBounds(291, 326, 276, 43);
		layeredPaneCadastroMan.add(btnCadastrarMan);
		
		JButton btnCadastrarSel = new JButton("Cadastrar");
		btnCadastrarSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String nome = fieldNomeSel.getText();
					String cpf = fieldCPFSel.getText();
					String email = fieldEmailSel.getText();
					String dataNasc = fieldDataNascSel.getText();
					String matricula;
					int senha = Integer.parseInt(fieldSenhaSel.getText());
					int numVendas = 0;
					double comissao = 600 + (numVendas * 50);
					
					if (objApp.getVendedores().isEmpty()) {
						matricula = "V" + 1;
					} else {
						matricula = "V" + (objApp.getVendedores().size() + 1);
					}
					
					Vendedor vendedor = new Vendedor(nome, cpf, email, dataNasc, matricula, senha, comissao, numVendas);
					objApp.cadastrarVendedor(vendedor);
					Admin.gravarArquivo(objApp);
					
					limparbotao();
					
					JOptionPane.showMessageDialog(null, "Vendedor cadastrado com Sucesso!");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnCadastrarSel.setForeground(Color.WHITE);
		btnCadastrarSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnCadastrarSel.setBackground(new Color(199, 21, 133));
		btnCadastrarSel.setBounds(291, 326, 276, 43);
		layeredPaneCadastroSel.add(btnCadastrarSel);

		JButton btnCadastrarProd = new JButton("Cadastrar");
		btnCadastrarProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nome = fieldNomeProd.getText();
				String tipo = comboBoxTipoProd.getSelectedItem().toString();
				String raridade = comboBoxRaridadeProd.getSelectedItem().toString();
				String tamanho = comboBoxTamanhoProd.getSelectedItem().toString();; 
				int qntEstoque = Integer.parseInt(fieldEstoqueProd.getText()); 
				double valor = Double.parseDouble(fieldValorUnitarioProd.getText());
				String cadastro;
				
				try {
					
					if (objApp.getSuculentas().isEmpty()) {
						cadastro = "S" + 1;
					} else {
						cadastro = "S" + (objApp.getSuculentas().size() + 1);
					}
					
				Suculenta suculenta = new Suculenta(nome, cadastro, tipo, raridade, tamanho, qntEstoque, valor);
				objApp.cadastrarSuculenta(suculenta);
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
				
				limparbotao();
				
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				
			}
		});
		btnCadastrarProd.setForeground(Color.WHITE);
		btnCadastrarProd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnCadastrarProd.setBackground(new Color(199, 21, 133));
		btnCadastrarProd.setBounds(291, 326, 276, 43);
		layeredPaneCadastroProd.add(btnCadastrarProd);
		
		JLabel lblValorTotalStoRes = new JLabel();
		lblValorTotalStoRes.setBounds(196, 233, 56, 16);
		layeredPaneVendaSel.add(lblValorTotalStoRes);
		
		JButton btnFazerPedidoSelSel = new JButton("Fazer Pedido");
		btnFazerPedidoSelSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					int numero;
					int qntPedida = Integer.parseInt(fieldQntSelSel.getText());
					double suculentaValor = 0;
					double valorTotal = 0;
					String suculenta = (String) comboBoxSuculentaSelSel.getSelectedItem();
					String vendedor = (String) comboBoxClienteSelSel.getSelectedItem();
					String cliente = (String) comboBoxVendedorSelSel.getSelectedItem();
					
					for (Suculenta suculenta2 : objApp.getSuculentas()) {
						if(suculenta.equals(suculenta2.getNome())) {
							suculentaValor = suculenta2.getValor();
							valorTotal = suculentaValor * qntPedida;

							lblValorTotalStoRes.setText(Double.toString(valorTotal));
						}
					}
					
					if (objApp.getVendedores().isEmpty()) {
						numero =  1;
					} else {
						numero = objApp.getVendedores().size() + 1;
					}
					
					Pedido pedido = new Pedido(numero, suculenta, suculentaValor, qntPedida, valorTotal, vendedor, cliente);
					objApp.fazerPedido(pedido);
					Admin.gravarArquivo(objApp);
					
					JOptionPane.showMessageDialog(null, "Pedido efetuado com sucesso.");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnFazerPedidoSelSel.setForeground(Color.WHITE);
		btnFazerPedidoSelSel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		btnFazerPedidoSelSel.setBackground(new Color(199, 21, 133));
		btnFazerPedidoSelSel.setBounds(291, 326, 276, 43);
		layeredPaneVendaSel.add(btnFazerPedidoSelSel);
		
		this.setVisible(true);
	}
	
	private void setImageBackground() {
		try {
			JLabel label = new JLabel(new ImageIcon(MenuLogin.class.getResource("/Imagens/Background_Menu.jpg")));
			this.setContentPane(label);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Erro, contate o administrador do sistema."
							+ " - Imagem Inválida!", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	public void limparbotao() {
		fieldNomeCli.setText("");
		fieldCPFCli.setText("");
		fieldEmailCli.setText("");
		fieldDataNascCli.setText("");
		
		fieldNomeMan.setText("");
		fieldCPFMan.setText("");
		fieldEmailMan.setText("");
		fieldDataNascMan.setText("");
		fieldSenhaMan.setText("");
		fieldSalarioMan.setText("");
		
		fieldNomeSel.setText("");
		fieldCPFSel.setText("");
		fieldEmailSel.setText("");
		fieldDataNascSel.setText("");
		fieldSenhaSel.setText("");
		fieldSenhaSel.setText("");
		
		fieldNomeProd.setText("");
		fieldValorUnitarioProd.setText("");
		fieldEstoqueProd.setText("");
	}
	
	public void limpartabelas() {
		
	}
}
