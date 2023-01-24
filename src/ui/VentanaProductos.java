package ui;

	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import classes.Producto;
import config.BD;


	public class VentanaProductos extends JFrame{

			public static ArrayList<Producto> pedido;
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;
			private final Action action = new botonAtras();
			private JTable ProductosJTable;
			private ArrayList<Producto> productos;
			private BD dbManager;
		
			
			public VentanaProductos() throws SQLException, IOException {
				pedido = new ArrayList<Producto>();
				setResizable(false);
				getContentPane().add(new JScrollPane(ProductosJTable), BorderLayout.CENTER);
				dbManager = new BD();

				productos = dbManager.getProducto();

				if(productos.size() == 0) {
					dbManager.cargaProductos();
				}

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(200, 200, 850, 500);
				contentPane = new JPanel();
				contentPane.setBackground(new Color(0, 0, 128));
				contentPane.setForeground(new Color(0, 0, 128));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
					
				ProductosJTable = new JTable();
				
				ProductosJTable.setBounds(88, 62, 595, 223);	
				try {
					dbManager.concon();
				} catch (Exception e) {
					
				}
				ProductosJTable.setModel(new ProductosTableModel(productos));
				
				ProductosJTable.getColumnModel().getColumn(0).setMinWidth(100);
				ProductosJTable.getColumnModel().getColumn(1).setMinWidth(100);
				ProductosJTable.getColumnModel().getColumn(2).setMinWidth(100);
				ProductosJTable.getColumnModel().getColumn(3).setMinWidth(100);
				
				contentPane.add(ProductosJTable);
				
				JLabel lblNewLabel = new JLabel("PRODUCTOS");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
				lblNewLabel.setForeground(new Color(192, 192, 192));
				lblNewLabel.setBounds(245, 11, 332, 40);
				contentPane.add(lblNewLabel);
				
				JButton btnRealizarPedidos = new JButton("REALIZAR PEDIDO");
				btnRealizarPedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnRealizarPedidos.setBounds(311, 404, 178, 30);
				contentPane.add(btnRealizarPedidos);
				
				JButton btnAtras = new JButton("ATRAS");
				btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnAtras.setBounds(700, 412, 89, 22);
				btnAtras.setAction(action);
				contentPane.add(btnAtras);

				JLabel labelTipo = new JLabel("Tipo:");
				labelTipo.setForeground(new Color(255, 255, 255));
				labelTipo.setBounds(203, 300, 46, 18);
				contentPane.add(labelTipo);
				
				JComboBox<String> comboBoxTipo = new JComboBox<String>();
				comboBoxTipo.setBounds(245, 298, 94, 22);
				contentPane.add(comboBoxTipo);
				comboBoxTipo.addItem("Todos");
				

				Set<String> tipos = new HashSet<String>();
				for (Producto p : productos) {
					tipos.add(p.getTipo());
				}

				for (String tipo : tipos) {
					comboBoxTipo.addItem(tipo);
				}

				JButton btnBuscarFiltro = new JButton("Buscar");
				btnBuscarFiltro.setBounds(389, 299, 85, 21);
				contentPane.add(btnBuscarFiltro);
				
				ArrayList<Producto> productosTipo = new ArrayList<Producto>();
				
				
				btnRealizarPedidos.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Anyadimos producto");
						pedido.add(productos.get(ProductosJTable.getSelectedRow()));
					}
				});
				
				btnBuscarFiltro.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						productosTipo.clear();
						
						if(comboBoxTipo.getSelectedItem().toString().equals("Todos")) {
							for(Producto p : productos) {
			                    productosTipo.add(p);
			                }
						}else {
							for(Producto p : productos) {
			                    if(p.getTipo().equals(comboBoxTipo.getSelectedItem().toString())) {
			                        productosTipo.add(p);
			                    }
							}
						}
						
						ProductosJTable.setModel(new ProductosTableModel(productosTipo));
						
					}
				});
			};
				
			private class botonAtras extends AbstractAction {
				public botonAtras() {
					putValue(NAME, "Atras");
					putValue(SHORT_DESCRIPTION, "ir a la ventana anterior");
				}
				public void actionPerformed(ActionEvent e) {
					VentanaInicio VentanaInicio = new VentanaInicio();
					VentanaInicio.setVisible(true);
					dispose();
				}
			}
			
			
			
			  public static void main(String[] args) throws SQLException, IOException {
				  VentanaProductos vI = new VentanaProductos();      // creamos una ventana
			       vI.setVisible(true);            		 // hacemos visible la ventana creada
			    }
		}