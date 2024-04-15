package ar.edu.unju.fi.ejercicio7Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7Model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String Nombre, Legajo;
		Double Salario;
		
		System.out.println("Ingrese los datos para un nuevo empleado");
		System.out.println("Ingrese el nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Ingrese el legajo: ");
		Legajo = scanner.nextLine();
		System.out.println("Ingrese el salario: ");
		Salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado(Nombre, Legajo, Salario);
		
		empleado.MostrarDatos();
		empleado.Aumento_Salario();
		empleado.MostrarDatos();
		
		scanner.close();
	}

}
