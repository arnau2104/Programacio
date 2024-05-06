package Examen_Arnau_Marques;

public class InstrumentoMusical {

	private String nombre;
	private String material;
	private int añoFabricacion;
	
	public InstrumentoMusical() {
		
	}
	
	public InstrumentoMusical(String nombre, String material, int añoFabricacion) {
		this.nombre=nombre;
		this.material=material;
		this.añoFabricacion=añoFabricacion;
	}
	
	public String toString() {
		return "Nombre: " + nombre +
				"\nMaterial: " + material +
				"\nAño de fabricacion: " + añoFabricacion;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
