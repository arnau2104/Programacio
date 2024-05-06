package Exercici10_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exercici10_3 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\ciclesgs\\Downloads\\P-UD7 Classes emmagatzemament i utilitats.pdf");
		File c = new File("copia.pdf");
		try {
			FileInputStream input = new FileInputStream(f);
			FileOutputStream output = new FileOutputStream (c);
			
			byte[] dades = new byte[100];
			int llegits = 0;
			int longitud=0;
			while (-1 != (llegits = input.read(dades))) {
				output.write(dades);
				 longitud = longitud + llegits;
			}
			
			output.close();
			input.close();
		
			
			System.out.println(f.length());
			System.out.println(c.length());
			System.out.println(longitud);
			
		}catch (Exception e ) {
			e.printStackTrace();
		}

	}

}
