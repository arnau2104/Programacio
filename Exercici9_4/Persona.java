package Exercici9_4;

public class Persona {

	private String nom;
	 private String dni;
	 private int edat;
	
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
				"\nEdat: " + edat + "\n";

		
	}

	public String getDni() {
		return dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
