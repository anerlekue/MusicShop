package ui;

	import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

	import java.awt.Color;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import config.BD;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JList;


	public class VentanaAltavoces extends JFrame{

			
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;
			private final Action action = new botonAtras();

			
			public VentanaAltavoces() {
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(200, 200, 850, 500);
				contentPane = new JPanel();
				contentPane.setBackground(new Color(0, 0, 128));
				contentPane.setForeground(new Color(0, 0, 128));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("ALTAVOCES");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
				lblNewLabel.setForeground(new Color(192, 192, 192));
				lblNewLabel.setBounds(284, 11, 332, 40);
				contentPane.add(lblNewLabel);
				
				JButton btnRealizarPedidos = new JButton("REALIZAR PEDIDO");
				btnRealizarPedidos.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnRealizarPedidos.setBounds(311, 404, 178, 30);
				contentPane.add(btnRealizarPedidos);
				
				JButton btnAtras = new JButton("ATRÁS");
				btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
				btnAtras.setBounds(700, 412, 89, 22);
				btnAtras.setAction(action);
				contentPane.add(btnAtras);
				

				JLabel labelModelo = new JLabel("Modelo:");
				labelModelo.setForeground(new Color(255, 255, 255));
				labelModelo.setBounds(192, 356, 46, 18);
				contentPane.add(labelModelo);
				

				JLabel labelTamayo = new JLabel("Tamaño:");
				labelTamayo.setForeground(new Color(255, 255, 255));
				labelTamayo.setBounds(404, 298, 67, 18);
				contentPane.add(labelTamayo);
				

				JLabel labelMarca = new JLabel("Marca:");
				labelMarca.setForeground(new Color(255, 255, 255));
				labelMarca.setBounds(203, 298, 46, 18);
				contentPane.add(labelMarca);
				

				JLabel labelCapacidad = new JLabel("Capacidad:");
				labelCapacidad.setForeground(new Color(255, 255, 255));
				labelCapacidad.setBounds(394, 356, 77, 18);
				contentPane.add(labelCapacidad);
				
				JComboBox comboBoxModelo = new JComboBox();
				comboBoxModelo.setBounds(249, 296, 94, 22);
				contentPane.add(comboBoxModelo);
				
				JComboBox comboBoxTamayo = new JComboBox();
				comboBoxTamayo.setBounds(249, 354, 94, 22);
				contentPane.add(comboBoxTamayo);
				
				JList list = new JList();
				list.setBounds(150, 62, 513, 207);
				contentPane.add(list);
				
				JComboBox comboBoxMarca = new JComboBox();
				comboBoxMarca.setBounds(461, 296, 94, 22);
				contentPane.add(comboBoxMarca);
				
				JComboBox comboBoxCapacidad = new JComboBox();
				comboBoxCapacidad.setBounds(461, 354, 94, 22);
				contentPane.add(comboBoxCapacidad);
				
				
				
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
			        VentanaAltavoces vA = new VentanaAltavoces();      // creamos una ventana
			       vA.setVisible(true);             // hacemos visible la ventana creada
			    }
		}