package kaban;

import java.util.ArrayList;
import java.util.List;

public abstract class ListaDeTareasAbstract implements Dashboard {
	
	protected List container;

	public ListaDeTareasAbstract() {
		super();
		System.out.println("starting DashboardAbstract() ctor...");
		container = new ArrayList();
	}

	@Override
	public boolean add(Tarea tarea) {		
		return container.add(tarea);
	}

	

}
