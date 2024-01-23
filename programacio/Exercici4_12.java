package programacio;

import java.util.Scanner;

public class Exercici4_12 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.println("Introdueix un valor");
		n1 = lector.nextInt();
		lector.nextLine();
		
		System.out.println("Introdueix el segon valor");
		n2 = lector.nextInt();
		lector.nextLine();
		
		if (n1<n2) {
			while (n1<=n2) {
				
				System.out.print(n1 + " ");
				n1++;
			}
		}else {
			System.out.println("Nombres incorrectes");
		}


	}

}
