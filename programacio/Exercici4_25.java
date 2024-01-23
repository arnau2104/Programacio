package programacio;

import java.util.Scanner;

public class Exercici4_25 {

    static String text;
    static String[] lletres;
    
    public static void main(String[] args) {
        llegirText();
        lletraMesSurt();
        contarLletra();
    }

    public static void llegirText() {
        Scanner lector = new Scanner(System.in);
        System.out.println("introdueix un text");
        text = lector.nextLine();
        lletres = new String[text.length()]; 
    }

    public static void lletraMesSurt() {
        int i = 0;
        int f = 0;
        while (i < text.length()) {
            lletres[i] = text.charAt(i) + "";
            f++;
            i++;
        }
        
        for (int j = 0; j < text.length(); j++) {
            System.out.println(lletres[j]);
        }
    }

    public static void contarLletra() {
        String contador="";
    	int i=0;
    	while(i<text.length()) {
    		for(int j=0; j<text.length();j++) 
    		if(text.charAt(i)==lletres[j].charAt(0)) {
    			contador=text.charAt(i) + contador;
    			System.out.println(contador);
    		}
    		i++;
    	}
    }
}
