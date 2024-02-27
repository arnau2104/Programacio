package Examen_Arnau_Marques;

public class Guitarra extends InstrumentoMusical implements Tocable,Afinable,Transportable {
	
	int numeroCuerdas;
	
	public Guitarra() {
		
	}
	
	public Guitarra(String nombre, String material, int añoFabricacion, int numeroCuerdas) {
		super(nombre,material,añoFabricacion);
		this.numeroCuerdas=numeroCuerdas;
	}
	
	public String tocar(String nombre) {
		
		return "Tocando la guitarra " + nombre;
		
	}
	
	public String afinar(String nombre) {
		
		return "Afinando la guitarra " + nombre;
	}
	
	public String empaquetar(String nombre) {
		
		return "Empaquetando la guitarra " + nombre;
	}
	
public String desempaquetar(String nombre) {
		
		return "Desempaquetando la guitarra " + nombre;
	}
	
	public String toString() {
		return super.toString() + 
				"\nNumero de cuerdas: " + numeroCuerdas;
	}
	
	
	

}
