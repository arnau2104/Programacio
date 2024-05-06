package Exercici9_8;

public class Persona {

	 String nom;
	 String dni;
	 int edat;
	
	public Persona () {
		
	}
	
	public Persona ( String nom, String dni, int edat) {
		this.nom = nom;
		this.dni = dni;
		this.edat = edat;
		
		
	}
	
	public String  toString() {
		return "Nom:" + nom +
				"\nDNI:" + dni +
				"\nEdat: " + edat;

		
	}
	public String getNom() {
		return nom;
	}
	
	
}
