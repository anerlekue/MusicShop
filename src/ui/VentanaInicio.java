package ui;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;


public class VentanaInicio extends JFrame{

		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private final Action actionBotonInstrumentos = new botonInstrumentos();
		private final Action actionBotonAltavoces = new botonAltavoces();
		private final Action actionBotonDiscos = new botonDiscos();
		private final Action actionBotonVerPedidos = new botonVerPedidos();
	

		
		public VentanaInicio() {
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(160, 82, 45));
			contentPane.setForeground(new Color(160, 82, 45));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("MUSIC SHOP");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setBounds(157, 10, 122, 39);
			contentPane.add(lblNewLabel);
			
			JButton btnComprarinstrumentos = new JButton("COMPRAR INSTRUMENTOS");
			btnComprarinstrumentos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnComprarinstrumentos.setBounds(136, 70, 171, 21);
			btnComprarinstrumentos.setAction(actionBotonInstrumentos);
			contentPane.add(btnComprarinstrumentos);
			
			JButton btnCompraraltavoces = new JButton("COMPRAR ALTAVOCES");
			btnCompraraltavoces.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnCompraraltavoces.setBounds(136, 102, 171, 21);
			btnCompraraltavoces.setAction(actionBotonAltavoces);
			contentPane.add(btnCompraraltavoces);
			
			JButton btnComprardiscos = new JButton("COMPRAR DISCOS");
			btnComprardiscos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnComprardiscos.setBounds(136, 134, 171, 21);
			btnComprardiscos.setAction(actionBotonDiscos);
			contentPane.add(btnComprardiscos);
			
			JButton btnVerpedidos = new JButton("VER PEDIDOS");
			btnVerpedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnVerpedidos.setBounds(136, 166, 171, 21);
			btnVerpedidos.setAction(actionBotonVerPedidos);
			contentPane.add(btnVerpedidos);
		
			
			JButton btnSalir = new JButton("SALIR");
			btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnSalir.setBounds(32, 218, 76, 21);
			contentPane.add(btnSalir);
			
			
			};
			
			private class botonInstrumentos extends AbstractAction {
				public botonInstrumentos() {
					putValue(NAME, "COMPRAR INSTRUMENTOS");
					putValue(SHORT_DESCRIPTION, "Abrir la ventana para realizar pedido de instrumentos");
				}

				public void actionPerformed(ActionEvent e) {
					VentanaInstrumentos ventanaInstrumentos = new VentanaInstrumentos();
					ventanaInstrumentos.setVisible(true);
					dispose();

				}
			}
			
			private class botonDiscos extends AbstractAction {
				public botonDiscos() {
					putValue(NAME, "COMPRAR DISCOS");
					putValue(SHORT_DESCRIPTION, "Abrir la ventana para realizar pedido de discos");
				}

				public void actionPerformed(ActionEvent e) {
					VentanaDiscos ventanaDiscos = new VentanaDiscos();
					ventanaDiscos.setVisible(true);
					dispose();

				}
			}
			
			private class botonAltavoces extends AbstractAction {
				public botonAltavoces() {
					putValue(NAME, "COMPRAR ALTAVOCES");
					putValue(SHORT_DESCRIPTION, "Abrir la ventana para realizar pedido de altavoces");
				}

				public void actionPerformed(ActionEvent e) {
					VentanaAltavoces ventanaAltavoces = new VentanaAltavoces();
					ventanaAltavoces.setVisible(true);
					dispose();

				}
			}
			
			private class botonVerPedidos extends AbstractAction {
				public botonVerPedidos() {
					putValue(NAME, "VER PEDIDOS");
					putValue(SHORT_DESCRIPTION, "Abrir la ventana para ver los pedidos realizados");
				}

				public void actionPerformed(ActionEvent e) {
					VentanaVerPedidos ventanaVerPedidos = new VentanaVerPedidos();
					ventanaVerPedidos.setVisible(true);
					dispose();

				}
			}
				
		  public static void main(String[] args) {
		        VentanaInicio vl = new VentanaInicio();      // creamos una ventana
		       vl.setVisible(true);             // hacemos visible la ventana creada
		    }
	}
