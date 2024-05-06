package Exercici10_5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Exercici10_5 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\ciclesgs\\Documents\\hola.txt");
		File c = new File("copiaHolar.txt");
		
		try {
			byte[] array ;
			
			FileInputStream input = new FileInputStream(f);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			
		
			int llegits = 0;
			int longitud =0;
			
			while (-1 != (llegits = input.read())) {
			
				output.write(llegits);
				longitud = longitud + llegits;
			}
			array = output.toByteArray();
			input.close();
			output.close();
			
			System.out.println(Arrays.toString(array));
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
