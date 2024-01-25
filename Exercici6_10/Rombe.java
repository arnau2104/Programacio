package Exercici6_10;

public class Rombe extends FiguraGeometrica {
	double midaCostat;
	
	public Rombe() {
		
	}
	
	public Rombe(double x,double y, double midaCostat) {
		super(x,y);
		this.midaCostat=midaCostat;
	}
	
	public  double area() {
		double area;
		area= midaCostat * midaCostat;
		
		return area;
	}
	
	public double perimetre() {
		double perimetre= midaCostat * 2 + midaCostat * 2;
		
		return perimetre;
	}
	
	public String toString() {
		return super.toString() + "\n Mide del costat: " + midaCostat +
									"\nArea: " + area() +
									"\nPerimetre: " + perimetre();
	}
}
