package ar.edu.unju.fi.ejercicio6Model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String Dni;
	private String Nombre;
	private LocalDate FechadeNac;
	private String Provincia;
	
	public Persona () {
	}
	
	public Persona(String dni, String nombre, LocalDate fechadeNac, String provincia) {
		super();
		Dni = dni;
		Nombre = nombre;
		FechadeNac = fechadeNac;
		Provincia = provincia;
	}

	public Persona(String dni, String nombre, LocalDate fechadeNac) {
		super();
		Dni = dni;
		Nombre = nombre;
		FechadeNac = fechadeNac;
		Provincia = "Jujuy";
	}
	
	public int CalcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.getFechadeNac(), fechaActual);
		return periodo.getYears();	
	}
	
	public void MayorDeEdad() {
		int edad = this.CalcularEdad();
		if (edad>18) {
			System.out.println("La persona es mayor de edad.");
		} else {
			System.out.println("La persona no es mayor de edad.");
		}
	}
	
	public void MostrarDatos () {
		System.out.println("Dni: "+getDni()+"\nNombre: "+getNombre()+"\nFecha de Nacimiento: "
	+getFechadeNac()+"\nProvincia: "+getProvincia());
		MayorDeEdad();
		
	}
	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public LocalDate getFechadeNac() {
		return FechadeNac;
	}

	public void setFechadeNac(LocalDate fechadeNac) {
		FechadeNac = fechadeNac;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	
	
	
	
	
}
