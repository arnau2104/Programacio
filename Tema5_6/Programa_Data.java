package Tema5_6;

import java.util.Scanner;

public class Programa_Data {

	static Data fecha = new Data();
	
	public static void main(String[] args) {

		llegirData();
		
	}

	public static void llegirData(){
		Scanner lector = new Scanner (System.in);

		int dia;
		int mes;
		int any;
		
		System.out.println("Introdueix una dia: ");
		dia = lector.nextInt();
		lector.nextLine();
		System.out.println("Introdueix una mes: ");
		mes = lector.nextInt();
		lector.nextLine();
		System.out.println("Introdueix una any: ");
		any = lector.nextInt();
		lector.nextLine();
		
		Data fecha = new Data(dia,mes,any);
		
	}
	
	
	
	

}
