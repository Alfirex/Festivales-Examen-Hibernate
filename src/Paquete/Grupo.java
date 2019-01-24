package Paquete;

public class Grupo {
	private int id;
	private String nombre, estilo;
	private int nMiembros;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getnMiembros() {
		return nMiembros;
	}
	public void setnMiembros(int nMiembros) {
		this.nMiembros = nMiembros;
	}
	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nombre=" + nombre + ", estilo=" + estilo + ", nMiembros=" + nMiembros + "]";
	}
	
	

}
