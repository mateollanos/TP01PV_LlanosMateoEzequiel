package ar.edu.unju.fi.ejercicio7Model;

public class Empleado {
	private String Nombre;
	private String Legajo;
	private Double Salario;
	
	private final Double salarioMin = 210000.0;
	private final Double aumentoMer = 20000.0;
	public Empleado(String nombre, String legajo, Double salario) {
		super();
		Nombre = nombre;
		Legajo = legajo;
		
		if (salario>=salarioMin) {
			Salario = salario;
		} else {
			Salario = salarioMin;
		}		
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre del empleado: "+getNombre()+"\nLegajo: "+getLegajo()+"\nSalario $: "+getSalario());
	}
	
	public void Aumento_Salario() {
		System.out.println("Aumento del salario: ");
		setSalario(Salario + aumentoMer);
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getLegajo() {
		return Legajo;
	}
	public void setLegajo(String legajo) {
		Legajo = legajo;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	
	
	
	
	
	
}
