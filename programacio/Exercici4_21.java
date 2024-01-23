package programacio;

import java.util.Scanner;

public class Exercici4_21 {
	//Variable global
	private static int[] llistaEnters = new int[10];

	public static void main(String[] args) {
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
		nombresInferiors();
	}
	public static void llegirLlista() {
		System.out.println("Escriu 10 valors enters i prem retorn.");
		Scanner lector = new Scanner(System.in);
		int index = 0;
		while (index < llistaEnters.length) {
			if (lector.hasNextInt()) {
				llistaEnters[index] = lector.nextInt();
				index++;
			} else {
				lector.next();
			}
		}
		lector.nextLine();
	}
	
	public static void ordenarLlista() {

		for (int i = 0; i < llistaEnters.length - 1; i++) {
			for(int j = i + 1; j < llistaEnters.length; j++) {
				//La posició tractada té un valor més alt que el de la cerca... Els intercanviem.

				if (llistaEnters[i] > llistaEnters[j]) {
					//Per intercanviar valors cal una variable auxiliar

					int canvi = llistaEnters[i];
					llistaEnters[i] = llistaEnters[j];
					llistaEnters[j] = canvi;
				}
			}
		}
	}
	public static void  mostrarLlista() {

		System.out.print("L'array ordenat és: [ ");
		for (int i = 0; i < llistaEnters.length;i++) {
			System.out.print(llistaEnters[i] + " ");
		}
		System.out.println("]");
	}
	public static void nombresInferiors() {
		int resultat= llistaEnters[9] / 2;
		//int longitud=0;
		int contador=0;
		for(int f=0; f<llistaEnters.length; f++) {
			//longitud= longitud - llistaEnters.length -1;
			if (llistaEnters[f] < resultat) {
				contador++;
				}
			}	
		System.out.println("Caben " + contador + " nombres dins la mitad del nombre mes gran");	
	}
}
			
	
	
	
		



