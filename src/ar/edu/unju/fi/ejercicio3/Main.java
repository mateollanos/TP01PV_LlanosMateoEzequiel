package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		int num=scanner.nextInt();
		
		if (num%2!=0) {
			System.out.println("Impar, su doble es: "+num*2);
		} else {
			System.out.println("Par, su triple es: "+num*3);
		}
		
		scanner.close();
	}

}
