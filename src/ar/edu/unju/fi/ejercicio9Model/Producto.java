package ar.edu.unju.fi.ejercicio9Model;

public class Producto {
	private String Nombre;
	private String Codigo;
	private Double Precio;
	private int Descuento = (int) (Math.random() * 51);
	
	public Producto () {
	}

	public Double CalcularDescuento() {
		return (getPrecio()-(getPrecio()*getDescuento())/100);
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre del producto: "+getNombre());
		System.out.println("Codigo del producto: "+getCodigo());
		System.out.println("Precio del producto: $"+getPrecio());
	}
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public int getDescuento() {
		return Descuento;
	}

	public void setDescuento(int descuento) {
		Descuento = descuento;
	}
	
	
	

}
