package ar.edu.unju.fi.ejercicio17Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17Model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
		        List <Jugador> jugadores = new ArrayList<>();

		        int op;
		        do {
		            System.out.println("\n--- Menú de Opciones ---");
		            System.out.println("1- Alta de jugador");
		            System.out.println("2- Mostrar los datos del jugador");
		            System.out.println("3- Mostrar todos los jugadores ordenados por apellido");
		            System.out.println("4- Modificar los datos de un jugador");
		            System.out.println("5- Eliminar un jugador");
		            System.out.println("6- Mostrar la cantidad total de jugadores");
		            System.out.println("7- Mostrar la cantidad de jugadores por nacionalidad");
		            System.out.println("8- Salir");
		            System.out.print("Ingrese una opción: ");
		            op = scanner.nextInt();
		            scanner.nextLine(); 
		            System.out.println();
		            boolean band=false;
		            switch (op) {
		                case 1:
		                	do {
		                		 try {
				                    	DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				                        
				                        System.out.println("\n--- Alta de Jugador ---");
				                        System.out.print("Ingrese el nombre: ");
				                        String nombre = scanner.nextLine();                 
				                        System.out.print("Ingrese el apellido: ");
				                        String apellido = scanner.nextLine();
				                        System.out.print("Ingrese la fecha de nacimiento (dd-mm-yyyy): ");
				                        String fecha = scanner.nextLine();
				                        LocalDate fechaNacimiento = LocalDate.parse(fecha,formateo);    
				                        System.out.print("Ingrese la nacionalidad: ");
				                        String nacionalidad = scanner.nextLine();
				                        System.out.print("Ingrese la estatura cm: ");
				                        float estatura = scanner.nextFloat();
				                        System.out.print("Ingrese el peso kg: ");
				                        float peso = scanner.nextFloat();     
				                        scanner.nextLine();
				                        System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
				                        String posicion = scanner.next(); 
				                        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);                    		
				                        jugadores.add(jugador);
				                        System.out.println("Jugador agregado correctamente.");
				                        band=true;
									} catch (Exception e) {
										System.out.println("Error. Vuelva a intentarlo");
									}
		                	}while(!band);
		                   
		                    break;
		                case 2:
		                	if(jugadores.isEmpty()) {
		                		System.out.println("No hay ningun jugador registrado");
		                	} else {
		                		band=false;
		                		try {
		                			System.out.println("Mostrar datos de un jugador");
		                        	System.out.print("Ingrese el nombre del jugador:");
		                        	String Nombre=scanner.next();
		                        	System.out.print("Ingrese el apellido del jugador:");
		                        	String Apellido=scanner.next();
		                     
		                        	for (int i = 0 ; i < jugadores.size() ; i ++) {
		            					if(	Nombre.equals(jugadores.get(i).getNombre()) && 
		            							Apellido.equals((jugadores.get(i)).getApellido())) {
		            						
		            							jugadores.get(i).MostrarDatos();
		            							band = true;
		            							break;
		            					}
		            				}
		                        	if (!band)  {
		                        		System.out.println("No hay coincidencias");
		                        	}
								} catch (Exception e) {
									System.out.println("Error");
								} }
		                    break;
		                case 3:
		                	if (jugadores.isEmpty()) {
		                		System.out.println("No hay ningun jugador registrado");
		                	} else {
		                		System.out.println("Jugadores ordenados por apellido: ");
		                		jugadores.sort(Comparator.comparing(Jugador::getApellido));
		                		for (Jugador jugador: jugadores) {
		                			System.out.println("- "+jugador.getApellido()+" "+jugador.getNombre());
		                		}
		                	}
		                    break;
		                case 4:
		                	if (jugadores.isEmpty()) {
		                		System.out.println("No hay ningun jugador registrado");
		                	} else {
		                		System.out.println("\n--- Modificar Datos de un Jugador ---");
		                        System.out.print("Ingrese el nombre del jugador: ");
		                        String nombreab = scanner.nextLine();
		                        System.out.print("Ingrese el apellido del jugador: ");
		                        String apellidoab = scanner.nextLine();
		                        for (Jugador jugador: jugadores) {
		                        	if (jugador.getNombre().equals(nombreab) && jugador.getApellido().equals(apellidoab)) {
		                        		int opcion;
		                        		do {
		                        			System.out.println("\nElija el dato que quiera modificar");
		                        			System.out.println("1-Nombre");
		    								System.out.println("2-Apellido");
		    								System.out.println("3-Fecha de nacimiento");
		    								System.out.println("4-Nacionalidad");
		    								System.out.println("5-Estatura");
		    								System.out.println("6-Peso");
		    								System.out.println("7-Posicion");
		    								System.out.println("8-Salir");
		    								opcion = scanner.nextInt();
		                        			
		    								switch (opcion) {
		    								case 1: 
		    									System.out.print("Ingrese el nombre: ");
		    									scanner.nextLine();
		    			                        String nombren = scanner.nextLine(); 
		    			                        jugador.setNombre(nombren);
		    			                        System.out.println("Actualizacion exitosa");
		    									break;
		    								case 2: 
		    									System.out.print("Ingrese el apellido: ");
		    									scanner.nextLine();
		    			                        String apellidon = scanner.nextLine();
		    			                        jugador.setApellido(apellidon);
		    			                        System.out.println("Actualizacion exitosa");
		    			                        break;
		    								case 3:
		    									 scanner.nextLine();
		    									 DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		    									 System.out.print("Ingrese la fecha de nacimiento (dd-mm-yyyy): ");
		    				                     String fechan = scanner.nextLine();
		    				                     LocalDate fechadn = LocalDate.parse(fechan,formateo);   
		    				                     jugador.setFechaNac(fechadn);
		    				                     System.out.println("Actualizacion exitosa");
		    				                     break;
		    								case 4:
		    									 System.out.print("Ingrese la nacionalidad: ");
		    									 scanner.nextLine();
		    			                         String nacionalidadn = scanner.nextLine();
		    			                         jugador.setNacionalidad(nacionalidadn);
		    			                         System.out.println("Actualizacion exitosa");
		    			                         break;
		    								case 5:
		    									 System.out.print("Ingrese la estatura cm: ");
		    				                     float estaturan = scanner.nextFloat();
		    				                     jugador.setEstatura(estaturan);
		    				                     System.out.println("Actualizacion exitosa");
		    				                     break;
		    								case 6:
		    									 System.out.print("Ingrese el peso kg: ");
		    				                     float peson = scanner.nextFloat(); 
		    				                     jugador.setPeso(peson);
		    				                     System.out.println("Actualizacion exitosa");
		    				                     break;
		    								case 7:
		    									 System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
		    				                     String posicionn = scanner.next();
		    				                     jugador.setPosición(posicionn);
		    				                     System.out.println("Actualizacion exitosa!");
		    				                     break;
		    								case 8: 
		    									System.out.println("Salida exitosa");
		    									 break;
		    				                default:
		    				                	System.out.println("Opcion incorrecta. Vuelva a elegir");
		    				                	 break;
		    								}
		                        		} while(opcion!=8);
		                            } else {
		                            	System.out.println();
		                            	System.out.println("No se encontraron coincidencias");
		                            }
		                        }
		                	}
		                    break;
		                case 5:
		                    if (jugadores.isEmpty()){
		                    	System.out.println("No hay ningun jugador registrado");
		                    } else {
		                    	System.out.print("Ingrese el nombre del jugador a eliminar: ");
		                    	String nombre = scanner.next();
		                    	System.out.print("Ingrese el apellido del jugador a eliminar: ");
		                    	String apellido = scanner.next();
		                    	Iterator<Jugador> iterator = jugadores.iterator();
		                		while(iterator.hasNext()) {
		                			Jugador jugador = iterator.next();
		                			if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
		                				iterator.remove();
		                				band=true;
		                			}
		                		}
		                		if (!band) {
		                			System.out.println("No se encontraron coincidencias");
		                		}
		                		else {
		                			System.out.println("Jugador eliminado correctamente");
		                		}
		                    }
		                    break;
		                case 6:
		                    if (jugadores.isEmpty()) {
		                    	System.out.println("No hay jugadores registrados");
		                    } else {
		                    	System.out.println("Hay "+ jugadores.size()+" jugadores registrados");
		                    }
		                    break;
		                case 7:
		                	if (jugadores.isEmpty()) {
		                		System.out.println("No hay jugadores registrados");
		                	} else {
		                		do {
		                			int cont=0;
		                        	try {
		    							System.out.println("Ingrese la nacionalidad:");
		    							String nacionalidad = scanner.next();
		    							for (Jugador jugador:jugadores) {
		    								if (nacionalidad.equals(jugador.getNacionalidad())) {
		    									cont++;
		    								}
		    							}
		    							System.out.println("Hay "+cont+" jugadores "+nacionalidad+"s");
		    							band=true;
		    						} catch (Exception e) {
		    							System.out.println("No se encontraron coincidencias. Vuelva a intentarlo");
		    						}
		                        } while (!band);
		                	}
		                    break;
		                case 8:
		                    System.out.println("Programa terminado");
		                    break;
		                default:
		                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
		                    break;
		            }
		        } while (op != 8);
		        scanner.close();
	}

}
