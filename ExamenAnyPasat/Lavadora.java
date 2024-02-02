package ExamenAnyPasat;

public class Lavadora  extends Electrodomestic implements enReparacion  {
	
	double capacitatCarga;
	
	
	public Lavadora() {
		
	}
	
	public Lavadora(double preu, double pes, String color,double capacitatCarga) {
		super(preu,pes,color);
		this.capacitatCarga=capacitatCarga;
	}
	
	public double reparar(double horesReparant) {
	
		
		double preuReparacio= horesReparant * preu_hora;
		
		return preuReparacio;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nCapacitat de carga:  " + capacitatCarga;
	}
}
