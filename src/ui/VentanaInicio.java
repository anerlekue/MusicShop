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

import classes.Producto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


public class VentanaInicio extends JFrame{

		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		
		
		public VentanaInicio()  {
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
			
			JButton btnComprarProductos = new JButton("COMPRAR PRODUCTOS");
			btnComprarProductos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});

			JButton btnVerpedidos = new JButton("VER CARRITO");
			
			
			JButton btnSalir = new JButton("SALIR");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ventana.setVisible(false);
					VentanaLogin vl = new VentanaLogin();
					vl.setVisible(true);
				}
			});
			btnSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnSalir.setBounds(542, 406, 166, 30);
			contentPane.add(btnSalir);
			
			JLabel labelGif = new JLabel();
			labelGif.setIcon(new ImageIcon ("images/bartgif.gif"));
			labelGif.setBounds(402, 113, 364, 231);
			contentPane.add(labelGif);
			
			JButton btnNewButton = new JButton("Ver Productos");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					VentanaProductos vp = null;
					try {
						vp = new VentanaProductos();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					vp.setVisible(true);
					
				}
			});
			btnNewButton.setBounds(125, 113, 209, 63);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Ver Carrito"+ "");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton_1.setForeground(new Color(0, 0, 0));
			btnNewButton_1.setBounds(125, 231, 209, 63);
			contentPane.add(btnNewButton_1);
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ArrayList<Producto> carrito = VentanaProductos.pedido;
					for (Producto producto : carrito) {
						System.out.println(producto);
					}
				}
			});
			
			
			};
				
		  public static void main(String[] args) {
		        VentanaInicio vl = new VentanaInicio();      // creamos una ventana
		       vl.setVisible(true);             			// hacemos visible la ventana creada
		    }
} 
