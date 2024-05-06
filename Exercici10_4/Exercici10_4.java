package Exercici10_4;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Exercici10_4 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\ciclesgs\\Documents\\hola.txt");
		File c = new File("copiaHolar.txt");
		
		try {
			FileReader input = new FileReader(f);
			FileWriter output = new FileWriter(c);
			
			char[] dades = new char [2];
			int llegits = 0;
			int longitud =0;
			
			while (-1 != (llegits = input.read(dades))) {
			
				output.write(dades);
				longitud = longitud + llegits;
			}
			
			input.close();
			output.close();
			
			System.out.println(f.length());
			System.out.println(c.length());
			System.out.println(longitud);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}

}
