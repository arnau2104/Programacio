package Exercici6_11;

public class LlistaLlibres {

	Llibre[] llistaLlibre =new Llibre[100];
	int contadorLlibres;


	public  void insertarLlibre(Llibre llibre) {
		llistaLlibre[contadorLlibres]= llibre;
		contadorLlibres++;
	}

	public void eliminarLlibre(Llibre llibre) {
		llistaLlibre[contadorLlibres]= llibre;
		contadorLlibres--;
	}
	
	public void mostrarDades() {
	System.out.println("Llista de llibres");	 for(int i=0;i<contadorLlibres;i++) {
			llistaLlibre[i].getTitol();
			llistaLlibre[i].getAutor();	
			llistaLlibre[i].getnPagines();
			llistaLlibre[i].getGenere();
		}
	}

	public String toString() {
		return "Llista de llibres" + mostrarDades();
		
	}
}

