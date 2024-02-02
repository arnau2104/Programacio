package ExamenAnyPasat;

import java.util.Scanner;

public class ProgramaElectrodomestics {

	static Scanner lector = new Scanner(System.in); 
	static int menu;
	static Electrodomestic[] electrodomestic= new Electrodomestic[100]; 
	static int contador;

	public static void main(String[] args) {

		do {

			System.out.println("(1)Introduir un nou Electrodomestic");
			System.out.println("(2)Mostrar totes les neveras");
			System.out.println("(3)Mostrar totes les lavadores");
			System.out.println("(4)Mostrar tots els electrodomestics");
			System.out.println("(5)Mostrar cuants electrodomestics hi ha de cada tipu i el nombre total de electrodomestics");
			System.out.println("(6)Mostrar el preu junt de totes les neveras");
			System.out.println("(7)Mostrar el preu junt de totes les lavadoras");
			System.out.println("(8)Mostrar el preu junt de tots els electrodomestics junts");
			System.out.println("(9)Enviar un electrodomestic a arreglar");
			System.out.println("(10) Sortir");
			menu=lector.nextInt();
			lector.nextLine();

			switch (menu) {
			case 1: nouElectrodomestic();
			break;
			case 2: mostrarNeveras();
			break;
			case 3: mostrarLavadores();
			break;
			case 4: mostrarElectrodomestics();
			break;
			case 5: contadorElectrodomestis();
			break;
			case 6: preuNeveras();
			break;
			case 7: preuLavadores();
			break;
			case 8: preuElectrodomestics();
			break;
			case 9: arregtlar();
			break;
			case 10: break;
			default: System.out.println("Introdueix un valor valid (1-10)");
			}


		}while(menu!=10);

		System.out.println("Adeu...");

	}

	public static void nouElectrodomestic() {

		int tipoElectrodomestic;
		double pes;
		double preu;
		String color;
		double temperaturaInterna;
		double capacitatCarga;

		System.out.println("Quin tipo d'electrodomestic vols crear");
		System.out.println(("(1)Nevera"));
		System.out.println("(2)Lavadora");
		tipoElectrodomestic=lector.nextInt();
		lector.nextLine();

		if(tipoElectrodomestic==1) {

			System.out.println("Introdueix el preu de la nevera:");
			preu=lector.nextDouble();
			lector.nextLine();

			System.out.println("Introdueix el pes de la nevera");
			pes=lector.nextDouble();
			lector.nextLine();

			System.out.println("Introdueix el color de la nevera");
			color=lector.nextLine();

			System.out.println("Introdueix la temperatura interna de la nevera");
			temperaturaInterna=lector.nextDouble();
			lector.nextLine();

			electrodomestic[contador]= new Nevera(preu,pes,color,temperaturaInterna);
			contador++;

		}else if(tipoElectrodomestic==2) {
			System.out.println("Introdueix el preu de la lavadora:");
			preu=lector.nextDouble();
			lector.nextLine();

			System.out.println("Introdueix el pes de la lavadora");
			pes=lector.nextDouble();
			lector.nextLine();

			System.out.println("Introdueix el color de la lavadora");
			color=lector.nextLine();

			System.out.println("Introdueix la capacitat de carga de la lavadora");
			capacitatCarga=lector.nextDouble();
			lector.nextLine();

			electrodomestic[contador]= new Lavadora(preu,pes,color,capacitatCarga);
			contador++;

		}else {
			System.out.println("Introdueix una opcio correcte(1-2)");
		}

	}

	private static void mostrarNeveras() {

		for(int i=0;i<contador;i++) {
			if(electrodomestic[i] instanceof Nevera) {
				//	((Nevera)electrodomestic[i]).toString();
				System.out.println(((Nevera)electrodomestic[i]));
				System.out.println("------------------------------");
			}
		}

	}

	private static void mostrarLavadores() {
		for(int i=0;i<contador;i++) {
			if(electrodomestic[i] instanceof Lavadora) {
				//	((Lavadora)electrodomestic[i]).toString();	
				System.out.println(((Lavadora)electrodomestic[i]));
				System.out.println("------------------------------");
			}
		}

	}

	private static void mostrarElectrodomestics() {
		for (int i=0;i<contador;i++) {
			if (electrodomestic[i] instanceof Nevera) {
				System.out.println("Nevera:");
			}else {
				System.out.println("Lavadora:");
			}
			System.out.println(electrodomestic[i]);
			System.out.println("------------------------------");
		}
	}

	private static void contadorElectrodomestis() {
		int contadorNevera=0;
		int contadorLavadora=0;

		for(int i=0;i<contador;i++) {
			if (electrodomestic[i] instanceof Nevera) {
				contadorNevera++;
			}else {
				contadorLavadora++;
			}
		}

		System.out.println("Hi ha un total de " + contador + " electrodomestics");
		System.out.println(contadorNevera + " son neveras");
		System.out.println(contadorLavadora + " son lavadoras");

	}

	private static void preuNeveras() {
		double preuTotal=0;

		for(int i=0;i<contador;i++) {
			if (electrodomestic[i] instanceof Nevera) {
				preuTotal=preuTotal + electrodomestic[i].getPreu();
			}
		}
		
		System.out.println("El preu total de totes  les neveras es " + preuTotal);

	}

	private static void preuLavadores() {
		double preuTotal=0;

		for(int i=0;i<contador;i++) {
			if (electrodomestic[i] instanceof Lavadora) {
				preuTotal=preuTotal + electrodomestic[i].getPreu();
			}
		}
		
		System.out.println("El preu total de totes  les lavadora es " + preuTotal);

	}

	private static void preuElectrodomestics() {
		double preuTotal=0;

		for(int i=0;i<contador;i++) {
				preuTotal=preuTotal + electrodomestic[i].getPreu();
			
		}
		
		System.out.println("El preu total de tots els electrodomestic es " + preuTotal);

	}

	private static void arregtlar() {
		int horesReparant=5;
		int tipoElectrodomestic;
		int id=0;
		int increment=0;
		
		System.out.println("Quin es l'id del electrodomestic que vols arreglar");
		for(int i=0;i<contador;i++) {
			
			System.out.println(increment);
			increment++;
		}
		id=lector.nextInt();
		lector.nextLine();
		
		for(int i=0;i<contador;i++) {
			if(i==id) {
				if(electrodomestic[i] instanceof Nevera) {
					System.out.println("El preu de la reparacio sera " + ((Nevera)electrodomestic[i]).reparar(horesReparant) + " euros");
					break;
				}
				if(electrodomestic[i] instanceof Lavadora) {
					
					System.out.println("El preu de la reparacio sera " + ((Lavadora)electrodomestic[i]).reparar(horesReparant) + " euros");
					
					break;
				}
			}
		}
		
	
		

	}



}
