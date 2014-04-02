package kaban;

import java.util.Date;

public class Programa {
	public static Dashboard dashboard=new DashboardList();

	public static void main(String[] args) throws Exception {
		System.out.println("Start "+new Date());
		
		User user;
		for(int i=0;i<15;i++){
			user=new User();
			user.setName("Titulo " + i);
			int prioridad=1+(int)(Math.random()*((10-1)+1));
			user.setPriority(prioridad);
			user.start();
			}
		System.out.println("End "+ new Date());
		}
}
