package kaban;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InterfaceUsuario extends JFrame {
	TextField titulo=new TextField();
	String[] estados={"DO_TO","IN_PROCESS","DONE","BACKLOG"};
	Integer[] prioridad={1,2,3,4,5,6,7,8,9,10};
	JComboBox listaEstado=new JComboBox<String>(estados),listaPrioridad=new JComboBox<Integer>(prioridad);
	JButton boton=new JButton("agregar");
	
	
	public InterfaceUsuario(String s){
		super(s);
		setLayout(new BorderLayout());
		init();
	}
	public void init(){
				JPanel panelOeste =new JPanel(new GridLayout(3, 1));
				panelOeste.add(new JLabel("Titulo"));
				panelOeste.add(new JLabel("Estado"));
				panelOeste.add(new JLabel("Prioridad"));
				add(panelOeste,BorderLayout.WEST);
				add(boton,BorderLayout.SOUTH);
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
