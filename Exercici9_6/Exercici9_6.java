package Exercici9_6;

import java.util.LinkedList;
import java.util.Scanner;


public class Exercici9_6 {
	static LinkedList<Ciutat> llistaCiutats = new LinkedList<>(); //1
	public static void main(String[] args) {
		
		
		llistaCiutats.add(new Ciutat("Barcelona")); //2
		llistaCiutats.add(new Ciutat("Madrid")); //2
		llistaCiutats.add(new Ciutat("Valencia")); //2
		llistaCiutats.add(new Ciutat("Sevilla")); //2
		
		mostrarDades(); //3
		
		llistaCiutats.addFirst(new Ciutat ("Bilbao")); //4
		
		llistaCiutats.addLast(new Ciutat ("Malaga")); //5

		System.out.println( "Primera Ciutat: " + llistaCiutats.getFirst().getCiutat() + " Darrera ciutat: " + llistaCiutats.getLast().getCiutat()); //6
		
		llistaCiutats.removeFirst(); //7
		llistaCiutats.removeLast(); //8
		
		mostrarDades();

	}
	
	public static void mostrarDades() {
		for ( Ciutat c : llistaCiutats) {
			System.out.println(c);
		}
	}
}

