package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese un numero dentro del rango [1,9]");
		
		if (scanner.hasNextInt()) {
			int num=scanner.nextInt();
			int prod;
			
			if (num<1 || num>9) {
				System.out.println("No esta dentro del rango solicitado.");
			} else {
				for (int multi=0; multi<11; multi++) {
					prod=num*multi;
					System.out.println(num+"x"+multi+" = "+prod);
				}
			}
			
		} else {
			System.out.println("No es un numero.");
		}
		scanner.close();
	}

}
