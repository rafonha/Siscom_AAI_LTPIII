package model;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class PedidosTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private ArrayList<Pedido> pedidos;
	private String[] colunas = {"CÓDIGO", "PRODUTO", "CLIENTE", "VENDEDOR", "PREÇO UNITÁRIO", "QUANTIDADE", "VALOR TOTAL"};    


	public PedidosTableModel(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos; 
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
		return pedidos.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {        
		Pedido item = pedidos.get(linha);         
		switch (coluna) {
		case 0:
			return item.getNumero();
		case 1:
			return item.getSuculentaPedido();   
		case 2:
			return item.getClientePedido();
		case 3:
			return item.getVendedorPedido();
		case 4:
			return item;   
		case 5:
			return item.getQntPedida();
		case 6:
			return item.getValorTotal();
		}        
		return null;        
	}
}
