package Exercici9_9;

import java.util.HashSet;
import java.util.Iterator;

public class Exercici9_9 {

	static HashSet<Integer> numeros = new HashSet<Integer>();
	
	
	public static void main(String[] args) {
		
		numeros.add(10); //1
		numeros.add(20); //1
		numeros.add(30); //1
		numeros.add(40); //1
		numeros.add(50); //1
		
		mostrarDades(); //2
		
		System.out.println( "El HasSet conte el nombre 20: " + numeros.contains(20)); //3
		System.out.println("El HasSet conte el nombre 35: " + numeros.contains(35)); //3
	
		numeros.remove(40); //4
		
		mostrarDades(); //5
		
		numeros.add(50); //6 el que pasa es que no es crea, perque ja existeix, pero no dnoa error
		
		mostrarDades(); //7
		
		System.out.println("La mida del HashSet es: " + numeros.size()); //8
		
		numeros.clear(); //9
		
		System.out.println("Ara la mida del HashSet es: " + numeros.size()); //10
		
		
	}	
	
	public static void mostrarDades() {
		Iterator<Integer> it = numeros.iterator();	//2
		for(Integer n : numeros) {
			System.out.println(it.next()); //2
		}
	}

}
