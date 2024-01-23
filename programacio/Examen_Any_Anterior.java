package programacio;

import java.util.Scanner;

public class Examen_Any_Anterior {

	
	static String contrassenya;
	static boolean te8lletres, hihaMajuscula,hihaMinuscula, hihaCaracterEspecial;
	
	public static void main(String[] args) {
		 Scanner lector = new Scanner(System.in);
		
		te8lletres=true;
		hihaMajuscula=false;
		hihaMinuscula=false;
		hihaCaracterEspecial=true;
		
		System.out.println("Introduir la contrasenya");
		contrassenya = lector.nextLine();
		
		while(!contrassenya.toUpperCase().equals("EXIT")) {
			if (contrassenya.length() <8) {
				te8lletres=false;
			}
			
			func_hihaMajuscula();
			func_hihaMinuscula();
			
		}
	}

	private static void func_hihaMinuscula() {
		for (int i=0; i<contrassenya.length();i++) {
			if (contrassenya.charAt(i) >= 'a' && contrassenya.charAt(i) >= 'z') {
				hihaMajuscula=true;
			}
		}
		
	}

	private static void func_hihaMajuscula() {
		for (int i=0; i<contrassenya.length();i++) {
			if (contrassenya.charAt(i) >= 'A' && contrassenya.charAt(i) >= 'Z') {
				hihaMajuscula=true;
			}
		}
		
	}

}
