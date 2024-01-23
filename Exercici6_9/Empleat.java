package Exercici6_9;

public abstract class Empleat {
	private String nom;
	private String cognoms;
	private double sou_base;
	private String dni;
	
	public Empleat() {
		
	}
	
	public Empleat(String nom, String cognoms,double sou_base,String dni) {
		this.nom=nom;
		this.cognoms=cognoms;
		this.sou_base=sou_base;
		this.dni=dni;
		
	}
	
	public String toString() {
		return "Nom: " + nom+
				"\nCognoms: " + cognoms +
				"\nSou base: " + sou_base +
				"\nDni: " + dni;
	}

}
