package Mistermind;

public class Tirada {
	
	char[] combinacioIntentada = new char[4];
	int[] resposta = new int[2];
	int puntuacio;
	
	public Tirada () {
		
	}
	
	public Tirada ( String intent) {
		
	}

	public char[] getCombinacioIntentada() {
		return combinacioIntentada;
	}

	public void setCombinacioIntentada(char[] combinacioIntentada) {
		this.combinacioIntentada = combinacioIntentada;
	}

	public int getResposta0() {
		return resposta[0];
	}
	
	public int getResposta1() {
		return resposta[1];
	}

	public void setResposta0(int resposta) {
		this.resposta[0] = resposta;
	}
	
	public void setResposta1(int resposta) {
		this.resposta[1] = resposta;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

}
