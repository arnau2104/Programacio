package programacio;

import java.util.Scanner;

public class Exercici4_11 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		//PAS 1 i 2
		System.out.print("Fins a quin valor vols sumar múltiples de 3?");

		int limit = lector.nextInt();
		lector.nextLine();
		int resultat = 0;
		//PAS 3: Anar mirant els valors un per un. Es comença pel 0.
		;
		for (int i=0; i<= limit;i= i + 3) {
		//PAS a: És múltiple de tres?
		if ( (i%3) == 0) {
		System.out.println("Afegim " + i +"...");
		resultat = resultat + i;
		}
		//PAS 3: Seguir anar mirant els valors un per un.
		
		}
		System.out.println("El resultat final és " + resultat + ".");
			
		}
	
	}

