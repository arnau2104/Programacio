import java.util.Scanner;

public class GestorPuntuacions {

	static int menu;
	static Scanner lector = new Scanner(System.in);
	static Puntuacio[] puntuacio = new Puntuacio[100]; //faig un objecte de tipus puntuacio per guardar les puntuacions
	static int contadorPuntuacio = 0;


	public static void main(String[] args) {

		do {
			try {

				System.out.println("(1)Introduir una nova puntuacio" +
						"\n(2)Mostrar la llista de puntuacions per ordre d'arribada" + 
						"\n(3)Mostrar puntuacions en ordre descendent de punts" + 
						"\n(4)Mostrar llista de puntuacions en ordre alfabètic de cognom" + 
						"\n(5)Sortir");
				menu=lector.nextInt();
				lector.nextLine();

				switch(menu) {
				case 1: novaPuntuacio();
				break;
				case 2: mostrarLlistaPuntuacionsOrdreArribada();
				break;
				case 3: mostrarPuntuacionsOrdreDescendent();
				break;
				case 4: mostrarPuntuacionsOrdreAlfabetic();
				break;
				case 5: break;
				default: System.out.println("Introdueix una opcio valida (1-5)");
				}
				// faig aquesta excepcio perque aixi control tots els errors a la vegada
			} catch(Exception e) {
				System.out.println("Has tingut un error en el programa");
				lector.nextLine(); // Buidar el buffer del scanner
			}
		}while(menu!=5); // que es repetesqui fins que seleccioni l'opcio 5

		System.out.println("Adeu...");


	}

	private static void novaPuntuacio() {
		String nom;
		String cognoms;
		double punts;
		String data;
		System.out.println("Registre de una nova puntuacio:");
		System.out.println("Introdueix el nom del jugador: ");
		nom=lector.next();


		System.out.println("Introdueix els cognoms del jugador: ");
		cognoms=lector.next();


		System.out.println("Introdueix la puntuacio del jugador: ");
		punts=lector.nextInt();
		lector.nextLine();

		System.out.println("Introdueix la data de la puntuacio amb el seguent format (dia-mes-any): ");
		data=lector.next();

		puntuacio[contadorPuntuacio] = new Puntuacio (nom,cognoms,punts,data);
		contadorPuntuacio++;

	}

	private static void mostrarLlistaPuntuacionsOrdreArribada() {
		for (int i=0; i<contadorPuntuacio;i++) {
			System.out.println(puntuacio[i].toString());
			System.out.println("---------------------------");
		}

	}

	private static void mostrarPuntuacionsOrdreDescendent() {

		Puntuacio[] ordreDescendent = new Puntuacio[contadorPuntuacio];
		int contadorDescendent=0;

		for(int i=0; i<contadorPuntuacio;i++) {

			ordreDescendent[i]=puntuacio[i];

		}

		for(int i=0;i<ordreDescendent.length;i++) {
			double numero=ordreDescendent[i].getPunts();
			for(int j=ordreDescendent.length-1;j>i;j--) {
				if(ordreDescendent[j].getPunts()>(numero)) {
					ordreDescendent[i]=ordreDescendent[j];

					numero=ordreDescendent[j].getPunts();
					ordreDescendent[j].setPunts(numero);
				}

			}
		}

		for(int i=0; i<contadorPuntuacio;i++) {
			if(puntuacio[i] != null ) {
				System.out.println(ordreDescendent[i].toString());
			}
		}

	}

	private static void mostrarPuntuacionsOrdreAlfabetic() {

		Puntuacio[] ordreAlfabetic = new Puntuacio[contadorPuntuacio];


		for(int i=0; i<contadorPuntuacio;i++) {

			ordreAlfabetic[i]=puntuacio[i];

		}
		for(int k=0;k<ordreAlfabetic.length;k++) {
			for (int i=0;i<ordreAlfabetic.length;i++) {
				char lletra= ordreAlfabetic[i].getCognoms().charAt(1);
				for(int j=i+1;j<ordreAlfabetic.length;j++) {
					if(lletra>ordreAlfabetic[j].getCognoms().charAt(1) && lletra!=ordreAlfabetic[j].getCognoms().charAt(1)) {
						ordreAlfabetic[i]=ordreAlfabetic[j];
						ordreAlfabetic[j]=ordreAlfabetic[i];

					}
					break;
				}

			}
		}

		for(int i =0; i<contadorPuntuacio;i++) {
			System.out.println(ordreAlfabetic[i].toString());
		}

	}

}
