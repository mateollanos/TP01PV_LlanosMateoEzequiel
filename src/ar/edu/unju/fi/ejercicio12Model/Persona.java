package ar.edu.unju.fi.ejercicio12Model;

import java.util.Calendar;

public class Persona {
	
	private String Nombre;
	private Calendar FechaNac;
	
	public Persona() {
	}
	public int Edad() {
		Calendar fechaActual = Calendar.getInstance();
		int edad = fechaActual.get(Calendar.YEAR) - getFechaNac().get(Calendar.YEAR);
		if (fechaActual.get(Calendar.MONTH)<getFechaNac().get(Calendar.MONTH) || 
				(fechaActual.get(Calendar.MONTH)==getFechaNac().get(Calendar.MONTH) && 
				fechaActual.get(Calendar.DAY_OF_MONTH)<getFechaNac().get(Calendar.DAY_OF_MONTH))) {
			edad--;
		}
		return edad;
	}
	public String Signo() {
		int mes = getFechaNac().get(Calendar.MONTH)+1;
		int dia = getFechaNac().get(Calendar.DAY_OF_MONTH);
		
		switch (mes) {
		case 1: // Enero
			if (dia<20) {
				return "Capricornio";
			}
			else {
				return "Acuario";
			}
		case 2: // Febrero
			if (dia<19) {
				return "Acuario";
			} else {
				return "Piscis";
			}
		case 3: // Marzo
			if (dia<21) {
				return "Piscis";
			} else {
				return "Aries";
			}
		case 4: // Abril
			if (dia<20) {
				return "Aries";
			} else {
				return "Tauro";
			}
		case 5: // Mayo
			if (dia<21) {
				return "Tauro"; 
			} else {
				return "Geminis";
			}
		case 6: // Junio
			if (dia<21) {
				return "Geminis";
			} else {
				return "Cancer";
			}
		case 7: // Julio
			if (dia<23) {
				return "Cancer";
			} else {
				return "Leo";
			}
		case 8: // Agosto
			if (dia<23) {
				return "Leo";
			} else {
				return "Virgo";
			}
		case 9: // Septiembre
			if (dia<23) {
				return "Virgo";
			} else {
				return "Libra";
			}
		case 10: // Octubre
			if (dia<23) {
				return "Libra";
			} else {
				return "Escorpio";
			}
		case 11: // Noviembre
			if (dia<22) {
				return "Escorpio";
			} else {
				return "Sagitario";
			}
		case 12: // Diciembre
			 if (dia<22) {
				 return "Sagitario";
			 } else {
				 return "Capricornio";
			 }
		default:
			return "Error";
	}
	}
	public String Estacion() {
		int mes = getFechaNac().get(Calendar.MONTH)+1;
		int dia = getFechaNac().get(Calendar.DAY_OF_MONTH);
		
		switch (mes) {
		case 1: // Enero
			return "Verano";
		case 2: // Febrero
			return "Verano";
		case 3: // Marzo
			if (dia<21) {
				return "Verano";
			} else {
				return "Otoño";
			}
		case 4: // Abril
			return "Otoño";
		case 5: // Mayo
			return "Otoño";
		case 6: // Junio
			if (dia<22) {
				return "Otoño";
			} else {
				return "Invierno";
			}
		case 7: // Julio
			return "Invierno";
		case 8: // Agosto
			return "Invierno";
		case 9: // Septiembre
			if (dia<23) {
				return "Invierno";
			} else {
				return "Primavera";
			}
		case 10: // Octubre
			return "Primavera";
		case 11: // Noviembre
			return "Primavera";
		case 12: // Diciembre
			 if (dia<22) {
				 return "Primavera";
			 } else {
				 return "Verano";
			 }
		default:
			return "Error"; }
		
	}
	public void MostrarDatos() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Fecha de nacimiento: "+getFechaNac().get(Calendar.DAY_OF_MONTH) + "/" +
                (getFechaNac().get(Calendar.MONTH) + 1) + "/" + getFechaNac().get(Calendar.YEAR));
		System.out.println("Edad: "+Edad());
		System.out.println("Signo del zodiaco: "+Signo());
		System.out.println("Estacion: "+Estacion());
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Calendar getFechaNac() {
		return FechaNac;
	}
	public void setFechaNac(Calendar fechaNac) {
		FechaNac = fechaNac;
	}
	
}
