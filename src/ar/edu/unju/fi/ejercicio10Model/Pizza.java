package ar.edu.unju.fi.ejercicio10Model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean ingreEspe;
	private final double ingreEspe20=500.0;
	private final double ingreEspe30=750.0;
	private final double ingreEspe40=1000.0;
	
	public Pizza() {
	}
	
	public void CalcularPrecio () {
		switch (getDiametro()) {
		case 20:
			if (isIngreEspe()==true) {
				setPrecio(4500+getIngreEspe20());
			} else {
				setPrecio(4500);
			}
		break;
		case 30:
			if (isIngreEspe()==true) {
				setPrecio(4800+getIngreEspe30());
			} else {
				setPrecio(4800);
			}
		break;
		case 40:
			if (isIngreEspe()==true) {
				setPrecio(5500+getIngreEspe40());
			} else {
				setPrecio(5500);
			}
		break;
		}
	}
	public void CalcularArea() {
		setArea(3.14*(Math.pow((getDiametro())/2, 2)));
	}
	
	public void MostrarDatos () {
		System.out.println("Diametro = "+getDiametro());
		System.out.println("Ingredientes especiales = "+isIngreEspe());
		System.out.println("Precio Pizza = "+ getPrecio());
		System.out.println("Area de la pizza = "+getArea());
		System.out.println();
	}
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngreEspe() {
		return ingreEspe;
	}
	public void setIngreEspe(boolean ingreEspe) {
		this.ingreEspe = ingreEspe;
	}
	public double getIngreEspe20() {
		return ingreEspe20;
	}
	public double getIngreEspe30() {
		return ingreEspe30;
	}
	public double getIngreEspe40() {
		return ingreEspe40;
	}
	
	
	
	
}
