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
			setBounds(200, 200, 850, 500);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(160, 82, 45));
			contentPane.setForeground(new Color(160, 82, 45));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("MUSIC SHOP");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel.setBounds(268, 11, 293, 40);
			contentPane.add(lblNewLabel);
			
			JButton btnComprarinstrumentos = new JButton("COMPRAR INSTRUMENTOS");
			btnComprarinstrumentos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnComprarinstrumentos.setBounds(300, 98, 189, 40);
			btnComprarinstrumentos.setAction(actionBotonInstrumentos);
			contentPane.add(btnComprarinstrumentos);
			
			JButton btnCompraraltavoces = new JButton("COMPRAR ALTAVOCES");
			btnCompraraltavoces.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnCompraraltavoces.setBounds(300, 177, 189, 40);
			btnCompraraltavoces.setAction(actionBotonAltavoces);
			contentPane.add(btnCompraraltavoces);
			
			JButton btnComprardiscos = new JButton("COMPRAR DISCOS");
			btnComprardiscos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnComprardiscos.setBounds(300, 253, 189, 40);
			btnComprardiscos.setAction(actionBotonDiscos);
			contentPane.add(btnComprardiscos);
			
			JButton btnVerpedidos = new JButton("VER PEDIDOS");
			btnVerpedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnVerpedidos.setBounds(300, 329, 189, 40);
			btnVerpedidos.setAction(actionBotonVerPedidos);
			contentPane.add(btnVerpedidos);
		
			
			JButton btnSalir = new JButton("SALIR");
			btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnSalir.setBounds(667, 393, 133, 40);
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
