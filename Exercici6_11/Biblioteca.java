package Exercici6_11;

import java.util.Scanner;

public class Biblioteca {

	static Scanner lector = new Scanner(System.in);
	static LlistaLlibres estanteriaAventura= new LlistaLlibres();
	static int contadorAventura;
	static LlistaLlibres estanteriaTerror;
	static int contadorTerror;
	static LlistaLlibres estanteriaComedia;
	static int contadorComedia;
	public static void main(String[] args) {

		insertarLlibre();
		//eliminarLlibre();
		mostrarDades();
	}

	public static void insertarLlibre() {
		int llibresAfegir;
		System.out.println("Cuants llibres vols afegir?");
		llibresAfegir=lector.nextInt();
		lector.nextLine();

		for(int i=0;i<llibresAfegir;i++) {

			String titol;
			String autor;
			int nPagines;
			String genere;

			System.out.println("Llibre " + i);
			System.out.println("Introdueix el nom del llibre que vols afegir:");
			titol=lector.nextLine();


			System.out.println("Introdueix el autor del llibre que vols afegir:");
			autor=lector.nextLine();


			System.out.println("Introdueix el nombre de pagines que te el llibre que vols afegir:");
			nPagines=lector.nextInt();
			lector.nextLine();


			System.out.println("Introdueix el genere del llibre que vols afegir:");
			genere=lector.nextLine();

			if(genere.equals("Aventura")) {
				estanteriaAventura.insertarLlibre(new Llibre(titol,autor,nPagines,genere)) ;
				contadorAventura++;
			}
			if(genere.equals("Terror")) {
				estanteriaTerror.insertarLlibre(new Llibre(titol,autor,nPagines,genere)) ;
				contadorTerror++;
			}
			if(genere.equals("Comedia")) {
				estanteriaComedia.insertarLlibre(new Llibre(titol,autor,nPagines,genere)) ;
				contadorComedia++;
			}
		}
	}

	public static void eliminarLlibre() {
		int llibresEliminar;
		System.out.println("Cuants llibres vols eliminar?");
		llibresEliminar=lector.nextInt();
		lector.nextLine();

		for (int i=0;i<llibresEliminar;i++) {
			String titolEliminar;
			System.out.println("Quin es el titol del llibre que vols eliminar?");
			titolEliminar=lector.nextLine();

			for (int j=0;j<(contadorAventura + contadorTerror + contadorComedia);j++) {
				if(titolEliminar.equals(estanteriaAventura.llistaLlibre[j].getTitol())) {
					estanteriaAventura.llistaLlibre[j].setTitol(null);
					estanteriaAventura.llistaLlibre[j].setAutor(null);
					estanteriaAventura.llistaLlibre[j].setnPagines(0);
					estanteriaAventura.llistaLlibre[j].setGenere(null);

				}
				if(titolEliminar.equals(estanteriaTerror.llistaLlibre[j].getTitol())) {
					estanteriaTerror.llistaLlibre[j].setTitol(null);
					estanteriaTerror.llistaLlibre[j].setAutor(null);
					estanteriaTerror.llistaLlibre[j].setnPagines(0);
					estanteriaTerror.llistaLlibre[j].setGenere(null);

				}
				if(titolEliminar.equals(estanteriaComedia.llistaLlibre[j].getTitol())) {
					estanteriaComedia.llistaLlibre[j].setTitol(null);
					estanteriaComedia.llistaLlibre[j].setAutor(null);
					estanteriaComedia.llistaLlibre[j].setnPagines(0);
					estanteriaComedia.llistaLlibre[j].setGenere(null);
					
				}
			}
		}
	}

	public static void mostrarDades() {
		System.out.println(estanteriaAventura.llistaLlibre.toString());
	}

}
