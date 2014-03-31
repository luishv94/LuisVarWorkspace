package kaban;

import kaban.DashboardList;
import kaban.Dashboard;
import kaban.State;
import kaban.Tarea;
import java.util.Date;


public class Programa {

	public static void main(String[] args) throws Exception {
		Tarea tarea;
		Dashboard dashboard = new DashboardList();
		for (int i = 0; i < 15; i++) {
			tarea = new Tarea("Tarea " + i, State.DO_TO);
			if (tarea.save()) {
				System.out.println("Saved " + tarea.getTitulo());
			}
		}
		System.out.println("End"+new Date() );
	}



}
