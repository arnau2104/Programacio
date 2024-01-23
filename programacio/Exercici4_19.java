package programacio;

import java.util.Scanner;

public class Exercici4_19 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int nombre_primers;
		int nombre=1;
		int divisor= nombre-1;
		int i=0;
		boolean trobat=false;

		System.out.println("Introdueix el nombre de primers que vols: ");
		nombre_primers=lector.nextInt();
		lector.nextLine();

		


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











