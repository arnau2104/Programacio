package ExamenAnyPasat;

public abstract class Electrodomestic  {
	
	private double pes;
	private double preu;
	private String color;
	
	public Electrodomestic() {
		
	}
	
	public Electrodomestic(double preu, double pes, String color) {
		this.preu=preu;
		this.pes=pes;
		this.color=color;
	}
	
	public String toString() {
		return "Preu: " + preu +
				"\nPes: " + pes + 
				"\nColor: " + color;
	}

	public double getPreu() {
		return preu;
	}
	
	

}
