package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaAdmin extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaAdmin() {
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
		
		
		JButton btnGestionusuarios = new JButton("GESTIÓN DE USUARIOS");
		btnGestionusuarios.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGestionusuarios.setBounds(128, 113, 165, 21);
		contentPane.add(btnGestionusuarios);
		
		JButton btnGestionstock = new JButton("GESTIÓN DE STOCK");
		btnGestionstock.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGestionstock.setBounds(128, 71, 165, 21);
		contentPane.add(btnGestionstock);
		
		JButton btnPedidosclientes = new JButton("PEDIDOS CLIENTES");
		btnPedidosclientes.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPedidosclientes.setBounds(128, 157, 165, 21);
		contentPane.add(btnPedidosclientes);
		
		JButton btnAtras = new JButton("ATRÁS");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBounds(331, 218, 76, 21);
		contentPane.add(btnAtras);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSalir.setBounds(32, 218, 76, 21);
		contentPane.add(btnSalir);
		
		
		
		};
			
	  public static void main(String[] args) {
	        VentanaAdmin vl = new VentanaAdmin();      // creamos una ventana
	       vl.setVisible(true);             // hacemos visible la ventana creada
	    }
}
