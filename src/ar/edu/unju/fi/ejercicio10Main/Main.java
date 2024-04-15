package ar.edu.unju.fi.ejercicio10Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10Model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		int cant=3;
		Pizza[] pizza = new Pizza[cant];
		for (int i=0; i<cant; i++) {
			
			pizza[i] = new Pizza();
			
			System.out.println("Ingrese los datos de la pizza "+(i+1));
			System.out.println("Diametro (20, 30 o 40): ");
			int Diametro = scanner.nextInt();
			if (Diametro==20 || Diametro==30 || Diametro==40) {
				pizza[i].setDiametro(Diametro);
			} else {
				System.out.println("Valor incorrecto.");
				System.exit(0);
			}
			System.out.println("Tiene ingredientes especiales? true/false");
			String IngreEsp = scanner.next();
				
				if (IngreEsp.equals("true")) {
					pizza[i].setIngreEspe(true);
				} 
				else {
					if (IngreEsp.equals("false")) {
						pizza[i].setIngreEspe(false);
					}
					else {
						System.out.println("Valor incorrecto.");
					}
				}
			pizza[i].CalcularArea();
			pizza[i].CalcularPrecio();
					
		}
		
		for (int i=0; i<cant; i++) {
			System.out.println("** Pizza "+(i+1)+" **");
			pizza[i].MostrarDatos();
			
		}
		scanner.close();	
	}
}
