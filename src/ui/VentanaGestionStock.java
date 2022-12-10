package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;


	public class VentanaGestionStock extends JFrame{
		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private final Action action = new botonAtras();

		
		public VentanaGestionStock() {
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
			
			JButton btnAñadirproductos = new JButton("AÑADIR PRODUCTOS");
			btnAñadirproductos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnAñadirproductos.setBounds(291, 384, 207, 27);
			contentPane.add( btnAñadirproductos);
			
			JTable tablastock = new JTable();
			contentPane.add(tablastock);
			tablastock.setFont(new Font("Arial", Font.PLAIN, 14));
			tablastock.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			tablastock.setBounds(141, 76, 527, 201);
			
			JTextField textFieldnombre = new JTextField();
			textFieldnombre.setFont(new Font("Tahoma", Font.BOLD, 10));
			textFieldnombre.setBounds(281, 311, 231, 27);
			contentPane.add(textFieldnombre);
			
			JLabel lblNombreusuario = new JLabel("Nº PRODUCTOS:");
			lblNombreusuario.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNombreusuario.setBounds(181, 313, 179, 21);
			contentPane.add(lblNombreusuario);
		
			
			JButton btnAtras = new JButton("ATRÁS");
			btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnAtras.setBounds(684, 417, 100, 21);
			btnAtras.setAction(action);
			contentPane.add(btnAtras);
				
			
			};
			
			private class botonAtras extends AbstractAction {
				public botonAtras() {
					putValue(NAME, "Atras");
					putValue(SHORT_DESCRIPTION, "ir a la ventana anterior");
				}
				public void actionPerformed(ActionEvent e) {
					VentanaAdmin VentanaAdmin = new VentanaAdmin();
					VentanaAdmin.setVisible(true);
					dispose();
				}
			}
				
		  public static void main(String[] args) {
		        VentanaGestionStock vl = new VentanaGestionStock();      // creamos una ventana
		       vl.setVisible(true);             // hacemos visible la ventana creada
		    }
	}
