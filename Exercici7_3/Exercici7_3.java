package Exercici7_3;

import java.util.Arrays;

public class Exercici7_3 {

	public static void main(String[] args) {

		//Aquest es el metode d'ordenacio per seleccio directe
		
		int[] llista = {8,5,2,6,9,3,1,4,0,7};
		
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
		

		System.out.println(Arrays.toString(llista));

	}
}