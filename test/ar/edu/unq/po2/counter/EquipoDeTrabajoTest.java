package ar.edu.unq.po2.counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	
	EquipoDeTrabajo equipo;
	
	UnaPersona homero;
	UnaPersona bart;
	UnaPersona lisa;
	UnaPersona maggie;
	UnaPersona marge;
	
	@BeforeEach
	void setUp() {
		equipo = new EquipoDeTrabajo("equipo 1");
		homero = new UnaPersona("Homero", "Simpson", 55);
		bart   = new UnaPersona("Bart", "Simpson", 10);
		lisa   = new UnaPersona("Lisa", "Simpson", 8);
		maggie = new UnaPersona("Maggie", "Simpson", 2);
		marge  = new UnaPersona("Marge", "Simpson", 53);
		
		equipo.agregarPersona(bart);
		equipo.agregarPersona(homero);
		equipo.agregarPersona(lisa);
		equipo.agregarPersona(maggie);
		equipo.agregarPersona(marge);
	}
	
	@Test
	void edadPromedioDeTodasLasPersonasTest() {
		assertEquals(equipo.promedioDeEdadDeLasPersonas(),25,6);
	}
	
	@Test 
	void todasLasEdadesDelEquipoDeTrabajoTEst() {
		assertEquals(equipo.cantidadDeEdadesDeTodasLasPersonas(),128);
		
	}

}
