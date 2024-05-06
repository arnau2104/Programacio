package Exercici7_2;

import java.util.Arrays;

public class Exercici7_2 {

	public static void main(String[] args) {

		//Aquest es el metode d'ordenacio per insercio directa
		
		int[] llista = {8,5,2,6,9,3,1,4,0,7};
		
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
		System.out.println(Arrays.toString(llista));
		
	}
}
