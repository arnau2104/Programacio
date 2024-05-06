package Exercici10_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

public class Institut {

	static Scanner lector = new Scanner(System.in);
	static int nPersones=0;
	static int menu;
	//static Persona[] persones = new Persona[100];
	static Vector<Persona> persona = new Vector<>();
	static File f = new File ("Registre de Alumnes i Profesors.txt");
	public static void main(String[] args) {
		try {
		do {
			if (!persona.isEmpty()) {
			ObjectInputStream ois = new ObjectInputStream (new
					FileInputStream(f));
					persona = (Vector)ois.readObject();
					ois.close();
			}
			
			System.out.println("(1)Crear un alumne");
			System.out.println("(2)Crear un professor");
			System.out.println("(3)Mostrar llista d'alumnes i professors");
			System.out.println("(4)Sortir");
			menu=lector.nextInt();
			lector.nextLine();
			
			switch (menu) {
			case 1:
				nouAlumne();
				break;
			case 2:
				nouProfessor();
				break;
			case 3:
				mostrarInformacio();
				break;
			case 4: break;
			default:
				System.out.println("Introdueix un valor valid(1-4)");
				break;
			}
			
			ObjectOutputStream oos = new ObjectOutputStream (new
					FileOutputStream(f));
					oos.writeObject(persona);
					oos.close();
			
		}while(menu!=4);
			

		}catch (Exception e ) {
			e.printStackTrace();
		}			
		
		System.out.println("Adeu");
	


	}
	
	public static void nouAlumne() {
		
		 String nom;
		 String dni;
		 int edat;
		 String nivellEscolar;
		
		System.out.println("Introdueix les dades de l'alumne:");
		System.out.println("Nom:");
		nom = lector.next();
		lector.nextLine();
		System.out.println("Dni:");
		dni = lector.next();
		lector.nextLine();
		System.out.println("Edat:");
		edat = lector.nextInt();
		lector.nextLine();
		System.out.println("Nivell escolar:");
		nivellEscolar = lector.next();
		lector.nextLine();
		
		persona.add(new Alumne(nom,dni,edat,nivellEscolar));
		
	}
	
	public static void nouProfessor() {
		
		 String nom;
		 String dni;
		 int edat;
		 String assignaturaDonada;
		
		System.out.println("Introdueix les dades del professor:");
		System.out.println("Nom:");
		nom = lector.next();
		lector.nextLine();
		System.out.println("Dni:");
		dni = lector.next();
		lector.nextLine();
		System.out.println("Edat:");
		edat = lector.nextInt();
		lector.nextLine();
		System.out.println("Assignatura donada:");
		assignaturaDonada = lector.next();
		lector.nextLine();
		
		persona.add(new Professor(nom,dni,edat,assignaturaDonada));
		
		
	}
	
	public static  void mostrarInformacio() {
		
		for(Persona p : persona) {
			if(p instanceof Alumne) {
				((Alumne)p).mostrarDades();
				System.out.println("------------------------------");
			}else if(p instanceof Professor) {
				((Professor)p).mostrarDades();
				System.out.println("------------------------------");
			}
			
			
			
			
			
		}
		
	}
	

}
