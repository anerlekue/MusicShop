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


	public class VentanaDiscos extends JFrame{

			
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;
			private final Action action = new botonAtras();

			
			public VentanaDiscos() {
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(200, 200, 850, 500);
				contentPane = new JPanel();
				contentPane.setBackground(new Color(0, 0, 128));
				contentPane.setForeground(new Color(0, 0, 128));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("DISCOS");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
				lblNewLabel.setForeground(new Color(192, 192, 192));
				lblNewLabel.setBounds(314, 11, 332, 40);
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
				

				JLabel labelGrupo = new JLabel("Grupo:");
				labelGrupo.setForeground(new Color(255, 255, 255));
				labelGrupo.setBounds(196, 298, 46, 18);
				contentPane.add(labelGrupo);
				

				JLabel labelAnyo = new JLabel("Año:");
				labelAnyo.setForeground(new Color(255, 255, 255));
				labelAnyo.setBounds(412, 298, 46, 18);
				contentPane.add(labelAnyo);
				

				JLabel labelLugar = new JLabel("Lugar de origen:");
				labelLugar.setForeground(new Color(255, 255, 255));
				labelLugar.setBounds(137, 356, 153, 18);
				contentPane.add(labelLugar);
				

				JLabel labelNombre = new JLabel("Nombre:");
				labelNombre.setForeground(new Color(255, 255, 255));
				labelNombre.setBounds(386, 356, 89, 18);
				contentPane.add(labelNombre);
				
				JComboBox comboBoxGrupo = new JComboBox();
				comboBoxGrupo.setBounds(239, 296, 94, 22);
				contentPane.add(comboBoxGrupo);
				
				JComboBox comboBoxAnyo = new JComboBox();
				comboBoxAnyo.setBounds(239, 354, 94, 22);
				contentPane.add(comboBoxAnyo);
				
				JList list = new JList();
				list.setBounds(150, 62, 513, 207);
				contentPane.add(list);
				
				JComboBox comboBoxLugar = new JComboBox();
				comboBoxLugar.setBounds(441, 296, 94, 22);
				contentPane.add(comboBoxLugar);
				
				JComboBox comboBoxNombre = new JComboBox();
				comboBoxNombre.setBounds(441, 354, 94, 22);
				contentPane.add(comboBoxNombre);
				
				
				
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
			        VentanaDiscos vD = new VentanaDiscos();      // creamos una ventana
			       vD.setVisible(true);             // hacemos visible la ventana creada
			    }
		}