package ar.edu.unq.po2.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaMercadoTest {
	
	CajaMercado caja;
	Stock s1;
	Producto arroz;
	Producto leche;
	Producto manteca;
	
	//STOCK
	Producto crema;
	Producto jugo;
	Producto milanesa;
	//
	
	@BeforeEach
	void setUp() {
		crema    = new ProductoCooperativa(30.5 , 50);
		jugo 	 = new Producto(125.2, 100);
		milanesa = new Producto(155.5, 150);
		arroz 	 = new ProductoCooperativa(85.5 , 60);
		leche 	 = new Producto(135.2, 20);
		manteca  = new Producto(115.5, 15);
		s1 = new Stock();
		s1.agregarProducto(crema);
		s1.agregarProducto(leche);
		s1.agregarProducto(jugo);
		s1.agregarProducto(arroz);
		s1.agregarProducto(milanesa);
		caja = new CajaMercado(s1);
		caja.agregarProducto(arroz);
		caja.agregarProducto(manteca);
	}

	@Test
	void totalDelMontoAPagarTest() {
		assertEquals(caja.montoTotalDeLosProductos(), 201D);
	}
	
	@Test
	void cantidadTotalDeUnProducto() {
		arroz.registrar();
		assertEquals(arroz.getCantidad(), 59);
	}
	
	@Test
	void cantidadTotalDeLosProductosEnElStockTest() {
		assertEquals(s1.getProdsStock().size(), 5);
	}

}
