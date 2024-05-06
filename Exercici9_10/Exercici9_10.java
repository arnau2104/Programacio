package Exercici9_10;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercici9_10 {

	static TreeSet <String> cadena = new TreeSet<>();
	
	public static void main(String[] args) {
		
		cadena.add("Arnau");
		cadena.add("Barcelona");
		cadena.add("Moix");
		cadena.add("Leo");
		
		
		mostrarDades(); // es mostren en ordre alfabetic
		
		System.out.println("La cadena conte a Arnau: " + cadena.contains("Arnau"));
		
		cadena.add("Arnau");
		
		mostrarDades(); // no tel deixa posar, pero no et dona cap error
		
		cadena.remove("Arnau");
		
		mostrarDades();

	}
	
	public static void mostrarDades() {
		Iterator<String> it = cadena.iterator();
		for(String n : cadena) {
			System.out.println(it.next()); 
		}
	}

}
