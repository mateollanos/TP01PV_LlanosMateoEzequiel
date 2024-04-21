package ar.edu.unju.fi.ejercicio18Model;

public class Pais {
	private String Codigo;
	private String Nombre;
	
	public Pais(String codigo, String nombre) {
		super();
		Codigo = codigo;
		Nombre = nombre;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void MostrarDatos() {
		System.out.println("Pais: "+getNombre()+" | "+"Codigo: "+getCodigo());
	}
	
	
	
}
