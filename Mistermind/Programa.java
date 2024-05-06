package Mistermind;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	
	static Scanner lector = new Scanner(System.in);
	static Partida partida;;
	static Tirada tirada;
	static final int intentsMAX = 16;
	static int menu;
	static ArrayList<Partida> llistaPartides = new ArrayList<Partida>();
	public static void main(String[] args) {
		
		do {
			try {
			System.out.println("(1)Nova Partida");
			System.out.println("(2)Partides anteriors");
			System.out.println("(3)Sortir");
			menu=lector.nextInt();
			lector.nextLine();
			
			switch(menu) {
			case 1: novaPartida();
					break;
			case 2: historialPartides();
					break;
			case 3: break;
			default: System.out.println("Selecciona una opcio correcta");
			}
			
			}catch(Exception e) {
				System.out.println("Hi ha hagut un error inesperat en el programa");
			}
		}while (menu!=3);
		
		System.out.println("Gracies per haver jugat!!");
		
		

	}
	
	public static void novaPartida() {
		String nom;
		
		System.out.println("Introdueix el seu nom:");
		nom=lector.nextLine();		
		partida = new Partida(nom);
		
		String intent;
		int intents=0;
		System.out.println(partida.getCombinacio());

		System.out.println("Opcions valides: " + "\t R,B,G,M,Y,C ");
		
		while (partida.getGuanyat() == false && intents < intentsMAX ) {
		
		System.out.println("Introdueix una combinacio de 4 colors:");
		intent = lector.nextLine();
		intent = intent.toUpperCase();
		
		tirada = new Tirada (intent);
		partida.tirades.add(tirada);
		
		intents++;
		
		partida.comprovar(intent,tirada);
		
		
	
		}
		
		partida.setPuntuacioTotal(partida.getPuntuacioTotal() * (intentsMAX - intents));
		
		System.out.println("La teva puntuacio en aquesta partida es: " + partida.getPuntuacioTotal());
		
		llistaPartides.add(partida);
	
	}
	
	public static void historialPartides() {
		for (int i=0;i<llistaPartides.size();i++) {
			System.out.println("ID: " + i + " Nom: " + llistaPartides.get(i).getNom()  + " Combinacio: " + llistaPartides.get(i).getCombinacio() + " Puntuacio: " + llistaPartides.get(i).getPuntuacioTotal());
		}
	}
	
	

}
