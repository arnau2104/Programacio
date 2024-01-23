package Exercici6_8;

public class TestFigures {

	public static void main(String[] args) {
		/*
		 * Pregunta 1:
		 * No pot compilar el programa, perque la clase Figura es abstracta, per tant no podem crear objectes de tipus Figura
		 * Pregunta 2:
		 * Si, la instruccio es correcte perque l'objecte es de tipus Cercle
		 * Pregunta 3:
		 * El resultat sera el text Dibuixant cercle i Dibuixant rectangle
		 */
		Cercle c = new Cercle();
		c.dibuixar();
		Rectangle r = new Rectangle();
		r.dibuixar();
		Figura f1 = new Cercle();
		Figura f2 = new Rectangle();
		f1.dibuixar();
		f2.dibuixar();

	}

}
