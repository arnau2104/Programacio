package Exercici6_10;

public class Quadrat extends FiguraGeometrica {
	double midaCostat;
	
	public Quadrat() {
		
	}
	
	public Quadrat(double x,double y, double midaCostat) {
		super(x,y);
		
		this.midaCostat=midaCostat;
	}
	
	public String toString() {
		return super.toString() + "\n Mide del costat: " + midaCostat;	
	}
}
