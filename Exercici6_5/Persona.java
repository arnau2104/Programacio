package Exercici6_5;

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
	
	public void mostrarDades() {
		
		System.out.print("Nom:");
		System.out.println(this.nom);
		System.out.print("DNI:");
		System.out.println(this.dni);
		System.out.print("Edat:");
		System.out.println(this.edat);
		
	}
	
	
}
