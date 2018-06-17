package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class GerenteTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 8089116544555428084L;
	 	private ArrayList<Gerente> gerentes;
	    private String[] colunas = {"CÓDIGO", "CPF", "NOME", "TELEFONE", "E-MAIL", "META DE VENDAS", "DATA DE CADASTRO"};    


	    public GerenteTableModel(ArrayList<Gerente> gerentes) {
	        this.gerentes = gerentes; 
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
	        return gerentes.size();
	    }

	    @Override
	    public Object getValueAt(int linha, int coluna) {        
	        Gerente gerente = gerentes.get(linha);         
	        switch (coluna) {
	            case 0:
	                return gerente.getMatricula();
	            case 1:
	                return gerente.getCpf();    
	            case 2:
	                return gerente.getNome();
	            case 3:
	                return gerente.getEmail();
	            case 4:
	            	return gerente.getDataNasc();
	            case 5:
	            	return gerente.getSalarioBase();
	            case 6:
	            	return gerente.getSenha();
	        }        
	        return null;        
	    }

}
