package ar.edu.unju.fi.ejercicio18Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18Model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18Model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
       
        List<DestinoTuristico> destinoTuristico = new ArrayList<>();
        
  
        Pais pais1 = new Pais("001","Argentina");
		Pais pais2 = new Pais("002","Chile");
		Pais pais3 = new Pais("003","Brasil");
		Pais pais4 = new Pais("004","España");
		Pais pais5 = new Pais("005","Mexico");
		Pais pais6 = new Pais("006","Japon");
		List <Pais> paises = new ArrayList<>(List.of(pais1,pais2,pais3,pais4,pais5,pais6));

        int op;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1- Alta de destino turistico");
            System.out.println("2- Mostrar todos los destinos turisticos");
            System.out.println("3- Modificar el pais de un destino turistico");
            System.out.println("4- Limpiar el arraylist de destinos turisticos");
            System.out.println("5- Eliminar un destino turistico");
            System.out.println("6- Mostrar los destinos turisticos ordenados por nombre");
            System.out.println("7- Mostrar todos los paises");
            System.out.println("8- Mostrar los destinos turisticos que pertenecen a un pais");
            System.out.println("9- Salir");
            op = scanner.nextInt();
            boolean band=false;
            switch (op) {
            case 1:
            	
            	do {
            		try {
            			DestinoTuristico destinos = new DestinoTuristico();
                    	System.out.println("\n--Alta de Destino Turistico--");
        				System.out.println("Ingrese el codigo de su destino: ");
        				scanner.nextLine();
        				String codigoDes = scanner.nextLine();
        				destinos.setCodigo(codigoDes);
        				System.out.println("Ingrese el nombre de su destino: ");
        				String nombreDes = scanner.nextLine();
        				destinos.setNombre(nombreDes);
        				System.out.println("Ingrese Precio de Destino: ");
        				double precioDestino = scanner.nextDouble();
        				destinos.setPrecio(precioDestino);
        				int opcion;
        				boolean bandera=false;
        				do {
        						System.out.println("\nElija un codigo del pais: ");
        						System.out.println("1- 001 Argentina");
        						System.out.println("2- 002 Chile");
        						System.out.println("3- 003 Brasil");
        						System.out.println("4- 004 España");
        						System.out.println("5- 005 Mexico");
        						System.out.println("6- 006 Japon");
        						opcion = scanner.nextInt();
        						switch(opcion) {
        						case 1:
        							destinos.setPais(pais1);
           							bandera = true;
        							break;
        						case 2:
        							destinos.setPais(pais2);
           							bandera = true;
        							break;
        						case 3:
        							destinos.setPais(pais3);
           							bandera = true;
        							break;
        						case 4:
        							destinos.setPais(pais4);
           							bandera = true;
        							break;
        						case 5:
        							destinos.setPais(pais5);
           							bandera = true;
        							break;
        						case 6:
        							destinos.setPais(pais6);
           							bandera = true;
        							break;
        						default:
        							System.out.println("Error. Vuelva a intentarlo");
        							break;
        					}	
        				}while (!bandera);
        				System.out.print("Ingrese la cantidad de dias en su destino: ");
        				int diasDes=scanner.nextInt();
        				destinos.setDias(diasDes);	
        				destinoTuristico.add(destinos);
        				band=true;
					} catch (Exception e) {
						System.out.println("Error. Vuelva a intentarlo");
					}
            		
            	} while(!band);
            	break;
            case 2:
            	if (destinoTuristico.isEmpty()) {
            		System.out.println("No hay destinos registrados");
            	} else {
            		for (DestinoTuristico dt : destinoTuristico) {
                		dt.MostrarDatos();
                	}
            	}
            	
            	break;
            case 3:
            	if (destinoTuristico.isEmpty()) {
            		System.out.println("No hay destinos registrados");
            	} else {
            		band=false;
                	do {
    					System.out.println("--Modificar el pais de un destino turistico--");
    					System.out.println("Ingrese el nombre del destino: ");
    					scanner.nextLine();
    					String nombre = scanner.next();
    					for(DestinoTuristico dt : destinoTuristico) {
    							if(nombre.equals(dt.getNombre())){
    								boolean bandera=false;
    								do {
    									System.out.println("Elija un nuevo codigo del pais: ");
            						    System.out.println("1- 001 Argentina");
            						    System.out.println("2- 002 Chile");
            						    System.out.println("3- 003 Brasil");
            						    System.out.println("4- 004 España");
            						    System.out.println("5- 005 Mexico");
            						    System.out.println("6- 006 Japon");
    									int opcion = scanner.nextInt();
    									switch(opcion) {
    										case 1:
    											dt.setPais(pais1);
    											bandera=true;
    											break;
    										case 2:
    											dt.setPais(pais2);
    											bandera=true;
    											break;
    										case 3:
    											dt.setPais(pais3);
    											bandera=true;
    											break;
    										case 4:
    											dt.setPais(pais4);
    											bandera=true;
    											break;
    										case 5:
    											dt.setPais(pais5);
    											bandera=true;
    											break;
    										case 6:
    											dt.setPais(pais6);
    											bandera=true;
    											break;
    										default:
    											System.out.println("El codigo no existe. Vuelva a intentarlo");
    											break;
    									}
    								}while (!bandera);	 
    								System.out.println("Modificacion exitosa");
    								band = true;
    								break;
    							} else {
    								System.out.println("No hay coincidencias. Vuelva a intentarlo");
    							}
    					  }
    				}while(!band);
            	}
            	break;
            case 4:
            	if (destinoTuristico.isEmpty()) {
            		System.out.println("No hay destinos registrados");
            	} else {
            		destinoTuristico.clear();
                	System.out.println("El arraylist de destinos turisticos fue vaciado exitosamente");
            	}
            	break;
            case 5:
            	if (destinoTuristico.isEmpty()) {
            		System.out.println("No hay destinos registrados");
            	} else {
            		System.out.println("\n--Eliminar un destino turistico--");
					System.out.println("Ingresar codigo de destino turistico: ");
					scanner.nextLine();
					String codigod = scanner.next();
            		band=false;
            		Iterator<DestinoTuristico> iterator = destinoTuristico.iterator();
            		while(iterator.hasNext()) {
            			DestinoTuristico destino = iterator.next();
            			if (destino.getCodigo().equals(codigod)) {
            				iterator.remove();
            				band=true;
            			}
            		}
            		if (!band) {
            			System.out.println("No se encontraron coincidencias");
            		}
            		else {
            			System.out.println("Destino eliminado correctamente");
            		}
            	}
            	break;
            case 6:
            	if (destinoTuristico.isEmpty()) {
            		System.out.println("No hay destinos registrados");
            	} else {
            		System.out.println("\n--Destinos turisticos ordenados por nombre--");
    				
    				destinoTuristico.sort(Comparator.comparing(DestinoTuristico::getNombre));
    				for (DestinoTuristico dt : destinoTuristico) {
    		            System.out.println(dt.getNombre());
    		        }
            	}
            	break;
            case 7:
            	if (destinoTuristico.isEmpty()) {
            		System.out.println("No hay destinos registrados");
            	} else {
            		System.out.println("\n--Datos de paises--");
            		for (Pais p : paises) {
            			p.MostrarDatos();
            		}
            	}
            	break;
            case 8: 
            	if (destinoTuristico.isEmpty()) {
            		System.out.println("No hay destinos registrados");
            	} else {
            		System.out.println("\n--Destinos turisticos que pertenecen a un pais--");
            		do {
    					System.out.println();
    					System.out.println("Elija el codigo del pais: ");
					    System.out.println("1- 001 Argentina");
					    System.out.println("2- 002 Chile");
					    System.out.println("3- 003 Brasil");
					    System.out.println("4- 004 España");
					    System.out.println("5- 005 Mexico");
					    System.out.println("6- 006 Japon");
    					int opcion = scanner.nextInt();
    					boolean existe=false;
    					switch (opcion) {
    					case 1:
    						for(DestinoTuristico dest : destinoTuristico) {
    							if(dest.getPais().getCodigo().equals("001")) {
    								existe=true;
    								dest.MostrarDatos();
    							}
    						}
    						if(!existe) {
    							System.out.println("No hay destinos registrados");
    						}
    						band = true;
    						break;
    					case 2:
    						for(DestinoTuristico dest : destinoTuristico) {
    							if(dest.getPais().getCodigo().equals("002")) {
    								existe=true;
    								dest.MostrarDatos();
    							}
    						}
    						if(!existe) {
    							System.out.println("No hay destinos registrados");
    						}
    						band = true;
    						break;
    					case 3:
    						for(DestinoTuristico dest : destinoTuristico) {
    							if(dest.getPais().getCodigo().equals("003")) {
    								existe=true;
    								dest.MostrarDatos();
    							}
    						}
    						if(!existe) {
    							System.out.println("No hay destinos registrados");
    						}
    						band = true;
    						break;
    					case 4:
    						for(DestinoTuristico dest : destinoTuristico) {
    							if(dest.getPais().getCodigo().equals("004")) {
    								existe=true;
    								dest.MostrarDatos();
    							}
    						}
    						if(!existe) {
    							System.out.println("No hay destinos registrados");
    						}
    						band = true;
    						break;
    					case 5:
    						for(DestinoTuristico dest : destinoTuristico) {
    							if(dest.getPais().getCodigo().equals("005")) {
    								existe=true;
    								dest.MostrarDatos();
    							}
    						}
    						if(!existe) {
    							System.out.println("No hay destinos registrados");
    						}
    						band = true;
    						break;
    					case 6:
    						for(DestinoTuristico dest : destinoTuristico) {
    							if(dest.getPais().getCodigo().equals("006")) {
    								existe=true;
    								dest.MostrarDatos();
    							}
    						}
    						if(!existe) {
    							System.out.println("No hay destinos registrados");
    						}
    						band = true;
    						break;
    					default:
    						System.out.println("El codigo no existe. Vuelva a intentarlo");
    						break;
    					}
    				} while(!band);
            	}
            	break;
            case 9:
            	 System.out.println("Programa terminado");
            	break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                break;
            }   
        } while (op!=9);
        scanner.close();

} }
