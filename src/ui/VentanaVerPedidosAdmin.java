
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


	public class VentanaVerPedidosAdmin extends JFrame{

			
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;
			private final Action action = new botonAtras();

			
			public VentanaVerPedidosAdmin() {
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
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel.setBounds(268, 11, 293, 40);
				contentPane.add(lblNewLabel);
				
				JTable tablapedidosclientes = new JTable();
				contentPane.add(tablapedidosclientes);
				tablapedidosclientes.setFont(new Font("Arial", Font.PLAIN, 14));
				tablapedidosclientes.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				tablapedidosclientes.setBounds(154, 81, 382, 159);
				
				JTextField textFieldId = new JTextField();
				textFieldId.setFont(new Font("Tahoma", Font.BOLD, 10));
				textFieldId.setBounds(320, 272, 143, 21);
				contentPane.add(textFieldId);
				
				JLabel lblId = new JLabel("ID");
				lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblId.setBounds(276, 263, 34, 34);
				contentPane.add(lblId);
				
				JButton btnEliminarpedidos = new JButton("ELIMINAR PEDIDOS");
				btnEliminarpedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnEliminarpedidos.setBounds(389, 315, 221, 59);
				contentPane.add(btnEliminarpedidos);
				
				JButton btnAtras = new JButton("ATRÁS");
				btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnAtras.setBounds(168, 315, 105, 59);
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
			        VentanaVerPedidosAdmin vl = new VentanaVerPedidosAdmin();      // creamos una ventana
			       vl.setVisible(true);             // hacemos visible la ventana creada
			    }
		}
