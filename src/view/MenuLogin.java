package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MenuLogin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public MenuLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuLogin.class.getResource("/Imagens/icon_menu.png")));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 400);
		this.setTitle("Login");
		setImageBackground();
		mainElements();
		this.setVisible(true);
	}
	
	private void setImageBackground() {
		try {
			JLabel label = new JLabel(new ImageIcon(MenuLogin.class.getResource("/Imagens/Background_Login.jpg")));
			this.setContentPane(label);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Erro, contate o administrador do sistema."
							+ " - Imagem Inválida!", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private JTextField textField;
	private JPasswordField passwordField;

	public void mainElements() {
		getContentPane().setBackground(new Color(0, 128, 128));
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setLayout(null);
		
		JLabel lblSistemaSuculentneas = new JLabel("Sistema Suculent\u00EDneas");
		lblSistemaSuculentneas.setForeground(new Color(199, 21, 133));
		lblSistemaSuculentneas.setBounds(70, 57, 331, 28);
		lblSistemaSuculentneas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaSuculentneas.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 30));
		getContentPane().add(lblSistemaSuculentneas);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula");
		lblMatrcula.setForeground(new Color(199, 21, 133));
		lblMatrcula.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		lblMatrcula.setBounds(71, 136, 89, 16);
		getContentPane().add(lblMatrcula);
		lblMatrcula.setVisible(true);
		
		textField = new JTextField();
		textField.setBounds(172, 135, 167, 22);
		getContentPane().add(textField);
		textField.requestFocus();
		textField.setColumns(10);
		textField.setVisible(true);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent et) {
				String mat = textField.getText();
				
				if (mat.equals("admin")) {
					//matricula correta
				} else if (mat.equals("")) {
					JOptionPane.showMessageDialog(textField, "A matrícula não pode ficar em branco.");
				} else {
					JOptionPane.showMessageDialog(textField, "Erro! Matrícula incorreta, tente novamente.");
				}
			}
		});
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(199, 21, 133));
		lblSenha.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		lblSenha.setBounds(71, 177, 56, 16);
		getContentPane().add(lblSenha);
		lblSenha.setVisible(true);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 176, 167, 22);
		textField.requestFocus();
		getContentPane().add(passwordField);
		passwordField.setVisible(true);
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pw = passwordField.getText();
				
				if (pw.equals("admin")) {
					//senha correta
				} else if (pw.equals("")) {
					JOptionPane.showMessageDialog(textField, "A senha não pode ficar em branco.");
				} else {
					JOptionPane.showMessageDialog(passwordField, "Erro! Senha incorreta, tente novamente.");
				}
			}
		});
		
		JButton button = new JButton("Entrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
//				Splash splash = new Splash(3000);
//				splash.setVisible(true);
//				splash.showSplash();
				
				Interface_Admin face = new Interface_Admin();
				face.setVisible(true);
				

			}
		});
		button.setVisible(true);
		button.setBackground(new Color(255, 255, 255));
		button.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		button.setBounds(172, 237, 167, 25);
		getContentPane().add(button);
		
	}
}
