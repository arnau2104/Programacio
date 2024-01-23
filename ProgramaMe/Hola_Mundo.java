package ProgramaMe;

import java.util.Scanner;

public class Hola_Mundo {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		int n=0;

		
		n = lector.nextInt();
		
			for(int i=0; i<n;i++) {
				System.out.println("Hola mundo.");
			}
		
	}


}
