package Tema5_6;

public class persona {

	private String nom;
	private String dni;
	private short edat;
	
	

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = (short) edat;
	}

	public String getNom() {
		return nom;
	}

	public String getDni() {
		return dni;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public  void nedar() {
		System.out.println("Som " + this.nom + " i estic nedant");
	}
	
	public void dades() {
		System.out.println("Visualitzacio de dades de la persona");
		System.out.println("Dni............: " + this.dni);
		System.out.println("Nom............: " + this.nom);
		System.out.println("Edat...........: " + this.edat);
	}
	
}
