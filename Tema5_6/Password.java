package Tema5_6;

import java.util.Random;

public class Password {
	Random random = new Random();
	private String password="";
	private int longitud =0;
	private boolean robust=false;
	
	
	public Password() {
		longitud = 8;
		int contador =0;
		int[] pswAleatori= new int [this.longitud];


		for (int i =0; i<longitud;i++) {
			pswAleatori[i]=random.nextInt((126 - 48)+1)+48;
			char caracter = (char)pswAleatori[i];
			password = password + caracter;

		}
		
		
	

	}
	
	public Password (int longitud) {
		
		this.password = password;
		
		int[] pswAleatori= new int [longitud];
		
		for (int i =0; i<longitud;i++) {
			pswAleatori[i]=random.nextInt((126 - 48)+1)+48;
			char caracter = (char)pswAleatori[i];
			password = password + caracter;

		}
	
		
		
	}
	
	
	public void robust() {
		this.longitud = longitud;
		boolean minuscula = false;
		boolean majuscula = false;
		boolean nombre = false;
		boolean simbol = false;
		boolean robust =false;
		
		for (int i =0; i<longitud;i++) {
			password.charAt(i);
			if (password.charAt(i) >= 'a' && password.charAt(i)<='z') {
				minuscula = true;
			}
			
			if (password.charAt(i) >= 'A' && password.charAt(i)<='Z') {
				majuscula = true;
			}
			
			if (password.charAt(i) >= '0' && password.charAt(i)<='9') {
				nombre = true;
			}
			
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				 simbol= true;
			}
		}
		
		if (minuscula == true && majuscula == true && nombre == true && simbol==true) {
			robust=true;
			
		}else {
			System.out.println( " La contrasenya no es robusta!");
		}
			
		
	}
		
	public String getPassword() {
		return password;
	}
	

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public boolean isRobust() {
		return robust;
	}

	
	
	
	
	
}
