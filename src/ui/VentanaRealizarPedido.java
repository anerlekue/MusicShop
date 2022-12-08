package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import config.BD;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;



public class VentanaRealizarPedido extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNick;
	private static String nick;
	private String con;
	private JPasswordField txtClave;

	public static String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void vaciarCampos() {
		txtNick.setText("");
		txtClave.setText("");

	}

	/**
	 * Create the frame.
	 */
	public VentanaRealizarPedido() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 82, 45));
		contentPane.setForeground(new Color(160, 82, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REALIZAR PEDIDO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(90, 24, 174, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnRegistrarse = new JButton("INSTRUMENTOS");
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnRegistrarse.setBounds(103, 71, 138, 21);
		contentPane.add(btnRegistrarse);
		
		JButton btnInicioSesion = new JButton("DISCOS");
		btnInicioSesion.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnInicioSesion.setBounds(103, 125, 138, 21);
		contentPane.add(btnInicioSesion);
		
		JButton btnAltavoces = new JButton("ALTAVOCES\r\n");
		btnAltavoces.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAltavoces.setBounds(103, 178, 138, 21);
		contentPane.add(btnAltavoces);
		
		JButton btnAtras = new JButton("VOLVER");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBounds(10, 232, 73, 21);
		contentPane.add(btnAtras);
		
		final JFrame ventana = this;
		
		JButton btnR = new JButton("Registrarse");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaRegistro v2 = new VentanaRegistro();
				v2.setVisible(true);

			}
		});
		
		
		btnRegistrarse.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new VentanaRegistro();
				dispose();
				
				 

			}
		});
		

		JButton btnAceptar = new JButton("Iniciar Sesion");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				
				int resultado = BD.buscarUsuario(txtNick.getText(), txtClave.getText());
				if (resultado == 1) {
					JOptionPane.showMessageDialog(null, "Inicio de sesion correcto", "INICIO SESION",
							JOptionPane.INFORMATION_MESSAGE);
					nick = txtNick.getText();
					con = txtClave.getText();

					ventana.setVisible(false);
					if (nick.equals("admin") && con.equals("admin1")) {
						
					} else {
						
					}

				} else if (resultado == 2) {
					JOptionPane.showMessageDialog(null, "Clave incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
	

	}		
	  public static void main(String[] args) {
	        VentanaRealizarPedido vRP = new VentanaRealizarPedido();      // creamos una ventana
	       vRP.setVisible(true);             // hacemos visible la ventana creada
	    }
}

