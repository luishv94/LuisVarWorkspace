package kaban;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
		lblNuevaTarea.setBounds(132, 11, 94, 14);
		getContentPane().add(lblNuevaTarea);

		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(89, 213, 69, 14);
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

		final JComboBox<State> comboBox = new JComboBox<State>(State.values());
        comboBox.setBounds(89, 351, 137, 20);
        getContentPane().add(comboBox);

		JLabel lblPrioridad = new JLabel("Prioridad");
		lblPrioridad.setBounds(89, 382, 89, 14);
		getContentPane().add(lblPrioridad);

		final JComboBox comboBox_1 = new JComboBox();// why final
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Baja",
				"Media", "Alta" }));
		comboBox_1.setBounds(89, 407, 137, 20);
		getContentPane().add(comboBox_1);

		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// JOptionPane.showConfirmDialog(null,"Desea agregar los datos?");

				// TODO: Validarlos y agregar info a vars

				String titulo = textField_2.getText();
				if ("".equalsIgnoreCase(titulo.trim())) {// Metodo de trim quita
															// espacios en
															// blanco al
															// principio y al
															// final
					JOptionPane.showMessageDialog(null, "T�tulo Vac�o!");
				}

				String categoria = textField_4.getText();
				if ("".equalsIgnoreCase(categoria.trim())) {
					JOptionPane.showMessageDialog(null, "Categor�a Vac�a!");
				}

				String propietario = textField_3.getText();
				if ("".equalsIgnoreCase(propietario.trim())) {
					JOptionPane.showMessageDialog(null, "Propietario Vac�o!");
				}

				String descripcion = textField.getText();
				if ("".equalsIgnoreCase(descripcion.trim())) {
					JOptionPane.showMessageDialog(null, "Descripci�n Vac�a!");
				}

				String fechaE = textField_1.getText();
				if ("".equalsIgnoreCase(fechaE.trim())) {
					JOptionPane.showMessageDialog(null,
							"Fecha de entrega Vacia!");
				}
				
				
				State estado=(State)comboBox.getSelectedItem();
							
				
				/*String estado = (String) comboBox.getSelectedItem();
				State Estado;
				if (estado.equals("Por Hacer")) {
					 Estado=State.DO_TO;
				} else if (estado.equals("En progreso")) {
					 Estado=State.IN_PROCESS;
				} else if (estado.equals("Hecha")) {
					 Estado=State.DONE;
				}*/

				
				String prioridad=(String)comboBox_1.getSelectedItem();
				int Prioridad=0;
				if(prioridad.equals("Alta")){
					Prioridad=1;
				}
				else if(prioridad.equals("Media")){
					Prioridad=2;
				}
				else if(prioridad.equals("Baja")){
					Prioridad=3;
				}
				
				
				

				// TODO: Agregarlos

				Tarea tarea = new Tarea(titulo, categoria, propietario,
						descripcion, fechaE, estado, Prioridad);

				// tarea.setDescripcion(textField.getText().trim());//ANOTHER
				// WAY BUT WITHOUT AN VALIDATION

				Programa.dashboard.add(tarea);
				JOptionPane.showMessageDialog(
						null,
						"Nueva tarea creada, su contenido es:\nTitulo: "
								+ tarea.getTitulo() + "\nCategor�a: "
								+ tarea.getCategoria() + "\nPropietario: "
								+ tarea.getPropietario() + "\nDescripci�n: "
								+ tarea.getDescripcion()
								+ "\nFecha de entrega: "
								+ tarea.getFechaDeEntrega()
								+ "\nEstado: "+tarea.getEstado()
								+ "\nPrioridad: "+tarea.getPrioridad()+" o "+prioridad);

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

	public static void main(String[] args) {
		JFrame a = new hd();
		a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		a.setSize(311, 543);
		a.setVisible(true);
	}
}
