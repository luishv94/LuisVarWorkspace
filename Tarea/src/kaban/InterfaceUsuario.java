package kaban;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;

public class InterfaceUsuario extends JFrame {
	TextField titulo=new TextField(),descripcion=new TextField(),categoria=new TextField(),propietario=new TextField(),fechaEntrega=new TextField();
	Integer[] prioridad={1,2,3,4,5,6,7,8,9,10};
	JComboBox listaEstado=new JComboBox<State>(State.values()),listaPrioridad=new JComboBox<Integer>(prioridad);
	JButton boton=new JButton("agregar");
	ListaDeTareas listaTareas=new ListaDeTareas();
	
	private class escuchadorBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(InterfaceUsuario.this, "escuchado");
			Tarea t=new Tarea(titulo.getText(),(State)listaEstado.getSelectedItem(),(Integer)listaPrioridad.getSelectedItem());
			t.setCategoria(categoria.getText());
			t.setDescripcion(descripcion.getText());
			t.setPropietario(propietario.getText());
			t.setFechaDeCreacion(new Date());
			Calendar c=new GregorianCalendar();
			String[] s=fechaEntrega.getText().split("/");
			c.set(Integer.parseInt(s[2]),Integer.parseInt(s[1]),Integer.parseInt(s[0]));
			t.setFechaDeEntrega(c.getTime());
		}
		
	}
	public InterfaceUsuario(String s){
		super(s);
		//segundo intento setLayout(new BorderLayout());
		setLayout(new GridBagLayout());
		init();
	}
	public void init(){
		//tercer intento
				GridBagConstraints gc=new GridBagConstraints();
				gc.gridx=0;
				gc.gridy=0;
				gc.anchor=gc.WEST;
				add(new JLabel("Titulo"),gc);
				gc.gridx=1;
				gc.gridy=0;
				
				add(titulo,gc);
				gc.gridx=0;
				gc.gridy=1;
				add(new JLabel("Estado"),gc);
				gc.gridx=1;
				gc.gridy=1;
				add(listaEstado,gc);
				gc.gridx=0;
				gc.gridy=2;
				add(new JLabel("Prioridad"),gc);
				gc.gridx=1;
				gc.gridy=2;
				add(listaPrioridad,gc);
				gc.gridx=0;
				gc.gridy=3;
				add(new JLabel("descripcion"),gc);
				gc.gridx=1;
				gc.gridy=3;
				add(descripcion,gc);
				gc.gridx=0;
				gc.gridy=4;
				add(new JLabel("propietario"),gc);
				gc.gridx=1;
				gc.gridy=4;
				add(propietario,gc);
				gc.gridx=0;
				gc.gridy=5;
				add(new JLabel("categoria"),gc);
				gc.gridx=1;
				gc.gridy=5;
				add(categoria,gc);
				gc.gridx=0;
				gc.gridy=6;
				add(new JLabel("fecha de entrega"),gc);
				gc.gridx=1;
				gc.gridy=6;
				add(fechaEntrega,gc);
				
				gc.gridx=0;
				gc.gridy=7;
				
				add(boton,gc);
				
				Dimension d=new Dimension(150,25);
				descripcion.setPreferredSize(new Dimension(150,80));
				titulo.setPreferredSize(d);
				propietario.setPreferredSize(d);
				categoria.setPreferredSize(d);
				fechaEntrega.setPreferredSize(d);
				boton.addActionListener(new escuchadorBoton());
		
				
		//segundo intento
//				titulo.setPreferredSize(new Dimension(150,25));
//				JPanel panelOeste =new JPanel(new GridLayout(7, 1)),panelCental=new JPanel(new GridLayout(7,1));
//				panelOeste.add(new JLabel("Titulo"));
//				panelOeste.add(new JLabel("Estado"));
//				panelOeste.add(new JLabel("Prioridad"));
//				panelCental.add(titulo);
//				panelCental.add(listaEstado);
//				panelCental.add(listaPrioridad);
//				add(panelOeste,BorderLayout.WEST);
//				add(panelCental,BorderLayout.CENTER);
//				add(boton,BorderLayout.SOUTH);
				
		
		
		
		//primer intento
//				titulo.setPreferredSize(new Dimension(300, 25));
//				JPanel panel1=new JPanel(new FlowLayout()),panel2=new JPanel(new FlowLayout()),panel3=new JPanel(new FlowLayout());
//				panel1.add(new JLabel("titulo"),FlowLayout.LEFT);
//				panel1.add(titulo,FlowLayout.CENTER);
//				add(panel1,BorderLayout.EAST);
//				panel2.add(new JLabel("Estado"));
//				panel2.add(listaEstado);
//				add(panel2,BorderLayout.WEST);
//				panel3.add(new JLabel("prioridad"),FlowLayout.LEFT);
//				panel3.add(listaPrioridad,FlowLayout.CENTER);
//				add(panel3,BorderLayout.CENTER);
//				add(boton,BorderLayout.SOUTH);
				
				
	}
	public static void main(String[] args){
		JFrame a=new InterfaceUsuario("Tarea");
		a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		a.setSize(400, 300);
		a.setVisible(true);
	}
}
