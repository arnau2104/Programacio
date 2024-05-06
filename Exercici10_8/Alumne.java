package Exercici10_8;

public class Alumne extends Persona {
	String nivellEscolar;
	
	public Alumne() {
		
	}
	
	public Alumne(String nom, String dni, int edat, String nivellEscolar) {
		super(nom,dni,edat);
		this.nivellEscolar = nivellEscolar;
	}
	
	public void mostrarDades() {
		super.mostrarDades();
		System.out.print("Nivell Escolar:");
		System.out.println(this.nivellEscolar);
	}
}
