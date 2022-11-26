package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import config.BD;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 82, 45));
		contentPane.setForeground(new Color(160, 82, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsr = new JLabel("Usuario");
		lblUsr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsr.setBounds(74, 83, 78, 32);
		contentPane.add(lblUsr);
		
		JLabel lblPsw = new JLabel("Password");
		lblPsw.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPsw.setBounds(74, 144, 91, 32);
		contentPane.add(lblPsw);
		
		textUsr = new JTextField();
		textUsr.setBounds(186, 92, 129, 19);
		contentPane.add(textUsr);
		textUsr.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(186, 153, 129, 19);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("MUSIC SHOP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(157, 10, 122, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnRegistrarse.setBounds(94, 213, 105, 21);
		contentPane.add(btnRegistrarse);
		
		JButton btnInicioSesion = new JButton("INICIO SESION");
		btnInicioSesion.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnInicioSesion.setBounds(242, 213, 105, 21);
		contentPane.add(btnInicioSesion);
		/*
		JPanel pCentro = new JPanel();
		pCentro.setBounds(0, 41, 434, 182);
		contentPane.add(pCentro);
		pCentro.setBackground(new Color(0, 0, 0, 0));

		JPanel pAbajo = new JPanel();
		pAbajo.setBounds(0, 223, 434, 38);
		pAbajo.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(pAbajo);
								pCentro.setLayout(null);
						
								JLabel lblUsuario = new JLabel("USUARIO :");
								lblUsuario.setBounds(114, 34, 61, 14);
								lblUsuario.setForeground(Color.BLACK);
								lblUsuario.setFont(new Font("Arial", Font.BOLD, 12));
								lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
								pCentro.add(lblUsuario);
						
								txtNick = new JTextField();
								txtNick.setBounds(217, 31, 93, 19);
								txtNick.setBackground(Color.WHITE);
								pCentro.add(txtNick);
								txtNick.setColumns(10);
						
								JLabel lblContrasea = new JLabel("CONTRASE\u00D1A :");
								lblContrasea.setBounds(114, 86, 90, 14);
								lblContrasea.setForeground(Color.BLACK);
								lblContrasea.setFont(new Font("Arial", Font.BOLD, 12));
								pCentro.add(lblContrasea);
								
										txtClave = new JPasswordField();
										txtClave.setBounds(217, 83, 93, 19);
										txtClave.setBackground(Color.WHITE);
										pCentro.add(txtClave);

		*/
		final JFrame ventana = this;
		
		JButton btnR = new JButton("Registrarse");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaRegistro v2 = new VentanaRegistro();
				v2.setVisible(true);

			}
		});
		//pAbajo.add(btnR);

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
						//VentanaAdmin vpa = new VentanaAdmin();
						//vpa.setVisible(true);
					} else {
						//VentanaPrincipal vpc = new VentanaPrincipal();
						//vpc.setVisible(true);
					}

				} else if (resultado == 2) {
					JOptionPane.showMessageDialog(null, "Clave incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		//pAbajo.add(btnAceptar);

	}		
	  public static void main(String[] args) {
	        VentanaLogin vl = new VentanaLogin();      // creamos una ventana
	       vl.setVisible(true);             // hacemos visible la ventana creada
	    }
}
