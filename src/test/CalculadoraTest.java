package test;

import pkg.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}
	
	@Test
	void testSuma() {
		int valorEsperado = 3;
		int valorReal = Calculadora.suma(1,2);
		assertEquals(valorEsperado, valorReal);
	
	}
	
	@Test
	void testResta() {
		int valorEsperado = 3;
		int valorReal = Calculadora.resta(4,1);
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testMultiplica() {
		int valorEsperado = 3;
		int valorReal = Calculadora.multiplica(1,3);
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testDivide() {
		int valorEsperado = 3;
		int valorReal = Calculadora.divide(6,2);
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testDivideCero() {
		int valorEsperado = -1;
		int valorReal = Calculadora.divide(6,0);
		assertEquals(valorEsperado, valorReal);
	}
	
	

}
