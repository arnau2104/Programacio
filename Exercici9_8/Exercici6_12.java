package Exercici9_8;

import java.util.LinkedList;
import java.util.Scanner;

import Exercici9_6.Ciutat;

public class Exercici6_12 {

	static LinkedList<Persona> cua = new LinkedList<>();
	static Scanner lector = new Scanner(System.in);
	static int menu;
	
	public static void main(String[] args) {
		try {
			do {
			
				System.out.println("(1)Posarte a la cua" +
									"\n(2)Sortir de la cua" + 
									"\n(3)Mostrar la cua" + 
									"\n(4)Sortir");
				menu = lector.nextInt();
				
				switch(menu) {
				case 1: afegirACua();
						break;
				case 2: eliminarDeCua();
						break;
				case 3: mostrarDades();
						break;
				case 4: break;
				default: System.out.println("Introdueix una opcio correcte (1-4)");
				}
			
			}while(menu!=4);
		
		}catch(Exception e) {
			System.out.println("Has tingut un error en el programa, comprova les dades insertades");
		}
	}
	
	public static void afegirACua() {
		 String nom;
		 String dni;
		 int edat;
		 
		 System.out.println("Nom");
		 nom = lector.next();
		 
		 System.out.println("Dni");
		 dni = lector.next();
		 
		 System.out.println("Edat");
		 edat = lector.nextInt();
		 
		 cua.addLast(new Persona(nom,dni,edat));
		 
	}
	
	public static void eliminarDeCua() {
		
		for(int i=0; i<cua.size();i++) {
			int eliminar;
			for(int j=0; i<cua.size();i++) {
			System.out.println(i + " " + cua.get(i).getNom());
			}
			eliminar = lector.nextInt();
			cua.remove(eliminar);
		}
		
	}

	public static void mostrarDades() {
		for ( Persona p : cua) {
			System.out.println(p);
			System.out.println("-------------------------");
		}
	}

}
