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
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
public class VentanaVerPedidos extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final Action action = new botonAtras();

	
	public VentanaVerPedidos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PEDIDOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setBounds(311, 11, 293, 40);
		contentPane.add(lblNewLabel);
		
		JTable tablapedidos = new JTable();
		contentPane.add(tablapedidos);
		tablapedidos.setFont(new Font("Arial", Font.PLAIN, 14));
		tablapedidos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tablapedidos.setBounds(148, 79, 546, 247);
		
		JButton btnEliminarpedidos = new JButton("ELIMINAR PEDIDO");
		btnEliminarpedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnEliminarpedidos.setBounds(325, 373, 178, 30);
		contentPane.add(btnEliminarpedidos);
		
		JButton btnAtras = new JButton("ATRÁS");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBounds(700, 412, 89, 22);
		btnAtras.setAction(action);
		contentPane.add(btnAtras);
		
		
		
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
	        VentanaVerPedidos vl = new VentanaVerPedidos();      // creamos una ventana
	       vl.setVisible(true);             // hacemos visible la ventana creada
	    }
}