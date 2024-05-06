package Exercici10_7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercici10_7 {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\ciclesgs\\Documents\\hola.txt"));
			String linia = "";
			int numlinea =0;
			//Es mostra tot el contingut per pantalla
			while (null != (linia = br.readLine())) {
				numlinea++;
			System.out.println("Línea " + numlinea + ": " + linia);
			}
			br.close();

		}catch (Exception e ) {
			e.printStackTrace();
		}
		
	}
	

}
