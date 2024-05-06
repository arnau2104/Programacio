package Exercici_E5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.HashMap;

public class Exercici_E5 {

	public static void main(String[] args) {
		try  {
			File f = new File("temperatures.txt");
			HashMap<String,Double> mitjaMesos = new HashMap<>();

			BufferedReader br = new BufferedReader (new FileReader(f));
			String linia = "";
			String mesos ="";
			String[] temperatures = new String[linia.length()];
			mesos = br.readLine();
			String[] mes = mesos.split(",");
			for(int i = 0; i< mes.length;i++) {
				mitjaMesos.put(mes[i], null);
			}
			int numLinia =0;
			while (  (linia = br.readLine())!= null) {
				numLinia++;
				temperatures = linia.split(",");
				for (int j =0;j<temperatures.length;j++) {
				Double temperatura = Double.parseDouble(temperatures[j]);
				if(numLinia==1) {
				mitjaMesos.put(mes[j],temperatura);	
					}else {
						double valorAntic=mitjaMesos.get(mes[j]);
						mitjaMesos.put(mes[j],  valorAntic+ temperatura);
					}
												
				}
				
			}
			double factor = Math.pow(10, 1);
			for(String m : mitjaMesos.keySet()) {
				mitjaMesos.put(m,  Math.round((mitjaMesos.get(m) / numLinia) * factor)/ factor  );
			}
			
			br.close();
			
			System.out.println(mitjaMesos);
			
			
			

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
