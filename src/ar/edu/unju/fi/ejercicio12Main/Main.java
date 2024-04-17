package ar.edu.unju.fi.ejercicio12Main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12Model.Persona;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		
		System.out.println("Ingrese los datos de la persona");
		System.out.println("Nombre:");
		String nombre = scanner.next();
		persona.setNombre(nombre);
		System.out.println("Fecha de nacimiento (dd/mm/yyyy):");
		String nacimiento = scanner.next();
		
		String[] partesFecha = nacimiento.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1;
        int anio = Integer.parseInt(partesFecha[2]);

        Calendar fechaNac = Calendar.getInstance();
        fechaNac.set(anio, mes, dia);
        persona.setFechaNac(fechaNac);
        
        persona.MostrarDatos();
        
        scanner.close();
		
	}

}
