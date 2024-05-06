package Exercici9_4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Institut {

	static Scanner lector = new Scanner(System.in);
	static int nPersones=0;
	

	
	public static void main(String[] args) {	
		
		 ArrayList<Persona> persona = new ArrayList<Persona>();//1
		
		persona.add(new Persona("Arnau","41751988D",19));//2
		persona.add(new Persona("Marc","417512348D",14));
		persona.add(new Persona("Carlos","41774288D",17));
		
		System.out.println(persona.toString()); //3
		
		persona.add(new Persona("Cristina","41583244R",42)); //4
		
		System.out.println(persona.toString()); //5
		
		
		for (int i =0; i< persona.size(); i++) {
            if (persona.get(i).getDni().equals("41751988D")) { //6
                persona.remove(i);
                break; 
            }
		}
		
		System.out.println(persona.toString()); //7
		
	}
	
}	