package kaban;

import java.util.Arrays;


public class ListaDeTareas implements Dashboard {
	private transient Tarea[] listaDeTareas;
	private int size;
	private transient int modCount = 0;
	
	
	//listaDeTareas
	//Clasificar(Estado)
	//Agregar(Tarea)
	//Borrar(Tarea)
	//PedirTarea()
	//OrdenarPorPrioridad()
	//OrdenarPorFecha()
	//Buscar()
	
	
	public boolean Agregar(Tarea tarea){
		ensureCapacity(size + 1);
		listaDeTareas[size++] = tarea;
		return true;		
	}
	
	public void ensureCapacity(int minCapacity) {
		modCount++;
		int oldCapacity = listaDeTareas.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			listaDeTareas = Arrays.copyOf(listaDeTareas, newCapacity);
		}
	}
	
	public boolean remove(Tarea tarea){
		if (tarea == null) {
			for (int index = 0; index < size; index++)
				if (listaDeTareas[index] == null) {
					fastRemove(index);
					return true;
				}
		} else {
			for (int index = 0; index < size; index++)
				if (tarea.equals(listaDeTareas[index])) {
					fastRemove(index);
					return true;
				}
		}
		return false;
	}
	private void fastRemove(int index) {
		modCount++;
		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(listaDeTareas, index + 1, listaDeTareas, index, numMoved);
		listaDeTareas[--size] = null; 
	}
	public void clear() {
		modCount++;

		
		for (int i = 0; i < size; i++)
			listaDeTareas[i] = null;

		size = 0;
	}
	public ListaDeTareas(int initialCapacity) {
		super();
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
		this.listaDeTareas = new Tarea[initialCapacity];
	}
	public ListaDeTareas() {
		this(10);
	}
}
