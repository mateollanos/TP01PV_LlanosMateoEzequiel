package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese un numero dentro del rango [0,10]");
		
		if (scanner.hasNextInt()) {
			
			int num=scanner.nextInt();
			int fac=1;
			
			if (num<0 || num>10) {
				System.out.println("No esta dentro del rango solicitado.");
			} else {
				while (num!=0) {
					fac=fac*num;
					num--;
				}
				System.out.println("El factorial del numero ingresado es: "+fac);
			}
		} else {
			System.out.println("No es un numero.");
		}
		scanner.close();
	}
}
