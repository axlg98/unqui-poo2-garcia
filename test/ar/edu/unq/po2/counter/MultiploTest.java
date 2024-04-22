package ar.edu.unq.po2.counter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTest {
	Multiplo multiplo;
	int valor1;
	int valor2;
	
	@BeforeEach
	public void setUp() {
		valor1 = 2;
		valor2 = 3;
		multiplo = new Multiplo(3,9);
	}
	
	@Test
	public void MultiploDeTest() {
		assertEquals(multiplo.multiploDe(), 999);
	}

}
