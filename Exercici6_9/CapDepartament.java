package Exercici6_9;

public class CapDepartament extends Qualificat {
	String treballadorsACarrec;
	String projectes;
	double plus_capDepartament;
	
	public CapDepartament() {
		
	}
	
	public CapDepartament(String nom, String cognoms,double sou_base,String dni, String titulacio,double plus,String departament, String treballadorsACarrec,String projectes, double plus_capDepartament) {
		super(nom,cognoms,sou_base,dni,titulacio,plus,departament);
		this.treballadorsACarrec = treballadorsACarrec;
		this.projectes = projectes;
		this.plus_capDepartament = plus_capDepartament;
	}
	@Override
	public String toString() {
		return super.toString() + "Treballadors a carrec: " + treballadorsACarrec +
								"\nProjectes: " + projectes +
								"\nPlus de cap de departament: " + plus_capDepartament;
	}

}
