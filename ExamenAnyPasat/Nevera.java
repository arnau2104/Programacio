package ExamenAnyPasat;

public class Nevera extends Electrodomestic implements enReparacion {
	double temperaturaInterna;
	
	public Nevera() {
		
	}
	
	public Nevera (double preu, double pes, String color,double temperaturaInterna) {
		super(preu,pes,color);
		this.temperaturaInterna=temperaturaInterna;
	}
	
	public double reparar(double horesReparant) {
		
		
		double preuReparacio= horesReparant * preu_hora;
		
		return preuReparacio;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nTemperatura interna:  " + temperaturaInterna;
	}
	
	
}
