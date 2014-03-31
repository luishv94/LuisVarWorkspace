package kaban;

import java.util.Date;


public class Tarea {
	private String descripcion;
	private String titulo;
	private State estado;
	private String categoria;
	private int prioridad;	
	private String propietario;
	private Date fechaDeEntrega;
	private Date fechaDeCreacion;
		
	public Tarea() {
		this("");
		System.out.println("starting Task() ctor...");
	}

	public Tarea(String titulo) {
		this(titulo, State.BACKLOG);
		System.out.println("starting Task(String) ctor...");
	}

	public Tarea(String titulo, State state) {
		super();
		System.out.println("starting Task(String, State) ctor...");
		
		this.titulo = titulo;
		fechaDeCreacion = new Date();
		prioridad = 1;
		this.estado = estado;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null) {
			this.titulo = titulo;
		}
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public State getEstado() {
		return estado;
		
	}
	public void setEstado(State estado) {
		this.estado = estado;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}
	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}	
	public String toString() {
		return this.titulo;
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Tarea) {
				return titulo.equals(((Tarea) obj).getTitulo());
			}
		}
		return false;
	}
	public boolean save(){
		try{
			Thread.sleep(1*1000);
		}catch(InterruptedException e ){
			e.printStackTrace();
		}
		return true;
	}
}


