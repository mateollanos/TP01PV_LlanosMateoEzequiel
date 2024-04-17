package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero dentro del rango [3,10]");
		int num = scanner.nextInt();
		if (num>2 && num<11) {
			int[] array = new int[num];
			int suma=0;
			
			for (int i=0; i<array.length; i++) {
				System.out.print("Ingrese el numero para la posicion ["+i+"]: ");
		        array[i]=scanner.nextInt();
		    }
			
			System.out.println("Los valores que ingreso en cada posicion fueron:");
			for (int i=0; i<array.length; i++) {
	            System.out.println("["+i+"]: "+array[i]);
	        }
			
			for (int i=0; i<array.length; i++) {
				suma+=array[i];
			}
			System.out.println("La suma de todos los numeros es: "+suma);
		} else {
			System.out.println("Incorrecto");
		}
		scanner.close();
	}

}
