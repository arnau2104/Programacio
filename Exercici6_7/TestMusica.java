package Exercici6_7;

import java.util.Scanner;

public class TestMusica {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		/* Pregunta 1: 
		 * El programa de la forma que es mostra a l'exercici no compilaria, perque hem fet la clase Musica abstracte i no podem cream objectes damunt ella 
		 * Pregunta 2:
		 *Crearia el constructor a la clase musica, perque les clases filles han de tenir durada, no estaria be posar una variable a cada clase 
		 */
		double durada;
		;
		System.out.println("Introdueix la durada del MP3");
		durada=lector.nextDouble();
		Mp3 m = new Mp3(durada);
		lector.nextLine();
		m.reproduir();
		System.out.println("Introdueix la durada del Ogg");
		durada=lector.nextDouble();
		
		Ogg o = new Ogg();
		o.reproduir();
		

	}

}
