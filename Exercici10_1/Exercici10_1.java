package Exercici10_1;

import java.io.File;

public class Exercici10_1 {

	public static void main(String[] args) {
		File file = new File("C:\\Windows\\Boot");
		
		File[] contingut = file.listFiles();
		
		for (File f : contingut) {
			System.out.println(f);
			
		}

	}

}
