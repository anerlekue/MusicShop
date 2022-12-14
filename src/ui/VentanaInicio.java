package ui;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaInicio extends JFrame{

		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private final Action actionBotonInstrumentos = new botonInstrumentos();
		private final Action actionBotonAltavoces = new botonAltavoces();
		private final Action actionBotonDiscos = new botonDiscos();
		private final Action actionBotonVerPedidos = new botonVerPedidos();
	

		
		public VentanaInicio() {
			final JFrame ventana = this;
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(200, 200, 850, 500);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(0, 0, 128));
			contentPane.setForeground(new Color(0, 0, 128));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("MUSIC SHOP");
			lblNewLabel.setForeground(new Color(192, 192, 192));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel.setBounds(259, 11, 293, 40);
			contentPane.add(lblNewLabel);
			
			JButton btnComprarinstrumentos = new JButton("COMPRAR INSTRUMENTOS");
			btnComprarinstrumentos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnComprarinstrumentos.setBounds(110, 113, 199, 30);
			btnComprarinstrumentos.setAction(actionBotonInstrumentos);
			contentPane.add(btnComprarinstrumentos);
			
			JButton btnCompraraltavoces = new JButton("COMPRAR ALTAVOCES");
			btnCompraraltavoces.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnCompraraltavoces.setBounds(110, 189, 199, 30);
			btnCompraraltavoces.setAction(actionBotonAltavoces);
			contentPane.add(btnCompraraltavoces);
			
			JButton btnComprardiscos = new JButton("COMPRAR DISCOS");
			btnComprardiscos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnComprardiscos.setBounds(110, 265, 199, 30);
			btnComprardiscos.setAction(actionBotonDiscos);
			contentPane.add(btnComprardiscos);
			
			JButton btnVerpedidos = new JButton("VER PEDIDOS");
			btnVerpedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnVerpedidos.setBounds(110, 343, 199, 30);
			btnVerpedidos.setAction(actionBotonVerPedidos);
			contentPane.add(btnVerpedidos);
		
			
			JButton btnSalir = new JButton("SALIR");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ventana.setVisible(false);
					VentanaLogin vl = new VentanaLogin();
					vl.setVisible(true);
				}
			});
			btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnSalir.setBounds(542, 404, 166, 30);
			contentPane.add(btnSalir);
			
			JLabel labelGif = new JLabel();
			labelGif.setIcon(new ImageIcon ("images/bartgif.gif"));
			labelGif.setBounds(402, 113, 364, 231);
			contentPane.add(labelGif);
			
			
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
