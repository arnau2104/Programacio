package Exercici6_6;

public class Deportista {

	String nom;
	String deport;
	String nacionalitat;
	
	public Deportista () {
		
	}
	
	public Deportista (String nom,String deport, String nacionalitat) {
		this.nom=nom;
		this.deport=deport;
		this.nacionalitat=nacionalitat;
	}
	
public void mostrarDades() {
		
		System.out.print("Nom:");
		System.out.println(this.nom);
		System.out.print("deport:");
		System.out.println(this.deport);
		System.out.print("Nacionalitat:");
		System.out.println(this.nacionalitat);
		
	}
	
}
