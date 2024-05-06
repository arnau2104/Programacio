package Exercici9_13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Exercici9_13 {

	static LinkedList<String> llibresDisponibles = new LinkedList<>();
	static HashSet<String> clientsRegistrats = new HashSet<>();
	static HashMap<String,Integer> inventari = new HashMap<>();
	static Scanner lector = new Scanner (System.in);
	static int menu;
	
	public static void main(String[] args) {
		
		//Llista de llibres disponibles
		llibresDisponibles.add("1984");
		llibresDisponibles.add("Cien años de soledad");
		llibresDisponibles.add("Orgullo y prejuicio");
		llibresDisponibles.add("El principito");
		llibresDisponibles.add("Don Quijote de la Mancha");
		llibresDisponibles.add("Harry Potter");
		llibresDisponibles.add("Crimen y Castigo");
		llibresDisponibles.add("Danza de Dragones");
		llibresDisponibles.add("Matar a un ruiseñor");
		llibresDisponibles.add("El señor de los anillos");
		
		//Llista de clients registrats
		clientsRegistrats.add("Arnau");
		clientsRegistrats.add("Andreu");
		clientsRegistrats.add("Toni");
		clientsRegistrats.add("Sergi");
		clientsRegistrats.add("Dani");
		clientsRegistrats.add("Juanjo");
		clientsRegistrats.add("Carlos");
		clientsRegistrats.add("Cristina");
		clientsRegistrats.add("Marina");
		clientsRegistrats.add("Paula");
		
		try {
			do {
				//Mostrar llista de llibres disponibles
				System.out.println("Llibres Disponibles: ");
				for(int i=0;i<llibresDisponibles.size();i++) {
					System.out.println(llibresDisponibles.get(i));
				}
				omplirInventari();
				System.out.println("-------");
				
				System.out.println("(1)Comprar un llibre");
				System.out.println("(2)Sortir");
				menu=lector.nextInt();
				lector.nextLine();
				
				switch(menu) {
				case 1: comprarLlibre();
						break;
				case 2: break;
				default: System.out.println("Selecciona una opcio valida (1-2");
			}
			
			
			}while(menu!=2);
		}catch (Exception e) {
			System.out.println("Ha sorgit un error inesperat al programa");
		}
		System.out.println("Adeu...");
	}
	
	public static void omplirInventari() {
		
		Random random = new Random();
		
		for (int i=0; i<llibresDisponibles.size();i++) {
			int quantitat =  random.nextInt(15) + 1; 
			inventari.put(llibresDisponibles.get(i),quantitat);
		}
	}
	
	public static void comprarLlibre() {
		
		String nom;
		String titol;
		int quantitat;
		
		System.out.println("Introdueix el seu nom:");
		nom = lector.nextLine();
		
		if(!clientsRegistrats.contains(nom)) {
			System.out.println("No estas registrat!");
			System.out.println("Introdueix el teu nom, per poder registrarte:");
			nom=lector.nextLine();
			
			clientsRegistrats.add(nom);
		}
		
		System.out.println("Quin es el titol del llibre que vols comprar:");
		titol = lector.nextLine();
		
		System.out.println("Quants en vols comprar:");
		quantitat=lector.nextInt();
		lector.nextLine();
		
		if(llibresDisponibles.contains(titol)) {
			if(inventari.get(titol)>= quantitat ) {
				inventari.put(titol, (inventari.get(titol) - quantitat));
				System.out.println("La compra sa realitzat correctament!!");
				mostrarInventari();
			}else {
				System.out.println("La quantitat que vols es mes gran que la existencia que tenim d'aquest llibre");
			}
			
		}else{
			System.out.println("El llibre que cerques no esta disponible a la llibreria");
		}
		
	}
	
	public static void mostrarInventari() {
		for(String i : inventari.keySet()) {
			System.out.println("TITOL: " + i + " AUTOR: " + inventari.get(i));
		}
	}

}
