package Exercici6_10;

public class Cercle extends FiguraGeometrica {
	
	double CordenadesCentre;
	double radi;
	
	
	public Cercle() {
		
	}
	
	public Cercle(double x,double y,double CordenadesCentre,double radi) {
		super(x,y);
		this.CordenadesCentre=CordenadesCentre;
		this.radi=radi;
	}
	
	public  double area() {
		
		
		double pi=Math.PI;
		double area=pi * Math.pow(radi, 2);
		
		return area;
	}
	
	public double perimetre() {
		double diametre=radi * 2;
		double pi=Math.PI;
		double perimetre= diametre * pi ;
		
		return perimetre;
	}
	
	public String toString() {
		return super.toString() + "\nCordenades del centre: " + CordenadesCentre + 
									"\nRadi: " + radi +
									"\nArea: " + area() +
									"\nPerimetre: " + perimetre();
	}

}
