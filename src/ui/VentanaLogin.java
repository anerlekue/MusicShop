package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import config.BD;


import javax.swing.AbstractAction;
import javax.swing.Action;
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



public class VentanaLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNick;
	private static String nick;
	private String con;
	private JPasswordField txtClave;
	private JTextField textUsr;
	private JPasswordField passwordField;
	private final Action action = new botonRegistrarse();

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
	public VentanaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(160, 82, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsr = new JLabel("Usuario");
		lblUsr.setForeground(new Color(255, 255, 255));
		lblUsr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsr.setBounds(286, 170, 78, 32);
		contentPane.add(lblUsr);
		
		JLabel lblPsw = new JLabel("Password");
		lblPsw.setForeground(new Color(255, 255, 255));
		lblPsw.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPsw.setBounds(273, 235, 91, 32);
		contentPane.add(lblPsw);
		
		textUsr = new JTextField();
		textUsr.setBounds(387, 173, 178, 32);
		contentPane.add(textUsr);
		textUsr.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(387, 238, 178, 32);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("MUSIC SHOP");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(325, 59, 293, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnRegistrarse.setBounds(254, 372, 120, 32);
		btnRegistrarse.setAction(action);
		contentPane.add(btnRegistrarse);
		
		
		JButton btnInicioSesion = new JButton("INICIO SESION");
		btnInicioSesion.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnInicioSesion.setBounds(548, 370, 129, 36);
		contentPane.add(btnInicioSesion);
		
		final JFrame ventana = this;
		
	
		
		
		

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
		
		private class botonRegistrarse extends AbstractAction {
			public botonRegistrarse() {
				putValue(NAME, "REGISTRARSE");
				putValue(SHORT_DESCRIPTION, "ir a la ventana Registro");
			}
			public void actionPerformed(ActionEvent e) {
				VentanaRegistro VentanaRegistro = new VentanaRegistro();
				VentanaRegistro.setVisible(true);
				dispose();
			}
		}
			
		

			
	  public static void main(String[] args) {
	        VentanaLogin vl = new VentanaLogin();      // creamos una ventana
	       vl.setVisible(true);             // hacemos visible la ventana creada
	    }
}
