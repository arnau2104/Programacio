package Examen_Arnau_Marques;

import java.util.Scanner;

public class ProgramaInstrumentos {

	static Scanner lector = new Scanner(System.in);
	static int menu;
	static InstrumentoMusical[] instrumento = new InstrumentoMusical [100]; //hago el array de tipo InstrumentoMusical porque asi con un solo array puedo tener todos instrumentos
	static int contador;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("(1)Crear guitarra" +
								"\n(2)Crear piano" +
								"\n(3)Mostrar instrumentos" +
								"\n(4)Tocar un instrumento" +
								"\n(5)Afinar un instrumento" +
								"\n(6)Transportar un instrumento" + 
								"\n(7)Salir");
			menu=lector.nextInt();
			lector.nextLine();
			
			switch(menu) {
			case 1: crearGuitarra();
					break;
			case 2: crearPiano();
					break;
			case 3: mostrarInstrumentos();
					break;
			case 4: tocarInstrumento();
					break;
			case 5: afinarInstrumento();
					break;
			case 6: transportarInstrumento();
					break;
			case 7: break;
			default: System.out.println("Introduce una opcion valida (1-7)");
			// pongo el default poque en caso de que ponga un nomero de los que no salen arriba le enseñe el mensage que he puesto
			
			}
			
		}while(menu!=7);
		//le digo que me haga el bucle mientras no seleccione la opcion 7 del menu
		
		System.out.println("Adios...");

	}

	private static void crearGuitarra() {
		 String nombre;
		 String material;
		 int añoFabricacion;
		 int numeroCuerdas;
		 
		 System.out.println("Introduce el nombre de la guitarra");
		 nombre=lector.nextLine();
		 
		 System.out.println("Introduce el material del que esta hecha la guitarra:");
		 material=lector.nextLine();
		 
		 System.out.println("Introduce el año de fabricacion de la guitarra:");
		 añoFabricacion=lector.nextInt();
		 lector.nextLine();
		 
		 System.out.println("Introduce el numero de cuerdas que tiene la guitarra");
		 numeroCuerdas=lector.nextInt();
		 lector.nextLine();
		 
		 //cojo el array de tipo InstrumentoMusical y creo un objeto de tipo guitarra
		 instrumento[contador]=new Guitarra (nombre,material,añoFabricacion,numeroCuerdas);
		 contador++;
		 
		 	
	}

	private static void crearPiano() {
		 String nombre;
		 String material;
		 int añoFabricacion;
		 boolean esPianoDeCola;
		 
		 System.out.println("Introduce el nombre del piano");
		 nombre=lector.nextLine();
		 
		 System.out.println("Introduce el material del que esta hecho el piano:");
		 material=lector.nextLine();
		 
		 System.out.println("Introduce el año de fabricacion del piano:");
		 añoFabricacion=lector.nextInt();
		 lector.nextLine();
		 
		 System.out.println("Introduce si es un piano de cola");
		 esPianoDeCola=lector.nextBoolean();
		 lector.nextLine();
		 
		 //cojo el array de tipo InstrumentoMusical y creo un objeto de tipo piano
		 instrumento[contador]=new Piano (nombre,material,añoFabricacion,esPianoDeCola);
		 contador++;
		
	}

	private static void mostrarInstrumentos() {
		System.out.println("Guitarras:");
		for(int i=0; i<contador;i++) {
			if(instrumento[i] instanceof Guitarra) {
				System.out.println(((Guitarra)instrumento[i]).toString());
				System.out.println("------------------------------");
			}
		}
		
		System.out.println("Pianos:");
		for(int i=0; i<contador;i++) {
			if(instrumento[i] instanceof Piano) {
				System.out.println(((Piano)instrumento[i]).toString());
				System.out.println("------------------------------");
			}
		}
		//hago los if para que me muestro los tipos de instrumento por separado
		
	}

	private static void tocarInstrumento() {
		int incremento=0;
		int id=0;
		
		
		System.out.println("Que instrumento quieres tocar:");
		for(int i=0;i<contador;i++) {
			System.out.println("id=" + incremento +" " +((InstrumentoMusical)instrumento[i]).getNombre());
			incremento++;
			// Le pongo un id para que pueda teclear el numero de instrumento que es para cuadrar con el array
		}
		id=lector.nextInt();
		lector.nextLine();
		String nombre = instrumento[id].getNombre();
		
		if(instrumento[id] instanceof Guitarra) {
			
			System.out.println(((Guitarra)instrumento[id]).tocar(nombre));
		}
		
		if(instrumento[id] instanceof Piano) {
			System.out.println(((Piano)instrumento[id]).tocar(nombre));
		}
		
		// con los if identifico de que tipo de objeto se trata para enseñar el mensaje correctamente
		
		
		
	}

	private static void afinarInstrumento() {
		int incremento=0;
		int id=0;
		
		
		System.out.println("Que instrumento quieres afinar:");
		for(int i=0;i<contador;i++) {
			System.out.println("id=" + incremento +" " +((InstrumentoMusical)instrumento[i]).getNombre());
			incremento++;
			// Le pongo un id para que pueda teclear el numero de instrumento que es para cuadrar con el array
		}
		id=lector.nextInt();
		lector.nextLine();
		String nombre = instrumento[id].getNombre();
		
		if(instrumento[id] instanceof Guitarra) {
			
			System.out.println(((Guitarra)instrumento[id]).afinar(nombre));
		}
		
		if(instrumento[id] instanceof Piano) {
			System.out.println(((Piano)instrumento[id]).afinar(nombre));
		}
		// con los if identifico de que tipo de objeto se trata para enseñar el mensaje correctamente
	}

	private static void transportarInstrumento() {
	
		int opcion;
		int incremento=0;
		int id=0;
		
		
		System.out.println("Que guitarra quieres transportar:");
		for(int i=0;i<contador;i++) {
			if(instrumento[i] instanceof Guitarra) {
			System.out.println("id=" + incremento +" " +((InstrumentoMusical)instrumento[i]).getNombre());
			incremento++;
			}
			// Le pongo un id para que pueda teclear el numero de instrumento que es para cuadrar con el array i hago el if para que solo muestre las guitarras
		}
		id=lector.nextInt();
		lector.nextLine();
		String nombre = instrumento[id].getNombre();
		
		//hago este if porque en caso de que la opcion que seleccione no sea una guitarra le enseñe el mensage quehe puesto abajo
		if(instrumento[id] instanceof Guitarra) {
		
		System.out.println("Que quieres hacer:" + 
							"\n(1)Empaquetar" +
							"\n(2)Desempaquetar");
		opcion=lector.nextInt();
		lector.nextLine();
		
		if(opcion == 1) {
			System.out.println(((Guitarra)instrumento[id]).empaquetar(nombre));	
			
		}else if (opcion==2) {
			System.out.println(((Guitarra)instrumento[id]).desempaquetar(nombre));	
		}else {
			System.out.println("Introduce una opcion valida");
		}
		
		}else {
			System.out.println("Introduce una opcion valida");
		}
	}

}
