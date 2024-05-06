package ExamenPassat_tema8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import javax.xml.crypto.Data;

public class Persona {

	private String dni;
	private String nombre;
	private int edad;
	LocalDate diaAtencion; 
	LocalTime horaAtencion;
	boolean servidoCorrectamente;
	
	public Persona() {
		
	}
	
	public Persona(String dni,String nombre,int edad) {
		this.dni = dni;
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public void Atender(LocalDate diaAtencion, 
	LocalTime horaAtencion,
	boolean servidoCorrectamente) {
		
		this.diaAtencion = diaAtencion;
		this.horaAtencion = horaAtencion;
		this.servidoCorrectamente = servidoCorrectamente;
		
		int contadorAtender = 0;
		contadorAtender++;
					
		}
		
	public String verAtender() {
		return "Dni: " + dni +
				"\nEdad: " + edad +
				"\nNombre: " + nombre +
				"\nDia de atencion: " + diaAtencion +
				"\nHora Atencion: " + horaAtencion +
				"\nServido correctamente: " + servidoCorrectamente;
		}
	
	
	public String toString() {
		return "Dni: " + dni +
				"\nEdad: " + edad +
				"\nNombre: " + nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isServidoCorrectamente() {
		return servidoCorrectamente;
	}
	
	

	
	
}
