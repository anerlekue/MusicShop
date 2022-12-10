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
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JList;


	public class VentanaInstrumentos extends JFrame{

			
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;
			private final Action action = new botonAtras();

			
			public VentanaInstrumentos() {
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(200, 200, 850, 500);
				contentPane = new JPanel();
				contentPane.setBackground(new Color(0, 0, 128));
				contentPane.setForeground(new Color(0, 0, 128));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("INSTRUMENTOS");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
				lblNewLabel.setForeground(new Color(192, 192, 192));
				lblNewLabel.setBounds(245, 11, 332, 40);
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
				labelModelo.setBounds(190, 358, 46, 18);
				contentPane.add(labelModelo);
				

				JLabel labelTipo = new JLabel("Tipo:");
				labelTipo.setForeground(new Color(255, 255, 255));
				labelTipo.setBounds(203, 300, 46, 18);
				contentPane.add(labelTipo);
				

				JLabel labelMarca = new JLabel("Marca:");
				labelMarca.setForeground(new Color(255, 255, 255));
				labelMarca.setBounds(402, 300, 46, 18);
				contentPane.add(labelMarca);
				

				JLabel labelColor = new JLabel("Color:");
				labelColor.setForeground(new Color(255, 255, 255));
				labelColor.setBounds(402, 358, 46, 18);
				contentPane.add(labelColor);
				
				JComboBox comboBoxModelo = new JComboBox();
				comboBoxModelo.setBounds(239, 296, 94, 22);
				contentPane.add(comboBoxModelo);
				
				JComboBox comboBoxTipo = new JComboBox();
				comboBoxTipo.setBounds(239, 354, 94, 22);
				contentPane.add(comboBoxTipo);
				
				JList list = new JList();
				list.setBounds(150, 62, 513, 207);
				contentPane.add(list);
				
				JComboBox comboBoxMarca = new JComboBox();
				comboBoxMarca.setBounds(441, 296, 94, 22);
				contentPane.add(comboBoxMarca);
				
				JComboBox comboBoxColor = new JComboBox();
				comboBoxColor.setBounds(441, 354, 94, 22);
				contentPane.add(comboBoxColor);
				
				
				
				
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
			        VentanaInstrumentos vI = new VentanaInstrumentos();      // creamos una ventana
			       vI.setVisible(true);             // hacemos visible la ventana creada
			    }
		}