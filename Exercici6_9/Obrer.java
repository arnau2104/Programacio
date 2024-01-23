package Exercici6_9;

public class Obrer extends Empleat {
	
	String desti;
	int horesExtra;
	double preuHoresExtra;
	
	public Obrer() {
		
	}
	
	public Obrer(String nom, String cognoms,double sou_base,String dni,String desti,int horesExtra,double preuHoresExtra) {
		super(nom,cognoms,sou_base,dni);
		this.desti = desti;
		this.horesExtra=horesExtra;
		this.preuHoresExtra=preuHoresExtra;
	}
	@Override
	public String toString() {
		return super.toString() + "Desti: " + desti +
								"\nHores extra: " + horesExtra + 
								"\nPreu de les hores extra: " + preuHoresExtra;
	}

}
