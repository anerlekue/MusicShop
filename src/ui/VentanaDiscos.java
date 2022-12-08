package ui;

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
import javax.swing.JComboBox;
import javax.swing.JList;


	public class VentanaDiscos extends JFrame{

			
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;

			
			public VentanaDiscos() {
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
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
				contentPane.add(btnAtras);
				
				JList list = new JList();
				list.setBounds(52, 78, 231, 88);
				contentPane.add(list);
				
				
				
				
				};
					
			  public static void main(String[] args) {
			        VentanaDiscos vD = new VentanaDiscos();      // creamos una ventana
			       vD.setVisible(true);             // hacemos visible la ventana creada
			    }
		}