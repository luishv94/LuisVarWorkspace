package kaban;

public class Programa {

	public static void main(String[] args) {
		Tarea tarea=new Tarea();
		
		tarea.setDescripcion("Completar el programa");
		
		ListaDeTareas lista=new ListaDeTareas();
		
		if (lista.Agregar(tarea)){
			System.out.println("Agregada");			
		}

	}

}
