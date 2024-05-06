package Exercici9_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Exercici9_11 {

	static HashMap <String,Integer> llistaContactes = new HashMap<>();
	static Scanner lector = new Scanner (System.in);
	static int menu;
	
	public static void main(String[] args) {
		try {
			do {
				
				System.out.println("(1)Nou Contacte");
				System.out.println("(2)Cercar contacte");
				System.out.println("(3)Mostrar contactes");
				System.out.println("(4)Sortir");
				menu=lector.nextInt();
				lector.nextLine();
				
				switch(menu) {
				case 1: nouContacte();
						break;
				case 2: cercarContacte();
						break;
				case 3: mostrarContactes();
						break;
				case 4: break;
				default: System.out.println("Introdueix una opcion correcta(1-4");
				}
				
			}while(menu!=4);
		}catch(Exception e) {
			System.out.println("has tingut un error inesperat en el programa");
		}
	}
	
	public static void mostrarContactes() {
		
	
				System.out.println(llistaContactes.keySet());
				System.out.println(llistaContactes.values());
				
				
				
	}
	
	public static void nouContacte() {
		String nom;
		int telefon;
		
		System.out.println("Introdueix el nom: ");
		nom=lector.next();
		
		System.out.println("Introdueix el nombre de telefon: ");
		telefon = lector.nextInt();
		lector.nextLine();
		
		llistaContactes.put(nom,telefon);
		
		
	}
	
	public static void cercarContacte() {
		String nom;
		
		System.out.println("Introdueix el nom del contacte que vols cercar: ");
		nom=lector.next();
		
			
		System.out.println(llistaContactes.get(nom));
			
		
			
		
	}

}
