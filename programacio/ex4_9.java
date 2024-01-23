package programacio;

import java.util.Scanner;

public class ex4_9 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//PAS 1 i 2
		int cocient = 0;
		System.out.print("Quin és el dividend? ");
		int dividend = lector.nextInt();
		lector.nextLine();
		//PAS 3 i 4
		System.out.print("Quin és el divisor? ");
		int divisor = lector.nextInt();
		lector.nextLine();
		//PAS 5
		while (dividend >= divisor) {
		//PAS 6
		dividend = dividend - divisor;
		cocient ++;
		System.out.println("Bucle: per ara el dividend val " +

		dividend + ".");

		//PAS 7: Simplement equival a dir que fem la volta al bucle per avaluar la condició

		}
		System.out.println("Has hagut de fer  " + cocient + " restes per arribar al resultat ." );
		System.out.println("El resultat final és " + dividend + ".");

	}

}
