package ExamenPassat_tema8;

import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.Data;

import java.time.LocalDate;
import java.time.LocalTime;

public class OficinaAtencionCliente {

	static Scanner lector = new Scanner(System.in);
	static int menu;
	static Persona[] persona = new Persona[100];
	static Persona[] cola = new Persona[100];
	static int contadorCola = 0;
	static int contador = 0;
	
	public static void main(String[] args) {

		do {
			
			System.out.println("(1)Ver la cola de personas" + 
								"\n(2)Llegada de una nueva persona a la oficina" +
								"\n(3)Atención de la primera persona de la cola" + 
								"\n(4)Ver una lista de las personas atendidas correctamente por orden de entrada" + 
								"\n(5)Ver la lista de personas que no se han podido atender correctamente por orden de\r\n"
								+ "entrada" + 
								"\n(6)Ver la lista de personas atendidas correctamente ordenadas por dni" + 
								"\n(7)Ver la lista de personas que no se han podido atender correctamente ordenadas por dni" + 
								"\n(8)Salir");
			menu=lector.nextInt();
			lector.nextLine();
			
			switch(menu) {
			case 1: verCola();
					break;
			case 2: llegadaOficina();
					break;
			case 3: atencionCola();
					break;
			case 4: listaAtendidosCorrectamente();
					break;
			case 5: listaPersonasAtendidasIncorrectamente();
					break;
			case 6: listaAtendidosOrdenadosDni();
					break;
			case 7: listaNoAtendidosOrdenadaDni();
					break;
			case 8: break;
			default: System.out.println("Introduce una opcion correcta (1-8");
			}
			
			
		}while(menu!=8);
		
		System.out.println("Adios");

	}

	private static void verCola() {
		for (int i =0; i<contadorCola;i++) {
		
			System.out.println(cola[i].toString());
		 
		}
		
	}

	private static void llegadaOficina() {
		String dni;
		String nombre;
		int edad;
		
		System.out.println("Dni:");
		dni=lector.next();
		
		System.out.println("Nombre:");
		nombre=lector.next();
		
		System.out.println("Edad:");
		edad=lector.nextInt();
		lector.nextLine();
		
		persona[contador] = new Persona (dni,nombre,edad);
		
		cola[contadorCola] = persona[contador];
		contador ++;
		contadorCola++;
		
	}

	private static void atencionCola() {

		Random random= new Random();
		boolean servidoCorrectamente = random.nextBoolean();
		LocalDate fechaActual = LocalDate.now();
		LocalTime horaActual = LocalTime.now();
		int contadorCola=0;
		Data diaAtencion;
		
		
		for (int i =0; i<cola.length;i++) {
			if (cola[i]!= null && i==contadorCola) {		
				cola[i].Atender(fechaActual,horaActual,servidoCorrectamente);		
				System.out.println(cola[i].verAtender());
				break;
				
				}
			}
		
		contadorCola++;
			
		}
	private static void listaAtendidosCorrectamente() {
		for (int i =0; i<cola.length;i++) {
			if(cola[i].servidoCorrectamente == true) {
				System.out.println(cola[i].verAtender());
				System.out.println("----------------------------");
			}
		}
		
	}

	private static void listaPersonasAtendidasIncorrectamente() {
		for (int i =0; i<cola.length;i++) {
			if(cola[i].servidoCorrectamente == false) {
				System.out.println(cola[i].verAtender());
			}
		}
		
	}

	private static void listaAtendidosOrdenadosDni() {
		for(int i=0;i<cola.length;i++) {
			String dni=cola[i].getDni();
			for(int j=cola.length-1;j>i;j--) {
				if(cola[j].getDni().compareTo(dni)> 0) {
					cola[i].getDni()= cola[j].getDni();
					llista[j]=numero;
					numero=llista[i];
				}
			
			}
		}
		
		
	}

	private static void listaNoAtendidosOrdenadaDni() {
		// TODO Auto-generated method stub
		
	}		

	
}
