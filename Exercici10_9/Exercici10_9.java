package Exercici10_9;

import java.io.File;
import java.io.RandomAccessFile;

public class Exercici10_9 {

	public static void main(String[] args) {
		try {
			File f = new File ("nombres.txt");

			int[] valorsInt = {1,2,3,4,5,6,7,8,9,10};
			double[] valorsDouble = {11.5,17.3,19.5,4.1,6.6,8.98};

			RandomAccessFile file = new RandomAccessFile(f, "rw");
			for(int i = 0; i < valorsInt.length; i++) {
				file.writeInt(valorsInt[i]);
			}
			for(int i = 0; i < valorsDouble.length; i++) {
				file.writeDouble(valorsDouble[i]);
			}
			file.seek(15);
			
			byte caracter = file.readByte();
			 
			   System.out.println(caracter);
			 file.close();
			

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}