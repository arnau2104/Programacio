package Exercici10_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class Exercici10_10 {

	public static void main(String[] args) {
		try {
		File f = new File("ramis.html");
		URL url = new URL("http://www.iesjoanramis.org");
		
		// Volcam el rebut al buffer
		BufferedReader in = new BufferedReader(new
		InputStreamReader(url.openStream()));
		 FileWriter wr = new FileWriter(f);
		
		// Mentre no acabi de llegir la página s’adjunta a un String
		
		String linia="";
		String inputText="";
		while ((linia = in.readLine()) != null) {
		 inputText = inputText + linia;
		}
		wr.write(inputText);
		in.close();
		wr.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}