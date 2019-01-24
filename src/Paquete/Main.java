package Paquete;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtilities.getSessionFactory().openSession();		
		ejecuta(session,"alex","casa","12");
		ejecuta(session,"mara","casa","12");
		
		close(session);
		HibernateUtilities.getSessionFactory().close();

	}
	private static void close(Session session) {
		// TODO Auto-generated method stub
		session.close();	
	}
	public static void ejecuta(Session s,String nombre,String lugar,String fecha) {
			
		s.beginTransaction();
		
		Festival oFestival1 = new Festival();
		oFestival1.setNombre(nombre);
		oFestival1.setLugar(lugar);
		oFestival1.setFecha(fecha);
		
		
		Actuacion oActuacion1 = new Actuacion();
		oActuacion1.setEscenario("Escenario Pau");
		oActuacion1.setHora("10:30");
		
		
		
		Grupo oGrupo1 = new Grupo();
		oGrupo1.setNombre("Equipo 1");
		oGrupo1.setnMiembros(2);
		oGrupo1.setEstilo("Rojo");
		
		

		
		s.save(oFestival1);
	
		s.save(oActuacion1);
		s.save(oGrupo1);
		
		s.getTransaction().commit();
	
	
		s.beginTransaction();
		
		
		
		for (int i = 1; i<3; i++) {
			Festival festival = s.get(Festival.class, i);
			System.out.println(festival.toString());
			
			Actuacion actuacion = s.get(Actuacion.class, i);
			System.out.println(actuacion.toString());
			
			Grupo grupo = s.get(Grupo.class, i);
			System.out.println(grupo.toString());
		}
		
		s.getTransaction().commit();
		
		
	}
	

}
