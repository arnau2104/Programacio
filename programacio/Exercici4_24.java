package programacio;

import java.util.Scanner;

public class Exercici4_24 {
	static String nombre;
	public static void main(String[] args) {
		  llegirNombre();
		  xifraAlta();
		  xifraBaixa();
	}
	public static void llegirNombre() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un nombre ");
		nombre=lector.nextLine();
	}
	public static void xifraAlta() {
		char nombrealt='0';
		int cont=0;
		if(nombre.length()<=15) {
			for(int i=0; i<nombre.length(); i++)
				if(nombre.charAt(i)> nombrealt) {
				nombrealt=nombre.charAt(i);
				cont=i +1;
			}
			System.out.println("El nombre mes gros es " + nombrealt + " i esta a la posicio  " +  cont);
		} else {
			System.out.println("Introdueix un nombre amb menys caracters");
			
		}
		}
		
	public static void xifraBaixa() {
		char nombrebaix='9';
		int posicio=0;
		int cont=0;
		if(nombre.length()<=15) {
			for(int i=0; i<nombre.length(); i++)
				if(nombre.charAt(i)< nombrebaix) {
				nombrebaix=nombre.charAt(i);
				posicio=i+1;
				
			}
			
			System.out.println("El nombre mes petit es " + nombrebaix + " i esta a la posicio  " +  posicio);
		} else {
			System.out.println("Introdueix un nombre amb menys caracters");
			
		}
	}
}
