package ProgramaMe;

import java.util.Scanner;
public class VerificacioEntrades {
public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	int impar = 0;
	int par = 0;
	int mesAlt = 0;
	int mesBaix = 0;

	int nEntrades = lector.nextInt();
	String[] entrada = new String[nEntrades];

	for (int i = 0; i < nEntrades; i++) {
		entrada[i] = lector.next();
		lector.nextLine();
		for (int j = 0; j < entrada[i].length(); j++) {
			if (entrada[i].charAt(j) % 2 != 0) {
				for (int k = 0; k < entrada[i].length(); k++) {
					mesBaix = entrada[i].charAt(k);
					if (entrada[i].charAt(k) < mesBaix)
						mesAlt = entrada[i].charAt(k);
				}
				impar = entrada[i].charAt(j) * 3 + mesBaix;
			}
			if (entrada[i].charAt(j) % 2 == 0) {
				for (int k = 0; k < entrada[i].length(); k++) {
					mesBaix = entrada[i].charAt((j + k) % entrada[i].length());
					if (entrada[i].charAt(k) > mesAlt) {
						mesAlt = entrada[i].charAt(k);
					}
				}
				par = entrada[i].charAt(j) * 2 + mesAlt;
			}
		}
		System.out.println((impar + par)-336);
	}
}
}