package ar.edu.unju.fi.ejercicio8Model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {	
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public long Calcular_Sumatoria() {
		long sumatoria=0;
		for (int k=1; k<=getN(); k++) {
			sumatoria+=Math.pow(((k*(k+1))/2), 2);
		}
		return sumatoria;
	}
	
	public long Calcular_Productorial() {
		long productorial=1;
		for (int k=1; k<=getN(); k++) {
			productorial*=k*(k+4);
		}
		return productorial;
	}
	
	
	
	
}

