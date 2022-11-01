package Main.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.config.BD;

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
import net.miginfocom.swing.MigLayout;


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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pArriba = new JPanel();
		pArriba.setBounds(0, 5, 434, 36);
		pArriba.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(pArriba);

		JLabel lblTitle = new JLabel("MusicShop");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setFont(new Font("Plantagenet Cherokee", Font.BOLD | Font.ITALIC, 20));
		pArriba.add(lblTitle);

		JPanel pCentro = new JPanel();
		pCentro.setBounds(0, 41, 434, 182);
		contentPane.add(pCentro);
		pCentro.setBackground(new Color(0, 0, 0, 0));

		JPanel pAbajo = new JPanel();
		pAbajo.setBounds(0, 223, 434, 38);
		pAbajo.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(pAbajo);
		pCentro.setLayout(new MigLayout("", "[33px][71.00px][85px][7px][][115.00]", "[20px][][][]"));
						
								JLabel lblUsuario = new JLabel("USUARIO :");
								lblUsuario.setForeground(Color.BLACK);
								lblUsuario.setFont(new Font("Arial", Font.BOLD, 12));
								lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
								pCentro.add(lblUsuario, "cell 2 1,alignx left,aligny center");
						
								txtNick = new JTextField();
								txtNick.setBackground(Color.WHITE);
								pCentro.add(txtNick, "cell 4 1,alignx left,aligny top");
								txtNick.setColumns(10);
						
								JLabel lblContrasea = new JLabel("CONTRASE\u00D1A :");
								lblContrasea.setForeground(Color.BLACK);
								lblContrasea.setFont(new Font("Arial", Font.BOLD, 12));
								pCentro.add(lblContrasea, "cell 2 3,alignx left,aligny center");
								
										txtClave = new JPasswordField();
										txtClave.setBackground(Color.WHITE);
										pCentro.add(txtClave, "cell 4 3,growx,aligny top");

		final JFrame ventana = this;

		JButton btnR = new JButton("Registrarse");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaRegistro v2 = new VentanaRegistro();
				v2.setVisible(true);

			}
		});
		pAbajo.add(btnR);

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
		
		pAbajo.add(btnAceptar);

	}								
}
