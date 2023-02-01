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
import Main.Main;
import classes.Producto;
import config.BD;
import javax.swing.JTextField;


public class VentanaProductos extends JFrame{

			private static final long serialVersionUID = 1L;
			private JPanel contentPane;
			private final Action action = new botonAtras();
			private JTable ProductosJTable;
			private ArrayList<Producto> productos;
			private BD dbManager;
			private JTextField textFieldNombre;
			private JTextField textFieldTipo;
			private JTextField textFieldPrecio;
			private JTextField textFieldId;
			private JButton btnAnyadirProducto;
		
			
			public VentanaProductos() throws SQLException, IOException {
				setResizable(false);
				add(new JScrollPane(ProductosJTable), BorderLayout.CENTER);
				dbManager = new BD();

				productos = dbManager.getProducto();

				if(productos.size() == 0) {
					dbManager.cargaProductos();
				}

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(200, 200, 1012, 513);
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
				
				
		       // add(new JScrollPane(ProductosJTable), BorderLayout.CENTER);
		        
				contentPane.add(ProductosJTable);
				
				JLabel lblCantidadProductos = new JLabel("AÑADIDOS AL PEDIDO: " + Main.pedido.size());
				lblCantidadProductos.setFont(new Font("Tahoma", Font.BOLD, 10));
				lblCantidadProductos.setForeground(new Color(255, 255, 255));
				lblCantidadProductos.setBounds(369, 285, 332, 40);
				contentPane.add(lblCantidadProductos);
				
				JLabel lblProductos = new JLabel("PRODUCTOS");
				lblProductos.setFont(new Font("Tahoma", Font.BOLD, 40));
				lblProductos.setForeground(new Color(192, 192, 192));
				lblProductos.setBounds(265, 11, 332, 40);
				contentPane.add(lblProductos);
						
				JButton btnRealizarPedidos = new JButton("REALIZAR PEDIDO");
				btnRealizarPedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnRealizarPedidos.setBounds(300, 385, 178, 30);
				contentPane.add(btnRealizarPedidos);
				
				JButton btnAtras = new JButton("ATRAS");
				btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnAtras.setBounds(884, 430, 89, 22);
				btnAtras.setAction(action);
				contentPane.add(btnAtras);

				JLabel labelTipo = new JLabel("Tipo:");
				labelTipo.setForeground(new Color(255, 255, 255));
				labelTipo.setBounds(233, 296, 46, 18);
				contentPane.add(labelTipo);
				
				JComboBox<String> comboBoxTipo = new JComboBox<String>();
				comboBoxTipo.setBounds(265, 296, 94, 22);
				contentPane.add(comboBoxTipo);
				comboBoxTipo.addItem("Todos");
				
				textFieldNombre = new JTextField();
				textFieldNombre.setBounds(777, 110, 147, 20);
				contentPane.add(textFieldNombre);
				textFieldNombre.setColumns(10);
				
				textFieldTipo = new JTextField();
				textFieldTipo.setBounds(777, 154, 147, 20);
				contentPane.add(textFieldTipo);
				textFieldTipo.setColumns(10);
				
				textFieldPrecio = new JTextField();
				textFieldPrecio.setBounds(777, 201, 147, 20);
				contentPane.add(textFieldPrecio);
				textFieldPrecio.setColumns(10);
				
				textFieldId = new JTextField();
				textFieldId.setBounds(777, 248, 147, 20);
				contentPane.add(textFieldId);
				textFieldId.setColumns(10);
				
				btnAnyadirProducto = new JButton("Añadir producto");
				btnAnyadirProducto.setBounds(792, 314, 119, 23);
				contentPane.add(btnAnyadirProducto);
				
				JLabel lblId = new JLabel("Id: ");
				lblId.setBounds(754, 251, 46, 14);
				lblId.setForeground(new Color(192, 192, 192));
				lblId.setFont(new Font("Tahoma", Font.BOLD, 10));
				contentPane.add(lblId);
				
				JLabel lblPrecio = new JLabel("Precio: ");
				lblPrecio.setBounds(733, 204, 58, 14);
				lblPrecio.setForeground(new Color(192, 192, 192));
				lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 10));
				contentPane.add(lblPrecio);
				
				JLabel lblNombre = new JLabel("Nombre: ");
				lblNombre.setBounds(733, 113, 46, 14);
				lblNombre.setForeground(new Color(192, 192, 192));
				lblNombre.setFont(new Font("Tahoma", Font.BOLD, 10));
				contentPane.add(lblNombre);
				
				JLabel lblTipo = new JLabel("Tipo: ");
				lblTipo.setBounds(744, 157, 46, 14);
				lblTipo.setForeground(new Color(192, 192, 192));
				lblTipo.setFont(new Font("Tahoma", Font.BOLD, 10));
				contentPane.add(lblTipo);
				
				JLabel lblAnyadir = new JLabel("Añadir Nuevo Producto");
				lblAnyadir.setBounds(724, 45, 244, 40);
				lblAnyadir.setForeground(new Color(192, 192, 192));
				lblAnyadir.setFont(new Font("Tahoma", Font.BOLD, 20));
				contentPane.add(lblAnyadir);
				
				
				btnAnyadirProducto.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Producto p = new Producto (textFieldNombre.getText(), textFieldTipo.getText(), Integer.valueOf(textFieldPrecio.getText()), textFieldId.getText());
						int resultado = dbManager.insertarProducto(p);
						if (resultado == 1) {
							try {
								productos = dbManager.getProducto();
							} catch (SQLException | IOException e1) {
								e1.printStackTrace();
							}
							ProductosJTable.setModel(new ProductosTableModel(productos));
							Main.pedido.clear();
							lblCantidadProductos.setText("AÑADIDOS AL PEDIDO: " + Main.pedido.size());
							textFieldNombre.setText("");
							textFieldTipo.setText("");
							textFieldPrecio.setText("");
							textFieldId.setText("");
							
							
						}
						else {
							System.out.println("No se ha podido añadir el producto" + p.toString());
						}
					}
					
				});
				

				Set<String> tipos = new HashSet<String>();
				for (Producto p : productos) {
					tipos.add(p.getTipo());
				}

				for (String tipo : tipos) {
					comboBoxTipo.addItem(tipo);
				}
				
				ArrayList<Producto> productosTipo = new ArrayList<Producto>();
				
				
				btnRealizarPedidos.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Anyadimos producto");
                        Main.pedido.add(productos.get(ProductosJTable.getSelectedRow()));
                        productos.remove(productos.get(ProductosJTable.getSelectedRow()));
                        ProductosJTable.setModel(new ProductosTableModel(productos));
                        lblCantidadProductos.setText("AÑADIDOS AL PEDIDO: " + Main.pedido.size());
                    }
                });
				
				comboBoxTipo.addActionListener(new ActionListener() {
					
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
			
			
			
			  public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
				  VentanaProductos vI = new VentanaProductos();      // creamos una ventana
			       vI.setVisible(true);            		 // hacemos visible la ventana creada
			    }
		}