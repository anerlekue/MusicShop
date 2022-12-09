package ui;

	import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

	import java.awt.Color;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JList;


	public class VentanaDiscos extends JFrame{

			
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;
			private final Action action = new botonAtras();

			
			public VentanaDiscos() {
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(200, 200, 850, 500);
				contentPane = new JPanel();
				contentPane.setBackground(new Color(160, 82, 45));
				contentPane.setForeground(new Color(160, 82, 45));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("DISCOS");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel.setBounds(113, 29, 170, 39);
				contentPane.add(lblNewLabel);
				
				JButton btnEliminarpedidos = new JButton("REALIZAR PEDIDO");
				btnEliminarpedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnEliminarpedidos.setBounds(146, 218, 137, 21);
				contentPane.add(btnEliminarpedidos);
				
				JButton btnAtras = new JButton("ATRÁS");
				btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnAtras.setBounds(10, 218, 76, 21);
				btnAtras.setAction(action);
				contentPane.add(btnAtras);
				
				JList list = new JList();
				list.setBounds(52, 78, 231, 88);
				contentPane.add(list);
				
				
				
				
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
					
			  public static void main(String[] args) {
			        VentanaDiscos vD = new VentanaDiscos();      // creamos una ventana
			       vD.setVisible(true);             // hacemos visible la ventana creada
			    }
		}