package programacio;

import java.util.Scanner;

public class Exercici4_23 {
	static int euros=0;
	static String moneda;
	 static double lliure =0.85;
	 static double dollar =1.16;
	 static double ien =131.66;
	public static void main(String[] args) {
	
			llegirEuros();
			llegirMoneda();
			conversor();

	}
	public static void llegirEuros() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Indrodueix una cuantitat d'euros: ");
		euros=lector.nextInt();
		lector.nextLine();
		
	}
	public static void llegirMoneda() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Indrodueix una moneda a la que el vols passar: ");
		moneda=lector.nextLine();
		
		
	}
	public static void conversor() {
		double canvi=0;
	switch(moneda) {
	case "lliure" :
		canvi=euros * lliure;
		System.out.println(euros + " son "+ canvi + " " + moneda + "s ");
		break;
		
	case "dollars":
		canvi=euros * dollar;
		System.out.println(euros + " son "+ canvi + " " + moneda + "s ");
		
		break;
	case "ien":
		canvi=euros * ien;
		System.out.println(euros + " son "+ canvi + " " + moneda + "s ");
		break;
	
	default :
		System.out.println("introduce un valorr correcto");
	}
		
	
	}
}
