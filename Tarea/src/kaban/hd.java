package kaban;

import javax.swing.*;
import java.awt.event.*;

public class hd extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public hd() {
		getContentPane().setLayout(null);
		
		JLabel lblNuevaTarea = new JLabel("Nueva Tarea");
		lblNuevaTarea.setBounds(132, 11, 62, 14);
		getContentPane().add(lblNuevaTarea);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(89, 213, 54, 14);
		getContentPane().add(lblDescripcin);
		
		textField = new JTextField();
		textField.setBounds(89, 238, 137, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFechaDeEntrega = new JLabel("Fecha de entrega");
		lblFechaDeEntrega.setBounds(89, 270, 105, 14);
		getContentPane().add(lblFechaDeEntrega);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 295, 137, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(89, 326, 46, 14);
		getContentPane().add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Por Hacer", "En progreso", "Hecha"}));
		comboBox.setBounds(89, 351, 137, 20);
		getContentPane().add(comboBox);
		
		JLabel lblPrioridad = new JLabel("Prioridad");
		lblPrioridad.setBounds(89, 382, 46, 14);
		getContentPane().add(lblPrioridad);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Baja", "Media", "Alta"}));
		comboBox_1.setBounds(89, 407, 137, 20);
		getContentPane().add(comboBox_1);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCrear.setBounds(67, 449, 84, 23);
		getContentPane().add(btnCrear);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(89, 51, 46, 14);
		getContentPane().add(lblTitulo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 76, 137, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPropietario = new JLabel("Propietario");
		lblPropietario.setBounds(89, 157, 89, 14);
		getContentPane().add(lblPropietario);
		
		textField_3 = new JTextField();
		textField_3.setBounds(89, 182, 137, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPropietario_1 = new JLabel("Categor\u00EDa");
		lblPropietario_1.setBounds(89, 106, 69, 14);
		getContentPane().add(lblPropietario_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(89, 131, 137, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCerrar.setBounds(164, 449, 89, 23);
		getContentPane().add(btnCerrar);

	}
	public static void main(String[] args){
		JFrame a=new hd();
		a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		a.setSize(311,543);
		a.setVisible(true);
	}
}
