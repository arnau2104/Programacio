package Exercici6_6;

import java.util.Scanner;

public class Olimpiades {

	static Scanner lector = new Scanner(System.in);
	static int menu;
	static int nDeportistes=0;
	static Deportista[] deportista = new Deportista[100];

	public static void main(String[] args) {

		do {
			System.out.println("(1)Donar de alta un futbolista");
			System.out.println("(2)Donar de alta un tenista");
			System.out.println("(3) Veure tots els deportistes");
			System.out.println("(4) Sortir");
			menu=lector.nextInt();
			lector.nextLine();

			switch(menu) {
			case 1:
				nouFutbolista();
				break;
			case 2:
				nouTenista();
			case 3:
				veureDades();
				break;
			case 4:
				break;
			default:
				System.out.println("Introdueix una opció correcte(1-4");
			}

		}while(menu!=4);

System.out.println("adeu");
	}

	public static void nouFutbolista() {

		String nom;
		String nacionalitat;
		String posicio;
		String deport = "Futbol";

		System.out.println("Introdueix el nom:");
		nom=lector.next();
		System.out.println("Introdueix la seva nacionalitat:");
		nacionalitat=lector.next();
		System.out.println("Introdueix la seva posicio ");
		posicio=lector.next();

		deportista[nDeportistes] = new Futbolista(nom,deport,nacionalitat,posicio);
		nDeportistes++;

	}

	public static void nouTenista() {

		String nom;
		String nacionalitat;
		String ma_bona;
		String deport = "Tenis";

		System.out.println("Introdueix el nom:");
		nom=lector.next();
		System.out.println("Introdueix la seva nacionalitat:");
		nacionalitat=lector.next();
		System.out.println("Introdueix la seva ma bona ");
		ma_bona=lector.next();

		deportista[nDeportistes] = new Tenista(nom,deport,nacionalitat,ma_bona);
		nDeportistes++;

	}
	
	public static void veureDades() {
		for(int i=0; i<nDeportistes;i++) {
			if(deportista[i] instanceof Futbolista) {
				((Futbolista)deportista[i]).mostrarDades();
				System.out.println("------------------------------");
			}
			if(deportista[i] instanceof Tenista) {
				((Tenista)deportista[i]).mostrarDades();
				System.out.println("------------------------------");
			}
		}
	}


}
