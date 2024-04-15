package ar.edu.unju.fi.ejercicio6Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6Model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		String Nombre, Dni, Fecha, Provincia;
		
		System.out.println("Ingrese los datos de la persona: ");
		
		Persona persona1 = new Persona();
		System.out.println("Ingrese el nombre: ");
		Nombre = scanner.nextLine();
		persona1.setNombre(Nombre);
		System.out.println("Ingrese el dni: ");
		Dni = scanner.nextLine();
		persona1.setDni(Dni);
		System.out.println("Ingrese la fecha de nacimiento: ");
		Fecha = scanner.nextLine();
		persona1.setFechadeNac(LocalDate.parse(Fecha,formato));
		System.out.println("Ingrese la provincia: ");
		Provincia = scanner.nextLine();
		persona1.setProvincia(Provincia);
		
		persona1.MostrarDatos();
		
		//Con constructor parametrizado:
		
		System.out.println("Ingrese el nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Ingrese el dni: ");
		Dni = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento: ");
		Fecha = scanner.nextLine();
		System.out.println("Ingrese la provincia: ");
		Provincia = scanner.nextLine();
		
		Persona persona2 = new Persona(Dni, Nombre, LocalDate.parse(Fecha,formato), Provincia);
		
		persona2.MostrarDatos();
		
		//Con constructor parametrizado sin provincia:
		
		System.out.println("Ingrese el nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Ingrese el dni: ");
		Dni = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento: ");
		Fecha = scanner.nextLine();
		
		Persona persona3 = new Persona(Dni, Nombre, LocalDate.parse(Fecha,formato));
		
		persona3.MostrarDatos();
		
		scanner.close();
	}

}
