package Exercici8_4;

public class Exercici8_4 {

	public static void main(String[] args) {
		try {
			provocoExcepcio("arnau");
			provocoExcepcio("Maricarmen");
		} catch (LaMevaExepcio e) {
			
			e.printStackTrace();
		}
		System.out.println("Programa finalitzar correctament");

	}
	
	public static void provocoExcepcio(String nom) throws LaMevaExepcio {
		System.out.println ("Nom: " + nom);
		if (nom.length() > 5) throw new LaMevaExepcio (nom);
		System.out.println ("No s'ha provocat l'excepció.");
		}

}
