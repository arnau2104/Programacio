package Exercici9_2;

public class Professor extends Persona {
	String assignaturaDonada;

	public Professor() {

	}

	public Professor(String nom, String dni, int edat,String assignaturaDonada) {
		super(nom,dni,edat);
		this.assignaturaDonada = assignaturaDonada;
	}

	public String toString() {
		return super.toString() + "\nAssignatura donada: " + assignaturaDonada;

	}

}
