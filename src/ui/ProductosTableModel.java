package ui;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import classes.Producto;


public class ProductosTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final List<String> headers = Arrays.asList( "Nombre", "Tipo", "Precio", "Id");
	private List<Producto> productos;

	public ProductosTableModel(List<Producto> productos) {
		this.productos = productos;
	}
	
	@Override
	public String getColumnName(int column) {
		return headers.get(column);
	}

	@Override
	public int getRowCount() {
		return productos.size();
	}

	@Override
	public int getColumnCount() {
		return headers.size(); 
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Producto producto = productos.get(rowIndex);
		switch (columnIndex) {
			case 0: return producto.getNombre();
			case 1: return producto.getTipo();
			case 2: return producto.getPrecio();
			case 3: return producto.getId();
			default: return null;
		}
	}

}
