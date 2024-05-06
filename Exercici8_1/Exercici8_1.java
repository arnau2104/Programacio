package Exercici8_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici8_1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int numero;
		int division;
		int[] numeros = {3,4,5,9};
		int menu=0;

		do {

			System.out.println("(1) Introduce un numero" +
					"\n(2) Recorre un array" + 
					"\n(3) Haz una division" + 
					"\n(4) Salir");
			menu=lector.nextInt();
			lector.nextLine();



			switch(menu) {


			case 1:
				try {
					System.out.println("Introduce un numero");
					numero=lector.nextInt();
					lector.nextLine();
				}
				catch (InputMismatchException e) {
					System.out.println(e.getMessage());
					System.out.println("Has introducido una letra en lugar de un numero");
					// limpiamos el buffer para evitar bucles
					lector.nextLine();

				}
				break;

			case 2:
				try {
					for (int i =0;i<=numeros.length;i++ ) {		
						System.out.println(numeros[i]);
					}
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
					System.out.println("Has salido del index");
				}
				break;

			case 3:
				try {
					division = 10 / 0;
				}
				catch (ArithmeticException e){
					System.out.println(e.getMessage());
					System.out.println("Has tenido un error en una operacion artimetica");

				}
				break;
			case 4: break;
			default: System.out.println("Introduce una opcion valida (1-4)");

			}




		}while(menu!=4);


	}

}
