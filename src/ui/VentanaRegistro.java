package ui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import config.BD;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import javax.swing.JPasswordField;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtNombre;
	private JPasswordField txtContrasenya;
	private JTextField txtDNI;

	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblRegistro = new JLabel("Registro");
		panel.add(lblRegistro);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		final JFrame ventana = this;
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaLogin vl = new VentanaLogin();
				vl.setVisible(true);
			}
		});
		panel_1.add(btnVolver);

		JButton bntRegistrar = new JButton("Registrarse");
		bntRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Anyade el user a la bd
				if (txtDNI.getText().equals("") || txtNombre.getText().equals("") || txtEmail.getText().equals("")
						|| txtContrasenya.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Hay que rellenar todos los campos", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						int resultado = BD.buscarUsuario(txtNombre.getText(), txtContrasenya.getText());
						if (resultado != 0) {
							JOptionPane.showMessageDialog(null, "Este usuario ya existe", "ERROR",
									JOptionPane.ERROR_MESSAGE);
						} else {
							BD.registrarUsuario(txtDNI.getText(), txtNombre.getText(), txtEmail.getText(), txtContrasenya.getText());
							JOptionPane.showMessageDialog(null, "Registro realizado con Exito", "REGISTRO",
									JOptionPane.INFORMATION_MESSAGE);
							ventana.setVisible(false);
							VentanaLogin vl = new VentanaLogin();
							vl.setVisible(true);
						}
					} catch (NumberFormatException e1) {

					}
				}
				
			}
		});
		panel_1.add(bntRegistrar);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 0, 0, 0, 0, 194, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 40, 30, 30, 30, 0, 31, 25 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);
								
								JLabel lblDNI = new JLabel("DNI:");
								GridBagConstraints gbc_lblDNI = new GridBagConstraints();
								gbc_lblDNI.anchor = GridBagConstraints.WEST;
								gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
								gbc_lblDNI.gridx = 2;
								gbc_lblDNI.gridy = 1;
								panel_2.add(lblDNI, gbc_lblDNI);
								
								txtDNI = new JTextField();
								GridBagConstraints gbc_txtDNI = new GridBagConstraints();
								gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
								gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtDNI.gridx = 4;
								gbc_txtDNI.gridy = 1;
								panel_2.add(txtDNI, gbc_txtDNI);
								txtDNI.setColumns(10);
						
								JLabel lblNombre = new JLabel("Nombre:");
								GridBagConstraints gbc_txtNombre = new GridBagConstraints();
								gbc_txtNombre.anchor = GridBagConstraints.WEST;
								gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
								gbc_txtNombre.gridx = 2;
								gbc_txtNombre.gridy = 2;
								panel_2.add(lblNombre, gbc_txtNombre);
						
								txtNombre = new JTextField();
								GridBagConstraints gbc_txtNombre1 = new GridBagConstraints();
								gbc_txtNombre1.insets = new Insets(0, 0, 5, 5);
								gbc_txtNombre1.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtNombre1.gridx = 4;
								gbc_txtNombre1.gridy = 2;
								panel_2.add(txtNombre, gbc_txtNombre1);
								txtNombre.setColumns(10);
				
						JLabel lblEmail = new JLabel("Email:");
						GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
						gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
						gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel_1.gridx = 2;
						gbc_lblNewLabel_1.gridy = 3;
						panel_2.add(lblEmail, gbc_lblNewLabel_1);
				
						txtEmail = new JTextField();
						GridBagConstraints gbc_txtEmail = new GridBagConstraints();
						gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
						gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtEmail.gridx = 4;
						gbc_txtEmail.gridy = 3;
						panel_2.add(txtEmail, gbc_txtEmail);
						txtEmail.setColumns(10);
		
				JLabel lblContrasenya = new JLabel("Contrasena:");
				GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
				gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_2.gridx = 2;
				gbc_lblNewLabel_2.gridy = 4;
				panel_2.add(lblContrasenya, gbc_lblNewLabel_2);
				
						txtContrasenya = new JPasswordField();
						GridBagConstraints gbc_txtContrasenya = new GridBagConstraints();
						gbc_txtContrasenya.insets = new Insets(0, 0, 5, 5);
						gbc_txtContrasenya.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtContrasenya.gridx = 4;
						gbc_txtContrasenya.gridy = 4;
						panel_2.add(txtContrasenya, gbc_txtContrasenya);
	}
	  public static void main(String[] args) {
	        VentanaRegistro vr = new VentanaRegistro();      // creamos una ventana
	        vr.setVisible(true);             // hacemos visible la ventana creada
	    }

}
