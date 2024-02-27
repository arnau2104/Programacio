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
	

}
