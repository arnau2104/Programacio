package Exercici7_4;

import java.util.Arrays;

public class Exercici7_4 {

	public static void main(String[] args) {
		
		//Aquest es el metode de ordenacio per intercanvi directa(metode  de la bombolla)
		
		int[] llista = {8,5,2,6,9,3,1,4,0,7};

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
		System.out.println(Arrays.toString(llista));

	}

}
