package Exercici8_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici8_3 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int numero;
		int division;
		int[] numeros = {3,4,5,9};
		int menu=0;

		do {
			try {

				System.out.println("(1) Lee un array" +
						"\n(2) Abre un fichero" + 
						"\n(3)Salir" );
				menu=lector.nextInt();
				lector.nextLine();



				switch(menu) {


				case 1:

					Persona[] array = null;
					for(int i=0;i<array.length;i++) {
						System.out.println(array[i]);
					}


					break;

				case 2:

					FileOutputStream f = new FileOutputStream ("nomFitxer");
					f.close();


					break;

				case 3:	
					break;

				default: System.out.println("Introduce una opcion valida (1-3)");

				}


			} catch (IOException e ) {
				System.out.println(e.getMessage());
				System.out.println("Has tenido un error en la lectura del fichero");
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("Error, el array esta vacio");
			}

		}while(menu!=3);
		System.out.println("Adios");

	}
	
		

}