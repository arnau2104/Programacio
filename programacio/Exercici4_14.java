package programacio;

import java.util.Scanner;

public class Exercici4_14 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int nombre;
		
		
		System.out.println("Introdueix un nombre per fer la piramide: ");
		nombre = lector.nextInt();
		lector.nextLine();
		
	for(int i =0; i<nombre;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("a");
		}
		// Es per fer un inro
		System.out.println(" ");
		}

	}

}
