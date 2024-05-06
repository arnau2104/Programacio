package Exercici9_2;

public class Alumne extends Persona {
	String nivellEscolar;
	
	public Alumne() {
		
	}
	
	public Alumne(String nom, String dni, int edat, String nivellEscolar) {
		super(nom,dni,edat);
		this.nivellEscolar = nivellEscolar;
	}
	
	public String  toString() {
		return super.toString() + "\nNivell Escolar: " + nivellEscolar;
		
	}

}
