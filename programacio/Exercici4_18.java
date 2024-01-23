package programacio;

import java.util.Scanner;

public class Exercici4_18 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		int nombre;
		boolean trobat=false;
		System.out.println("Introdueix un nombre: ");
		nombre=lector.nextInt();
		lector.nextLine();
		int divisor= nombre-1;
		while (divisor>1) {
			if ((nombre%divisor)==0) {
				System.out.println("No es un nombre primer");
				trobat=true;
				break;
			}
			divisor--;				
		} if (trobat==false) {
			System.out.println("Es un nombre primer");
		}
			
	
	}

}
