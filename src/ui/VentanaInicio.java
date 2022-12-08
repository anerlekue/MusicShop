package ui;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;


public class VentanaInicio extends JFrame{

		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;

		
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
			contentPane.add(btnComprarinstrumentos);
			
			JButton btnCompraraltavoces = new JButton("COMPRAR ALTAVOCES");
			btnCompraraltavoces.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnCompraraltavoces.setBounds(136, 102, 171, 21);
			contentPane.add(btnCompraraltavoces);
			
			JButton btnComprardiscos = new JButton("COMPRAR DISCOS");
			btnComprardiscos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnComprardiscos.setBounds(136, 134, 171, 21);
			contentPane.add(btnComprardiscos);
			
			JButton btnVerpedidos = new JButton("VER PEDIDOS");
			btnVerpedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnVerpedidos.setBounds(136, 166, 171, 21);
			contentPane.add(btnVerpedidos);
		
			
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
		        VentanaInicio vl = new VentanaInicio();      // creamos una ventana
		       vl.setVisible(true);             // hacemos visible la ventana creada
		    }
	}
