package Exercici9_2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Institut {

	static Scanner lector = new Scanner(System.in);
	static int nPersones=0;
	static int menu;
	//static Persona[] persones = new Persona[100];
	static Hashtable<String,Persona> map= new Hashtable<String,Persona>();
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("(1)Crear un alumne");
			System.out.println("(2)Crear un professor");
			System.out.println("(3)Mostrar llista d'alumnes i professors");
			System.out.println("(4)Sortir");
			menu=lector.nextInt();
			lector.nextLine();
			
			switch (menu) {
			case 1:
				nouAlumne();
				break;
			case 2:
				nouProfessor();
				break;
			case 3:
				mostrarInformacio();
				break;
			case 4:
				break;
			default:
				System.out.println("Introdueix un valor valid(1-4)");
				break;
			}
			
		}while(menu!=4);
		System.out.println("Adeu");
			


	}
	
	public static void nouAlumne() {
		
		 String nom;
		 String dni;
		 int edat;
		 String nivellEscolar;
		
		System.out.println("Introdueix les dades de l'alumne:");
		System.out.println("Nom:");
		nom = lector.next();
		lector.nextLine();
		System.out.println("Dni:");
		dni = lector.next();
		lector.nextLine();
		System.out.println("Edat:");
		edat = lector.nextInt();
		lector.nextLine();
		System.out.println("Nivell escolar:");
		nivellEscolar = lector.next();
		lector.nextLine();
		
		 Persona alumne = new Alumne(nom,dni,edat,nivellEscolar);
		
		map.put(dni, alumne);
	}
	
	public static void nouProfessor() {
		
		 String nom;
		 String dni;
		 int edat;
		 String assignaturaDonada;
		
		System.out.println("Introdueix les dades del professor:");
		System.out.println("Nom:");
		nom = lector.next();
		lector.nextLine();
		System.out.println("Dni:");
		dni = lector.next();
		lector.nextLine();
		System.out.println("Edat:");
		edat = lector.nextInt();
		lector.nextLine();
		System.out.println("Assignatura donada:");
		assignaturaDonada = lector.next();
		lector.nextLine();
		
	Persona professor =	new Professor(nom,dni,edat,assignaturaDonada);
		map.put(dni, professor);
		
	}
	
	public static  void mostrarInformacio() {
		
		for(Map.Entry m : map.entrySet()) {
			
				System.out.println(m.getKey() + " " +  m.getValue());
				System.out.println("------------------------------");
			
				
			
					
		}
		
		
	}

}
