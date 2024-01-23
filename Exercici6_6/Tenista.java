package Exercici6_6;

public class Tenista extends Deportista {
	String ma_bona;
	public Tenista() {

	}

	public Tenista (String nom,String deport, String nacionalitat, String ma_bona) {
		super(nom,deport,nacionalitat);
		this.ma_bona=ma_bona;

	}
	
	public void mostrarDades() {
		super.mostrarDades();
		System.out.println("Ma bona:");
		System.out.println(this.ma_bona);
	}

}
