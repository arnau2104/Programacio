package Exercici8_4;

public class LaMevaExepcio extends Exception {
	private String nom;
	
	public LaMevaExepcio (String xxx) {
		nom = new String (xxx);
	}
	
	public String toString() {
		return "Exception LaMevaExepcio: Error motivat per el valor = " +  nom.toString() + " nom massa llarg";
	}
	

}
