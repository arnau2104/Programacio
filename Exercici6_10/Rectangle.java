package Exercici6_10;

public class Rectangle extends FiguraGeometrica {
	
	double midaCostatX;
	double midaCostatY;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double x,double y,double midaCostatX,double midaCostatY) {
		super(x,y);
		this.midaCostatX=midaCostatX;
		this.midaCostatY=midaCostatY;
		
	}
	
	public  double area() {
		double area;
		area= midaCostatX * midaCostatY;
		
		return area;
	}
	
	public double perimetre() {
		double perimetre= midaCostatX * 2 + midaCostatY * 2;
		
		return perimetre;
	}
	
	public String toString() {
		return super.toString() + 	"\nMida del costat X: " + midaCostatX +
									"\nMida del costat Y: " + midaCostatY +
									"\nArea: " + area() +
									"\nPerimetre: " + perimetre();
	}
}
