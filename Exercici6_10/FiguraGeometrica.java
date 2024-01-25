package Exercici6_10;

public class FiguraGeometrica {
	
	private double x;
	private double y;
	
	public FiguraGeometrica() {
		
	}
	
	public FiguraGeometrica(double x,double y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "X: " + x +
				"\nY: " + y;
	}
}
