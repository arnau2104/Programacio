package Exercici6_11;

public class Llibre {
	private String titol;
	private String autor;
	private int nPagines;
	private String genere;
	
	public Llibre(){
		}
	public Llibre (String titol,String autor,int nPagines,String genere) {
		this.titol=titol;
		this.autor=autor;
		this.nPagines=nPagines;
		this.genere=genere;
	}
	
	public String toString() {
		return "Titol: " + titol +
				"\nAutor: " + autor;
	}
	public String getTitol() {
		return titol;
	}
	public void setTitol(String titol) {
		this.titol = titol;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getnPagines() {
		return nPagines;
	}
	public void setnPagines(int nPagines) {
		this.nPagines = nPagines;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	
}
