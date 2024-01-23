package Exercici6_9;

import java.util.Scanner;

public class Programaempleats {

	static Scanner lector = new Scanner(System.in);
	static int menu;
	static Qualificat[] qualificat = new Qualificat[100];
	static Obrer[] obrer = new Obrer[100];
	static CapDepartament[] capDepartament = new CapDepartament[100];
	static int contador_Qualificat;
	static int contador_Obrer;
	static int contador_CapDepartament;
	public static void main(String[] args) {
		
		do {
			System.out.println("(1)Donar d'alta un empleat qualificat");
			System.out.println("(2)Donar d'alta un obrer");
			System.out.println("(3)Donar d'alta un cap de departament");
			System.out.println("(4)Mostar tots els empleats");
			System.out.println("(5)Sortir");
			menu=lector.nextInt();
			lector.nextLine();
			
			switch(menu) {
			case 1: nouQualificat();
					break;
			case 2: nouObrer();
					break;
			case 3: nouCapDepartament();
					break;
			case 4: mostrarDades();
					break;
			case 5:
					break;
			default: System.out.println("Introdueix una opcio correcte(1-5)");
			}
			
		}while(menu!=5);
		
		System.out.println("Adeu...");

	}
	

	public static void nouQualificat() {
		String nom;
		String cognoms;
	    double sou_base;
		String dni;
		String titulacio;
		double plus;
		String departament;
		
		
		System.out.println("Nom:");
		nom=lector.nextLine();

		
		System.out.println("Cognoms:");
		cognoms=lector.nextLine();

		
		System.out.println("Sou base:");
		sou_base=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Dni:");
		dni=lector.nextLine();
	
		
		System.out.println("Titulacio:");
		titulacio=lector.nextLine();
	
		
		System.out.println("Plus:");
		plus=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Departament:");
		departament=lector.nextLine();
		
		
		qualificat[contador_Qualificat] = new Qualificat (nom,cognoms,sou_base,dni,titulacio,plus,departament);
		contador_Qualificat++;
	}
	
	public static void nouObrer() {
		String nom;
		String cognoms;
	    double sou_base;
		String dni;
		String desti;
		int horesExtra;
		double preuHoresExtra;
		
		System.out.println("Nom:");
		nom=lector.nextLine();
		
		
		System.out.println("Cognoms:");
		cognoms=lector.nextLine();
		
		
		System.out.println("Sou base:");
		sou_base=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Dni:");
		dni=lector.nextLine();
		
		
		System.out.println("Desti:");
		desti=lector.nextLine();
	
		
		System.out.println("Hores extra:");
		horesExtra=lector.nextInt();
		lector.nextLine();
		
		System.out.println("Preu de les hores extra:");
		preuHoresExtra=lector.nextDouble();
		lector.nextLine();
		
		obrer[contador_Obrer] = new Obrer (nom,cognoms,sou_base,dni,desti,horesExtra,preuHoresExtra);
		contador_Obrer++;
	}
	
	public static void nouCapDepartament() {
		String nom;
		String cognoms;
	    double sou_base;
		String dni;
		String titulacio;
		double plus;
		String departament;
		String treballadorsACarrec;
		String projectes;
		double plus_capDepartament;
	
		
		System.out.println("Nom:");
		nom=lector.nextLine();
	
		
		System.out.println("Cognoms:");
		cognoms=lector.nextLine();
	
		
		System.out.println("Sou base:");
		sou_base=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Dni:");
		dni=lector.nextLine();
	
		
		System.out.println("Titulacio:");
		titulacio=lector.nextLine();
		;
		
		System.out.println("Plus:");
		plus=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Departament:");
		departament=lector.nextLine();
	
		
		System.out.println("Treballadors a carrec:");
		treballadorsACarrec=lector.nextLine();
		
		
		System.out.println("Projectes:");
		projectes=lector.nextLine();
		
		
		System.out.println("Plus de cap de departament:");
		plus_capDepartament=lector.nextDouble();
		lector.nextLine();
		
		capDepartament[contador_CapDepartament] = new CapDepartament (nom,cognoms,sou_base,dni,titulacio,plus,departament,treballadorsACarrec,projectes,plus_capDepartament);
		contador_CapDepartament++;
	}
	
	public static void mostrarDades() {
		 System.out.println("Empleats Qualificats:");
		    for (int i = 0; i < contador_Qualificat; i++) {
		        if (qualificat[i] != null) {
		            System.out.println(qualificat[i].toString());
		            System.out.println("---------------------");
		        }
		    }

		    System.out.println("Obrers:");
		    for (int i = 0; i < contador_Obrer; i++) {
		        if (obrer[i] != null) {
		            System.out.println(obrer[i].toString());
		            System.out.println("---------------------");
		        }
		    }

		    System.out.println("Caps de Departament:");
		    for (int i = 0; i < contador_CapDepartament; i++) {
		        if (capDepartament[i] != null) {
		            System.out.println(capDepartament[i].toString());
		            System.out.println("---------------------");
		        }
		    }
	}

}
