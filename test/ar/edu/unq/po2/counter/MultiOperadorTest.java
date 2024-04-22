package ar.edu.unq.po2.counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperadorTest {
	MultiOperador multOp;
	
	@BeforeEach
	public void setUp() {
		multOp = new MultiOperador();
		multOp.agregarNumero(1);
		multOp.agregarNumero(2);
		multOp.agregarNumero(3);
		multOp.agregarNumero(4);
		multOp.agregarNumero(5);
		multOp.agregarNumero(6);
		multOp.agregarNumero(7);
	}
	
	@Test
	public void cantidadDeSumasDeTodosLosNumerosTest() {
		assertEquals(multOp.sumarLosNumeros(), 28);
	}
	
	@Test
	public void cantidadDeRestaDeTodosLosNumerosTest() {
		assertEquals(multOp.restarLosNumeros(), -28);
	}
	
	@Test
	public void cantidadDeMultiplicacionDeTodosLosNumerosTest() {
		assertEquals(multOp.multiplicacionDeLosNumeros(), 5040);
	}
}
