package Exercici10_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class Exercici10_6 {

	public static void main(String[] args) {
		try {
			GZIPOutputStream out = new GZIPOutputStream(new
			FileOutputStream("copia2Hola.gz"));
			FileInputStream in = new FileInputStream("C:\\Users\\ciclesgs\\Documents\\hola.txt");
			byte[] dades = new byte[1024];
			int llegits = 0;
			while (-1 != (llegits = in.read(dades))) {
			out.write(dades,0,llegits);
			}
			in.close();
			out.close();
			} catch (Exception e) {
				e.getStackTrace();
			}

	}

}
