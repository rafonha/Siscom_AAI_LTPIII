package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class suculentaTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 8089116544555428084L;
	private ArrayList<Suculenta> suculentas;
	private String[] colunas = {"CÓDIGO", "NOME", "PREÇO", "ESTOQUE", "ESTOQUE MÍNIMO", "DATA"};    


	public suculentaTableModel(ArrayList<Suculenta> suculentas) {
		this.suculentas = suculentas; 
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
		return suculentas.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {        
		Suculenta suculenta = suculentas.get(linha);         
		switch (coluna) {
		case 0:
			return suculenta.getCadastro();
		case 1:
			return suculenta.getNome();    
		case 2:
			return suculenta.getTipo();
		case 3:
			return suculenta.getRaridade();
		case 4:
			return suculenta.getValor();
		case 5:
			return suculenta.getQntEstoque();
		}        
		return null;        
	}

}
