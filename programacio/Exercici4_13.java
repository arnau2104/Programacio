package programacio;

import java.util.Scanner;

public class Exercici4_13 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int nombre;
		
		do {
			System.out.println("Introdueix un nombre major que 1: ");
			nombre = lector.nextInt();
			lector.nextLine();
		} while(nombre < 1); 
			
			
		int i = nombre -1;
		while (i > 1){	
			if (nombre%i==0) {
			
			System.out.println("El divisor mes gran es " + i);
			break;	
			
			}
			i--;
		
		}
		if (i==1) {
			System.out.println("No hem trobat cap divisor");
		}
	}
	
	
}

