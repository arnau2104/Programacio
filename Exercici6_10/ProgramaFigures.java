package Exercici6_10;

import java.util.Scanner;

public class ProgramaFigures {

	static Scanner lector = new Scanner(System.in);
	static int menu;
	static Quadrat[] quadrat = new Quadrat[100];
	static int contadorQuadrat;
	static Rectangle[] rectangle = new Rectangle[100];
	static int contadorRectangle;
	static Rombe[] rombe = new Rombe[100];
	static int contadorRombe;
	static Cercle[] cercle = new Cercle[100];
	static int contadorCercle;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("(1)Nou quadrat");
			System.out.println("(2)Nou rectangle");
			System.out.println("(3)Nou rombe");
			System.out.println("(4)Nou cercle");
			System.out.println("(5)Mostrar les dades");
			System.out.println("(6)Sortir");
			menu=lector.nextInt();
			lector.nextLine();
			switch(menu) {
			case 1: nouQuadrat();
					break;
			case 2: nouRectangle();
					break;
			case 3: nouRombe();
					break;
			case 4: nouCercle();
					break;
			case 5: mostrarDades();
					break;
			case 6: break;
			default: System.out.println("Introdueix una opcio correcte(1-6)");
			}
			
		}while(menu!=6);
		
		System.out.println("Adeu...");

	}

	private static void nouQuadrat() {
		double midaCostat;
		double x;
		double y;
		
		System.out.println("Introdueix les cordenades de X: ");
		x=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix les cordenades de Y: ");
		y=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix la mida del costat: ");
		midaCostat=lector.nextDouble();
		lector.nextLine();
		
		quadrat[contadorQuadrat]=new Quadrat( x, y,midaCostat);
		contadorQuadrat++;
	}

	private static void nouRectangle() {
		double midaCostatX;
		double midaCostatY;
		double x;
		double y;
		
		System.out.println("Introdueix les cordenades de X: ");
		x=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix les cordenades de Y: ");
		y=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix la mida del costat X : ");
		midaCostatX=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix la mida del costat Y : ");
		midaCostatY=lector.nextDouble();
		lector.nextLine();
		
		rectangle[contadorRectangle]=new Rectangle( x, y,midaCostatX,midaCostatY);
		contadorRectangle++;
		
	}
 
	private static void nouRombe() {	
		double midaCostat;
		double x;
		double y;
		
		System.out.println("Introdueix les cordenades de X: ");
		x=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix les cordenades de Y: ");
		y=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix la mida del costat: ");
		midaCostat=lector.nextDouble();
		lector.nextLine();
		
		rombe[contadorRombe]=new Rombe( x, y,midaCostat);
		contadorRombe++;
	}

	private static void nouCercle() {
		double CordenadesCentre;
		double radi;
		double x;
		double y;
		
		System.out.println("Introdueix les cordenades de X: ");
		x=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix les cordenades de Y: ");
		y=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix les coordenades del centre: ");
		CordenadesCentre=lector.nextDouble();
		lector.nextLine();
		
		System.out.println("Introdueix el radi: ");
		radi=lector.nextDouble();
		lector.nextLine();
		
		cercle[contadorCercle]=new Cercle( x, y,CordenadesCentre,radi);
		contadorCercle++;
		
	}

	private static void mostrarDades() {
	
		System.out.println("Quadrats:");
		for(int i=0; i<contadorQuadrat;i++) {
			if(quadrat[i]!=null) {
				System.out.println(quadrat[i].toString());
				System.out.println("---------------------");
			}
		}
		
		System.out.println("Rectangles:");
		for(int i=0; i<contadorRectangle;i++) {
			if(rectangle[i]!=null) {
				System.out.println(rectangle[i].toString());
				System.out.println("---------------------");
			}
		}
		
		System.out.println("Rombes:");
		for(int i=0; i<contadorRombe;i++) {
			if(rombe[i]!=null) {
				System.out.println(rombe[i].toString());
				System.out.println("---------------------");
			}
			
		}
		
		System.out.println("Cercles:");
		for(int i=0; i<contadorCercle;i++) {
			if(cercle[i]!=null) {
				System.out.println(cercle[i].toString());
				System.out.println("---------------------");
			}
		}
		
	}

}
