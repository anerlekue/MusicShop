package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class VentanaGestionUsuarios extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public VentanaGestionUsuarios() {
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
		
		JButton btnEliminarcuenta = new JButton("ELIMINAR CUENTA");
		btnEliminarcuenta.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnEliminarcuenta.setBounds(124, 218, 171, 21);
		contentPane.add(btnEliminarcuenta);
		
		JTable tablausuarios = new JTable();
		contentPane.add(tablausuarios );
		tablausuarios .setFont(new Font("Arial", Font.PLAIN, 14));
		tablausuarios .setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tablausuarios .setBounds(104, 60, 218, 111);
		
		JTextField textFieldnombre = new JTextField();
		textFieldnombre.setFont(new Font("Tahoma", Font.BOLD, 10));
		textFieldnombre.setBounds(142, 186, 143, 21);
		contentPane.add(textFieldnombre);
		
		JLabel lblNombreusuario = new JLabel("NOMBRE USUARIO");
		lblNombreusuario.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNombreusuario.setBounds(43, 186, 179, 21);
		contentPane.add(lblNombreusuario);
	
		
		JButton btnAtras = new JButton("ATRÁS");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBounds(331, 218, 76, 21);
		contentPane.add(btnAtras);
		
		
		};
			
	  public static void main(String[] args) {
	        VentanaGestionUsuarios vl = new VentanaGestionUsuarios();      // creamos una ventana
	       vl.setVisible(true);             // hacemos visible la ventana creada
	    }
}