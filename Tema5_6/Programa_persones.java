package Tema5_6;

public class Programa_persones {

	public static void main(String[] args) {
		
		persona p1, p2, p3;
		
		p1 = new persona();
		p2 = new persona();	
		p3 = new persona();
		
		p1.setNom ("Joan Martínez");
		p1.setDni ("999999999G");
		p1.setEdat (33);
		
		p2.setNom  ("Maria");
		p2.setDni ("88887656D");
		p2.setEdat (15);
		
		p3.setNom  ("Luca");
		p3.setDni ("41796655FD");
		p3.setEdat (26);
		
	
		p1.dades();
		p2.dades();
		p3.dades();
		
	}

}
