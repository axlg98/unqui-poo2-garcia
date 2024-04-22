package ar.edu.unq.po2.counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	
	Point unPunto;
	Point otroPunto;
	Point tercerPunto;
	
	@BeforeEach
	public void setUp() {
		unPunto = new Point();
		otroPunto = new Point(5,4);
		tercerPunto = new Point(10,12);
	}
	
	@Test
	public void moviendoElPuntoTest() {
		otroPunto.moverALaPosicion(otroPunto.getX()+2, otroPunto.getY()+2);
		assertEquals(otroPunto.getX(),7);
		assertEquals(otroPunto.getY(),6);
	}
	
	@Test
	public void pointInicioTest() {
		assertEquals(unPunto.getX(),0);
		assertEquals(unPunto.getY(),0);
	}
	
	@Test
	void sumarLosPuntosTest() {
		otroPunto.sumarPuntos(tercerPunto);
		assertEquals(otroPunto.getX(),15);
		assertEquals(otroPunto.getY(),16);
		unPunto.sumarPuntos(tercerPunto);
		assertEquals(unPunto.getX(),10);
		assertEquals(unPunto.getY(),12);
	}
}
