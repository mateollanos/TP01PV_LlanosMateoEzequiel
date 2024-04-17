package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num=8;
        int[] array = new int[num];

        for (int i=0; i<array.length; i++) {
            System.out.print("Ingrese el valor para la posicion ["+i+"]: ");
            array[i]=scanner.nextInt();
        }
        System.out.println("Los valores que ingreso en cada posicion fueron:");
        for (int i=0; i<array.length; i++) {
            System.out.println("["+i+"]: "+array[i]);
        }

        scanner.close();
	}
}
