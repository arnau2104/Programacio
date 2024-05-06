package Exercici10_2;

import java.io.File;
import java.io.FilenameFilter;

public class Exercici10_2 {

	public static void main(String[] args) {
		File imatges = new File("C:\\Users\\ciclesgs\\Pictures\\Screenshots");
		
		String[] contingut = imatges.list(new FilenameFilter() {
			public boolean accept(File f, String name) {
				if (name.endsWith(".png") || name.endsWith(".jpg") )
				return true;
				else
				return false;

				}});
		
		for (String i : contingut) {
			System.out.println(i);
		}

	}

}
