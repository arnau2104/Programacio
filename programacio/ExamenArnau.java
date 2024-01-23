package programacio;

import java.util.Scanner;

public class ExamenArnau {
	static String usuari;
	static String contrasenya;
	static int menu=0;
	static String comprovacioUsuari;
	static String comprovacioContrasenya;
	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		;
		//posam el do while perque ens entri almenys una vegada, i que acabi el bucle cuan l'usuari introduesqui l'opcio 3
		do {
		System.out.println("(1) Introduir nou usuari i conrasenya");
		System.out.println("(2) Entrar al sistema");
		System.out.println("(3) Sortir del programa");
		menu=lector.nextInt();
		lector.nextLine();
		
		switch(menu) {
		case 1: opcio1();
			break;
		case 2: opcio2();
			break;
		case 3: opcio3();
			break;
		case 4: 
			System.out.println("Opcio incorrecta. Selecioneu una opcio(1-3)");	
			System.out.println();
			}
		}while(menu != 3);
		
	}

	public static void opcio1() {
		
		System.out.println("Introdueix l'usuaris que vols crear: ");
		usuari=lector.nextLine();
		
		System.out.println("Introdueix les  contrasenyes respectives dels usuaris: ");
		contrasenya=lector.nextLine();	
		
	}
	
	
	public static void opcio2() {
		
		int entradesIncorrectes=0;
		boolean contrasenyaEsCorrecta=false;
		
		System.out.println("Introdueix l'usuari: ");
		comprovacioUsuari=lector.nextLine();
		
		System.out.println("Introdueix la contrasenya de l'usuari:");
		comprovacioContrasenya=lector.nextLine();
		
		//posam aquest if defora perque si l'usuari i contrasenya son bons no entri dins el bucle
		if (comprovacioUsuari.equals(usuari) && comprovacioContrasenya.equals(contrasenya)) {
			System.out.println("Has entrat al sistema. No has tingut intents d'entrada incorrectes");
			contrasenyaEsCorrecta=true;
		}
		
		//SYSO perque fagi un intro i no quedi junt amb el menu
		System.out.println();
		
		//posam el while que sigui=false perque si entra a l'if anterior cambiara a true
		while(contrasenyaEsCorrecta==false) {	
			entradesIncorrectes++; // posam l'increment dalt, perque si entra al bucle significa que ha fallat almenys una vegada
			System.out.println("Usuario o contrassenya incorrectes. Introdueix l'usuari: ");
			comprovacioUsuari=lector.nextLine();

			System.out.println("Introdueix la contrasenya de l'usuari:");
			comprovacioContrasenya=lector.nextLine();

			if(comprovacioUsuari.equals(usuari) && comprovacioContrasenya.equals(contrasenya) && entradesIncorrectes>0) {
				System.out.println("Has entrat al sistema. Hi ha hagut "   + entradesIncorrectes + " intents d'entrada incorrectes");
				contrasenyaEsCorrecta=true;
			}

		}
	
	}
	
	public static void opcio3() {
		System.out.println("Adeu");
	}
}
