package Exercici7_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProgramaPenjat {

	static String[] paraules = new String [10];

	static Scanner lector = new Scanner(System.in);
	static boolean endevinat=false;
	static int falls=0;
	static String paraulaTriada="";
	static final int intentsMax=6;
	static String[][] dibuix = new String[intentsMax][intentsMax];
	static int intents=0;
	static boolean seguirJugant=true;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("Hola,anem a jugar al joc del penjat!");
			paraulesGuardades();
			endevinarParaula();
			
			System.out.println("Vols seguir jugant?");
			String resposta=lector.nextLine();
			
			if(resposta.toLowerCase().equals("no")) {
				seguirJugant=false;
			}
			
			
		}while(seguirJugant==true);
		
		System.out.println("Gracies per haver jugat");
		
		
	}

	public static void paraulesGuardades() {

		Random random= new Random();


		paraules[0]="hola";
		paraules[1]="java";
		paraules[2]="messi";
		paraules[3]="prova";
		paraules[4]="alonso";
		paraules[5]="taula";
		paraules[6]="carto";
		paraules[7]="bus";
		paraules[8]="derrota";
		paraules[9]="arnau";

		paraulaTriada=paraules[random.nextInt(10)];
		
	
		
		

	}

	public static void endevinarParaula() {
		
		int lletresEndevinades=0;
		String lletra;
		String[] intent = new String[paraulaTriada.length()];
		String lletresFallades="";
		
		for(int i=0;i<paraulaTriada.length();i++) {
			intent[i]="_";
		}

		while(intents<intentsMax && endevinat!=true) {
			
			boolean lletraCorrecta=false;

			for(int i=0;i<paraulaTriada.length();i++) {
				System.out.print(intent[i]);
				System.out.print(" ");
			}
			
			//mostra la llista de les lletres fallades
			if(!lletresFallades.isEmpty()) {
				System.out.print("\t Lletres fallades: ");
				for(int i=0;i<lletresFallades.length();i++) {
					System.out.print(lletresFallades.charAt(i) + ",");
				}
			}
			
			

			System.out.println("\n\nIntrodueix una lletra");
			lletra=lector.next();
			
			
			//Bucle perque vagi mirant totes les lletres de la paraula avam si colcuna es igual
			for(int i=0;i<paraulaTriada.length();i++) {
				if(lletra.charAt(0)==paraulaTriada.charAt(i)) {
					intent[i]=lletra;	
					lletraCorrecta=true; //si entra al if es que la lletra que ha posat es correcta
				}
			}
			
			
			
			//bucle per comprovar si l intent es iguala a la paraula
			for(int i=0;i<paraulaTriada.length();i++) {
				if(intent[i].charAt(0)==paraulaTriada.charAt(i)) {
					endevinat=true;
				
				}else {
					endevinat=false;
					break;
				}
			}
			
			intents++;
			
			
		
			if(lletraCorrecta==true) {
				System.out.print("Lletra correcta ");
				System.out.println(  intentsMax-intents + " intents restants");
				
			}else {
				falls ++;
				System.out.print("Lletra incorrecta ");
				if(intentsMax-intents==0) {
					System.out.println("Te has quedat sense intents");
				}else {
				System.out.println(  intentsMax-intents + " intents restants");
				lletresFallades=lletresFallades + lletra;
				}
				
				
			}
			
			System.out.println();
			if(falls!=0) {
				mostrarDibuix(falls);
			}
			
			

		}
		
		if(endevinat==true) {
			System.out.println("Enhorabona has endevinat la paraula");
		}else {
			System.out.println("Casi!! La paraula era: " + paraulaTriada);
			
		}

		

	}
	
	public static void mostrarDibuix(int falls) {
		
		for(int i=0;i<dibuix.length;i++) {
			for (int j=0;j<dibuix.length;j++){
				dibuix[i][j]=" ";
				
			}
		}
		
		dibuix[0][1]="-";
		dibuix[1][0]="/";
		dibuix[1][2]="|";
		dibuix[2][0]="|";
		dibuix[2][2]="o";
		dibuix[3][0]="|";
		dibuix[3][1]="_";
		dibuix[3][2]="|";
		dibuix[3][3]="_";
		dibuix[4][0]="|";
		dibuix[4][2]="|";
		dibuix[5][0]="|";
		dibuix[5][1]="/";
		dibuix[5][3]= "\\";
		
		
		for(int i=0;i<falls;i++) {
			for (int j=0;j<dibuix[i].length;j++){	
				System.out.print(dibuix[i][j]);	
			}
			
			System.out.println();
			
			if(falls==7) {
				break;
			}
		}
		
	
			
		
	}

}
