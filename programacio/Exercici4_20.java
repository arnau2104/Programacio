package programacio;

import java.util.Scanner;

public class Exercici4_20 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int doblers;
		int billet500=0;
		int billet200=0;
		int billet100=0;
		int billet50=0;
		int billet20=0;
		int billet10=0;
		int billet5=0;
		
		System.out.println("Introdueix un nombre de doblers multiple de 5: ");
		doblers=lector.nextInt();
		lector.nextLine();
	
		
		
		while(doblers>=0) {
			if(doblers/500>0) {
				billet500=doblers/500;
				System.out.println(billet500 + " de 500");
				doblers=doblers - (500 * billet500);
			}if(doblers/200>0 & doblers%500!=0) {
				billet200=doblers/200;
				System.out.println(billet200 + " de 200");
				doblers=doblers-(200 * billet200);
			}if(doblers/100>0 & doblers%200!=0) {
				billet100=doblers/00;
				System.out.println(billet100 + " de 100");
				doblers=doblers-(100 * billet100);
			}if(doblers/50>0 & doblers%100!=0) {
				billet50=doblers/50;
				System.out.println(billet50 + " de 50");
				doblers=doblers-(50 * billet50);
			}if(doblers/20>0 & doblers%50!=0) {
				billet20=doblers/20;
				System.out.println(billet20 + " de 20");
				doblers=doblers-(20 * billet200);
			}
			if(doblers/10>0 & doblers%20!=0) {
				billet10=doblers/10;
				System.out.println(billet10 + " de 10");
				doblers=doblers-(10 * billet10);
			}if(doblers/5>0 & doblers%10!=0) {
				billet5=doblers/5;
				System.out.println(billet5 + " de 5");
				doblers=doblers-(5 * billet5);
			}
		}
	}	

}
