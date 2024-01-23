package Exercici6_5;

public class Professor extends Persona {
	String assignaturaDonada;

	public Professor() {

	}

	public Professor(String nom, String dni, int edat,String assignaturaDonada) {
		super(nom,dni,edat);
		this.assignaturaDonada = assignaturaDonada;
	}

	public void mostrarDades() {
		super.mostrarDades();
		System.out.print("Assignatura Donada:");
		System.out.println(this.assignaturaDonada);

	}

}
