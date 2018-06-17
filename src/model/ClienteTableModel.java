package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private ArrayList<Cliente> clientes;
    private String[] colunas = {"NOME", "CPF", "E-MAIL", "DATA DE NASCIMENTO", "DATA DE CADASTRO", "QUANTIDADE DE PEDIDOS"};
    public ClienteTableModel(ArrayList<Cliente> clientes) {
        this.clientes = clientes; 
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {        
        Cliente cliente = clientes.get(linha);         
        switch (coluna) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getCpf();    
            case 2:
                return cliente.getEmail();
            case 3:
                return cliente.getDataNasc();
            case 4:
            	return cliente.getDataEntrada();
            case 5:
            	return cliente.getQntPedidos();
        }        
        return null;        
    }

}
