package programacio;

import java.util.Scanner;

public class Exercici4_17 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int nombre;
		int base = 2;
		String binari="";
		String octal="";
		System.out.println("Introdueix un nombre decimal: ");
		nombre=lector.nextInt();
		lector.nextLine();
		
		System.out.println("Introdueix la base en la cual el vols: ");
		base=lector.nextInt();
		lector.nextLine();
		
		
			
				while(nombre>=base) {
			binari= (nombre % base) + binari;
			nombre= nombre/base;
				}
		System.out.println("1" + binari);
			
				
		
	
	
		

	}

}
