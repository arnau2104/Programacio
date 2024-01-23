package programacio;

import java.util.Scanner;

public class Exercici4_16 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int decimal;
		int dos= 2;
		String binari="";
		System.out.println("Introdueix un nombre decimal: ");
		decimal=lector.nextInt();
		lector.nextLine();
		
		while(decimal>=2) {
			binari= (decimal % 2) + binari;
			decimal= decimal/2;
		}
	
	
		System.out.print("1"+binari); 
	
	}                            
	
	

}
