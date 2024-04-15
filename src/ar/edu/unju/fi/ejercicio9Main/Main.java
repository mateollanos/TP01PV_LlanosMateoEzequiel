package ar.edu.unju.fi.ejercicio9Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9Model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int cant=3;
		Producto[] producto = new Producto[cant];
		
		for (int i=0; i<cant; i++) {
			System.out.println("Ingrese los datos para el producto "+(i+1)+":");
			
			System.out.println("Nombre del producto:");
			String nombre = scanner.next();
			System.out.println("Codigo del producto:");
			String codigo = scanner.next();
			System.out.println("Precio del producto:");
			Double precio = scanner.nextDouble();
			
			producto[i] = new Producto();
			producto[i].setNombre(nombre);
			producto[i].setCodigo(codigo);
			producto[i].setPrecio(precio);
		}
		
		for (int i=0; i<cant; i++) {
			System.out.println("Producto "+(i+1));
			producto[i].MostrarDatos();
			System.out.println("Precio con descuento: $"+producto[i].CalcularDescuento());
		}
		
		scanner.close();
		
	}

}
