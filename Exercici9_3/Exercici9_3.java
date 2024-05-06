package Exercici9_3;

import java.util.ArrayList;

public class Exercici9_3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(); //1
		
		numeros.add(10); //2
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		
		System.out.println(numeros); //3
		
		
		numeros.add(60);//4
		System.out.println(numeros); //5
		
		numeros.remove(2);//6
		System.out.println(numeros); //7
			
		System.out.println(numeros.get(0));//8
		
		numeros.set(1, 25);//9
		System.out.println(numeros); //10
		
		System.out.println(numeros.size());//11
		
		System.out.println("Hi ha el nombre 40 a l'ArrayList? : " + numeros.contains(40));//12
		
		numeros.clear(); //13
		
		System.out.println("L'ArrayList esta buit? : " + numeros.isEmpty()); //14

	}

}
