package ar.edu.unq.po2.supermercado;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTest {
	
	Supermercado supermercado;
	Producto arroz;
	Producto queso;
	Producto leche;
	Producto fideos;
	List<Producto> productos = new ArrayList<Producto>(); 
	
	@BeforeEach
	void setUp() {
		supermercado = new Supermercado("Carrefour", "C. Pellegrini 1352");
		arroz = new Producto("Arroz",50.2);
		queso = new Producto("Queso",125.0);
		leche = new Producto("Leche", 75.5);
		fideos = new Producto("Fideos", 155.5);
		productos.add(fideos);
		productos.add(leche);
		supermercado.setProductos(productos);
	}
	
	@Test
	void todosLosProductosDelSupermercadoTest() {
		assertEquals(supermercado.cantidadTotalDeProductos(), 2);
	}
	
	@Test
	void todosLosProductosDelSupermercadoMasLoAgregadoTest() {
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(queso);
		assertEquals(supermercado.cantidadTotalDeProductos(), 4);
	}
	
	@Test
	void todosLosPreciosDeLosProductosDelSupermercadoTest() {
		assertEquals(supermercado.todosLosPreciosDelSupermercado(),231.0);
	}
	
	@Test
	void todosLosPreciosDeLosProductosDelSupermercadoMasLoAgregadosTest() {
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(queso);
		assertEquals(supermercado.todosLosPreciosDelSupermercado(),406.2);
	}
	
	@Test
	void preciosDeLosProductosLaLechePrecioCuidado() {
		leche.setEsPrecioCuidado(true);
		leche.setPrecioCuidado(0.11);
		assertEquals(supermercado.todosLosPreciosDelSupermercado(),163.805);
	}
	
	@Test
	void precioDeLaLecheConPrecioCuidadoTest() {
		leche.setEsPrecioCuidado(true);
		leche.setPrecioCuidado(0.11);
		assertEquals(leche.calcularPrecio(),8.305);
	}
}
