package programacio;

import java.util.Scanner;

public class Exercici4_10 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int nombre;
		
		do { 
			System.out.println("Introdueix un nombre entre 1 i 12: ");
			nombre = lector.nextInt();
			lector.nextLine();
		} while (nombre > 12 || nombre <= 0);
			
		switch (nombre) {
		case 2:
			System.out.println("El mes té 28 o 29 dies");
			break;
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes té 31 dies");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes té 30 dies");
			break;
			
		}
	}

}
