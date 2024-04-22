package ar.edu.unq.po2.mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class CajaMercado {
	private List<Producto> productos;
	
	public CajaMercado(Stock stock) {
		this.productos = new ArrayList<Producto>();
		for(Producto producto : this.getProductos()) {
				stock.decrementarStock(producto);				
		}
	}
	
	public Double montoTotalDeLosProductos() {
		Double montoTotal = 0D;
		for(Producto p : this.getProductos()) {
			montoTotal += p.getPrecio();
		}
		return montoTotal;
	}
	
	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	//GET Y SET
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
