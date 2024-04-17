package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero dentro del rango [5,10]");
		int num = scanner.nextInt();
		if (num>4 && num<11) {
			String[] array = new String[num];
			
			for (int i=0; i<array.length; i++) {
				System.out.print("Ingrese el nombre para la posicion ["+i+"]: ");
		        array[i]=scanner.next();
		    }
			
			System.out.println("Los nombres que ingreso desde el primer indice fueron:");
			for (int i=0; i<array.length; i++) {
	            System.out.println("["+i+"]: "+array[i]);
	        }
			
			System.out.println("Los nombres que ingreso desde el ultimo indice fueron:");
			for (int i=array.length-1; i>-1; i--) {
	            System.out.println("["+i+"]: "+array[i]);
	        }
		} else {
			System.out.println("Incorrecto");
		}
		scanner.close();
	}

}
