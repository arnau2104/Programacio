package ProgramaMe;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		int casos_prueba;
		int A;
		int B;
		int C;
		int positiuA;
		casos_prueba=lector.nextInt();

		for(int i =0; i<casos_prueba;i++) {
			A=lector.nextInt();
			B=lector.nextInt();
			C=lector.nextInt();
			if(A<=0) {
				A=-A;
				
			}
			if(C<=0 ) {
				C=-C;
			}
			if(B<=0) {
				B=-B;
			}
				if(A-B==C-B) {
					System.out.println("EMPATE");
				}
				if(A-B>C-B) {
					System.out.println(A);
				}
				if(A-B<C-B) {
					System.out.println(C);
				}
				
			}
		
	}
}
