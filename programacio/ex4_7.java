package programacio;

import java.util.Scanner;

public class ex4_7 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//PAS 1 i 2
		System.out.print("Fins a quin valor vols sumar múltiples de 3?");

		int limit = lector.nextInt();
		lector.nextLine();
		int resultat = 0;
		//PAS 3: Anar mirant els valors un per un. Es comença pel 0.
		int i = 0;
		while (i <= limit) {
		//PAS a: És múltiple de tres?
		if ( (i%3) == 0) {
		System.out.println("Afegim " + i +"...");
		resultat = resultat + i;
		}
		//PAS 3: Seguir anar mirant els valors un per un.
		i = i + 3;
		}
		System.out.println("El resultat final és " + resultat + ".");

	}

}
