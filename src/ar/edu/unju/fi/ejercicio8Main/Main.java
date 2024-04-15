package ar.edu.unju.fi.ejercicio8Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8Model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese el valor de n: ");
		num=scanner.nextInt();
		calculadora.setN(num);
		
		System.out.println("La sumatoria de "+num+" es: "+calculadora.Calcular_Sumatoria());
		System.out.println("El productorial de "+num+" es: "+calculadora.Calcular_Productorial());
		
		scanner.close();
	}

}
