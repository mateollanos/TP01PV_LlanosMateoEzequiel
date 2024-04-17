package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num=5,j=0;
		
		String[] array = new String[num];
		
		for (int i=0; i<array.length; i++) {
			System.out.print("Ingrese el nombre para la posicion ["+i+"]: ");
	        array[i]=scanner.next();
	    }
		
		System.out.println("La lista de nombres es:");
		
		while (j<array.length) {
			System.out.println("["+j+"]: "+array[j]);
			j++;
		}
		
		System.out.println("El tamaño del array es: "+array.length);
		
		byte ind;
		do {
			System.out.println("Ingrese un indice del rango [0,"+(array.length-1)+"] para eliminar:");
			ind = scanner.nextByte();
		} while (ind<0 && ind>array.length-1);
		
		for (int i=ind; i<array.length-1; i++) { 
			array[i]=array[i+1];
		}
		array[array.length-1]="";
		
		System.out.println("La lista actualizada de nombres es:");
		
		for (int i=0; i<array.length; i++) {
            System.out.println("["+i+"]: "+array[i]);
        }
		scanner.close();
	}

}
