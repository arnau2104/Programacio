package Exercici7_5;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArray {

	static int[] llista;
	static Scanner lector = new Scanner(System.in);
	static int menu;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println(	"\n(1)Crear array"
					+ 			"\n(2)Ordenacio per insercio directa"
					+ 			"\n(3)Ordenacio per seleccio directa"
					+ 			"\n(4)Ordenacio per intercanvi directa (metode de la bombolla)"
					+ 			"\n(5)Sortir");
			menu=lector.nextInt();
			lector.nextLine();
			
			switch(menu) {
			case 1: crearArray();
					break;
			case 2: insercioDirecta();
					break;
			case 3: seleccioDirecta();
					break;
			case 4: intercanviDirecta();
					break;
			case 5: break;
			default: System.out.println("Introdueix una opcio correcta (1-4)");
			}
			
		}while(menu!=5);
		
		System.out.println("Adeu...");
				

	}
	
	public static void crearArray() {
		
		int longitud;
		
		
		System.out.println("De quina longitud vols l'array");
		longitud=lector.nextInt();
		lector.nextLine();
		llista=new int[longitud];
		
		for(int i=0;i<longitud;i++) {
			System.out.println("Introdueix els nombres del array");
			int nombre=lector.nextInt();
			lector.nextLine();
			
			llista[i]=nombre;			
			
		}
		
	}

	private static void insercioDirecta() {
	
		System.out.println("Insercio directa:");
		
		for(int i = 1; i<llista.length;i++) {
			int num = llista[i];
			for(int j=i-1;j>=0;j--) {
				if (llista[j]>num) {
					llista[j+1]=llista[j];
				}else {
					llista[j+1]=num;
					break;
				}
				if(j==0 && llista[0]>num) {
					llista[0]=num;
				}
			}
		}
		System.out.println(Arrays.toString(llista) + "\n");
		
	}

	private static void seleccioDirecta() {

		System.out.println("Seleccio directa:");
		
		for(int i=0;i<llista.length;i++) {
			int numero=llista[i];
			for(int j=llista.length-1;j>i;j--) {
				if(llista[j]<numero) {
					llista[i]=llista[j];
					llista[j]=numero;
					numero=llista[i];
				}
			
			}
		}
		

		System.out.println(Arrays.toString(llista) + "\n");

		
	}

	private static void intercanviDirecta() {
		
		System.out.println("Intercanvi directa:");
		
		for(int k=0;k<llista.length;k++) {
			for (int i=0;i<llista.length;i++) {
				int numero= llista[i];
				for(int j=i+1;j<llista.length;j++) {
					if(numero>llista[j] && numero!=llista[j]) {
						llista[i]=llista[j];
						llista[j]=numero;
					}
					break;
				}

			}
		}
		System.out.println(Arrays.toString(llista) + "\n");
		
	}

}
