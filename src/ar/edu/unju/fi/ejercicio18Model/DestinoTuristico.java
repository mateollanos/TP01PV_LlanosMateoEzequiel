package ar.edu.unju.fi.ejercicio18Model;

public class DestinoTuristico {
	private String Codigo;
	private String Nombre;
	private double Precio;
	private Pais Pais;
	private int Dias;
	
	
	public DestinoTuristico() {
	}

	public DestinoTuristico(String codigo, String nombre, double precio, Pais pais,
			int dias) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Precio = precio;
		Pais = pais;
		Dias = dias;
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

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public Pais getPais() {
		return Pais;
	}

	public void setPais(Pais pais) {
		Pais = pais;
	}

	public int getDias() {
		return Dias;
	}

	public void setDias(int dias) {
		Dias = dias;
	}

	public void MostrarDatos() {
		System.out.println("\n--Datos del destino turistico--");
		System.out.println("Nombre del destino: "+getNombre());
		System.out.println("Codigo del destino: " +getCodigo());
		System.out.println("Cantidad de dias en el destino: " + getDias());
		System.out.println("Pais del destino: " + (getPais()).getNombre());	
	}
	
	
}
