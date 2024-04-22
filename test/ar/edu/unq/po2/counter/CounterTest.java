package ar.edu.unq.po2.counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

public class CounterTest {
	Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
	@BeforeEach
	public void setUp() {
//Se crea el contador
		counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(2);
		counter.addNumber(3);
		counter.addNumber(4);
		counter.addNumber(5);
		counter.addNumber(6);
		counter.addNumber(7);
		counter.addNumber(8);
		counter.addNumber(9);
		counter.addNumber(10);
		counter.addNumber(11);
		counter.addNumber(12);
		counter.addNumber(13);
		counter.addNumber(14);
		counter.addNumber(15);
		counter.addNumber(16);
		counter.addNumber(17);
		counter.addNumber(18);
		counter.addNumber(19);
	}
	/**
	 * Verifica la cantidad de pares
	*/
	@Test
	public void cantidadDeParesTest() {
		int amount = counter.cantidadDePares();
		assertEquals(amount, 9);
	}
	
	@Test
	public void cantidadDeImparesTest() {
		int amount = counter.cantidadDeImpares();
		assertEquals(amount, 10);
	}
	
	@Test
	public void cantidadDeNumeroMultiploTest() {
		int amount = counter.cantidadMultiplo(4);
		assertEquals(amount, 4);
	}
}
