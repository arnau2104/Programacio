package programacio;

import java.util.Scanner;

public class Exercici4_22 {
	static int nombre_primers;
	static int nombre=1;
	public static void main(String[] args) {
		
		llegirNombres();
		sebrePrimers();
	
	}
		
		public static void llegirNombres() {
			Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix el nombre de primers que vols: ");
		 nombre_primers=lector.nextInt();
		lector.nextLine();
		}

		public static void sebrePrimers() {
			boolean trobat=false;
			int i=0;
			int divisor= nombre-1;	
		while(nombre_primers>i) {
			while (divisor>1) {
				if ((nombre%divisor)==0) {		
					trobat=true;
					
					
				}
				
				
				divisor--;
				

			}	if (trobat==false) {
				System.out.print(nombre + ",");
				i++;

			}
			divisor=nombre-1;
			nombre++;
			trobat=false;

		}
	
	}

		
}

