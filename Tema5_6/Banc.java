package Tema5_6;

import java.util.Scanner;

public class Banc {

	static Scanner lector = new Scanner(System.in);
	
	static CompteBancari[] comptes = new CompteBancari[1000];
	static int numComptes;
	 String dni;
	
	public static void main(String[] args) {
		
		int menu;

		do {
			System.out.println("Que vols fer?");
			System.out.println("(1) Nou compte");
			System.out.println("(2) Ingresar");
			System.out.println("(3) Treure doblers");
			System.out.println("(4) Veure saldo");
			System.out.println("(5) Sortir");
			menu = lector.nextInt();
			lector.nextLine();

			switch(menu) {
			case 1: 
				nouCompte();
				break;
			case 2: 
				ingersar();
				break;
			case 3: 
				treureDoblers();
				break;
			case 4: 
				saldo();
				break;
			case 5: 
				break;
			default: 
				System.out.println("Introdueix un valor correcte (1-5)");
			}

		}while(menu !=5);
		System.out.println("Adeu");
	}





	public static  void nouCompte() {
		String dni;
		String nom;
		double saldo;
		
		
		System.out.println("Introdueix el dni del titular: ");
		dni = lector.next();
		lector.nextLine();
		
		System.out.println("Introdueix el nom del titular:: ");
		nom = lector.next();
		lector.nextLine();
		
		System.out.println("Introdueix el saldo del titular:: ");
		saldo = lector.nextDouble();
		lector.nextLine();
		
		comptes[numComptes]= new CompteBancari (dni, nom, saldo);
		numComptes++;
		
	}
	
	private static void ingersar() {
		String dni;
		double quantitat;
		
		
		System.out.println("Introdueix el dni del titular:");
		dni = lector.next();
		lector.nextLine();
		
		System.out.println("Introdueix la quantitat de diners a ingresar:");
		quantitat = lector.nextDouble();
		lector.nextLine();
		
		for (int i = 0; i < numComptes;i++) {
			if(dni.equals(comptes[i].getDniTitular())) {
				comptes[i].setSaldo(comptes[i].getSaldo() + quantitat);
			}
		}
	}

	private static void treureDoblers() {
		String dni;
		double quantitat;
		
		
		System.out.println("Introdueix el dni del titular:");
		dni = lector.next();
		lector.nextLine();
		
		System.out.println("Introdueix la quantitat de diners que vols treure:");
		quantitat = lector.nextDouble();
		lector.nextLine();
		
		for (int i = 0; i < numComptes;i++) {
			if(dni.equals(comptes[i].getDniTitular())) {
				comptes[i].setSaldo(comptes[i].getSaldo() - quantitat);
			}
		}
		
	}
	
	private static void saldo() {
		
		String dni;
			
		System.out.println("Introdueix el dni del titular:");
		dni = lector.next();
		lector.nextLine();
		
		for (int i = 0; i < numComptes;i++) {
			if(dni.equals(comptes[i].getDniTitular())) {
				System.out.println("El saldo de la compta es: " + comptes[i].getSaldo() + "euros");
				
			}
		}
	}


}
