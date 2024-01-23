package Tema5_6;

import java.util.Scanner;

public class ComprobacioPassword {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {

		int menu=0;

		do {
			System.out.println("Tria una opció:");
			System.out.println("(1) Generer contrasenya de 8 caracters");
			System.out.println("(2) Crear contrasenya de longitud especifica ");
			System.out.println("(3) Sortir");
			menu = lector.nextInt();
			lector.nextLine();

			switch(menu) {
			case 1: 
				password8();
				break;
			case 2: 
				passwordLongEsp();
				break;

			case 3:
				System.out.println("Adeu");
				break;
			default :
				System.out.println("introdueix una opcio correcte (1-3)");
			}

		}while(menu !=3);

	}

	private static void password8() {
		int numPasswords=0;

		int contador = 0;

		System.out.println("Cuantes contrasenyes vols?");
		numPasswords = lector.nextInt();
		lector.nextLine();



		do {
			Password psw8 = new Password();
			System.out.println("La seva contrasenya generada es: " + psw8.getPassword() );
			if(psw8.isRobust()==true) {
				System.out.println("La contrasenya es robusta!");
			}else {
				System.out.println("La contrasenya no es robusta!");
			}
			contador++;
		
		}while(contador<numPasswords);
	}

	private static void passwordLongEsp() {
		int numPasswords=0;
		int contador = 0;
		int nombre=0;

		System.out.println("Cuantes contrasenyes vols?");
		numPasswords = lector.nextInt();
		lector.nextLine();
		
		System.out.println("De quina longitud vols les contrasenyes?");
		nombre = lector.nextInt();

		do {
			
			Password longitud = new Password(nombre);
			longitud.robust();
			
			System.out.println("La teva contrasenya es : " + longitud.getPassword());
			if(longitud.isRobust()==true) {
				System.out.println("La contrasenya es robusta!");
			}else {
				System.out.println("La contrasenya no es robusta!");
			}
			contador++;
			
			
		}while(contador < numPasswords);
	}



}
