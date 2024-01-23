package Tema5_6;

public class CompteBancari {

	private String nomTitular;
	private String dniTitular;
	private double saldo;
	
	public CompteBancari() {
		
	}
	
	public CompteBancari( String dniTitular, String nomTitular, double saldo) {
		this.dniTitular = dniTitular;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
		
	}
	
	public void ingerssar() {
		
	}
	
	public void reintegrar() {
		
	}
	
	public void mostrarsaldo() {
		
	}

	public String getDniTitular() {
		return dniTitular;
	}

	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
}


