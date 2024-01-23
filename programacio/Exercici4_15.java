package programacio;

import java.util.Scanner;

public class Exercici4_15 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int nombre;	
		System.out.println("Introdueix un nombre per fer la piramide: ");
		nombre = lector.nextInt();
		lector.nextLine();
		for(int i=0; i<nombre;i++) {
			
			for (int f=0;f<=(nombre-1)-i;f++) {
				
				
					System.out.print(" ");
					
			}for (int j=0; j<=i * 2;j++) {
				
				System.out.print("*");
				}
			
			
			System.out.println();
		}
			
		
	}

}
