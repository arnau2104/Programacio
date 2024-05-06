package Ex6_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Institut {

	static Scanner lector = new Scanner(System.in);
	static int nPersones=0;
	static int menu;
	//static Persona[] persones = new Persona[100];
	static ArrayList<Persona> persona = new ArrayList<>();
	
	public static void main(String[] args) {
		try {
		do {
			
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
			case 4:
				break;
			default:
				System.out.println("Introdueix un valor valid(1-4)");
				break;
			}
			
			escriureObjectesAFitxer();
			
		}while(menu!=4);
		System.out.println("Adeu");
			
		}catch (Exception e) {
			e.printStackTrace();
		}

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
		//nPersones++;
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
		//nPersones++;
		
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
	
	public static void escriureObjectesAFitxer() {
		try {
		Persona m = new Persona();
		File f = new File("Registre Alumnes i Profesors.txt");
	
		ObjectOutputStream oos = new ObjectOutputStream (new
		FileOutputStream(f));
		oos.writeObject(m);
		
		

		
		ObjectInputStream ois = new ObjectInputStream (new
		FileInputStream(f));
		Persona p = (Persona)ois.readObject();
		ois.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
