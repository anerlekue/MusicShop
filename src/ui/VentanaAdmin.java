package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
public class VentanaAdmin extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final Action actionBotonGestionStock = new botonGestionStock();
	private final Action actionBotonGestionUsuarios = new botonGestionUsuarios();
	private final Action actionBotonVerPedidos = new botonVerPedidos();

	public VentanaAdmin() {
		final JFrame ventana = this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(236, 98, 83));
		contentPane.setForeground(new Color(236, 98, 83));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("MUSIC SHOP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(268, 11, 293, 40);
		contentPane.add(lblNewLabel);
		
		
		JButton btnGestionusuarios = new JButton("GESTIÓN DE USUARIOS");
		btnGestionusuarios.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGestionusuarios.setBounds(100, 209, 199, 29);
		btnGestionusuarios.setAction(actionBotonGestionUsuarios);
		contentPane.add(btnGestionusuarios);
		
		JButton btnGestionstock = new JButton("GESTIÓN DE STOCK");
		btnGestionstock.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGestionstock.setBounds(100, 136, 199, 29);
		btnGestionstock.setAction(actionBotonGestionStock);
		contentPane.add(btnGestionstock);
		
		JButton btnPedidosclientes = new JButton("PEDIDOS CLIENTES");
		btnPedidosclientes.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPedidosclientes.setBounds(100, 280, 199, 29);
		btnPedidosclientes.setAction(actionBotonVerPedidos);
		contentPane.add(btnPedidosclientes);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaLogin vl = new VentanaLogin();
				vl.setVisible(true);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSalir.setBounds(667, 393, 133, 40);
		contentPane.add(btnSalir);
		
		JLabel labelImagen = new JLabel();
		labelImagen.setIcon(new ImageIcon ("images/admin.gif"));
		labelImagen.setBounds(402, 94, 351, 233);
		contentPane.add(labelImagen);
		
		
		
		};
		
		private class botonGestionStock extends AbstractAction {
			public botonGestionStock() {
				putValue(NAME, "GESTIÓN DE STOCK");
				putValue(SHORT_DESCRIPTION, "Abrir la ventana para añadir o eliminar productos");
			}

			public void actionPerformed(ActionEvent e) {
				VentanaGestionStock ventanaGestionStock = new VentanaGestionStock();
				ventanaGestionStock.setVisible(true);
				dispose();

			}
		}
		
		private class botonGestionUsuarios extends AbstractAction {
			public botonGestionUsuarios() {
				putValue(NAME, "GESTIÓN DE USUARIOS");
				putValue(SHORT_DESCRIPTION, "Abrir la ventana para eliminar cuentas");
			}

			public void actionPerformed(ActionEvent e) {
				VentanaGestionUsuarios ventanaGestionUsuarios = new VentanaGestionUsuarios();
				ventanaGestionUsuarios.setVisible(true);
				dispose();

			}
		}
		
		private class botonVerPedidos extends AbstractAction {
			public botonVerPedidos() {
				putValue(NAME, "PEDIDOS CLIENTES");
				putValue(SHORT_DESCRIPTION, "Abrir la ventana para ver los pedidos realizados por los clientes");
			}

			public void actionPerformed(ActionEvent e) {
				VentanaVerPedidosAdmin ventanaVerPedidosAdmin = new VentanaVerPedidosAdmin();
				ventanaVerPedidosAdmin.setVisible(true);
				dispose();

			}
		}
			
	  public static void main(String[] args) {
	       VentanaAdmin vl = new VentanaAdmin();      // creamos una ventana
	       vl.setVisible(true);             // hacemos visible la ventana creada
	    }
}
