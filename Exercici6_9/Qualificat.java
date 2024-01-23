package Exercici6_9;

public class Qualificat extends Empleat {
	String titulacio;
	double plus;
	String departament;
	
	public Qualificat() {
		
	}
	
	public Qualificat(String nom, String cognoms,double sou_base,String dni, String titulacio,double plus,String departament) {
	super(nom,cognoms,sou_base,dni);
	this.titulacio=titulacio;
	this.plus=plus;
	this.departament=departament;
	}
	@Override
	public String toString() {
		return super.toString() + "\nTitulacio: " + titulacio + 
								"\nPlus: " + plus + 
								"\nDepartament: " + departament;
	
	}

}
