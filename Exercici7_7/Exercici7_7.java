package Exercici7_7;

import java.util.Arrays;

public class Exercici7_7 {

	static int[] taulell = new int [8];
	static int totalQueens=8;
	static int n=0;
	
	public static void main(String[] args) {
		
	//	Exercici7_7 solver = new Exercici7_7();
	     check(n); 
	      
	      
		
	}

	private static void check(int n){
		if(n==totalQueens){
			if(n==8) {
		
			mostrarDibuix();
				return;
			}
			}
			for (int i = 0; i < totalQueens; i++) {
				taulell[n]=i;
				
				if(judge(n)==true){
					check(n+1);
					
				}
				
			}
		}
	

	private static boolean judge(int n){
		for (int i = 0; i < n; i++) {
			if( taulell[i]==taulell[n] || Math.abs(taulell[n]-taulell[i])==Math.abs(n-i)){
				return false;
			}
		}
		return true;
	}
	
	private static void mostrarDibuix() {
		for (int i = 0; i < totalQueens; i++) {
            for (int j = 0; j < totalQueens; j++) {
                if (taulell[i] == j) {
                    System.out.print(" Q "); // Si hi ha reina en aquesta  posición, posam "Q"
                } else {
                    System.out.print(" * "); // Si no hi ha una reina, posam *
                }
            }
            System.out.println();
        }
        System.out.println(); // posam una intro
    }
	
}
