package programacio;

import java.util.Scanner;

public class ex4_6 {
	//Es fa un descompte del 8%.
			/**
			 * Constant per posar el percentatge de descompte aplicat
			 */
			public static final float DESCOMPTE = 8;
			//Es fa descompte per compres d'un mínim de 100 euros.
			/**
			 * Constant per indicar el preu minim a partir del qual es fa descompte
			 */
			public static final float COMPRA_MIN = 100;
			/**
			 * Funcio principal del programa
			 * @param args La funco main te els parametres habituals
			 */
			public static void main (String[] args) {
			Scanner lector = new Scanner(System.in);
			System.out.print("Quin és el preu del producte, en euros? ");
			
			if (lector.hasNextFloat()) {
			float preu = lector.nextFloat();
			lector.nextLine();
			//Estructura de selecció simple.
			//Si l'expressió avalua true, executa el bloc dins l'if.
			//En cas contrari, ignora'l.
			if (preu >= COMPRA_MIN) {
			float descompteFet = preu * DESCOMPTE / 100;
			preu = preu - descompteFet;
			}
			System.out.println("El preu final per pagar és de " + preu + "euros.");
			
			}else {
				System.out.println("Introdueix un nombre");
			}
		}

	}


