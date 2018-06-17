package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class VendedorTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 8089116544555428084L;
	 	private ArrayList<Vendedor> vendedores;
	    private String[] colunas = {"CÓDIGO", "CPF", "NOME", "TELEFONE", "E-MAIL", "META DE VENDAS", "DATA DE CADASTRO"};    


	    public VendedorTableModel(ArrayList<Vendedor> vendedores) {
	        this.vendedores = vendedores; 
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
	        return vendedores.size();
	    }

	    @Override
	    public Object getValueAt(int linha, int coluna) {        
	        Vendedor vendedor = vendedores.get(linha);         
	        switch (coluna) {
	            case 0:
	                return vendedor.getMatricula();
	            case 1:
	                return vendedor.getCpf();    
	            case 2:
	                return vendedor.getNome();
	            case 3:
	                return vendedor.getEmail();
	            case 4:
	            	return vendedor.getDataNasc();
	            case 5:
	            	return vendedor.getNumVendas();
	            case 6:
	            	return vendedor.getComissao();
	            case 7:
	            	return vendedor.getSenha();
	        }        
	        return null;        
	    }

}
