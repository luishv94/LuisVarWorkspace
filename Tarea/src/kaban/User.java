package kaban;

import kaban.Programa;
import kaban.Tarea;


public class User extends Thread {
	public void run(){
		String name=Thread.currentThread().getName();
		int prioridad=Thread.currentThread().getPriority();
		
		System.out.println("Running "+ name+"(Prioridad ="+prioridad+")...");
		
		Tarea tarea =new Tarea(name, prioridad);
		if(tarea.save()){
			Programa.dashboard.add(tarea);
		}
				
	}	
}
