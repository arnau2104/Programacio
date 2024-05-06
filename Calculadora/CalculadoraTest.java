package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSuma() {
		double valorEsperat = 30;
		Calculadora calcu = new Calculadora(20, 10);
		double resultat = calcu.suma();
		assertEquals(valorEsperat, resultat, 0);
	}

	@Test
	void testResta() {
		double valorEsperat = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double resultat = calcu.resta();
		assertEquals(valorEsperat, resultat, 0);
	}

	@Test
	void testMultiplica() {
		double valorEsperat = 200;
		Calculadora calcu = new Calculadora(20, 10);
		double resultat = calcu.multiplica();
		assertEquals(valorEsperat, resultat, 0);
	}

	@Test
	void testDivideix() {
		double valorEsperat = 2;
		Calculadora calcu = new Calculadora(20, 10);
		double resultat = calcu.divideix();
		assertEquals(valorEsperat, resultat, 0);
	}

}
