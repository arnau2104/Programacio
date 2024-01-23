package Exercici6_6;

public class Futbolista extends Deportista {
	String posicio;
	public Futbolista() {
		
	}
	
	public Futbolista (String nom,String deport, String nacionalitat, String posicio) {
		super(nom,deport,nacionalitat);
		this.posicio=posicio;
	}
	
	public void mostrarDades() {
		super.mostrarDades();
		System.out.println("Posicio:");
		System.out.println(this.posicio);
	}

}
