
public class Puntuacio {

	private String nom;
	private String cognoms;
	private double punts;
	private String data;

	public Puntuacio() {

	}

	public Puntuacio (String nom, String cognoms, double punts, String data) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.punts = punts;
		this.data = data;
	}

	public String toString() {
		return "Nom: " + nom +
				"\nCognoms: " + cognoms + 
				"\nPunts: " + punts +
				"\nData: " + data;
	}

	public String getNom() {
		return nom;
	}

	public String getCognoms() {
		return cognoms;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setPunts(double punts) {
		this.punts = punts;
	}

	public String getData() {
		return data;
	}

	public double getPunts() {

		return punts;
	}



}
