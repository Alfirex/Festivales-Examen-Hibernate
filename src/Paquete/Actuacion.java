package Paquete;

public class Actuacion {
	private int id;
	private String hora, escenario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getEscenario() {
		return escenario;
	}
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}
	@Override
	public String toString() {
		return "Actuacion [id=" + id + ", hora=" + hora + ", escenario=" + escenario + "]";
	}
	
	
	
}
