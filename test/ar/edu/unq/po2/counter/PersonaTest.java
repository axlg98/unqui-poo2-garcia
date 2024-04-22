package ar.edu.unq.po2.counter;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona homero;
	Persona bart;
	LocalDate homeroFecha;
	LocalDate bartFecha;
	
	@BeforeEach
	void setUp() {
	homeroFecha = LocalDate.of(1978, 5, 25);
	homero = new Persona(homeroFecha, "Homero");
	
	bartFecha = LocalDate.of(2014, 3, 15);
	bart = new Persona(bartFecha, "Bart");
	}
	
	@Test
	 void calcularEdadDeHomeroTest() {
		assertEquals(homero.edadDeLaPersona(),45);
	}
	
	@Test
	 void calcularEdadDeBartTest() {
		assertEquals(bart.edadDeLaPersona(),10);
	}
	
	@Test
	 void bartEsMenorQueHomeroTest() {
		assertTrue(bart.menorQue(homero));
	}
}
