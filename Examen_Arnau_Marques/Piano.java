package Examen_Arnau_Marques;

public class Piano extends InstrumentoMusical implements Tocable,Afinable {

	boolean esPianoDeCola;

	public Piano() {

	}

	public Piano(String nombre, String material, int añoFabricacion, boolean esPianoDeCola) {
		super(nombre,material,añoFabricacion);
		this.esPianoDeCola=esPianoDeCola;
	}

	public String tocar(String nombre) {

		return "Tocando el piano " + nombre;

	}
	
public String afinar(String nombre) {
		
		return "Afinando el piano " + nombre;
	}

	public String toString() {
		return super.toString() + 
				"\nEs piano de cola: " + esPianoDeCola;
	}

}
