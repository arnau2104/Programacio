package Mistermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Partida {

	String nom;
	char[] colors = {'R','B','G','M','Y','C'};
	Boolean guanyat = false;
	String combinacio="";
	ArrayList<Tirada> tirades = new ArrayList<Tirada>();
	int puntuacioTotal;
	
	public Partida() {
		
	}
	
	public Partida (String nom) {
		this.nom=nom;
		
		combinacioSecreta();
		
	}
	
	public void combinacioSecreta() {
		
		Random random= new Random();
				
		for(int i=0;i<4;i++) {
			combinacio+=colors[random.nextInt(6)];
		}
		
	}
	
	public void   comprovar (String intent, Tirada tirada) {
		
		int correctes =0;
		for (int i=0; i<4;i++) {
			int contCorrectes = tirada.getResposta0();
			if (intent.charAt(i)== combinacio.charAt(i)) {
				tirada.setResposta0( tirada.getResposta0() + 1);
				correctes++;
				
			}else {
				if(combinacio.contains(String.valueOf(intent.charAt(i))) && contCorrectes == tirada.getResposta0())  {
					tirada.setResposta1( tirada.getResposta1() + 1);
				}
				
				
			}
		}
		
		tirada.setPuntuacio(tirada.getResposta0() * 2 + tirada.getResposta1() * 1);
		
		puntuacioTotal = puntuacioTotal + tirada.getPuntuacio();
		
		
		if(correctes==4) {
			System.out.println("Enhorabona has endevinat la combinacio");
			guanyat = true;
		}else {
			System.out.println("Tens " + tirada.getResposta0() + " colors en el lloc correcte" );
			System.out.println("Tens " + tirada.getResposta1() + " colors mal colocats");
		}
	
	}

	public String getCombinacio() {
		return combinacio;
	}

	public Boolean getGuanyat() {
		return guanyat;
	}

	public int getPuntuacioTotal() {
		return puntuacioTotal;
	}

	public void setPuntuacioTotal(int puntuacioTotal) {
		this.puntuacioTotal = puntuacioTotal;
	}

	public String getNom() {
		return nom;
	}


	

	
	
}
