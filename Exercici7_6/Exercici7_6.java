package Exercici7_6;

import java.util.Arrays;

public class Exercici7_6 {

	 
	
	public static void main(String[] args) {
		int[] llista = {8,5,2,6,9,3,1,4,0,7};
		  quicksort(llista, 0, llista.length - 1);
		System.out.println(Arrays.toString(llista));

	}
	
	public static void quicksort(int[] llista,int first_index,int last_index) {
		if (last_index > first_index) {
			int pivotIndex= particion (llista,first_index,last_index);
			 quicksort(llista, first_index, pivotIndex - 1);
	            quicksort(llista, pivotIndex + 1, last_index);
		}
	}

	public static int particion(int[] llista,int first_index,int last_index) {
		
		
			int pivot=llista[first_index];
			int left=first_index + 1;
			int right=last_index;
			
			while (left<=right) {
				while ( left<=right && llista[left] < pivot) {
					left++;
				}
				while (left<=right && llista[right] > pivot) {
					right--;
				}
				
				if(left <= right) {
					int temp = llista[left];
					llista[left]=llista[right];
					llista[right]=temp;
					left++;
					right--;
				}	
				
			}
			int temp=llista[right];
			llista[right] = llista[first_index];
			llista[first_index]=temp;
			
			return right;
		}
		
		
		
	}


	